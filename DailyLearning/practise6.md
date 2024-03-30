#  字符串排序
输入为若干英文单词，每行一个，以#作为输入结束标志。其中英文单词总数不
超过 20 个，英文单词为长度小于 10 的仅由小写英文字母组成的字符串。输出为排
序后的结果，每个单词后面都额外输出一个空格。 

```java
import java.util.ArrayList;
import java.util.Scanner;

public class StringSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("请输入不超过20个的全小写英语单词:");
        System.out.println("#作为结束标志");
        System.out.println("注意一行一个单词");

        String regex = "[a-z]{1,10}";
        while (true) {
            String str = sc.next();
            if (str.equals("#") || list.size() >= 20) {
                break;
            }
            if (!str.matches(regex)) {
                System.out.println(str + "格式不正确!");
                continue;
            }
            list.add(str);
        }
        //数组下标代表字符串长度
        ArrayList<Integer>[] arr = new ArrayList[10];
        for (int i = 0; i < list.size(); i++) {
            int len = list.get(i).length();
            //判断非空
            if(arr[len] == null){
                //为数组中有效集合分配空间
                arr[len] = new ArrayList<>();
            }
            //将字符串坐标放入到下标为长度的集合中
            arr[len].add(i);
        }
        System.out.println();
        StringBuilder sb = new StringBuilder();
        //不存在长度为0的字符串
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == null){
                continue;
            }
            for (int j = 0; j < arr[i].size(); j++) {
                Integer index = arr[i].get(j);
                String s = list.get(index);
                sb.append(s+" ");
            }
        }
        System.out.println(sb);
    }
}
```