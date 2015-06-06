/**
 */
package com.ponta027.fta.model.fta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ponta027.fta.model.fta.Event#isBaseEvent <em>Base Event</em>}</li>
 *   <li>{@link com.ponta027.fta.model.fta.Event#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ponta027.fta.model.fta.FtaPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends Diagram {
	/**
	 * Returns the value of the '<em><b>Base Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Event</em>' attribute.
	 * @see #setBaseEvent(boolean)
	 * @see com.ponta027.fta.model.fta.FtaPackage#getEvent_BaseEvent()
	 * @model required="true"
	 * @generated
	 */
	boolean isBaseEvent();

	/**
	 * Sets the value of the '{@link com.ponta027.fta.model.fta.Event#isBaseEvent <em>Base Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Event</em>' attribute.
	 * @see #isBaseEvent()
	 * @generated
	 */
	void setBaseEvent(boolean value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(Condition)
	 * @see com.ponta027.fta.model.fta.FtaPackage#getEvent_Condition()
	 * @model
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link com.ponta027.fta.model.fta.Event#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

} // Event
