import java.util.*;

public class weightedSubstring {
    
    static String smallestString(int weight) {
        int[] charWeights = new int[26];
        charWeights[0] = 1;
        for (int i = 1; i < 26; i++) {
            charWeights[i] = (i + 1) * charWeights[i - 1] + charWeights[i - 1];
        }
        
        int[] dp = new int[weight + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        
        for (int w = 1; w <= weight; w++) {
            for (int i = 0; i < 26; i++) {
                if (charWeights[i] <= w) {
                    int prevWeight = w - charWeights[i];
                    if (dp[prevWeight] != Integer.MAX_VALUE && dp[prevWeight] + 1 < dp[w]) {
                        dp[w] = dp[prevWeight] + 1;
                    }
                }
            }
        }
        
        StringBuilder result = new StringBuilder();
        int remainingWeight = weight;
        while (remainingWeight > 0) {
            for (int i = 25; i >= 0; i--) {
                if (charWeights[i] <= remainingWeight && dp[remainingWeight - charWeights[i]] + 1 == dp[remainingWeight]) {
                    result.append((char) ('A' + i));
                    remainingWeight -= charWeights[i];
                    break;
                }
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        int weight = 25;
        System.out.println(smallestString(weight));
    }
}
