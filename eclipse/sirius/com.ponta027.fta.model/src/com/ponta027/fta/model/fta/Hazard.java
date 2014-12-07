/**
 */
package com.ponta027.fta.model.fta;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hazard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ponta027.fta.model.fta.Hazard#getConditions <em>Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ponta027.fta.model.fta.FtaPackage#getHazard()
 * @model
 * @generated
 */
public interface Hazard extends Diagram {
	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' reference list.
	 * The list contents are of type {@link com.ponta027.fta.model.fta.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' reference list.
	 * @see com.ponta027.fta.model.fta.FtaPackage#getHazard_Conditions()
	 * @model
	 * @generated
	 */
	EList<Condition> getConditions();

} // Hazard
