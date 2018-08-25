package xiaozhao2016.eighth;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @Description: 构造最大树
 * @Author: daihong
 * @Date: Created in  2018/8/25
 */
public class Test {
    public static void main(String[] args){
        int[] A = {3,1,4,2};
        buildMaxTree(A,4);
    }
    public static int[] buildMaxTree(int[] A, int n) {
        // write code here
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i=0;i<n;i++){
            int max = A[i];
            queue.offer(A[i]);
            if (queue.peek()>max){
                max = queue.peek();
            }
        }
        return null;
    }

}
