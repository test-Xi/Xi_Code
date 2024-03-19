package SelfStudy;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend[] arr = new GirlFriend[4];

        GirlFriend g1 = new GirlFriend("张三",18,"开朗","me");
        GirlFriend g2 = new GirlFriend("李四",19,"开朗","me");
        GirlFriend g3 = new GirlFriend("王五",20,"开朗","me");
        GirlFriend g4 = new GirlFriend("赵六",17,"开朗","me");

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        arr[3] = g3;

        int sumYear = 0;
        for (int i = 0; i < arr.length; i++) {
            sumYear  += arr[i].getYear();
        }
        double averageYear = (sumYear+0.0)/arr.length;
        System.out.println("四位女朋友的平均年龄为："+averageYear);

        System.out.println();
        System.out.println("年龄低于平均年龄的有：");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第"+(i+1)+"位");
            if(arr[i].getYear() < averageYear){
                System.out.println("姓名："+arr[i].getName());
                System.out.println("年龄："+arr[i].getYear());
                System.out.println("性格："+arr[i].getGender());
                System.out.println("爱好："+arr[i].getHobby());
            }
            System.out.println();
        }
    }
}
