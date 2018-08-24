package second;

/**
 * @Description: 旋转字符串
 * @Author: daihong
 * @Date: Created in  2018/8/24
 */
public class Test {
    public static void main(String[] args){
        String str = "ABCDEFGH";
        System.out.println(rotateString(str,8,4));
    }
    public static String rotateString(String A,int n,int p){
        char[] chars = A.toCharArray();
        char[] chars1 = new char[p+1];
        char[] chars2 = new char[n-p-1];
        int k=0,j=0;
        for (int i=0;i<n;i++){
            if(i<p+1)
            chars1[k++] = chars[i];
            else
                chars2[j++] = chars[i];
        }
        String str1 = new String(chars1);
        String str2 = new String(chars2);
        return str2+str1;
    }
}
