/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datelab;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Xavi
 */
public class DateTest {
  private static Date date1;  
    @BeforeClass
    public static void setUpClass() {
        date1 = new Date(2015,1,1);
    }

    public static void testGetDayofYear(){
      assertEquals(1, date1.getDayofYear());  
    }  
    
     
}
