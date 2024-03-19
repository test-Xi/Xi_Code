package SelfStudy;

import java.util.Scanner;

public class transform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想转化大写的金额：");
        int number = 0;
        while(true){
            number = sc.nextInt();
            if(number >= 0 && number <= 9999999){
                break;
            }else{
                System.out.println("输入错误：");
                System.out.println("请输入 0 ~ 999999");
            }
        }
        //转换
        String str = exchange(number);

        System.out.println("大写结果为：");
        System.out.println(str);
    }

    public static String exchange(int number){
        String str = "";
        char[] chs1 = {'元','拾','佰','仟','万','拾','佰'};
        char[] chs2 = {'零','壹','贰','叁','肆','伍','陆','柒','捌','玖'};
        for (int i = 0; i <= 6; i++) {
            //添加单位
            str = chs1[i] + str ;
            //转换数字
            int index = number % 10;
            str = chs2[index] + str;
            number /= 10;
        }
        return str;
    }
}
