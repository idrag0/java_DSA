package DynamicPro;

public class LCS {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        
        int[][] t = new int[2][n+1];
        
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0) {
                    t[i % 2][j] = 0;
                } else if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    t[i % 2][j] = 1 + t[(i + 1) % 2][j - 1];
                } else {
                    t[i % 2][j] = Math.max(t[i % 2][j - 1], t[(i + 1) % 2][j]);
                }
            }
        }
        
        return t[m % 2][n];
    }

    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        
        Solution obj = new Solution();
        System.out.println(obj.longestCommonSubsequence(text1, text2));
    }
}
