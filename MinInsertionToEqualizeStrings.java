public class MinInsertionToEqualizeStrings {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "kac";
        
        int[] result = minInsertionsToEqualizeStrings(str1, str2);
        System.out.println(result[0] + " " + result[1]);

        String str3 = "yyyy";
        String str4 = "yyyy";
        
        result = minInsertionsToEqualizeStrings(str3, str4);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] minInsertionsToEqualizeStrings(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        // Calculate LCS length
        int lcsLength = longestCommonSubsequence(str1, str2, m, n);

        // Minimum insertions for str1 and str2 to make them equal
        int insertionsStr1 = n - lcsLength;
        int insertionsStr2 = m - lcsLength;

        return new int[]{insertionsStr1, insertionsStr2};
    }

    public static int longestCommonSubsequence(String str1, String str2, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];

        // Fill dp array
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[m][n];
    }
}
