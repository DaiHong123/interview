package xiaozhao2016.eighth;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

/**
 * @Description: 构造最大树
 * @Author: daihong
 * @Date: Created in  2018/8/25
 */
public class Test {

    public static void main(String[] args){
        int[] A = {3,1,4,2};
        int[] ints = buildMaxTree(A, 4);
        for (int i=0;i<4;i++){
            System.out.println(ints[i]);
        }
    }
    public static int[] buildMaxTree(int[] A, int n) {
        // write code here
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<n;i++){
            int pos = -1;
            while (!stack.isEmpty()&&A[stack.peek()]<A[i]){
                int t = stack.pop();
                if (res[t]==-1||A[res[t]]>A[i]){
                    res[t] = i;
                }
            }
            if (!stack.isEmpty()){
                pos = stack.peek();
            }
            stack.push(i);
            res[i] = pos;
        }
        return res;
    }

}
