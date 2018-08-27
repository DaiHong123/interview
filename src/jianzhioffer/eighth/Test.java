package jianzhioffer.eighth;

/**
 * @Description: 青蛙跳台阶
 * @Author: daihong
 * @Date: Created in  2018/8/27
 */
public class Test {
    public static void main(String[] args){
        System.out.println(JumpFloor(3));
    }
    public static int JumpFloor(int target) {
        if (target==1) return 1;
        if (target==2) return 2;
       return JumpFloor(target-1)+JumpFloor(target-2);
    }
}
