package WeeklyContest.weeklyContest_398;
import java.util.*;
public class SpecialArray1 {
    public boolean isArraySpecial(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]%2==0&&nums[i+1]%2==0||nums[i]%2!=0&&nums[i+1]%2!=0){
                return false;
            }
        }
        return true;
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
        SpecialArray1 sa=new SpecialArray1();
        System.out.println(sa.isArraySpecial(num));
        s.close();
    }
}
