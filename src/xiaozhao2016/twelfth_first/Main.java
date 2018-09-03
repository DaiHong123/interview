package xiaozhao2016.twelfth_first;

/**
 * @Description: 对于字符串A，其中绝对不含有字符’.’和’*’。再给定字符串B，其中可以含有’.’
 * 或’*’，’*’字符不能是B的首字符，并且任意两个’*’字符不相邻。exp中的’.’代表任何一个字符，B中的’*’表
 * 示’*’的前一个字符可以有0个或者多个。请写一个函数，判断A是否能被B匹配。
 *
 * 给定两个字符串A和B,同时给定两个串的长度lena和lenb，请返回一个bool值代表能否匹配。保证两串的长度均
 * 小于等于300。
 *
 * 测试样例：
 * "abcd",4,".*",2
 * 返回：true
 * @Author: daihong
 * @Date: Created in  2018/9/1
 */
public class Main {
    public static void main(String[] args){
        String A = "abcd";
        String B = ".*";
        System.out.println(chkWildMatch(A,A.length(),B,B.length()));
    }
    public static boolean chkWildMatch(String A, int lena, String B, int lenb) {
        // write code here
        char[] s = A.toCharArray();
        char[] e = B.toCharArray();
        return coreFunc(s,0,e,0);
    }
    /**
     * 含义：s[si...lena]与e[ei...lenb]是否匹配，因此coreFunc(s,0,e,0)即是最终的结果
     */
    public static boolean coreFunc(char[] s,int si,char[] e,int ei){
        /**
         * 若e已经到达终点
         */
        if(ei==e.length){
            /**
             * 若s也到达了终点，代表两者匹配成功
             */
            return si==s.length;
        }
        if(ei+1==e.length||e[ei+1]!='*'){
            return si!=s.length&&(s[si]==e[ei]||e[ei]=='.')&&coreFunc(s,si+1,e,ei+1);
        }
        while(si!=s.length&&(s[si]==e[ei]||e[ei]=='.')){
            if(coreFunc(s,si,e,ei+2)){
                return true;
            }
            si++;
        }
        return coreFunc(s,si,e,ei+2);
    }
}
