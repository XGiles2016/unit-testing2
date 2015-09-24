package edu.worcester.cs.kwurst;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GradeTest {
private static Grade grade;
	@Before
	public void setUp() throws Exception {
		grade = new Grade("B+");
	}

	@Test
	public void testGetLetterGrade() {
		assertEquals("B+", grade.getLetterGrade());
	}

	@Test
	public void testGetNumericGrade() {
		assertEquals(3.3, grade.getNumericGrade(),0);
	}

}
