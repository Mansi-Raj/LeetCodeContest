package biweeklyContest.Biweekly131;
import java.util.*;
public class ElementOccurrences {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> xIndices = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                xIndices.add(i);
            }
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int query = queries[i];
            if (query <= xIndices.size()) {
                result[i] = xIndices.get(query - 1);
            } else {
                result[i] = -1;
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
        System.out.print("Enter the length of the queries: ");
        int m=s.nextInt();
        System.out.print("Enter elements of queries: ");
        int[]queries=new int[m];
        for (int i = 0; i < m; i++) {
            queries[i]=s.nextInt();
        }
        System.out.print("Enter the value of x: ");
        int x=s.nextInt();
        ElementOccurrences e=new ElementOccurrences();
        System.out.println(Arrays.toString(e.occurrencesOfElement(num, queries, x)));
        s.close();
    }
}
