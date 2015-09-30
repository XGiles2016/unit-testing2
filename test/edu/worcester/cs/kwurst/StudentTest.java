package edu.worcester.cs.kwurst;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {

	private static Student student1;
	private static Student student2;
        private static Course course1;
        private static Course course2;
        private static Course course3;
        private static Course course4;
        private static Grade a;
        private static Grade b;
	
	@Before
	public void setUp() throws Exception {
		student1 = new Student("Jane", "Smith");
		student2 = new Student("John", "Doe");
                course1 = new Course("Computer Science", 140 , "Basics", 3);
                course2 = new Course("Math", 200 , "Calc", 4);
                course3 = new Course("English", 100 , "English101", 3);
                course4 = new Course("Science", 200, "Physics", 4);
                a = new Grade("A");
                b = new Grade("B");
                
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
                String currentId = student1.getId();
                int x = Integer.parseInt(currentId);
                x = x + 1;                
                currentId = String.format("%07d",x);
                assertEquals(currentId, student2.getId());
        } 

	@Test
	public void testGpa() {
		student1.addCourse(course1, "Spring", 2012, a);
                student1.addCourse(course2, "Spring", 2012, a);
                student1.addCourse(course3, "Spring", 2012, b);
                student1.addCourse(course4, "Spring", 2012, b);
                assertEquals(student1.getGpa(), 3.5, 0);
                
	}

	@Test
	public void testGetCurrentEarnedCr() {
		student1.addCourse(course1, "Spring", 2012, a);
                student1.addCourse(course2, "Spring", 2012, a);
                student1.addCourse(course3, "Spring", 2012, b);
                student1.addCourse(course4, "Spring", 2012, b);
                assertEquals(student1.getCurrentEarnedCr(), 14);
	}

	@Test
	public void testGetAnticipatedAdditionalCr() {
		student1.addCourse(course1, "Spring", 2012, a);
                student1.addCourse(course2, "Spring", 2012, a);
                student1.addCourse(course3, "Spring", 2012, b);
                student1.addCourse(course4, "Spring", 2012, b);
                assertEquals(student1.getAnticipatedRemainingCr(), 106);
	}

	@Test
	public void testLascComplete() {
		student1.setLascComplete(false);
                assertEquals(student1.getLascComplete(), false);
	}

	@Test
	public void testGetMajorComplete() {
		student1.setMajorComplete(true);
                assertEquals(student1.getMajorComplete(), true);
	}
/**
     * Test of readyToGraduate method, of class Student.
     */
    @Test
    public void testReadyToGraduate() {
        student1.setCurrentEarnedCr(120);
        student1.setGpa(3.0);
        student1.setLascComplete(true);
        student1.setMajorComplete(true);
        boolean expResult = true;
        assertEquals(expResult, student1.readyToGraduate());  
    }
    
    @Test
    public void testReadyToGraduate2() {
        student1.setCurrentEarnedCr(110);
        student1.setGpa(3.0);
        student1.setLascComplete(true);
        student1.setMajorComplete(true);
        boolean expResult = false;
        assertEquals(expResult, student1.readyToGraduate());  
    }
     @Test
    public void testReadyToGraduate3() {
        student1.setCurrentEarnedCr(120);
        student1.setGpa(1.0);
        student1.setLascComplete(true);
        student1.setMajorComplete(true);
        boolean expResult = false;
        assertEquals(expResult, student1.readyToGraduate());  
    }

     @Test
    public void testReadyToGraduate4() {
        student1.setCurrentEarnedCr(120);
        student1.setGpa(3.0);
        student1.setLascComplete(false);
        student1.setMajorComplete(true);
        boolean expResult = false;
        assertEquals(expResult, student1.readyToGraduate());  
    }
     
    @Test
    public void testReadyToGraduate5() {
        student1.setCurrentEarnedCr(120);
        student1.setGpa(3.0);
        student1.setLascComplete(true);
        student1.setMajorComplete(false);
        boolean expResult = false;
        assertEquals(expResult, student1.readyToGraduate());  
    }

	@Test
	public void testGetTranscript() {
		fail("Not yet implemented");
	}

}
