import java.util.*; 
import java.io.*;
import java.time.YearMonth; 

public class Main { 
    public static void main(String[] args) {

        
        int count = 0; 

        System.out.println(Integer.parseInt(String.format("%02d%02d%02d",2,5,1024)));

        for(int year = 1; year<=100; year++){
            for(int month = 1; month<=12; month++){
                YearMonth yearMonthObject = YearMonth.of(year, month);
                for(int day = 1; day<=yearMonthObject.lengthOfMonth();day++){
                  
                    int date = Tools.dateToInt(month, day, year); 
                    if(Tools.isAdmirable(date)){
                        System.out.println(date);
                        count++; 
                    }
                }
            }
        }

        System.out.println(count);
    }
}