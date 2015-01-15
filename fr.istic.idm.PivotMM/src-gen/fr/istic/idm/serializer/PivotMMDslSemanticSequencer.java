package fr.istic.idm.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.istic.idm.pivotMM.CheckBox;
import fr.istic.idm.pivotMM.ComboBox;
import fr.istic.idm.pivotMM.PivotMMPackage;
import fr.istic.idm.pivotMM.PollSystem;
import fr.istic.idm.pivotMM.RadioButton;
import fr.istic.idm.pivotMM.TextField;
import fr.istic.idm.pivotMM.UiModel;
import fr.istic.idm.services.PivotMMDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class PivotMMDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PivotMMDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PivotMMPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PivotMMPackage.CHECK_BOX:
				if(context == grammarAccess.getCheckBoxRule() ||
				   context == grammarAccess.getWidgetRule()) {
					sequence_CheckBox(context, (CheckBox) semanticObject); 
					return; 
				}
				else break;
			case PivotMMPackage.COMBO_BOX:
				if(context == grammarAccess.getComboBoxRule() ||
				   context == grammarAccess.getWidgetRule()) {
					sequence_ComboBox(context, (ComboBox) semanticObject); 
					return; 
				}
				else break;
			case PivotMMPackage.POLL_SYSTEM:
				if(context == grammarAccess.getPollSystemRule()) {
					sequence_PollSystem(context, (PollSystem) semanticObject); 
					return; 
				}
				else break;
			case PivotMMPackage.RADIO_BUTTON:
				if(context == grammarAccess.getRadioButtonRule() ||
				   context == grammarAccess.getWidgetRule()) {
					sequence_RadioButton(context, (RadioButton) semanticObject); 
					return; 
				}
				else break;
			case PivotMMPackage.TEXT_FIELD:
				if(context == grammarAccess.getTextFieldRule() ||
				   context == grammarAccess.getWidgetRule()) {
					sequence_TextField(context, (TextField) semanticObject); 
					return; 
				}
				else break;
			case PivotMMPackage.UI_MODEL:
				if(context == grammarAccess.getUiModelRule()) {
					sequence_UiModel(context, (UiModel) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (value=EString?)
	 */
	protected void sequence_CheckBox(EObject context, CheckBox semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=EString?)
	 */
	protected void sequence_ComboBox(EObject context, ComboBox semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (title=EString? (models+=UiModel models+=UiModel*)?)
	 */
	protected void sequence_PollSystem(EObject context, PollSystem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=EString?)
	 */
	protected void sequence_RadioButton(EObject context, RadioButton semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=EString?)
	 */
	protected void sequence_TextField(EObject context, TextField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=EString? laQuestion=EString? (widgets+=Widget widgets+=Widget*)?)
	 */
	protected void sequence_UiModel(EObject context, UiModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
