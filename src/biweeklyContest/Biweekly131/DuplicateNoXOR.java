package biweeklyContest.Biweekly131;
import java.util.*;

public class DuplicateNoXOR {
    public int duplicateNumbersXOR(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 2) {
                result ^= entry.getKey();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=s.nextInt();
        System.out.print("Enter the elements of the array: ");
        int[]num=new int[n];
        for (int i = 0; i < n; i++) {
            num[i]=s.nextInt();
        }
        DuplicateNoXOR d=new DuplicateNoXOR();
        System.out.print(d.duplicateNumbersXOR(num));
        s.close();
    }
}
