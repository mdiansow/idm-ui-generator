/**
 */
package fr.istic.idm.pivotMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Poll System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.istic.idm.pivotMM.PollSystem#getTitle <em>Title</em>}</li>
 *   <li>{@link fr.istic.idm.pivotMM.PollSystem#getModels <em>Models</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.istic.idm.pivotMM.PivotMMPackage#getPollSystem()
 * @model
 * @generated
 */
public interface PollSystem extends EObject
{
  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see fr.istic.idm.pivotMM.PivotMMPackage#getPollSystem_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link fr.istic.idm.pivotMM.PollSystem#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Models</b></em>' containment reference list.
   * The list contents are of type {@link fr.istic.idm.pivotMM.UiModel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Models</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Models</em>' containment reference list.
   * @see fr.istic.idm.pivotMM.PivotMMPackage#getPollSystem_Models()
   * @model containment="true"
   * @generated
   */
  EList<UiModel> getModels();

} // PollSystem
