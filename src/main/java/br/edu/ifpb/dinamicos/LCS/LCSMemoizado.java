package br.edu.ifpb.dinamicos.LCS;

public class LCSMemoizado {

    static final int maximum = 1000;

    public static int lcs(String X, String Y, int m, int n, int[][] dp) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (dp[m - 1][n - 1] != -1) {
            return dp[m - 1][n - 1];
        }

        if (X.charAt(m - 1) == Y.charAt(n - 1)) {

            dp[m - 1][n - 1] = 1 + lcs(X, Y, m - 1, n - 1, dp);

        } else {

            dp[m - 1][n - 1] = Math.max(lcs(X, Y, m, n - 1, dp),
                    lcs(X, Y, m - 1, n, dp));

        }
        return dp[m - 1][n - 1];
    }

}
