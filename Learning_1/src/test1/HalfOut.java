package test1;

import java.util.*;


//�����Զ������飬������ִ����������鳤��һ���Ԫ�ء�
//? : ���÷�
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
                System.out.println("���鳤��Ϊ:"+ arr.length+ ",Ԫ��" + entry.getKey()+"�ĳ��ִ���Ϊ:" +entry.getValue()+ ",����Ҫ��~~~");
                break;
            }
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println("�����뼸�������ö��Ÿ���:");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arr  = str.split(",");
        System.out.println("���������Ϊ��");
        System.out.println(Arrays.toString(arr));
        if(!halfOut(arr)){
            System.out.println("������������Ԫ��");
        }

    }}





