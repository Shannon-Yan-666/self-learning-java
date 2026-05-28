package demo01_lambda;

import java.util.Arrays;

public class LambdaDemo1 {
    public static void main(String[] args) {
        Integer[] arr = {4,2,6,3,5,7,1,9,8};
        //数组API：排序工具 sort方法
        //匿名内部类
//        Arrays.sort(arr,new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                //升序排列 ： o1 - o2
//                //降序排列 ： o2 - o1
//                return o1-o2;
//            }
//        });

        //lambda表达式-完整格式
//        Arrays.sort(arr,(Integer o1, Integer o2)-> {
//                return o1-o2;
//            }
//        );

        //lambda表达式-省略写法
        Arrays.sort(arr,(o1, o2)-> o2 - o1);

        System.out.println(Arrays.toString(arr));
    }
}
