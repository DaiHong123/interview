package xiaozhao2016.tenth;

import java.util.ArrayList;

/**
 * @Description: 找寻最大差值
 * @Author: daihong
 * @Date: Created in  2018/8/27
 */
public class Test {
    public static void main(String[] args) {
        int[] A = {9,3,1,10,5};
        int max = findMaxDivision(A, A.length);
        System.out.println(max);
    }

    public static int findMaxDivision(int[] A, int n) {
        // write code here
        int max = A[0];
        int min = A[0];
        for (int i = 0; i < n; i++) {
            if (A[i] < min) {
                min = A[i];
            }
            if (A[i] > max) {
                max = A[i];
            }
        }
        int[] arr = new int[max-min+1];
        for (int i=0;i<n;i++){
            arr[A[i]-min]++;
        }
        int count = 0;
        int Max = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==0){
                count++;
            }else {
                if (Max<count){
                    Max = count;
                }
                count=0;
            }
        }
    return Max+1;
    }
}
