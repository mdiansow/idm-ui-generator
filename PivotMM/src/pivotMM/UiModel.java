/**
 */
package pivotMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pivotMM.UiModel#getWidgets <em>Widgets</em>}</li>
 *   <li>{@link pivotMM.UiModel#getId <em>Id</em>}</li>
 *   <li>{@link pivotMM.UiModel#getLaQuestion <em>La Question</em>}</li>
 * </ul>
 * </p>
 *
 * @see pivotMM.PivotMMPackage#getUiModel()
 * @model
 * @generated
 */
public interface UiModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Widgets</b></em>' containment reference list.
	 * The list contents are of type {@link pivotMM.Widget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widgets</em>' containment reference list.
	 * @see pivotMM.PivotMMPackage#getUiModel_Widgets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Widget> getWidgets();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see pivotMM.PivotMMPackage#getUiModel_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link pivotMM.UiModel#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>La Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>La Question</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>La Question</em>' attribute.
	 * @see #setLaQuestion(String)
	 * @see pivotMM.PivotMMPackage#getUiModel_LaQuestion()
	 * @model
	 * @generated
	 */
	String getLaQuestion();

	/**
	 * Sets the value of the '{@link pivotMM.UiModel#getLaQuestion <em>La Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>La Question</em>' attribute.
	 * @see #getLaQuestion()
	 * @generated
	 */
	void setLaQuestion(String value);

} // UiModel
