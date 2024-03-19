package SelfStudy;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem{
    public static void main(String[] args) {
        ArrayList<User> list1 = new ArrayList<>();
        ArrayList<Student> list2 = new ArrayList<>();

        land:while(true){
            String  goal = start1();
            switch(goal){
                case "1" -> {
                    boolean flag = landing(list1);
                    if(flag){
                        break land;
                    }
                }
                case "2" -> register(list1);
                case "3" -> forgetPassword(list1);
                case "4" -> {
                    System.out.println("好的,祝你生活愉快!");
                    System.exit(0);
                }
                default  -> System.out.println("输入错误,请重新输入!");
            }
        }
        while(true){
            String  goal = start();
            switch(goal){
                case "1" -> addStudent(list2);
                case "2" -> deleteStudent(list2);
                case "3" -> changeStudent(list2);
                case "4" -> searchStudent(list2);
                case "5" -> {
                    System.out.println("好的,祝你生活愉快!");
                    System.exit(0);
                }
                default  -> System.out.println("输入错误,请重新输入!");

            }
        }
    }
    public static boolean landing(ArrayList<User> list){
        for (int i = 0; i < 3; i++) {
            System.out.println("----------欢迎来到学生管理系统---------");
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名和密码:");
            String name = sc.next();
            String password = sc.next();
            int index = getIndex1(list , name);
            if(index == -1){
                System.out.println("没有该用户存在,是否注册用户:"
                        +"\n"+"(是请输入1 , 否 请输入0)");
                String goal = sc.next();
                switch(goal){
                    case "1" -> {
                        register(list);
                        return false;
                    }
                    case "0" -> {
                        return false;
                    }
                }
            }
            if(list.get(index).getPassword().equals(password)){
                System.out.println("登陆成功!");
                return true;
            }else {
                System.out.println("登陆失败!你还有"+(2-i)+"此机会");
                if (i ==2 ) {
                    System.out.println("登陆错误!");
                    System.out.println("请选择是否忘记密码:"
                            + "\n" + "(是请输入1 , 否 请输入0)");
                    String goal = sc.next();
                    switch (goal) {
                        case "1" -> {
                            forgetPassword(list);
                            return false;
                        }
                        case "0" -> {
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }
    public static String  start(){
        System.out.println("----------欢迎来到学生管理系统---------");
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生");
        System.out.println("4.查询学生");
        System.out.println("5.  退出 ");
        System.out.println("请输入你的选择:");
        Scanner sc = new Scanner(System.in);
        String goal = sc.next();
        return goal;
    }
    public static String  start1(){
        System.out.println("----------欢迎来到学生管理系统---------");
        System.out.println("1. 登录 ");
        System.out.println("2. 注册");
        System.out.println("3.忘记密码");
        System.out.println("5. 退出 ");
        System.out.println("请输入你的选择:");
        Scanner sc = new Scanner(System.in);
        String goal = sc.next();
        return goal;
    }
    public static void addStudent(ArrayList<Student> list2){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的学号 - 姓名 - 年龄:");
        String id = sc.next();
        String name = sc.next();
        int age = sc.nextInt();
        //检验唯一
        boolean flag = isContains(list2 , id);
        if( !flag){
            Student stu = new Student(id,name,age);
            list2.add(stu);
            System.out.println("添加成功!");
        }else{
            System.out.println("添加失败!id重复");
        }

    }
    public static void deleteStudent(ArrayList<Student> list2){
        if(list2.size() == 0){
            System.out.println("该校无学生信息,请先添加再进行后续操作");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想删除学生的Id:");
        String idDelete = sc.next();
        for (int i = 0; i < list2.size(); i++) {
            String id = list2.get(i).getId();
            if(id.equals(idDelete)){
                System.out.println("删除成功!");
                list2.remove(i);
                return;
            }
        }
        System.out.println("该校无该生信息!");
        System.out.println("删除失败!");

    }
    public static void changeStudent(ArrayList<Student> list2){
        if(list2.size() == 0){
            System.out.println("该校无学生信息,请先添加再进行后续操作");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你需要修改学生的id");
        String id = sc.next();
        int index = getIndex(list2 , id);
        if(index == -1 ){
            System.out.println("修改失败!没有id符合的学生!");
            return ;
        }
        System.out.println("请输入该生修改后的个人信息:");
        System.out.println("请输入学生的学号 - 姓名 - 年龄:");
        String idReplace = sc.next();
        String nameReplace = sc.next();
        int ageReplace = sc.nextInt();
        //检验唯一
        boolean flag1 = isContains(list2 , idReplace);

        if( !flag1){
            Student stu = new Student(idReplace,nameReplace,ageReplace);
            list2.set(index , stu);
            System.out.println("修改成功!");
        }else{
            System.out.println("修改失败!id重复");
        }
    }
    public static void searchStudent(ArrayList<Student> list2){
        if(list2.size() == 0){
            System.out.println("该校无学生信息,请先添加再进行后续操作");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要查询学生信息的id");
        String goalId = sc.next();
        for (int i = 0; i < list2.size(); i++) {
            String id = list2.get(i).getId();
            if(id.equals(goalId)){
                System.out.println("查询成功!该生信息为:");
                Student stu = list2.get(i);
                System.out.println("id" + "\t" + "姓名" + "\t" + "年龄:" );
                System.out.print(stu.getId()+"\t");
                System.out.print(stu.getName()+"\t");
                System.out.print("\t" +stu.getAge());
                System.out.println();
                return ;
            }
        }
        System.out.println("没有找到该学生!");

    }
    public static int getIndex(ArrayList<Student> list , String id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)){
                return i ;
            }
        }
        return -1;
    }

    public static int getIndex1(ArrayList<User> list , String name){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public static int getIndex2(ArrayList<User> list , String idNumber) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getIdNumber().equals(idNumber)){
                return i;
            }
        }
        return -1;
    }
    public static boolean isContains(ArrayList<Student> list2 ,String id){
        for (int i = 0; i < list2.size(); i++) {
            if(list2.get(i).getId().equals(id)){
                return true ;
            }
        }
        return false;
    }
    public static void register(ArrayList<User> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的身份证号码:");
        String idNumber = sc.next();
        boolean flag = idNumberContain(list,idNumber);
        if(flag){
            System.out.println("该身份证号码已经注册!");
            System.out.println("请选择是否忘记密码:(1/0)");
            String goal = sc.next();
            switch (goal){
                case "1" -> {
                    forgetPassword(list);
                    return;
                }
                case "0" -> {
                    return;
                }
            }
        }
        System.out.println("请输入你的手机号码:");
        String number = sc.next();
        boolean flag1 = phoneContain(list,number);
        if(flag1){
            System.out.println("该手机号码已经注册!");
            System.out.println("请选择是否忘记密码:(1/0)");
            String goal = sc.next();
            switch (goal){
                case "1" ->  {
                    forgetPassword(list);
                    return;
                }
                case "0" -> {
                    return;
                }
            }
        }

        System.out.println("资质核验成功:");

        System.out.println("请输入你的用户名:");
        String name = sc.next();
        while(true){
            System.out.println("请输入你的密码:");
            String password1 = sc.next();
            System.out.println("请在此输入你的密码:");
            String password2 = sc.next();
            if(password1.equals(password2)){
                System.out.println("注册成功" +"\n"+
                        "请返回登录!");
                User user = new User(name,password1,idNumber,number);
                list.add(user);
                break;
            }else{
                System.out.println("两次密码不同,请重新输入:");
            }
        }
    }
    public static boolean idNumberContain(ArrayList<User> list , String idNumber){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIdNumber().equals(idNumber)){
                return true;
            }
        }
        return false;
    }
    public static boolean phoneContain(ArrayList<User> list , String number){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPhoneNumber().equals(number)){
                return true;
            }
        }
        return false;
    }
    public static void forgetPassword(ArrayList<User> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身份证号码:");
        String idNumber = sc.next();
        System.out.println("请输入手机号码:");
        String phoneNumber = sc.next();
        int index = getIndex2(list,idNumber);
        if(index == -1){
            System.out.println("没有该用户存在,是否注册用户:"
                    +"\n"+"(是请输入1 , 否 请输入0)");
            String goal = sc.next();
            switch(goal){
                case "1" -> {
                    register(list);
                    return ;
                }
                case "0" -> {
                    return ;
                }
            }
        }
        if(list.get(index).getPhoneNumber().equals(phoneNumber)){
            while(true){
                System.out.println("请输入你的新密码:");
                String password1 = sc.next();
                System.out.println("请在此输入你的密码:");
                String password2 = sc.next();
                if(password1.equals(password2)){
                    list.get(index).setPassword(password1);
                    System.out.println("修改成功!请返回重新登录:");
                    break;
                }else{
                    System.out.println("两次密码不同,请重新输入:");
                }
            }
        }
    }
}