/**
 */
package myJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Donnee Typee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link myJava.DonneeTypee#getType <em>Type</em>}</li>
 *   <li>{@link myJava.DonneeTypee#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see myJava.MyJavaPackage#getDonneeTypee()
 * @model abstract="true"
 * @generated
 */
public interface DonneeTypee extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(JType)
	 * @see myJava.MyJavaPackage#getDonneeTypee_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JType getType();

	/**
	 * Sets the value of the '{@link myJava.DonneeTypee#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(JType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see myJava.MyJavaPackage#getDonneeTypee_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link myJava.DonneeTypee#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DonneeTypee
