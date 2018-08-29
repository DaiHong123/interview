package jianzhioffer.thirteenth;

import java.util.ArrayList;

/**
 * @Description: 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的
 * 偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * @Author: daihong
 * @Date: Created in  2018/8/28
 */
public class Test {
    public static void main(String[] args){
        int[] array = {2,4,6,1,3,5,7};
        reOrderArray(array);
    }
    static public void reOrderArray(int [] array) {
        if (array==null) return;
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        while (i<array.length){
            if ((array[i]&1)==0){
                arrayList.add(array[i]);
                for (int j=i;j< array.length-1;j++){
                    array[j] = array[j+1];
                }
                array[array.length-1] = -1;
            }
            if ((array[i]&1)==0){
                i=0;
            } else {
                i++;
            }
        }
        int j=0;
        for (int k=0;k<array.length;k++){
            if (array[k]==-1)
            array[k] = arrayList.get(j++);
        }
        for (int k=0;k<array.length;k++){
            System.out.println(array[k]);
        }
    }
}
