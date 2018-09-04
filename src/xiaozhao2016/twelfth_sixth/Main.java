package xiaozhao2016.twelfth_sixth;

/**
 * @Description: 对于两个字符串A和B，我们需要进行插入、删除和修改操作将A串变为B串，
 * 定义c0，c1，c2分别为三种操作的代价，请设计一个高效算法，求出将A串变为B串所需要的最少代价。
 *
 * 给定两个字符串A和B，及它们的长度和三种操作代价，请返回将A串变为B串所需要的最小代价。
 * 保证两串长度均小于等于300，且三种代价值均小于等于100。
 *
 * 测试样例：
 * "abc",3,"adc",3,5,3,100
 * 返回：8
 * @Author: daihong
 * @Date: Created in  2018/9/3
 */
public class Main {
    public static void main(String[] args){
        String A = "abc";
        String B = "adc";
        System.out.println(findMinCost(A,A.length(),B,B.length(),5,3,100));
    }
    public static int findMinCost(String A, int n, String B, int m, int c0, int c1, int c2) {
        // write code here
        int[][] arr = new int[n+1][m+1];
        for (int i=0;i<n+1;i++){
            arr[i][0] = c1*i;
        }
        for (int j=0;j<m+1;j++){
            arr[0][j] = c0*j;
        }
        for (int i=1;i<n+1;i++){
            for (int j=1;j<m+1;j++){
                if (A.charAt(i-1)==B.charAt(j-1)){
                    arr[i][j] = arr[i-1][j-1];
                }else {
                    arr[i][j] = Math.min(arr[i-1][j-1]+c2,Math.min(arr[i-1][j]+c1,arr[i][j-1]+c0));
                }
            }
        }
        return arr[n][m];
    }
}
