package xiaozhao2016.fifteenth;

/**
 * @Description: 对于一个字符串，我们想通过添加字符的方式使得新的字符串整体变成回文串，
 * 但是只能在原串的结尾添加字符，请返回在结尾添加的最短字符串。
 * <p>
 * 给定原字符串A及它的长度n，请返回添加的字符串。保证原串不是回文串。
 * <p>
 * 测试样例：
 * "ab",2
 * 返回："a"
 * @Author: daihong
 * @Date: Created in  2018/8/28
 */
public class Test {
    public static void main(String[] args) {
        String A = "abc1234321ab";
        System.out.println(addToPalindrome(A, A.length()));
    }

    public static String addToPalindrome(String A, int n) {
        // write code here
        char[] chars = A.toCharArray();
        if (n <= 1) return null;

        char[] chars1 = new char[n];
        int j = 0;
        for (int i = n - 1; i >= 0; i--) {
            chars1[j++] = chars[i];
        }
        String s = String.valueOf(chars1);
        for (int i = 0; i < n; i++) {
            if (A.substring(i, n).equals(s.substring(0, n - i))) {
                return s.substring(n - i, n);
            }
        }
        return "";
    }
}
