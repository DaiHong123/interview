package xiaozhao2016.fifteenth;

/**
 * @Description: 对于一个字符串，我们想通过添加字符的方式使得新的字符串整体变成回文串，
 * 但是只能在原串的结尾添加字符，请返回在结尾添加的最短字符串。
 *
 * 给定原字符串A及它的长度n，请返回添加的字符串。保证原串不是回文串。
 *
 * 测试样例：
 * "ab",2
 * 返回："a"
 * @Author: daihong
 * @Date: Created in  2018/8/28
 */
public class Test {
    public static void main(String[] args){
        String A = "abbbbbaa";
        System.out.println(addToPalindrome(A,A.length()));
    }
    public static String addToPalindrome(String A, int n) {
        // write code here
        char[] chars = A.toCharArray();
        if (n<=1) return null;
        String s = "";
        if (n==2) return String.valueOf(chars[0]);
        if (n>3){
            for (int i=n-2;i>=0;i--){
                s +=chars[i];
            }
        }

        return s;
    }
}
