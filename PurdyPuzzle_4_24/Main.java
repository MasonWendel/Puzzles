import java.io.*; 
import java.util.*;

public class Main {
    static int isOct(int x){
        double num = (Math.sqrt(3*x+1)+1)/3;
        if(num == (int)num){
            return (int)num; 
        }
        return -1; 
    }
    
    static String PrintStarOct(int num, int n){
        int star = 0;
        while(num>0){
            star += num%10; 
            num/=10; 
        }
        star += n; 
        return ""+star; 
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter the N you want to get to: ");
        int nGoal = in.nextInt(); 
        int count = 0; 
        int currPentOct;
        int np = 2;
        while(true){
            int pent = np*(3*np - 1)/2; 
            System.out.println(pent);
            int oct = isOct(pent);
            if(oct != -1){
                System.out.println("Oct num: "+pent);
                count++; 
                currPentOct = pent; 
            }
            if(count == nGoal){
                System.out.println("Here is the star value of the "+nGoal+"th pentagonal number that is also octagonal: "+PrintStarOct(pent,oct));
                break; 
            }
            np++; 
        }
    }
}
