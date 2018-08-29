package xiaozhao2016.sixteenth;

/**
 * @Description: 对于一个字符串，请设计一个高效算法，计算其中最长回文子串的长度。
 *
 * 给定字符串A以及它的长度n，请返回最长回文子串的长度。
 *
 * 测试样例：
 * "abc1234321ab",12
 * 返回：7
 * @Author: daihong
 * @Date: Created in  2018/8/29
 */
public class Test {
    public static void main(String[] args){
        String A = "abc1234321ab";
        System.out.println(getLongestPalindrome(A,A.length()));
    }
    public static int getLongestPalindrome(String A, int n) {
        // write code here
        /*char[] chars = A.toCharArray();
        int len = 0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<=n;j++){
                String s = A.substring(i,j);
               if (huiWen(s)){
                   if (s.length()>len){
                       len = s.length();
                   }
               }
            }
        }
        return len;*/
        int[][] dp = new int[n][n];
        int max = 1;
        for (int i = 0; i < n; ++i) {
            dp[i][i] = 1;
        }
        char[] a = A.toCharArray();
        for (int len = 2; len <= n; ++len) {
            for (int i = 0; i <= n - len; ++i) {
                int j = i + len - 1;
                if (len == 2 && a[i] == a[j]) {
                    dp[i][j] = len;
                    max = 2;
                    continue;
                }
                if (a[i] == a[j] && dp[i + 1][j - 1] != 0) {
                    dp[i][j] = len;
                    max = len;
                }
            }
        }
        return max;
    }
    public static Boolean huiWen(String s){
        if (s==null) return false;
        char[] chars = s.toCharArray();
        for (int i=0,j=chars.length-1;i<chars.length&j>=0;i++,j--){
            if (chars[i]!=chars[j])
                return false;
        }
        return true;
    }
}
