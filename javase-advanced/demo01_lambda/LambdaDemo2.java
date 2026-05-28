package demo01_lambda;

import java.util.Arrays;

/**
 * 定义数组并存储一些字符串，
 * 利用Arrays中的sort方法进行排序要求：
 * 按照字符串的长度进行排序：
 * 短的在前面，长的在后面。（暂时不比较字符串里面的内容）
 */
public class LambdaDemo2 {
    public static void main(String[] args) {
        String[]arr = {"a","bb","ccc","dddd","eeeee"};

        //指定数组的排序规则 sort方法
//        Arrays.sort(arr,new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                //字符串的长度进行排序
//                return o1.length()-o2.length();
//            }
//        });

        //Lambda 简写格式
        Arrays.sort(arr,(o1,  o2)->o1.length()-o2.length());

        System.out.println(Arrays.toString(arr));
    }
}
