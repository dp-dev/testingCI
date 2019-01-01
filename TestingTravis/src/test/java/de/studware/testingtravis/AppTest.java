package de.studware.testingtravis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
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

	@Test
	public void checkSubtraction() {
		System.out.println("Check Test 3");
		assertEquals(-1, new App().sub(2, 3));
	}

	@Test
	public void checkSubtractionFalse() {
		System.out.println("Check Test 4");
		assertFalse(-1 == new App().sub(2, 4));
	}

	@Test
	public void checkMockito() {
		System.out.println("Mockito Check");
		List<String> mockedList = mock(List.class);
		mockedList.add("one");
		mockedList.clear();
		verify(mockedList).add("one");
		verify(mockedList).clear();
	}
}
