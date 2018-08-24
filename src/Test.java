import java.util.Stack;

/**
 * @Description: $description$
 * @Author: daihong
 * @Date: Created in  2018/8/23
 */
public class Test {
  public static void main(String[] args){
      push(1);
      push(2);
      push(3);
      System.out.println(pop());
      System.out.println(pop());
      push(4);
      System.out.println(pop());
      push(5);
      System.out.println(pop());
      System.out.println(pop());
  }
   static Stack<Integer> stack1 = new Stack<Integer>();
   static Stack<Integer> stack2 = new Stack<Integer>();

    public static void push(int node) {
        stack1.push(node);
    }

    public static int pop() {
        while(!stack1.empty())
            stack2.push(stack1.pop());
        int pop =  stack2.pop();
        while (!stack2.empty()){
            stack1.push(stack2.pop());
        }
        return pop;
    }
}
