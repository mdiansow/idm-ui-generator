package fr.istic.idm.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.istic.idm.questionnaireDsl.Option;
import fr.istic.idm.questionnaireDsl.Question;
import fr.istic.idm.questionnaireDsl.Questionnaire;
import fr.istic.idm.questionnaireDsl.QuestionnaireDslPackage;
import fr.istic.idm.questionnaireDsl.Sondage;
import fr.istic.idm.services.QuestionnaireDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class QuestionnaireDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private QuestionnaireDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == QuestionnaireDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case QuestionnaireDslPackage.OPTION:
				if(context == grammarAccess.getOptionRule()) {
					sequence_Option(context, (Option) semanticObject); 
					return; 
				}
				else break;
			case QuestionnaireDslPackage.QUESTION:
				if(context == grammarAccess.getQuestionRule()) {
					sequence_Question(context, (Question) semanticObject); 
					return; 
				}
				else break;
			case QuestionnaireDslPackage.QUESTIONNAIRE:
				if(context == grammarAccess.getQuestionnaireRule()) {
					sequence_Questionnaire(context, (Questionnaire) semanticObject); 
					return; 
				}
				else break;
			case QuestionnaireDslPackage.SONDAGE:
				if(context == grammarAccess.getSondageRule()) {
					sequence_Sondage(context, (Sondage) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     text+=STRING+
	 */
	protected void sequence_Option(EObject context, Option semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID text=STRING question+=Option)
	 */
	protected void sequence_Question(EObject context, Question semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID questionnaire+=Question*)
	 */
	protected void sequence_Questionnaire(EObject context, Questionnaire semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     sondage+=Questionnaire+
	 */
	protected void sequence_Sondage(EObject context, Sondage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
