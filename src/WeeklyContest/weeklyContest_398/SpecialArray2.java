package WeeklyContest.weeklyContest_398;
import java.util.*;
public class SpecialArray2 {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = queries.length;
        boolean[] result = new boolean[n];

        for (int i = 0; i < n; i++) {
            int i1 = queries[i][0];
            int i2 = queries[i][1];
            boolean isSpecial = true;

            for (int j = i1; j < i2; j++) {
                if ((nums[j] % 2 == 0 && nums[j + 1] % 2 == 0) || (nums[j] % 2 != 0 && nums[j + 1] % 2 != 0)) {
                    isSpecial = false;
                    break;
                }
            }
            result[i] = isSpecial;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n=s.nextInt();
        System.out.print("Enter the elments of the array: ");
        int[]nums=new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=s.nextInt();
        }
        System.out.print("Enter the length of rows of matrix: ");
        int m=s.nextInt();
        int[][]queries=new int[m][2];
        System.out.print("Enter the elements of matrix: ");
        for (int i = 0; i < m; i++) {
            for(int j=0;j<2;j++){
                queries[i][j]=s.nextInt();
            }
        }
        SpecialArray2 sa=new SpecialArray2();
        System.out.print(Arrays.toString(sa.isArraySpecial(nums, queries)));
        s.close();
    }
}
