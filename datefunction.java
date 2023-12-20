/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demodforsql;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author User
 */
public class datefunction {
    
    public static void main(String[] args) 
    {
        String s = "2024-01-01";
String e = "2025-12-30";
LocalDate start = LocalDate.parse(s);
LocalDate end = LocalDate.parse(e);
List<LocalDate> totalDates = new ArrayList<>();
while (!start.isAfter(end)) {
    System.out.println(start);
    totalDates.add(start);
    start = start.plusDays(1);
    
 
}
 // System.out.println(totalDates);
    }
    
            
    
}
