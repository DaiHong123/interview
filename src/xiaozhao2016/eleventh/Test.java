package xiaozhao2016.eleventh;

/**
 * @Description: 查找数组中未出现的最小正整数
 * @Author: daihong
 * @Date: Created in  2018/8/27
 */
public class Test {
    public static void main(String[] args){
        int[] A = {-1,2,3,4};
        findArrayMex(A,A.length);
    }
    public static int findArrayMex(int[] A, int n) {
        // write code here
        sort(A,0,n-1);
        int min = 0;
        for (int i=0;i<n;i++){
            if (A[i]<0){
                A[i]=0;
            }
        }
        if (A[0]>1) min = 1;
        if (A[0]<=1){
            for (int i=0;i<n-1;i++){
                if (A[i]+1<A[i+1]){
                    min = A[i]+1;
                    break;
                }
            }
            if (min==0){
                min = A[n-1]+1;
            }
        }
       return min;
    }
    public static void sort(int[] A,int left,int right){
        int begin = left;
        int end = right;
        int key = A[left];
        while (begin<end){
            while (begin<end&&A[end]>=key){
                end--;
            }
            if (A[end]<key){
                int temp = A[end];
                A[end] = A[begin];
                A[begin] = temp;
            }
            while (begin<end&&A[begin]<=key){
                begin++;
            }
            if (A[begin]>key){
                int temp = A[begin];
                A[begin] = A[end];
                A[end] = temp;
            }
        }
        if (begin>left) sort(A,left,begin-1);
        if (right>end) sort(A,end+1,right);
    }
}
