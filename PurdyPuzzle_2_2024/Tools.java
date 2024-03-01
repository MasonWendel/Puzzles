import java.util.*;

public class Tools {
    private static Map<Integer, TreeSet<Integer>> factorCache = new HashMap<>();

    public static TreeSet<Integer> getFactors(int number) {
        if (factorCache.containsKey(number)) {
            return factorCache.get(number);
        }

        TreeSet<Integer> factors = new TreeSet<>();
        factors.add(1);

        int sqrtNumber = (int) Math.sqrt(number);

        for (int i = 2; i <= sqrtNumber; i++) {
            if (number % i == 0) {
                factors.add(i);
                factors.add(number / i);
            }
        }

        factorCache.put(number, factors);
        return factors;
    }

    public static boolean isAdmirable(int x) {
        TreeSet<Integer> set = getFactors(x);
        List<Integer> nums = new ArrayList<>(set);
    
        int sum = nums.stream().mapToInt(Integer::intValue).sum();
    
        for (int subtracted : nums) {
            if (sum - subtracted*2 == x) {
                return true;
            }
        }
    
        return false;
    }

    public static int dateToInt(int month, int day, int year) {
        return Integer.parseInt(String.format("%02d%02d%02d",month,day,year));
    }
}
