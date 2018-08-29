package xiaozhao2016.seventeenth;

/**
 * @Description: 给定一个长度为N(N > 1)的整型数组A，可以将A划分成左右两个部分，左部分A[0..K]，
 * 右部分A[K+1..N-1]，K可以取值的范围是[0,N-2]。求这么多划分方案中，左部分中的最大值减去右部分最大值的绝对值，
 * 最大是多少？
 * <p>
 * 给定整数数组A和数组的大小n，请返回题目所求的答案。
 * <p>
 * 测试样例：
 * [2,7,3,1,1],5
 * 返回：6
 * @Author: daihong
 * @Date: Created in  2018/8/29
 */
public class Test {
    public static void main(String[] args) {
        int[] A = {95, 73, 15, 94, 78};
        System.out.println(findMaxGap(A, A.length));
    }

    public static int findMaxGap(int[] A, int n) {
        // write code here
        return find(A, n, 0);
    }

    public static int find(int[] A, int n, int k) {
        if (k==n-1){
            return 0;
        }
        int s = 0;
        int[] a = new int[k + 1];
        int[] b = new int[n - k - 1];
        int j = 0;
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (i <= k) {
                a[c++] = A[i];
            }
            if (i > k) {
                b[j++] = A[i];
            }
        }
        int maxA = max(a);
        int maxB = max(b);
        s = Math.abs(maxA - maxB);
       int Max = find(A, n, k + 1);
        return Max>s?Max:s;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
