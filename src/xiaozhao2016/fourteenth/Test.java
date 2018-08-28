package xiaozhao2016.fourteenth;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Description: 对于一个无序数组，数组中元素为互不相同的整数，请返回其中最小的k个数，顺序与原数组中元素顺序一致。
 *
 * 给定一个整数数组A及它的大小n，同时给定k，请返回其中最小的k个数。
 *
 * 测试样例：
 * [1,2,4,3],4,2
 * 返回：[1,2]
 * @Author: daihong
 * @Date: Created in  2018/8/28
 */
public class Test {
    public static void main(String[] args){
        int[] A = {3188,4522,2526,4085,1621,723,1073};
        int[] kthNumbers = findKthNumbers(A, A.length, 6);

    }
    static public int[] findKthNumbers(int[] A, int n, int k) {
        // write code here
        int[] B = new int[k];
        if(k<=0) return B;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<n;i++){
            int max = 0;
            int s = 0;
            if (count<n-k){
                for (int j=0;j<n;j++){
                    if (A[j]>max){
                        if (map.get(j)==null){
                            max = A[j];
                            s=j;
                        }
                    }
                }
                map.put(s,max);
                ++count;
            }
        }
        int a = 0;
        for (int i=0;i<n;i++){
           if (map.get(i)==null){
               B[a++] = A[i];
           }
        }
        return B;
    }

}
