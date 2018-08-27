package jianzhioffer.twlenth;

/**
 * @Description: 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * @Author: daihong
 * @Date: Created in  2018/8/27
 */
public class Test {
    public static void main(String[] args){
        System.out.println(Power(2,-1));
    }
    public static double Power(double base, int exponent) {
        int ex = Math.abs(exponent);
        double count = 1;
        while (ex!=0){
            count= count*base;
            --ex;
        }
        return exponent>=0? count:(1/count);
    }
}
