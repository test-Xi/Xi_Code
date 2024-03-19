package SelfStudy;

import java.util.Scanner;

public class HuiWenString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str= sc.nextLine();
        boolean result=judge(str);
        if(result){
            System.out.println("字符串："+str+"确认为回文字符串！");
        }else{
            System.out.println("字符串："+str+"不是回文字符串！");
        }
    }

    public static boolean judge(String str){
        int left =0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
