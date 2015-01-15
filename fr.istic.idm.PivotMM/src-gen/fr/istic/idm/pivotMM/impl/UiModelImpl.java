/**
 */
package fr.istic.idm.pivotMM.impl;

import fr.istic.idm.pivotMM.PivotMMPackage;
import fr.istic.idm.pivotMM.UiModel;
import fr.istic.idm.pivotMM.Widget;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.istic.idm.pivotMM.impl.UiModelImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.istic.idm.pivotMM.impl.UiModelImpl#getLaQuestion <em>La Question</em>}</li>
 *   <li>{@link fr.istic.idm.pivotMM.impl.UiModelImpl#getWidgets <em>Widgets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiModelImpl extends MinimalEObjectImpl.Container implements UiModel
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getLaQuestion() <em>La Question</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLaQuestion()
   * @generated
   * @ordered
   */
  protected static final String LA_QUESTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLaQuestion() <em>La Question</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLaQuestion()
   * @generated
   * @ordered
   */
  protected String laQuestion = LA_QUESTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getWidgets() <em>Widgets</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidgets()
   * @generated
   * @ordered
   */
  protected EList<Widget> widgets;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UiModelImpl()
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
    return PivotMMPackage.Literals.UI_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PivotMMPackage.UI_MODEL__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLaQuestion()
  {
    return laQuestion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLaQuestion(String newLaQuestion)
  {
    String oldLaQuestion = laQuestion;
    laQuestion = newLaQuestion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PivotMMPackage.UI_MODEL__LA_QUESTION, oldLaQuestion, laQuestion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Widget> getWidgets()
  {
    if (widgets == null)
    {
      widgets = new EObjectContainmentEList<Widget>(Widget.class, this, PivotMMPackage.UI_MODEL__WIDGETS);
    }
    return widgets;
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
      case PivotMMPackage.UI_MODEL__WIDGETS:
        return ((InternalEList<?>)getWidgets()).basicRemove(otherEnd, msgs);
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
      case PivotMMPackage.UI_MODEL__ID:
        return getId();
      case PivotMMPackage.UI_MODEL__LA_QUESTION:
        return getLaQuestion();
      case PivotMMPackage.UI_MODEL__WIDGETS:
        return getWidgets();
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
      case PivotMMPackage.UI_MODEL__ID:
        setId((String)newValue);
        return;
      case PivotMMPackage.UI_MODEL__LA_QUESTION:
        setLaQuestion((String)newValue);
        return;
      case PivotMMPackage.UI_MODEL__WIDGETS:
        getWidgets().clear();
        getWidgets().addAll((Collection<? extends Widget>)newValue);
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
      case PivotMMPackage.UI_MODEL__ID:
        setId(ID_EDEFAULT);
        return;
      case PivotMMPackage.UI_MODEL__LA_QUESTION:
        setLaQuestion(LA_QUESTION_EDEFAULT);
        return;
      case PivotMMPackage.UI_MODEL__WIDGETS:
        getWidgets().clear();
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
      case PivotMMPackage.UI_MODEL__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case PivotMMPackage.UI_MODEL__LA_QUESTION:
        return LA_QUESTION_EDEFAULT == null ? laQuestion != null : !LA_QUESTION_EDEFAULT.equals(laQuestion);
      case PivotMMPackage.UI_MODEL__WIDGETS:
        return widgets != null && !widgets.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (id: ");
    result.append(id);
    result.append(", laQuestion: ");
    result.append(laQuestion);
    result.append(')');
    return result.toString();
  }

} //UiModelImpl
