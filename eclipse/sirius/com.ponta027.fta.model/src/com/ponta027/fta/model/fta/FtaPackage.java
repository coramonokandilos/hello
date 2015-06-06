/**
 */
package com.ponta027.fta.model.fta;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.ponta027.fta.model.fta.FtaFactory
 * @model kind="package"
 * @generated
 */
public interface FtaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fta";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.ponta027.fta";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.ponta027.fta";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FtaPackage eINSTANCE = com.ponta027.fta.model.fta.impl.FtaPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.ponta027.fta.model.fta.impl.FTAImpl <em>FTA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ponta027.fta.model.fta.impl.FTAImpl
	 * @see com.ponta027.fta.model.fta.impl.FtaPackageImpl#getFTA()
	 * @generated
	 */
	int FTA = 0;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA__DIAGRAMS = 0;

	/**
	 * The number of structural features of the '<em>FTA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>FTA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.ponta027.fta.model.fta.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ponta027.fta.model.fta.impl.DiagramImpl
	 * @see com.ponta027.fta.model.fta.impl.FtaPackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__DETAIL = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__ID = 2;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.ponta027.fta.model.fta.impl.HazardImpl <em>Hazard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ponta027.fta.model.fta.impl.HazardImpl
	 * @see com.ponta027.fta.model.fta.impl.FtaPackageImpl#getHazard()
	 * @generated
	 */
	int HAZARD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__NAME = DIAGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__DETAIL = DIAGRAM__DETAIL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__ID = DIAGRAM__ID;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__CONDITIONS = DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_FEATURE_COUNT = DIAGRAM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_OPERATION_COUNT = DIAGRAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.ponta027.fta.model.fta.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ponta027.fta.model.fta.impl.EventImpl
	 * @see com.ponta027.fta.model.fta.impl.FtaPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = DIAGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DETAIL = DIAGRAM__DETAIL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ID = DIAGRAM__ID;

	/**
	 * The feature id for the '<em><b>Base Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__BASE_EVENT = DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CONDITION = DIAGRAM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = DIAGRAM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = DIAGRAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.ponta027.fta.model.fta.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ponta027.fta.model.fta.impl.ConditionImpl
	 * @see com.ponta027.fta.model.fta.impl.FtaPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = DIAGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__DETAIL = DIAGRAM__DETAIL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ID = DIAGRAM__ID;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__EVENTS = DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gate Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__GATE_KIND = DIAGRAM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = DIAGRAM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = DIAGRAM_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link com.ponta027.fta.model.fta.GateType <em>Gate Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ponta027.fta.model.fta.GateType
	 * @see com.ponta027.fta.model.fta.impl.FtaPackageImpl#getGateType()
	 * @generated
	 */
	int GATE_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link com.ponta027.fta.model.fta.FTA <em>FTA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FTA</em>'.
	 * @see com.ponta027.fta.model.fta.FTA
	 * @generated
	 */
	EClass getFTA();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ponta027.fta.model.fta.FTA#getDiagrams <em>Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagrams</em>'.
	 * @see com.ponta027.fta.model.fta.FTA#getDiagrams()
	 * @see #getFTA()
	 * @generated
	 */
	EReference getFTA_Diagrams();

	/**
	 * Returns the meta object for class '{@link com.ponta027.fta.model.fta.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see com.ponta027.fta.model.fta.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the attribute '{@link com.ponta027.fta.model.fta.Diagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ponta027.fta.model.fta.Diagram#getName()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.ponta027.fta.model.fta.Diagram#getDetail <em>Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detail</em>'.
	 * @see com.ponta027.fta.model.fta.Diagram#getDetail()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Detail();

	/**
	 * Returns the meta object for the attribute '{@link com.ponta027.fta.model.fta.Diagram#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.ponta027.fta.model.fta.Diagram#getId()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Id();

	/**
	 * Returns the meta object for class '{@link com.ponta027.fta.model.fta.Hazard <em>Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hazard</em>'.
	 * @see com.ponta027.fta.model.fta.Hazard
	 * @generated
	 */
	EClass getHazard();

	/**
	 * Returns the meta object for the reference list '{@link com.ponta027.fta.model.fta.Hazard#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conditions</em>'.
	 * @see com.ponta027.fta.model.fta.Hazard#getConditions()
	 * @see #getHazard()
	 * @generated
	 */
	EReference getHazard_Conditions();

	/**
	 * Returns the meta object for class '{@link com.ponta027.fta.model.fta.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see com.ponta027.fta.model.fta.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link com.ponta027.fta.model.fta.Event#isBaseEvent <em>Base Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Event</em>'.
	 * @see com.ponta027.fta.model.fta.Event#isBaseEvent()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_BaseEvent();

	/**
	 * Returns the meta object for the reference '{@link com.ponta027.fta.model.fta.Event#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see com.ponta027.fta.model.fta.Event#getCondition()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Condition();

	/**
	 * Returns the meta object for class '{@link com.ponta027.fta.model.fta.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see com.ponta027.fta.model.fta.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the reference list '{@link com.ponta027.fta.model.fta.Condition#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Events</em>'.
	 * @see com.ponta027.fta.model.fta.Condition#getEvents()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Events();

	/**
	 * Returns the meta object for the attribute '{@link com.ponta027.fta.model.fta.Condition#getGateKind <em>Gate Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gate Kind</em>'.
	 * @see com.ponta027.fta.model.fta.Condition#getGateKind()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_GateKind();

	/**
	 * Returns the meta object for enum '{@link com.ponta027.fta.model.fta.GateType <em>Gate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gate Type</em>'.
	 * @see com.ponta027.fta.model.fta.GateType
	 * @generated
	 */
	EEnum getGateType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FtaFactory getFtaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.ponta027.fta.model.fta.impl.FTAImpl <em>FTA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ponta027.fta.model.fta.impl.FTAImpl
		 * @see com.ponta027.fta.model.fta.impl.FtaPackageImpl#getFTA()
		 * @generated
		 */
		EClass FTA = eINSTANCE.getFTA();

		/**
		 * The meta object literal for the '<em><b>Diagrams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FTA__DIAGRAMS = eINSTANCE.getFTA_Diagrams();

		/**
		 * The meta object literal for the '{@link com.ponta027.fta.model.fta.impl.DiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ponta027.fta.model.fta.impl.DiagramImpl
		 * @see com.ponta027.fta.model.fta.impl.FtaPackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__NAME = eINSTANCE.getDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>Detail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__DETAIL = eINSTANCE.getDiagram_Detail();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__ID = eINSTANCE.getDiagram_Id();

		/**
		 * The meta object literal for the '{@link com.ponta027.fta.model.fta.impl.HazardImpl <em>Hazard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ponta027.fta.model.fta.impl.HazardImpl
		 * @see com.ponta027.fta.model.fta.impl.FtaPackageImpl#getHazard()
		 * @generated
		 */
		EClass HAZARD = eINSTANCE.getHazard();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD__CONDITIONS = eINSTANCE.getHazard_Conditions();

		/**
		 * The meta object literal for the '{@link com.ponta027.fta.model.fta.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ponta027.fta.model.fta.impl.EventImpl
		 * @see com.ponta027.fta.model.fta.impl.FtaPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Base Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__BASE_EVENT = eINSTANCE.getEvent_BaseEvent();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__CONDITION = eINSTANCE.getEvent_Condition();

		/**
		 * The meta object literal for the '{@link com.ponta027.fta.model.fta.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ponta027.fta.model.fta.impl.ConditionImpl
		 * @see com.ponta027.fta.model.fta.impl.FtaPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__EVENTS = eINSTANCE.getCondition_Events();

		/**
		 * The meta object literal for the '<em><b>Gate Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__GATE_KIND = eINSTANCE.getCondition_GateKind();

		/**
		 * The meta object literal for the '{@link com.ponta027.fta.model.fta.GateType <em>Gate Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ponta027.fta.model.fta.GateType
		 * @see com.ponta027.fta.model.fta.impl.FtaPackageImpl#getGateType()
		 * @generated
		 */
		EEnum GATE_TYPE = eINSTANCE.getGateType();

	}

} //FtaPackage
