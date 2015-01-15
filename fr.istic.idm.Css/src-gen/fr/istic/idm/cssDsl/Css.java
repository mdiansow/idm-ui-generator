/**
 */
package fr.istic.idm.cssDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Css</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.istic.idm.cssDsl.Css#getCss <em>Css</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.istic.idm.cssDsl.CssDslPackage#getCss()
 * @model
 * @generated
 */
public interface Css extends EObject
{
  /**
   * Returns the value of the '<em><b>Css</b></em>' containment reference list.
   * The list contents are of type {@link fr.istic.idm.cssDsl.Widget}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Css</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Css</em>' containment reference list.
   * @see fr.istic.idm.cssDsl.CssDslPackage#getCss_Css()
   * @model containment="true"
   * @generated
   */
  EList<Widget> getCss();

} // Css
