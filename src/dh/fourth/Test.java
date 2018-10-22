package dh.fourth;

/**
 * @Description: 查找年龄
 * @Author: daihong
 * @Date: Created in  2018/8/30
 */
public class Test {
    public static void main(String[] args){
        int[] arr = {15,5,56,56,15,23,11,15,45,78,65,16,13,15,13,46};
        int[] sort = sort(arr);
        for (int i=0;i<sort.length;i++){
            System.out.println(sort[i]);
        }
    }
    public static int[] sort(int[] arr){
        int[] sup = new int[101];
        for (int i=0;i<arr.length;i++){
                sup[arr[i]]++;
        }
        int k = 0;
        for (int i=0;i<sup.length;i++){
         if (sup[i]!=0){
             for (int j=0;j<sup[i];j++){
                 arr[k++] = i;
             }
         }
        }
        return arr;
    }
}
