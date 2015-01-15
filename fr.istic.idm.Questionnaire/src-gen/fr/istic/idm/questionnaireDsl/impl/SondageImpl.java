/**
 */
package fr.istic.idm.questionnaireDsl.impl;

import fr.istic.idm.questionnaireDsl.Questionnaire;
import fr.istic.idm.questionnaireDsl.QuestionnaireDslPackage;
import fr.istic.idm.questionnaireDsl.Sondage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sondage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.istic.idm.questionnaireDsl.impl.SondageImpl#getSondage <em>Sondage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SondageImpl extends MinimalEObjectImpl.Container implements Sondage
{
  /**
   * The cached value of the '{@link #getSondage() <em>Sondage</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSondage()
   * @generated
   * @ordered
   */
  protected EList<Questionnaire> sondage;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SondageImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return QuestionnaireDslPackage.Literals.SONDAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Questionnaire> getSondage()
  {
    if (sondage == null)
    {
      sondage = new EObjectContainmentEList<Questionnaire>(Questionnaire.class, this, QuestionnaireDslPackage.SONDAGE__SONDAGE);
    }
    return sondage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case QuestionnaireDslPackage.SONDAGE__SONDAGE:
        return ((InternalEList<?>)getSondage()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case QuestionnaireDslPackage.SONDAGE__SONDAGE:
        return getSondage();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case QuestionnaireDslPackage.SONDAGE__SONDAGE:
        getSondage().clear();
        getSondage().addAll((Collection<? extends Questionnaire>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case QuestionnaireDslPackage.SONDAGE__SONDAGE:
        getSondage().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case QuestionnaireDslPackage.SONDAGE__SONDAGE:
        return sondage != null && !sondage.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SondageImpl
