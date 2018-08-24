package first;

/**
 * @Description: 之字打印数组
 * @Author: daihong
 * @Date: Created in  2018/8/24
 */
public class Test {
    public static void main(String[] args){
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int[] ints = printMatrix(mat, 4, 3);
        for (int i=0;i<ints.length;i++){
            System.out.println(ints[i]);
        }

    }
    public static int[] printMatrix(int[][] mat,int n,int m){
        int[] arr = new int[n*m];
        if (mat==null) return arr;
        int k = 0;
        int index = 1;
        for (int i=0;i<n;i++){
            if ((index&1)==1){
                for (int j=0;j<m;j++){
                    arr[k++] = mat[i][j];
                }
            }else {
                for (int j=m-1;j>=0;j--){
                    arr[k++] = mat[i][j];
                }
            }
            index++;
        }
        return arr;
    }
}
