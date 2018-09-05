package xiaozhao2016.thirtieth;

/**
 * @Description: 现在有一栋高楼，但是电梯却出了故障，无奈的你只能走楼梯上楼，根据你的腿长，你一
 * 次能走1级或2级楼梯，已知你要走n级楼梯才能走到你的目的楼层，请计算你走到目的楼层的方案数，由于楼很高，
 * 所以n的范围为int范围内的正整数。
 *
 * 给定楼梯总数n，请返回方案数。为了防止溢出，请返回结果Mod 1000000007的值。
 *
 * 测试样例：
 * 3
 * 返回：3
 * @Author: daihong
 * @Date: Created in  2018/9/5
 */
public class Main {
    public static void main(String[] args){
        System.out.println(countWays(1));
    }
    public static int countWays(int n) {
        // write code here
       if(n<=0){
           return 0;
       }
       long[] arr = new long[n];
           arr[0] = 1;
      if (n>=2){
          arr[1] = 2;
          for (int i=2;i<arr.length;i++){
              arr[i] = arr[i-1]+arr[i-2];
          }
      }
       return (int)arr[n-1]%1000000007;
    }
}
