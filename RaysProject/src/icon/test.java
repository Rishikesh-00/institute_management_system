/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icon;

import java.time.Year;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.Month;
/**
 *
 * @author Ravi Kishan
 */
public class test {
     int year;
    public static void main(String[] args) {
       Calendar cal=Calendar.getInstance();
      int year = (cal.get(Calendar.YEAR))%100;
//       Year year = (Year.now());
//       //nt currentYear = currentdate.getYear();
       
      System.out.println(""+year);
        
    }
}
