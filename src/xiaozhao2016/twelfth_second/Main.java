package xiaozhao2016.twelfth_second;

/**
 * @Description: 有一个整型数组A，代表数值不同的纸牌排成一条线。玩家a和玩家b依次拿走每张纸牌，规
 * 定玩家a先拿，玩家B后拿，但是每个玩家每次只能拿走最左或最右的纸牌，玩家a和玩家b都绝顶聪明，他们总会
 * 采用最优策略。请返回最后获胜者的分数。
 *
 * 给定纸牌序列A及序列的大小n，请返回最后分数较高者得分数(相同则返回任意一个分数)。保证A中的元素均小于
 * 等于1000。且A的大小小于等于300。
 *
 * 测试样例：
 * [1,2,100,4],4
 * 返回：101
 * @Author: daihong
 * @Date: Created in  2018/9/1
 */
public class Main {
    public static void main(String[] args){

    }
    public int cardGame(int[] A, int n) {
        // write code here
        int[][] f = new int[n][n];
        int[][] s = new int[n][n];
        for (int i = 0; i < n; ++i) {
            f[i][i] = A[i];
        }
        f[A.length - 2][A.length - 1] = Math.max(A[A.length - 2], A[A.length - 1]);
        for (int i = f.length - 2; i >= 0; i--){
            for (int j = i + 1; j <= f.length - 1; ++j) {
                s[i][j] = Math.min(f[i + 1][j], f[i][j - 1]);
                f[i][j] = Math.max(A[i] + s[i + 1][j], A[j] + s[i][j - 1]);
            }
        }
        return Math.max(f[0][n - 1], s[0][n - 1]);
    }
}
