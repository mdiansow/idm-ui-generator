/**
 */
package fr.istic.idm.questionnaireDsl.impl;

import fr.istic.idm.questionnaireDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuestionnaireDslFactoryImpl extends EFactoryImpl implements QuestionnaireDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static QuestionnaireDslFactory init()
  {
    try
    {
      QuestionnaireDslFactory theQuestionnaireDslFactory = (QuestionnaireDslFactory)EPackage.Registry.INSTANCE.getEFactory(QuestionnaireDslPackage.eNS_URI);
      if (theQuestionnaireDslFactory != null)
      {
        return theQuestionnaireDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new QuestionnaireDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuestionnaireDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case QuestionnaireDslPackage.SONDAGE: return createSondage();
      case QuestionnaireDslPackage.QUESTIONNAIRE: return createQuestionnaire();
      case QuestionnaireDslPackage.QUESTION: return createQuestion();
      case QuestionnaireDslPackage.OPTION: return createOption();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sondage createSondage()
  {
    SondageImpl sondage = new SondageImpl();
    return sondage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Questionnaire createQuestionnaire()
  {
    QuestionnaireImpl questionnaire = new QuestionnaireImpl();
    return questionnaire;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Question createQuestion()
  {
    QuestionImpl question = new QuestionImpl();
    return question;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Option createOption()
  {
    OptionImpl option = new OptionImpl();
    return option;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuestionnaireDslPackage getQuestionnaireDslPackage()
  {
    return (QuestionnaireDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static QuestionnaireDslPackage getPackage()
  {
    return QuestionnaireDslPackage.eINSTANCE;
  }

} //QuestionnaireDslFactoryImpl
