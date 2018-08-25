package xiaozhao2016.fourth;

import java.util.ArrayList;

/**
 * @Description: 顺时针打印数组
 * @Author: daihong
 * @Date: Created in  2018/8/24
 */
public class Test {
    public static void main(String[] args){
        int mat[][] = {{43,18,67,7,69,88,58,68,22,85,65,57,20,53,79,85,78,97,98,77,1,88},{28,59,57,51,79,27,37,88,39,33,2,52,11,13,13,6,52,54,5,50,85,23},
                {50,90,51,54,0,49,41,72,99,77,78,5,73,7,60,82,54,1,53,33,84,16},{85,30,22,38,78,27,25,54,11,78,6,85,81,85,81,67,9,63,9,2,47,38},
                {1,87,21,29,47,11,3,60,36,90,33,11,64,57,65,44,43,66,92,95,81,58},{49,50,17,16,18,86,55,60,43,85,35,5,66,79,21,26,41,26,28,89,69,36},
                {96,31,34,64,51,25,7,58,49,7,31,54,29,36,24,58,40,14,28,26,24,87},{81,82,50,91,81,51,30,34,72,9,71,36,42,15,60,53,73,53,99,62,20,99},
                {31,50,50,39,48,45,18,65,22,80,29,41,35,96,83,79,97,68,62,25,6,46},{47,30,42,97,39,62,34,86,18,26,62,89,89,36,88,99,56,32,65,79,84,92},
                {92,65,80,69,69,12,3,35,85,73,10,57,6,0,62,39,27,6,39,28,13,12}};

        int[] ints = clockwisePrint(mat, 11, 22);
       /* for (int i=0;i<ints.length;i++){
            System.out.println(ints[i]);
        }*/
    }
    public static int[] clockwisePrint(int[][] mat,int n,int m){
        int[] arr = new int[n*m];
        int x1 = 0;
        int x2 = m-1;
        int x3 = 0;
        int x4 = n-1;
        ArrayList<Integer> arrayList = new ArrayList<>();
        clock(mat,x1,x2,x3,x4,arrayList);
        int i = 0;
        for (Integer integer:arrayList){
            arr[i++] = integer;
        }
        return arr;
    }
    public static void clock(int[][] mat,int x1,int x2,int x3,int x4,ArrayList<Integer> arrayList){
        if (mat==null) return;
        if (x1<x3||x1>x2||x3>x4) return;
        for (int i=x1;i<=x2;i++){
            arrayList.add(mat[x1][i]);
        }
        for (int i=x1+1;i<=x4;i++){
            arrayList.add(mat[i][x2]);
        }
        if (x4>x1)
        for (int i=x2-1;i>=x3;i--){
            arrayList.add(mat[x4][i]);
        }
        if(x2>x1)
        for (int i=x4-1;i>x1;i--){
            arrayList.add(mat[i][x3]);
        }
        clock(mat,x1+1,x2-1,x3+1,x4-1,arrayList);
    }
}
