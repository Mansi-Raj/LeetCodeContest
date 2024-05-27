package WeeklyContest.weekly399;
import java.util.*;

public class StringComparisonIII {
    public String compressedString(String word) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= word.length(); i++) {
            if (i == word.length() || word.charAt(i) != word.charAt(i - 1)) {
                while(count>9){
                    result.append(9).append(word.charAt(i - 1));
                    count-=9;
                }
                result.append(count).append(word.charAt(i - 1));
                count = 1;
            } else {
                count++;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word=s.next();
        StringComparisonIII sc=new StringComparisonIII();
        System.out.print(sc.compressedString(word));
        s.close();
    }
}
