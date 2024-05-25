package biweeklyContest.Biweekly131;
import java.util.*;

public class DistinctColorBalls {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer, Integer> ballMap = new HashMap<>();
        HashMap<Integer, Integer> colorMap = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        for (int[] query : queries) {
            int ball = query[0];
            int newColor = query[1];

            if (ballMap.containsKey(ball)) {
                int oldColor = ballMap.get(ball);
                int count = colorMap.get(oldColor);

                if (count == 1) {
                    colorMap.remove(oldColor);
                } else {
                    colorMap.put(oldColor, count - 1);
                }
            }

            ballMap.put(ball, newColor);
            colorMap.put(newColor, colorMap.getOrDefault(newColor, 0) + 1);

            res.add(colorMap.size());
        }

        int[] resultArray = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            resultArray[i] = res.get(i);
        }

        return resultArray;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value of limit: ");
        int limit=s.nextInt();
        System.out.print("Enter the length of the queries: ");
        int m=s.nextInt();
        System.out.print("Enter elements of queries: ");
        int[][]queries=new int[m][2];
        for (int i = 0; i < m; i++) {
            for(int j=0;j<2;j++){
                queries[i][j]=s.nextInt();
            }
        }
        DistinctColorBalls d=new DistinctColorBalls();
        System.out.print(Arrays.toString(d.queryResults(limit, queries)));
        s.close();
    }
}
