package WeeklyContest.contest400;
import java.util.*;
public class MinimumChairs {
    public static int minimumChairs(String s) {
        int count = 0;
        int max = 0;
        for(char c : s.toCharArray()){
            if(c == 'E'){
                count++;
            } else if(c == 'L'){
                count--;
            }
            if(count > max) {
                max = count;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a string which only contains E and L: ");
        String str=s.next();
        System.out.println(minimumChairs(str));
        s.close();
    }
}
