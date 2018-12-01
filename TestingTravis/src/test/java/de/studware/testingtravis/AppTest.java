package de.studware.testingtravis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *           name of the test case
	 */
	/*public AppTest(String testName) {
		super(testName);
	}
	
	/**
	 * @return the suite of tests being tested
	 
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}
	
	/**
	 * Rigourous Test :-)
	 
	public void testApp() {
		assertTrue(true);
	}
	*/
	@Test
	public void checkAddition() {
		System.out.println("Check Test 1");
		assertEquals(5, new App().add(2, 3));
	}
	
	@Test
	public void checkAdditionFalse() {
		System.out.println("Check Test 2");
		assertFalse(5 == new App().add(2, 4));
	}
}
