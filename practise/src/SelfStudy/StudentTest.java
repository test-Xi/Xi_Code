package SelfStudy;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr= new Student[3];

        Student stu1 = new Student("chenxi001","张三",18);
        Student stu2 = new Student("chenxi002","李四",19);
        Student stu3 = new Student("chenxi003","王五",20);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        Student stu4 = new Student("chenxi004","赵六",19);

        boolean flag = contains(arr,stu4.getId());
        if(!flag){
            int count = getCount(arr);
            if(count == arr.length){
                System.out.println("档案库已经存满");
                //创建一个新数组
                Student[] newArr = creatNewArr(arr,stu4);
                printArr(newArr);
            }else{
                //getCount得到的数字就为已经存了n个元素，而下标又为序数-1
                arr[count] = stu4;
                printArr(arr);
            }
        }else{
            System.out.println("当前id重复，请修改id在进行添加");
        }

        //根据id删除学生对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想删除的学生的id：");
        String idDelete =sc.next();
        boolean flag1 = true;
        for (int i = 0; i < arr.length; i++) {
            String id = arr[i].getId();
            if(arr[i] != null&&id.equals(idDelete)){
                flag1 = false;
                arr[i] = null;
            }
        }
        if(flag1){
            System.out.println("当前id不存在，删除失败！");
        }
        printArr(arr);

    }

    public static Student[] creatNewArr(Student[] arr,Student s){
        Student[] newArr = new Student[arr.length+1];
        for (int i = 0; i < newArr.length; i++) {
            if(i<arr.length){
                newArr[i] = arr[i];
            }else {
                newArr[i] = s;
            }
        }
        return newArr;
    }
    public static boolean contains(Student[] arr,String id){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                if(arr[i].getId() == id){
                    return true;
                }
            }
        }
        return false;
    }

    public static int getCount(Student[] arr){
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                count++;
            }
        }
        return count;
    }

    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
           if(arr[i] != null){
               System.out.println("学生"+(i+1));
               System.out.println("学号："+arr[i].getId());
               System.out.println("姓名："+arr[i].getName());
               System.out.println("年龄："+arr[i].getAge());
               System.out.println();
           }
        }
    }
}
