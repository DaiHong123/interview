package xiaozhao2016.twelfth_fifth;

/**
 * @Description: A、B和C。如果C包含且仅包含来自A和B的所有字符，而且在C中属于A的字符之间保持原来
 * 在A中的顺序，属于B的字符之间保持原来在B中的顺序，那么称C是A和B的混编。实现一个函数，判断C是否是A和
 * B的混编。
 *
 * 给定三个字符串A,B和C，及他们的长度。请返回一个bool值，代表C是否是A和B的混编。保证三个串的长度
 * 均小于等于100。
 *
 * 测试样例：
 * "ABC",3,"12C",3,"A12BCC",6
 * 返回：true
 * @Author: daihong
 * @Date: Created in  2018/9/3
 */
public class Main {
    public static void main(String[] args){
        String A = "ABC";
        String B = "12C";
        String C = "A12BCC";
        System.out.println(chkMixture(A,A.length(),B,B.length(),C,C.length()));
    }
    public static boolean chkMixture(String A, int n, String B, int m, String C, int v) {
        // write code here
        if (A==null||B==null||C==null) {
            return false;
        }
        int i=0;
        int j=0;
        int k=0;
        while (k<v){
            if (j==m&&i<n){
                String s1 = C.substring(k,v);
                String s2 = A.substring(i,n);
                if (s1.equals(s2)){
                    return true;
                }else {
                    return false;
                }
            }else if(j<m&&i==n){
                String s1 = C.substring(k,v);
                String s2 = B.substring(j,m);
                if (s1.equals(s2)){
                    return true;
                }else {
                    return false;
                }
            }else {
                if (C.charAt(k)==B.charAt(j)){
                    j++;
                }else if (C.charAt(k)==A.charAt(i)){
                    i++;
                }else {
                    return false;
                }
            }

            k++;
        }
        return true;
    }
}
