package jianzhioffer.ninth;

/**
 * @Description: $description$
 * @Author: daihong
 * @Date: Created in  2018/8/27
 */
public class Test {
    public static void main(String[] args){

    }
    public int JumpFloorII(int target) {
        if (target==1) return 1;
        if (target==2) return 2;
        if (target==3) return 4;
        return 2*JumpFloorII(target-1);
    }
}
