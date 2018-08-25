package jianzhioffer.sixth;

/**
 * @Description: 旋转数字
 * @Author: daihong
 * @Date: Created in  2018/8/25
 */
public class Test {
    public static void main(String[] args){
        int[] array = {4,5,1,2,3};
        System.out.println(minNumberInRotateArray(array));
    }
    public static int minNumberInRotateArray(int[] array){
        if (array.length==0) return 0;
        int left = 0;
        int right = array.length-1;
        int mid = left;
        while (array[left]>=array[right]){
            if (right-left==1){
                mid = right;
                break;
            }
            mid = (left+right)/2;
            if (array[mid]>=array[left]){
                left = mid;
            }
            if (array[mid]<array[right]){
                right = mid;
            }
        }
        return array[mid];
    }

}
