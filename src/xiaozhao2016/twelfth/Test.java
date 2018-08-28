package xiaozhao2016.twelfth;

import java.util.ArrayList;

/**
 * @Description: 现定义数组单调和为所有元素i的f(i)值之和。这里的f(i)函数定义为元素i左边(不包括其自身)
 * 小于等于它的数字之和。请设计一个高效算法，计算数组的单调和。
 * 给定一个数组A同时给定数组的大小n，请返回数组的单调和。保证数组大小小于等于500，同时保证单调和不会超过int范围。
 * <p>
 * 测试样例：
 * [1,3,5,2,4,6],6
 * 返回：27
 * @Author: daihong
 * @Date: Created in  2018/8/27
 */
public class Test {
    public static void main(String[] args) {
        int[] A = {1,3,5,2,4,6};
        calcMonoSum(A,A.length);
    }
    public static int calcMonoSum(int[] A, int n) {
        // write code here
        int count = 0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i>j&&A[i]>=A[j]){
                  count = count + A[j];
                }else if (i<=j){
                    break;
                }
            }
        }
        return count;
    }

}
