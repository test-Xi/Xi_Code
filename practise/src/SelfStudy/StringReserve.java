package SelfStudy;

import java.util.Scanner;

public class StringReserve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

        str = reserse(str);

        System.out.println("字符串的逆序结果为：");
        System.out.println(str);
    }
    public static String reserse(String str){
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
