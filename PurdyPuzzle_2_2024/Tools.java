import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;


public class Tools {
    
    public static TreeSet<Integer> getFactors(int number){
        TreeSet<Integer> factors  = new TreeSet<Integer>(); 

        while (number % 2 == 0) {
            System.out.print(2 + " ");
            number /= 2;
        }

        // Use a loop for odd factors starting from 3
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }

        // If the remaining number is a prime greater than 2
        if (number > 2) {
            factors.add(number); 
        }

        factors.remove(number);
        return factors; 
    }

    public static boolean isAdmirable(int x){ 
        TreeSet<Integer> set = getFactors(x);  

        Queue<Integer> nums = new LinkedList<Integer>(); 

        for(int i : set){
            nums.add(i); 
        }

        int copy = Integer.valueOf(x); 

        while(copy-->0){
            int subtracted = nums.poll(); 

            int sum = 0; 

            for(int i : nums){
                sum += i; 
            }

            sum -= subtracted; 

            if(sum == x){
                return true; 
            }

            nums.add(subtracted);
        }

        return false; 
    }


    public static int dateToInt(int month, int day, int year){
        return Integer.parseInt(""+month+day+year); 
    }

    


}
