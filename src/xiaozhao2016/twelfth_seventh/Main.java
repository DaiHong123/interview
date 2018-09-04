package xiaozhao2016.twelfth_seventh;

/**
 * @Description: 对于两个字符串，请设计一个时间复杂度为O(m*n)的算法(这里的m和n为两串的长度)，求
 * 出两串的最长公共子串的长度。这里的最长公共子串的定义为两个序列U1,U2,..Un和V1,V2,...Vn，
 * 其中Ui + 1 == Ui+1,Vi + 1 == Vi+1，同时Ui == Vi。
 *
 * 给定两个字符串A和B，同时给定两串的长度n和m。
 *
 * 测试样例：
 * "1AB2345CD",9,"12345EF",7
 * 返回：4
 * @Author: daihong
 * @Date: Created in  2018/9/4
 */
public class Main {
    public static void main(String[] args){
        String A = "abbabccc";
        String B = "bcbab";
        System.out.println(findLongest(A,A.length(),B,B.length()));
    }
    public static int findLongest(String A, int n, String B, int m) {
        // write code here
        if (A==null||B==null){
            return 0;
        }
        int max = 0;
        int count = 0;
        int i=0,j=0;
        if (n<m){
            int temp = n;
            n = m;
            m = temp;
            String C = A;
            A = B;
            B = C;
        }
        while (i<n&&j<m){
            if (A.charAt(i)==B.charAt(j)){
                i++;
                j++;
                count++;
                while (i<n&&j<m){
                    if (A.charAt(i)==B.charAt(j)){
                        count++;
                        i++;
                        j++;
                    }else {
                        max = max>count?max:count;
                        count = 0;
                        i=0;
                        break;
                    }
                }

            }else {
                i++;
            }

        }
        return max;
    }
}
