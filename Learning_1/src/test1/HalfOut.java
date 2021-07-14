package test1;

import java.util.*;


//输入自定义数组，输出出现次数超过数组长度一半的元素。
//? : 的用法
public class HalfOut {
    public static boolean halfOut(String[] arr){
        boolean f = false;
        Map<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            Integer num = map.get(s);
            map.put(s, num == null ? 1 : num + 1);
        }

        Set<Map.Entry<String, Integer>> set = map.entrySet();

        for (Map.Entry<String, Integer> entry : set) {
            if (entry.getValue() > arr.length / 2) {
                f = true;
                System.out.println("数组长度为:"+ arr.length+ ",元素" + entry.getKey()+"的出现次数为:" +entry.getValue()+ ",符合要求~~~");
                break;
            }
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println("请输入几个数并用逗号隔开:");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arr  = str.split(",");
        System.out.println("输入的数组为：");
        System.out.println(Arrays.toString(arr));
        if(!halfOut(arr)){
            System.out.println("无满足条件的元素");
        }

    }}





