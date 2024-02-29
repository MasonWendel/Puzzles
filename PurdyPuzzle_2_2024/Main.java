import java.util.*; 
import java.io.*;
import java.time.YearMonth; 

public class Main { 
    public static void main(String[] args) {

        
        int count = 0; 

        System.out.println(Tools.getFactors(12));

        // for(int year = 2001; year<=2100; year++){
        //     for(int month = 1; month<=12; month++){
        //         YearMonth yearMonthObject = YearMonth.of(year, month);
        //         for(int day = 1; day<=yearMonthObject.lengthOfMonth();day++){
        //             System.out.printf("%d/%d/%d%n",month, day, year);
        //             int date = Tools.dateToInt(month, day, year); 
        //             if(Tools.isAdmirable(date)){
        //                 count++; 
        //             }
        //         }
        //     }
        // }

        System.out.println(count);
    }
}