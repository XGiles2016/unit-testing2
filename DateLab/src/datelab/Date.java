package datelab;
import java.util.Calendar;

/** A Date type.

   Note that no real functionality is implemented, the code
   simply serves to demonstrate testing and test cases.

   This source code is from the book
     "Flexible, Reliable Software:
       Using Patterns and Agile Development"
     published 2010 by CRC Press.
   Author:
     Henrik B Christensen
     Department of Computer Science
     Aarhus University

   Please visit http://www.baerbak.com/ for further information.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

*/
public class Date {
    
    private int year,month, dayOfMonth;
  /**
   * Construct a date object.
   * @param year the year as integer, i.e. year 2010 is 2010.
   * @param month the month as integer, i.e.
   *              januar is 1, december is 12.
   * @param dayOfMonth the day number in the month, range 1..31.
   * PRECONDITION: The date parameters must represent a valid date.
  */
  public Date(int year, int month, int dayOfMonth) {
     this.year = year;
     this.month = month;
     this.dayOfMonth = dayOfMonth;
  }

  public enum Weekday {
      MONDAY, TUESDAY, WEDNESDAY,
      THURSDAY, FRIDAY,
      SATURDAY, SUNDAY };
  
  public int getMonth(){
      return this.month;
  }
  
  public int getDayOfMonth(){
      return this.dayOfMonth;
  }
  public int getDaysInMonth(int month){
      if((month == 4) || (month == 6) || (month == 9) || (month == 11)){
              return 30;
      }
      else if(month == 2){
           if(isLeapYear()){
              return 29;
            }
            else
              return 28;
      }
      else 
      return 31;
  }
  /**
  * Calculate the weekday that this Date object represents.
  * @return the weekday of this date.
  */
  public Weekday dayOfWeek() {
    int dayofWeek = (this.dayOfMonth + this.month + this.year + (this.year/4) + (year%100)) % 7;
    Weekday weekday = null;
    switch(dayofWeek){
        case 0: 
            weekday = Weekday.SUNDAY;
            break;
        case 1: 
            weekday = Weekday.MONDAY;
            break;
        case 2: 
            weekday = Weekday.TUESDAY;
            break;
        case 3: 
            weekday = Weekday.WEDNESDAY;
            break;
        case 4: 
            weekday = Weekday.THURSDAY;
            break;
        case 5: 
            weekday = Weekday.FRIDAY;
            break;
        case 6: 
            weekday = Weekday.SATURDAY;
            break;
    }
    return weekday;
  }

  public boolean isLeapYear() {
	return (this.year % 400 == 0) || (this.year % 4 == 0) && (this.year % 100 != 0);
  }

  /** Calculate and return the number of days between two
      dates.
      @return the number of days between two Dates
    */
  public int daysBetween(Date d) {
     int date1 = this.getDayofYear();
     int date2 = d.getDayofYear();
     return date2 - date1;
}
  public int getDayofYear(){
      Calendar cal = Calendar.getInstance();
      cal.set(this.year, this.month - 1, this.dayOfMonth);
      int day = cal.get(Calendar.DAY_OF_YEAR);
      return day;
  }
}
