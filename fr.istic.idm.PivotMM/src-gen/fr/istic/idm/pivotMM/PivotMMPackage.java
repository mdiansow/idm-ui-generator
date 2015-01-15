/**
 */
package fr.istic.idm.pivotMM;

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
 * @see fr.istic.idm.pivotMM.PivotMMFactory
 * @model kind="package"
 * @generated
 */
public interface PivotMMPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "pivotMM";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.istic.fr/idm/PivotMM";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pivotMM";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PivotMMPackage eINSTANCE = fr.istic.idm.pivotMM.impl.PivotMMPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.istic.idm.pivotMM.impl.PollSystemImpl <em>Poll System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.idm.pivotMM.impl.PollSystemImpl
   * @see fr.istic.idm.pivotMM.impl.PivotMMPackageImpl#getPollSystem()
   * @generated
   */
  int POLL_SYSTEM = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLL_SYSTEM__TITLE = 0;

  /**
   * The feature id for the '<em><b>Models</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLL_SYSTEM__MODELS = 1;

  /**
   * The number of structural features of the '<em>Poll System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLL_SYSTEM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.istic.idm.pivotMM.impl.WidgetImpl <em>Widget</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.idm.pivotMM.impl.WidgetImpl
   * @see fr.istic.idm.pivotMM.impl.PivotMMPackageImpl#getWidget()
   * @generated
   */
  int WIDGET = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET__VALUE = 0;

  /**
   * The number of structural features of the '<em>Widget</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.istic.idm.pivotMM.impl.UiModelImpl <em>Ui Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.idm.pivotMM.impl.UiModelImpl
   * @see fr.istic.idm.pivotMM.impl.PivotMMPackageImpl#getUiModel()
   * @generated
   */
  int UI_MODEL = 2;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_MODEL__ID = 0;

  /**
   * The feature id for the '<em><b>La Question</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_MODEL__LA_QUESTION = 1;

  /**
   * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_MODEL__WIDGETS = 2;

  /**
   * The number of structural features of the '<em>Ui Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.istic.idm.pivotMM.impl.CheckBoxImpl <em>Check Box</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.idm.pivotMM.impl.CheckBoxImpl
   * @see fr.istic.idm.pivotMM.impl.PivotMMPackageImpl#getCheckBox()
   * @generated
   */
  int CHECK_BOX = 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX__VALUE = WIDGET__VALUE;

  /**
   * The number of structural features of the '<em>Check Box</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.istic.idm.pivotMM.impl.RadioButtonImpl <em>Radio Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.idm.pivotMM.impl.RadioButtonImpl
   * @see fr.istic.idm.pivotMM.impl.PivotMMPackageImpl#getRadioButton()
   * @generated
   */
  int RADIO_BUTTON = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO_BUTTON__VALUE = WIDGET__VALUE;

  /**
   * The number of structural features of the '<em>Radio Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO_BUTTON_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.istic.idm.pivotMM.impl.TextFieldImpl <em>Text Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.idm.pivotMM.impl.TextFieldImpl
   * @see fr.istic.idm.pivotMM.impl.PivotMMPackageImpl#getTextField()
   * @generated
   */
  int TEXT_FIELD = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FIELD__VALUE = WIDGET__VALUE;

  /**
   * The number of structural features of the '<em>Text Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FIELD_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.istic.idm.pivotMM.impl.ComboBoxImpl <em>Combo Box</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.idm.pivotMM.impl.ComboBoxImpl
   * @see fr.istic.idm.pivotMM.impl.PivotMMPackageImpl#getComboBox()
   * @generated
   */
  int COMBO_BOX = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMBO_BOX__VALUE = WIDGET__VALUE;

  /**
   * The number of structural features of the '<em>Combo Box</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMBO_BOX_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link fr.istic.idm.pivotMM.PollSystem <em>Poll System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Poll System</em>'.
   * @see fr.istic.idm.pivotMM.PollSystem
   * @generated
   */
  EClass getPollSystem();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.idm.pivotMM.PollSystem#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see fr.istic.idm.pivotMM.PollSystem#getTitle()
   * @see #getPollSystem()
   * @generated
   */
  EAttribute getPollSystem_Title();

  /**
   * Returns the meta object for the containment reference list '{@link fr.istic.idm.pivotMM.PollSystem#getModels <em>Models</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Models</em>'.
   * @see fr.istic.idm.pivotMM.PollSystem#getModels()
   * @see #getPollSystem()
   * @generated
   */
  EReference getPollSystem_Models();

  /**
   * Returns the meta object for class '{@link fr.istic.idm.pivotMM.Widget <em>Widget</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Widget</em>'.
   * @see fr.istic.idm.pivotMM.Widget
   * @generated
   */
  EClass getWidget();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.idm.pivotMM.Widget#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.istic.idm.pivotMM.Widget#getValue()
   * @see #getWidget()
   * @generated
   */
  EAttribute getWidget_Value();

  /**
   * Returns the meta object for class '{@link fr.istic.idm.pivotMM.UiModel <em>Ui Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ui Model</em>'.
   * @see fr.istic.idm.pivotMM.UiModel
   * @generated
   */
  EClass getUiModel();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.idm.pivotMM.UiModel#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see fr.istic.idm.pivotMM.UiModel#getId()
   * @see #getUiModel()
   * @generated
   */
  EAttribute getUiModel_Id();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.idm.pivotMM.UiModel#getLaQuestion <em>La Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>La Question</em>'.
   * @see fr.istic.idm.pivotMM.UiModel#getLaQuestion()
   * @see #getUiModel()
   * @generated
   */
  EAttribute getUiModel_LaQuestion();

  /**
   * Returns the meta object for the containment reference list '{@link fr.istic.idm.pivotMM.UiModel#getWidgets <em>Widgets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Widgets</em>'.
   * @see fr.istic.idm.pivotMM.UiModel#getWidgets()
   * @see #getUiModel()
   * @generated
   */
  EReference getUiModel_Widgets();

  /**
   * Returns the meta object for class '{@link fr.istic.idm.pivotMM.CheckBox <em>Check Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Check Box</em>'.
   * @see fr.istic.idm.pivotMM.CheckBox
   * @generated
   */
  EClass getCheckBox();

  /**
   * Returns the meta object for class '{@link fr.istic.idm.pivotMM.RadioButton <em>Radio Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Radio Button</em>'.
   * @see fr.istic.idm.pivotMM.RadioButton
   * @generated
   */
  EClass getRadioButton();

  /**
   * Returns the meta object for class '{@link fr.istic.idm.pivotMM.TextField <em>Text Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Field</em>'.
   * @see fr.istic.idm.pivotMM.TextField
   * @generated
   */
  EClass getTextField();

  /**
   * Returns the meta object for class '{@link fr.istic.idm.pivotMM.ComboBox <em>Combo Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Combo Box</em>'.
   * @see fr.istic.idm.pivotMM.ComboBox
   * @generated
   */
  EClass getComboBox();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PivotMMFactory getPivotMMFactory();

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
     * The meta object literal for the '{@link fr.istic.idm.pivotMM.impl.PollSystemImpl <em>Poll System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.idm.pivotMM.impl.PollSystemImpl
     * @see fr.istic.idm.pivotMM.impl.PivotMMPackageImpl#getPollSystem()
     * @generated
     */
    EClass POLL_SYSTEM = eINSTANCE.getPollSystem();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POLL_SYSTEM__TITLE = eINSTANCE.getPollSystem_Title();

    /**
     * The meta object literal for the '<em><b>Models</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLL_SYSTEM__MODELS = eINSTANCE.getPollSystem_Models();

    /**
     * The meta object literal for the '{@link fr.istic.idm.pivotMM.impl.WidgetImpl <em>Widget</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.idm.pivotMM.impl.WidgetImpl
     * @see fr.istic.idm.pivotMM.impl.PivotMMPackageImpl#getWidget()
     * @generated
     */
    EClass WIDGET = eINSTANCE.getWidget();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WIDGET__VALUE = eINSTANCE.getWidget_Value();

    /**
     * The meta object literal for the '{@link fr.istic.idm.pivotMM.impl.UiModelImpl <em>Ui Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.idm.pivotMM.impl.UiModelImpl
     * @see fr.istic.idm.pivotMM.impl.PivotMMPackageImpl#getUiModel()
     * @generated
     */
    EClass UI_MODEL = eINSTANCE.getUiModel();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UI_MODEL__ID = eINSTANCE.getUiModel_Id();

    /**
     * The meta object literal for the '<em><b>La Question</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UI_MODEL__LA_QUESTION = eINSTANCE.getUiModel_LaQuestion();

    /**
     * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UI_MODEL__WIDGETS = eINSTANCE.getUiModel_Widgets();

    /**
     * The meta object literal for the '{@link fr.istic.idm.pivotMM.impl.CheckBoxImpl <em>Check Box</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.idm.pivotMM.impl.CheckBoxImpl
     * @see fr.istic.idm.pivotMM.impl.PivotMMPackageImpl#getCheckBox()
     * @generated
     */
    EClass CHECK_BOX = eINSTANCE.getCheckBox();

    /**
     * The meta object literal for the '{@link fr.istic.idm.pivotMM.impl.RadioButtonImpl <em>Radio Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.idm.pivotMM.impl.RadioButtonImpl
     * @see fr.istic.idm.pivotMM.impl.PivotMMPackageImpl#getRadioButton()
     * @generated
     */
    EClass RADIO_BUTTON = eINSTANCE.getRadioButton();

    /**
     * The meta object literal for the '{@link fr.istic.idm.pivotMM.impl.TextFieldImpl <em>Text Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.idm.pivotMM.impl.TextFieldImpl
     * @see fr.istic.idm.pivotMM.impl.PivotMMPackageImpl#getTextField()
     * @generated
     */
    EClass TEXT_FIELD = eINSTANCE.getTextField();

    /**
     * The meta object literal for the '{@link fr.istic.idm.pivotMM.impl.ComboBoxImpl <em>Combo Box</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.idm.pivotMM.impl.ComboBoxImpl
     * @see fr.istic.idm.pivotMM.impl.PivotMMPackageImpl#getComboBox()
     * @generated
     */
    EClass COMBO_BOX = eINSTANCE.getComboBox();

  }

} //PivotMMPackage
