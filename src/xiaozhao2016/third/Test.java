package xiaozhao2016.third;

/**
 * @Description: 顺时针旋转数组
 * @Author: daihong
 * @Date: Created in  2018/8/24
 */
public class Test {
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        rotateMatrix(arr,3);
    }
    public static int[][] rotateMatrix(int[][] mat,int n){
        int[][] arr = new int[n][n];
        if (mat==null) return arr;
        int a=0;
        for(int i=0;i<n;i++){
            int b=0;
            for (int j=n-1;j>=0;j--){
                System.out.print(mat[j][i]+" ");
                arr[a][b] = mat[j][i];
                b++;
            }
            a++;
            System.out.println();
        }
        return arr;
    }
}
