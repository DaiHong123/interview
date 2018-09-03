package xiaozhao2016.twelfth_third;

import java.util.ArrayList;

/**
 * @Description: 对于一个只由0(假)、1(真)、&(逻辑与)、|(逻辑或)和^(异或)五种字符组成的
 * 逻辑表达式，再给定一个结果值。现在可以对这个没有括号的表达式任意加合法的括号，返回得到能有多少种加
 * 括号的方式，可以达到这个结果。
 *
 * 给定一个字符串表达式exp及它的长度len，同时给定结果值ret,请返回方案数。保证表达式长度小于等于300
 * 。为了防止溢出，请返回答案Mod 10007的值。
 *
 * 测试样例：
 * "1^0|0|1",7,0
 * 返回：2
 * @Author: daihong
 * @Date: Created in  2018/9/3
 */
public class Main {
    public static void main(String[] args){
        String exp = "1^0|0|1";
        countWays(exp,exp.length(),0);
    }
    public static int countWays(String exp, int len, int ret) {
        // write code here
        char[] chars = exp.toCharArray();
        if ((chars[0]!='1'&&chars[0]!='0')||(chars[len-1]!='1'&&chars[len-1]!='0')){
            return 0;
        }
        ArrayList<Character> arrayList = new ArrayList<>();
        for (int i=0;i<len;i++){
            if (chars[i]!='1'&&chars[i]!='0'){
                arrayList.add(chars[i]);
            }
        }

        return 0;
    }
}
