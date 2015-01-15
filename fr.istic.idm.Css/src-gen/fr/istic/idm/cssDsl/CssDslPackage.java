/**
 */
package fr.istic.idm.cssDsl;

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
 * @see fr.istic.idm.cssDsl.CssDslFactory
 * @model kind="package"
 * @generated
 */
public interface CssDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "cssDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.istic.fr/idm/CssDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "cssDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CssDslPackage eINSTANCE = fr.istic.idm.cssDsl.impl.CssDslPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.istic.idm.cssDsl.impl.CssImpl <em>Css</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.idm.cssDsl.impl.CssImpl
   * @see fr.istic.idm.cssDsl.impl.CssDslPackageImpl#getCss()
   * @generated
   */
  int CSS = 0;

  /**
   * The feature id for the '<em><b>Css</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS__CSS = 0;

  /**
   * The number of structural features of the '<em>Css</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.istic.idm.cssDsl.impl.WidgetImpl <em>Widget</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.idm.cssDsl.impl.WidgetImpl
   * @see fr.istic.idm.cssDsl.impl.CssDslPackageImpl#getWidget()
   * @generated
   */
  int WIDGET = 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET__ID = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET__VALUE = 1;

  /**
   * The number of structural features of the '<em>Widget</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link fr.istic.idm.cssDsl.Css <em>Css</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Css</em>'.
   * @see fr.istic.idm.cssDsl.Css
   * @generated
   */
  EClass getCss();

  /**
   * Returns the meta object for the containment reference list '{@link fr.istic.idm.cssDsl.Css#getCss <em>Css</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Css</em>'.
   * @see fr.istic.idm.cssDsl.Css#getCss()
   * @see #getCss()
   * @generated
   */
  EReference getCss_Css();

  /**
   * Returns the meta object for class '{@link fr.istic.idm.cssDsl.Widget <em>Widget</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Widget</em>'.
   * @see fr.istic.idm.cssDsl.Widget
   * @generated
   */
  EClass getWidget();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.idm.cssDsl.Widget#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see fr.istic.idm.cssDsl.Widget#getId()
   * @see #getWidget()
   * @generated
   */
  EAttribute getWidget_Id();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.idm.cssDsl.Widget#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.istic.idm.cssDsl.Widget#getValue()
   * @see #getWidget()
   * @generated
   */
  EAttribute getWidget_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CssDslFactory getCssDslFactory();

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
     * The meta object literal for the '{@link fr.istic.idm.cssDsl.impl.CssImpl <em>Css</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.idm.cssDsl.impl.CssImpl
     * @see fr.istic.idm.cssDsl.impl.CssDslPackageImpl#getCss()
     * @generated
     */
    EClass CSS = eINSTANCE.getCss();

    /**
     * The meta object literal for the '<em><b>Css</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CSS__CSS = eINSTANCE.getCss_Css();

    /**
     * The meta object literal for the '{@link fr.istic.idm.cssDsl.impl.WidgetImpl <em>Widget</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.idm.cssDsl.impl.WidgetImpl
     * @see fr.istic.idm.cssDsl.impl.CssDslPackageImpl#getWidget()
     * @generated
     */
    EClass WIDGET = eINSTANCE.getWidget();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WIDGET__ID = eINSTANCE.getWidget_Id();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WIDGET__VALUE = eINSTANCE.getWidget_Value();

  }

} //CssDslPackage
