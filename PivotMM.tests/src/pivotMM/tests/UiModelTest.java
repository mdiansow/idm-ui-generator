/**
 */
package pivotMM.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pivotMM.PivotMMFactory;
import pivotMM.UiModel;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ui Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UiModelTest extends TestCase {

	/**
	 * The fixture for this Ui Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiModel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UiModelTest.class);
	}

	/**
	 * Constructs a new Ui Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Ui Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(UiModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Ui Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiModel getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PivotMMFactory.eINSTANCE.createUiModel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //UiModelTest
