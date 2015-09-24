package edu.worcester.cs.kwurst;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {

	private static Student student1;
	private static Student student2;
	
	@Before
	public void setUp() throws Exception {
		student1 = new Student("Jane", "Smith");
		student2 = new Student("John", "Doe");
	}

	@Test
	public void testGetStudentCount() {
		assertEquals(2, Student.getStudentCount());
	}

	@Test
	public void testGetFirstName() {
		assertEquals("Jane", student1.getFirstName());
	}

	@Test
	public void testGetLastName() {
		assertEquals("Doe", student2.getLastName());
	}

	@Test
	public void testGetId() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetGpa() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCurrentEarnedCr() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAnticipatedAdditionalCr() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetLascComplete() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMajorComplete() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCurrentRemainingCr() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAnticipatedRemainingCr() {
		fail("Not yet implemented");
	}

	@Test
	public void testReadyToGraduate() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTranscript() {
		fail("Not yet implemented");
	}

}
