package SelfStudy;

import java.util.Scanner;

public class PhoneTest{
    public static void main(String[] args) {
        Phone[] arr = new Phone[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            Phone phone = new Phone();

            System.out.println("请输入手机的品牌：");
            String band = sc.next();
            phone.setBand(band);

            System.out.println("请输入手机的价格：");
            double price = sc.nextInt();
            phone.setPrice(price);

            System.out.println("请输入手机的颜色：" );
            String color = sc.next();
            phone.setColor(color);

            arr[i] = phone;
        }

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getPrice();
        }
        double averagePrice = sum/arr.length;

        System.out.println("这"+arr.length+"部手机的平均价格为："+averagePrice);
    }
}