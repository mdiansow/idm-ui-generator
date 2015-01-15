package fr.istic.idm.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.istic.idm.cssDsl.Css;
import fr.istic.idm.cssDsl.CssDslPackage;
import fr.istic.idm.cssDsl.Widget;
import fr.istic.idm.services.CssDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class CssDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CssDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CssDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CssDslPackage.CSS:
				if(context == grammarAccess.getCssRule()) {
					sequence_Css(context, (Css) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.WIDGET:
				if(context == grammarAccess.getWidgetRule()) {
					sequence_Widget(context, (Widget) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     css+=Widget+
	 */
	protected void sequence_Css(EObject context, Css semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID (value='CheckBox' | value='ComboBox' | value='TextField' | value='RadioButton'))
	 */
	protected void sequence_Widget(EObject context, Widget semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
