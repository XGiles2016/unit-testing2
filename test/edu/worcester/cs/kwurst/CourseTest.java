package edu.worcester.cs.kwurst;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CourseTest {

private static Course cs;

	@Before
	public void setUp() throws Exception {
		cs = new Course("Computer Science", 101, "Basics of Computer Science", 3);
	}

	@Test
	public void testGetDepartment() {
		assertEquals("Computer Science", cs.getDepartment());
	}

	@Test
	public void testGetNumber() {
		assertEquals(101, cs.getNumber());
	}

	@Test
	public void testGetTitle() {
		assertEquals("Basics of Computer Science", cs.getTitle());
	}

	@Test
	public void testGetCredits() {
		assertEquals(3, cs.getCredits());
	}

}
