package biweeklyContest.Biweekly130;
import java.util.*;
public class SatisfiesCondition {
    public boolean satisfiesConditions(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(m!=i+1&&grid[i][j]!=grid[i+1][j]) return false;
                if(n!=j+1&&grid[i][j]==grid[i][j+1]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of rows of matrix: ");
        int m=s.nextInt();
        System.out.print("Enter the number of cols of matrix: ");
        int n=s.nextInt();
        int[][]grid=new int[m][n];
        System.out.print("Enter the elements of matrix: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=s.nextInt();
            }
        }
        SatisfiesCondition sc=new SatisfiesCondition();
        System.out.print(sc.satisfiesConditions(grid));
        s.close();
    }
}
