package xiaozhao2016.thirteenth;

/**
 * @Description: 对于两个字符串A，B。请设计一个高效算法，找到B在A中第一次出现的起始位置。若B未在A中出现，则返回-1。
 * <p>
 * 给定两个字符串A和B，及它们的长度lena和lenb，请返回题目所求的答案。
 * <p>
 * 测试样例：
 * "acbc",4,"bc",2
 * 返回：2
 * @Author: daihong
 * @Date: Created in  2018/8/28
 */
public class Test {
    public static void main(String[] args) {
        String A = "acac";
        String B = "bc";
        System.out.println(findAppearance(A, A.length(), B, B.length())) ;
    }

    public static int findAppearance(String A, int lena, String B, int lenb) {
        // write code here
        char[] charsA = A.toCharArray();
        char[] charsB = B.toCharArray();
        int i = 0, j = 0;
        while (i < lena && j < lenb) {
            if (charsA[i] == charsB[j]) {
                i++;
                j++;
            }else if (charsA[i] != charsB[j]) {
                i = i - j + 1;
                j = 0;
            }
        }
        if (j>=lenb){
            return i-j;
        }else {
            return -1;
        }
    }
}
