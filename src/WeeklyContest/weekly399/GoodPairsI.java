package WeeklyContest.weekly399;
import java.util.*;

public class GoodPairsI {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count=0;
        int n=nums1.length;
        int m=nums2.length;
        for (int value : nums1) {
            for (int i : nums2) {
                if (value % (i * k) == 0) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size of the array1: ");
        int n=s.nextInt();
        System.out.print("Enter the elements of the array1: ");
        int[]nums1=new int[n];
        for (int i = 0; i < n; i++) {
            nums1[i]=s.nextInt();
        }
        System.out.print("Enter the size of the array2: ");
        int m=s.nextInt();
        System.out.print("Enter the elements of the array2: ");
        int[]nums2=new int[m];
        for (int i = 0; i < n; i++) {
            nums2[i]=s.nextInt();
        }
        System.out.print("Enter the value of k: ");
        int k=s.nextInt();
        GoodPairsI g=new GoodPairsI();
        System.out.print(g.numberOfPairs(nums1,nums2,k));
    }
}
