/**
 * <copyright>
 * </copyright>
 *
 * $Id: SourceDialect.java,v 1.1 2009/01/31 00:22:40 xli Exp $
 */
package org.eclipse.datatools.enablement.ibm.db2.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Source Dialect</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.datatools.enablement.ibm.db2.model.DB2ModelPackage#getSourceDialect()
 * @model
 * @generated
 */
public final class SourceDialect extends AbstractEnumerator {
	/**
	 * The '<em><b>UNKNOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNKNOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN = 0;

	/**
	 * The '<em><b>PLSQL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLSQL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLSQL_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PLSQL = 1;

	/**
	 * The '<em><b>DB2SQLPL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DB2SQLPL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DB2SQLPL_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DB2SQLPL = 2;

	/**
	 * The '<em><b>UNKNOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @generated
	 * @ordered
	 */
	public static final SourceDialect UNKNOWN_LITERAL = new SourceDialect(UNKNOWN, "UNKNOWN", "UNKNOWN"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>PLSQL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLSQL
	 * @generated
	 * @ordered
	 */
	public static final SourceDialect PLSQL_LITERAL = new SourceDialect(PLSQL, "PLSQL", "PLSQL"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>DB2SQLPL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DB2SQLPL
	 * @generated
	 * @ordered
	 */
	public static final SourceDialect DB2SQLPL_LITERAL = new SourceDialect(DB2SQLPL, "DB2SQLPL", "DB2SQLPL"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * An array of all the '<em><b>Source Dialect</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SourceDialect[] VALUES_ARRAY =
		new SourceDialect[] {
			UNKNOWN_LITERAL,
			PLSQL_LITERAL,
			DB2SQLPL_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Source Dialect</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Source Dialect</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SourceDialect get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SourceDialect result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Source Dialect</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SourceDialect getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SourceDialect result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Source Dialect</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SourceDialect get(int value) {
		switch (value) {
			case UNKNOWN: return UNKNOWN_LITERAL;
			case PLSQL: return PLSQL_LITERAL;
			case DB2SQLPL: return DB2SQLPL_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SourceDialect(int value, String name, String literal) {
		super(value, name, literal);
	}

} //SourceDialect
