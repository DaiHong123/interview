package dh.third;

import java.util.Random;

/**
 * @Description: 创建随机数
 * @Author: daihong
 * @Date: Created in  2018/8/30
 */
public class Test {
    public static void main(String[] args){
        int[] array = array();
        for (int i=0;i<6;i++){
            System.out.println(array[i]);
        }
    }
    public static int[] array(){
        int[] array = new int[6];
        for (int i=0;i<6;i++){
            double random = Math.random()*30;
            array[i] = (int)random+1;
        }
        return array;
    }
}
