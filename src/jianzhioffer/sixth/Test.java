package jianzhioffer.sixth;

/**
 * @Description: 旋转数字
 * @Author: daihong
 * @Date: Created in  2018/8/25
 */
public class Test {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        System.out.println(minNumberInRotateArray(array));
    }
    public static int minNumberInRotateArray(int[] arr){
        /*int left = 0;
        int mid = left;
        int right = arr.length-1;
        while (arr[left] >= arr[right]) {
            if (right-left == 1) {
                mid = right;
                break;
            }
            mid = (left + right) / 2;
            if (arr[mid] >= arr[left]) {
                left = mid ;
            }
            if (arr[mid] < arr[right]) {
                right = mid ;
            }

        }
        return arr[mid];*/
        int min = arr[0];
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                min = arr[i+1];
            }
        }
       return min;
    }

}
