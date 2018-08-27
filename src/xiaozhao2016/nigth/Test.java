package xiaozhao2016.nigth;

import java.util.Stack;

/**
 * @Description: 栈中元素逆序
 * @Author: daihong
 * @Date: Created in  2018/8/27
 */
public class Test {
    public static void main(String[] args){
        int[] stack = {1,2,3,4,5};
        int[] ints = reverseStackRecursively(stack, 5);
        for(int i=0;i<5;i++){
            System.out.println(ints[i]);
        }
    }
    public static int[] reverseStackRecursively(int[] stack, int top) {
        // write code here
        int[] arr = new int[top];
        if (stack==null) return arr;
        Stack<Integer> stack1 = new Stack<>();
        for (int i=0;i<top;i++){
            stack1.push(stack[i]);
        }
        int i = 0;
        while (!stack1.isEmpty()){
            arr[i++] = stack1.pop();
        }
        return arr;
    }
}
