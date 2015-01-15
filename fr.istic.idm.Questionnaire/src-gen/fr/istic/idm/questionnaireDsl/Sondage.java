/**
 */
package fr.istic.idm.questionnaireDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sondage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.istic.idm.questionnaireDsl.Sondage#getSondage <em>Sondage</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.istic.idm.questionnaireDsl.QuestionnaireDslPackage#getSondage()
 * @model
 * @generated
 */
public interface Sondage extends EObject
{
  /**
   * Returns the value of the '<em><b>Sondage</b></em>' containment reference list.
   * The list contents are of type {@link fr.istic.idm.questionnaireDsl.Questionnaire}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sondage</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sondage</em>' containment reference list.
   * @see fr.istic.idm.questionnaireDsl.QuestionnaireDslPackage#getSondage_Sondage()
   * @model containment="true"
   * @generated
   */
  EList<Questionnaire> getSondage();

} // Sondage
