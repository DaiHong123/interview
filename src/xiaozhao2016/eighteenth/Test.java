package xiaozhao2016.eighteenth;

/**
 * @Description: 对于一个无序数组A，请设计一个算法，求出需要排序的最短子数组的长度。
 * <p>
 * 给定一个整数数组A及它的大小n，请返回最短子数组的长度。
 * <p>
 * 测试样例：
 * [1,5,3,4,2,6,7],7
 * 返回：4
 * @Author: daihong
 * @Date: Created in  2018/8/30
 */
public class Test {
    public static void main(String[] args) {
        int[] A = {1,2,6,5,8,9};
        int a = '2';
        System.out.println(a);
        System.out.println(findShortest(A, A.length));
    }

    public static int findShortest(int[] A, int n) {
        // write code here
        int a = 0;
        int i1 = 0;
        while (i1 < n) {
            int min = A[i1];
            for (int j = i1; j < n; j++) {
                if (min > A[j]) {
                    --a;
                    break;
                }
            }
            if (a != i1) {
                a++;
                break;
            }
            a++;
            i1++;
        }
        int b = 0;
        int i = n - 1;
        while (i >= 0) {
            int max = A[i];
            for (int j = i; j >= 0; j--) {
                if (max < A[j]) {
                    --b;
                    break;
                }
            }
            if (b + i != (n - 1)) {
                b++;
                break;
            }
            b++;
            i--;
        }
        System.out.println(a+":"+b);
        return n>(a+b)?n-a-b:0;
    }
}
