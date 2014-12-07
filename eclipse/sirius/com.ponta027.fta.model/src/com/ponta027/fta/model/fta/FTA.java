/**
 */
package com.ponta027.fta.model.fta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FTA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ponta027.fta.model.fta.FTA#getDiagrams <em>Diagrams</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ponta027.fta.model.fta.FtaPackage#getFTA()
 * @model
 * @generated
 */
public interface FTA extends EObject {
	/**
	 * Returns the value of the '<em><b>Diagrams</b></em>' containment reference list.
	 * The list contents are of type {@link com.ponta027.fta.model.fta.Diagram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagrams</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagrams</em>' containment reference list.
	 * @see com.ponta027.fta.model.fta.FtaPackage#getFTA_Diagrams()
	 * @model containment="true"
	 * @generated
	 */
	EList<Diagram> getDiagrams();

} // FTA
