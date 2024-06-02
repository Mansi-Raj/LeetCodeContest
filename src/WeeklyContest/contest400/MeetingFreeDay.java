package WeeklyContest.contest400;
import java.util.*;
public class MeetingFreeDay {
    public static int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        int count = 0;
        int currentEnd = 0;

        for (int[] m:meetings) {
            int start = m[0];
            int end = m[1];
            if (start > currentEnd + 1) {
                count += (start - currentEnd - 1);
            }
            if (end > currentEnd) {
                currentEnd = end;
            }
        }

        if (days > currentEnd) {
            count += (days - currentEnd);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int d=s.nextInt();
        System.out.print("Enter the number of rows: ");
        int n=s.nextInt();
        System.out.print("Enter the days no of start and end of meeting: ");
        int[][]meetings=new int [n][2];
        for (int i = 0; i < n; i++) {
            meetings[i][0]=s.nextInt();
            meetings[i][1]=s.nextInt();
        }
        System.out.println(countDays(d,meetings));
        s.close();
    }
}
