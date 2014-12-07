/**
 */
package com.ponta027.fta.model.fta.impl;

import com.ponta027.fta.model.fta.Condition;
import com.ponta027.fta.model.fta.Event;
import com.ponta027.fta.model.fta.FtaPackage;
import com.ponta027.fta.model.fta.GateType;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ponta027.fta.model.fta.impl.ConditionImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link com.ponta027.fta.model.fta.impl.ConditionImpl#getGateKind <em>Gate Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionImpl extends DiagramImpl implements Condition {
	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The default value of the '{@link #getGateKind() <em>Gate Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateKind()
	 * @generated
	 * @ordered
	 */
	protected static final GateType GATE_KIND_EDEFAULT = GateType.OR_GATE;
	/**
	 * The cached value of the '{@link #getGateKind() <em>Gate Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateKind()
	 * @generated
	 * @ordered
	 */
	protected GateType gateKind = GATE_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtaPackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectResolvingEList<Event>(Event.class, this, FtaPackage.CONDITION__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GateType getGateKind() {
		return gateKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGateKind(GateType newGateKind) {
		GateType oldGateKind = gateKind;
		gateKind = newGateKind == null ? GATE_KIND_EDEFAULT : newGateKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtaPackage.CONDITION__GATE_KIND, oldGateKind, gateKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FtaPackage.CONDITION__EVENTS:
				return getEvents();
			case FtaPackage.CONDITION__GATE_KIND:
				return getGateKind();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FtaPackage.CONDITION__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case FtaPackage.CONDITION__GATE_KIND:
				setGateKind((GateType)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case FtaPackage.CONDITION__EVENTS:
				getEvents().clear();
				return;
			case FtaPackage.CONDITION__GATE_KIND:
				setGateKind(GATE_KIND_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FtaPackage.CONDITION__EVENTS:
				return events != null && !events.isEmpty();
			case FtaPackage.CONDITION__GATE_KIND:
				return gateKind != GATE_KIND_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (GateKind: ");
		result.append(gateKind);
		result.append(')');
		return result.toString();
	}

} //ConditionImpl
