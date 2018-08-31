package xiaozhao2016.nineteenth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Description: 首先一个正整数T（T≤20），表示数据组数。
 * 之后每组数据的第一行有2个整数n  和m  (1≤n≤105 ,0≤m≤3×105 )，依次表示镇上的人数和相互之间的认识关系数。
 * 之后m行，第 i 行每行两个数Ai和Bi   (1≤Ai ,Bi ≤n  )，表示Ai认识Bi。（保证没有重复的认识关系，但可能存在
 * 自己认识自己的认识关系）
 * 保证所有数据中80%的数据满足n≤1000,m≤10000
 * @Author: daihong
 * @Date: Created in  2018/8/30
 */
public class Test {
    public static void main(String[] args)throws Exception{
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        int t = 0;
        t = Integer.parseInt(bu.readLine());

        while(t--!=0){
            int n = 0;
            int m = 0;
            String par = bu.readLine();
            String[] r = par.split(" ");
            n = Integer.parseInt(r[0]);
            m = Integer.parseInt(r[1]);
            int[] a = new int[n+1];
            int[] b = new int[n+1];
            for(int i=0;i<m;i++){
                String par1 = bu.readLine();
                String[] r1 = par1.split(" ");
                int p1 = Integer.parseInt(r1[0]);
                int p2 = Integer.parseInt(r1[1]);
                if(p1==p2){
                    continue;
                }
                a[p1] ++;
                b[p2] ++;
            }
            int num = 0;
            int p = 0;
            for(int i=1;i<=n;i++){
                if(a[i] == 0&&b[i] == n-1){
                    num++;
                    p = i;
                    break;
                }
            }

            if(num == 0){
                System.out.println(0);
                System.out.println();
            }else{
                System.out.println(num);
                System.out.print(p);
                System.out.println();
            }

        }
    }
}
