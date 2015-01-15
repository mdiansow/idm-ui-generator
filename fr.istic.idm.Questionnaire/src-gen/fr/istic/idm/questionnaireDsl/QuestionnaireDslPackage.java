/**
 */
package fr.istic.idm.questionnaireDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.istic.idm.questionnaireDsl.QuestionnaireDslFactory
 * @model kind="package"
 * @generated
 */
public interface QuestionnaireDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "questionnaireDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.istic.fr/idm/QuestionnaireDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "questionnaireDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  QuestionnaireDslPackage eINSTANCE = fr.istic.idm.questionnaireDsl.impl.QuestionnaireDslPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.istic.idm.questionnaireDsl.impl.SondageImpl <em>Sondage</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.idm.questionnaireDsl.impl.SondageImpl
   * @see fr.istic.idm.questionnaireDsl.impl.QuestionnaireDslPackageImpl#getSondage()
   * @generated
   */
  int SONDAGE = 0;

  /**
   * The feature id for the '<em><b>Sondage</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SONDAGE__SONDAGE = 0;

  /**
   * The number of structural features of the '<em>Sondage</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SONDAGE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.istic.idm.questionnaireDsl.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.idm.questionnaireDsl.impl.QuestionnaireImpl
   * @see fr.istic.idm.questionnaireDsl.impl.QuestionnaireDslPackageImpl#getQuestionnaire()
   * @generated
   */
  int QUESTIONNAIRE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE__NAME = 0;

  /**
   * The feature id for the '<em><b>Questionnaire</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE__QUESTIONNAIRE = 1;

  /**
   * The number of structural features of the '<em>Questionnaire</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.istic.idm.questionnaireDsl.impl.QuestionImpl <em>Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.idm.questionnaireDsl.impl.QuestionImpl
   * @see fr.istic.idm.questionnaireDsl.impl.QuestionnaireDslPackageImpl#getQuestion()
   * @generated
   */
  int QUESTION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__TEXT = 1;

  /**
   * The feature id for the '<em><b>Question</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__QUESTION = 2;

  /**
   * The number of structural features of the '<em>Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.istic.idm.questionnaireDsl.impl.OptionImpl <em>Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.idm.questionnaireDsl.impl.OptionImpl
   * @see fr.istic.idm.questionnaireDsl.impl.QuestionnaireDslPackageImpl#getOption()
   * @generated
   */
  int OPTION = 3;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION__TEXT = 0;

  /**
   * The number of structural features of the '<em>Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link fr.istic.idm.questionnaireDsl.Sondage <em>Sondage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sondage</em>'.
   * @see fr.istic.idm.questionnaireDsl.Sondage
   * @generated
   */
  EClass getSondage();

  /**
   * Returns the meta object for the containment reference list '{@link fr.istic.idm.questionnaireDsl.Sondage#getSondage <em>Sondage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sondage</em>'.
   * @see fr.istic.idm.questionnaireDsl.Sondage#getSondage()
   * @see #getSondage()
   * @generated
   */
  EReference getSondage_Sondage();

  /**
   * Returns the meta object for class '{@link fr.istic.idm.questionnaireDsl.Questionnaire <em>Questionnaire</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Questionnaire</em>'.
   * @see fr.istic.idm.questionnaireDsl.Questionnaire
   * @generated
   */
  EClass getQuestionnaire();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.idm.questionnaireDsl.Questionnaire#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.istic.idm.questionnaireDsl.Questionnaire#getName()
   * @see #getQuestionnaire()
   * @generated
   */
  EAttribute getQuestionnaire_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.istic.idm.questionnaireDsl.Questionnaire#getQuestionnaire <em>Questionnaire</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Questionnaire</em>'.
   * @see fr.istic.idm.questionnaireDsl.Questionnaire#getQuestionnaire()
   * @see #getQuestionnaire()
   * @generated
   */
  EReference getQuestionnaire_Questionnaire();

  /**
   * Returns the meta object for class '{@link fr.istic.idm.questionnaireDsl.Question <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Question</em>'.
   * @see fr.istic.idm.questionnaireDsl.Question
   * @generated
   */
  EClass getQuestion();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.idm.questionnaireDsl.Question#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.istic.idm.questionnaireDsl.Question#getName()
   * @see #getQuestion()
   * @generated
   */
  EAttribute getQuestion_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.idm.questionnaireDsl.Question#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see fr.istic.idm.questionnaireDsl.Question#getText()
   * @see #getQuestion()
   * @generated
   */
  EAttribute getQuestion_Text();

  /**
   * Returns the meta object for the containment reference list '{@link fr.istic.idm.questionnaireDsl.Question#getQuestion <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Question</em>'.
   * @see fr.istic.idm.questionnaireDsl.Question#getQuestion()
   * @see #getQuestion()
   * @generated
   */
  EReference getQuestion_Question();

  /**
   * Returns the meta object for class '{@link fr.istic.idm.questionnaireDsl.Option <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Option</em>'.
   * @see fr.istic.idm.questionnaireDsl.Option
   * @generated
   */
  EClass getOption();

  /**
   * Returns the meta object for the attribute list '{@link fr.istic.idm.questionnaireDsl.Option#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Text</em>'.
   * @see fr.istic.idm.questionnaireDsl.Option#getText()
   * @see #getOption()
   * @generated
   */
  EAttribute getOption_Text();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  QuestionnaireDslFactory getQuestionnaireDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.istic.idm.questionnaireDsl.impl.SondageImpl <em>Sondage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.idm.questionnaireDsl.impl.SondageImpl
     * @see fr.istic.idm.questionnaireDsl.impl.QuestionnaireDslPackageImpl#getSondage()
     * @generated
     */
    EClass SONDAGE = eINSTANCE.getSondage();

    /**
     * The meta object literal for the '<em><b>Sondage</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SONDAGE__SONDAGE = eINSTANCE.getSondage_Sondage();

    /**
     * The meta object literal for the '{@link fr.istic.idm.questionnaireDsl.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.idm.questionnaireDsl.impl.QuestionnaireImpl
     * @see fr.istic.idm.questionnaireDsl.impl.QuestionnaireDslPackageImpl#getQuestionnaire()
     * @generated
     */
    EClass QUESTIONNAIRE = eINSTANCE.getQuestionnaire();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTIONNAIRE__NAME = eINSTANCE.getQuestionnaire_Name();

    /**
     * The meta object literal for the '<em><b>Questionnaire</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUESTIONNAIRE__QUESTIONNAIRE = eINSTANCE.getQuestionnaire_Questionnaire();

    /**
     * The meta object literal for the '{@link fr.istic.idm.questionnaireDsl.impl.QuestionImpl <em>Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.idm.questionnaireDsl.impl.QuestionImpl
     * @see fr.istic.idm.questionnaireDsl.impl.QuestionnaireDslPackageImpl#getQuestion()
     * @generated
     */
    EClass QUESTION = eINSTANCE.getQuestion();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION__NAME = eINSTANCE.getQuestion_Name();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION__TEXT = eINSTANCE.getQuestion_Text();

    /**
     * The meta object literal for the '<em><b>Question</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUESTION__QUESTION = eINSTANCE.getQuestion_Question();

    /**
     * The meta object literal for the '{@link fr.istic.idm.questionnaireDsl.impl.OptionImpl <em>Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.idm.questionnaireDsl.impl.OptionImpl
     * @see fr.istic.idm.questionnaireDsl.impl.QuestionnaireDslPackageImpl#getOption()
     * @generated
     */
    EClass OPTION = eINSTANCE.getOption();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPTION__TEXT = eINSTANCE.getOption_Text();

  }

} //QuestionnaireDslPackage
