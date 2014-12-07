/**
 */
package com.ponta027.fta.model.fta;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ponta027.fta.model.fta.Condition#getEvents <em>Events</em>}</li>
 *   <li>{@link com.ponta027.fta.model.fta.Condition#getGateKind <em>Gate Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ponta027.fta.model.fta.FtaPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends Diagram {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' reference list.
	 * The list contents are of type {@link com.ponta027.fta.model.fta.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' reference list.
	 * @see com.ponta027.fta.model.fta.FtaPackage#getCondition_Events()
	 * @model
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Gate Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link com.ponta027.fta.model.fta.GateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gate Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gate Kind</em>' attribute.
	 * @see com.ponta027.fta.model.fta.GateType
	 * @see #setGateKind(GateType)
	 * @see com.ponta027.fta.model.fta.FtaPackage#getCondition_GateKind()
	 * @model required="true"
	 * @generated
	 */
	GateType getGateKind();

	/**
	 * Sets the value of the '{@link com.ponta027.fta.model.fta.Condition#getGateKind <em>Gate Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gate Kind</em>' attribute.
	 * @see com.ponta027.fta.model.fta.GateType
	 * @see #getGateKind()
	 * @generated
	 */
	void setGateKind(GateType value);

} // Condition
