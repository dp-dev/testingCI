package de.studware.testingtravis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AppTest {
	private static final Logger log = LoggerFactory.getLogger(AppTest.class);

	@Test
	public void checkAddition() {
		log.info("Check Test 1");
		assertEquals(5, new App().add(2, 3));
	}

	@Test
	public void checkAdditionFalse() {
		log.info("Check Test 2");
		assertFalse(5 == new App().add(2, 4));
	}

	@Test
	public void checkSubtraction() {
		log.info("Check Test 3");
		assertEquals(-1, new App().sub(2, 3));
	}

	@Test
	public void checkSubtractionFalse() {
		log.info("Check Test 4");
		assertFalse(-1 == new App().sub(2, 4));
	}

	@Test
	public void checkMockito() {
		log.info("Mockito Check");
		List<String> mockedList = Mockito.mock(List.class);
		mockedList.add("one");
		mockedList.clear();
		Mockito.verify(mockedList).add("one");
		Mockito.verify(mockedList).clear();
	}
}
