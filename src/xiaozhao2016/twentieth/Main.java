package xiaozhao2016.twentieth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Description:找第一次只出现一次的字符
 * @Author: daihong
 * @Date: Created in  2018/8/31
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        int i = 0;
        while (t != 0) {
            BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
            String str = bufferedReader1.readLine();
            System.out.println(firstOnly(str));
            t--;
        }
    }

    public static char firstOnlyOne(String str) {
        int[] chars1 = new int[256];
        for (int i = 0; i < chars1.length; i++) {
            chars1[i] = 0;
        }
        for (int i = 0; i < str.length(); i++) {
                chars1[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (chars1[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }
        return '\0';
    }

    public static char firstOnly(String str){
        char[] ch = str.toCharArray();
        int[] hashmap = new int[127];
        for(char c:ch){
            hashmap[c] ++;
        }
        for(char c:ch){
            if(hashmap[c]==1){
                return c;
            }
        }
        return 0;
    }
}
