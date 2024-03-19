package SelfStudy;

import java.util.Scanner;

public class YHSanJiao{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请问你要输出几行杨辉三角");
        int n=sc.nextInt();
        print(n);
    }
    public static void print(int n){
        int[][] arr=new int[n][];
        for (int i = 0; i < n; i++) {
            arr[i] = new int[i + 1];
            arr[i][0]=1;
            arr[i][i]=1;
            if(i>1){
                for (int j = 1; j < i; j++) {
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <=i; j++) {
                if(arr[i][j]==0){
                    break;
                }else{
                    System.out.print(arr[i][j]+"\t");
                }
            }
            System.out.println();
        }
    }
}