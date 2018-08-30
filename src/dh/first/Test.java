package dh.first;

/**
 * @Description: 一个数组，求每个数组除第一个元素的值。
 * @Author: daihong
 * @Date: Created in  2018/8/30
 */
public class Test {
    public static void main(String[] args){
        int[] arr = {4,5,6,8,3,0};
        int[] array = newArray(arr);
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    private static int[] newArray(int[] arr){
       if (arr==null) {
           return null;
       }
       if (arr[0]==0){
           return null;
       }
       int divisor = arr[0];
      for (int i=0;i<arr.length;i++){
          //陷阱不能直接arr[i] = arr[i]/arr[0]，因为这样的话，在第一次除就把arr[0]的值改为1了，也可以倒着求
          arr[i] = (arr[i]/divisor);
      }
      return arr;
    }
}
