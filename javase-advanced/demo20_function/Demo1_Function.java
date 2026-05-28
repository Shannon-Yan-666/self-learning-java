package demo20_function;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 目标：了解什么是方法引用
 *      把已经存在的方法拿过来用，当做函数式接口中抽象方法的方法体
 * 引用符号：  ::
 * 注意事项：
 *      1、需要有函数式接口
 *      2、被引用方法必须已经存在（Java工具类、三方提供、自己写）
 *      3、被引用方法的形参和返回值需要跟抽象方法保持一致，被引用方法的功能，要满足当前的需求
 *
 */
public class Demo1_Function {
    public static void main(String[] args) {
        //需求：创建一个数组，进行倒序排序
        Integer[]arr = {3,2,5,4,1,6};

        //匿名内部类
        Arrays.sort(arr,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        //Lambda表达式
        //因为第二个参数的类型Comparator是一个函数式接口
        Arrays.sort(arr,(o1,o2)-> o2-o1);

        //方法引用
        //1.引用处需要是函数式接口
        //2.被引用的方法需要已经存在
        //3.被引用方法的形参和返回值，需要跟抽象方法的形参和返回值保持一致
        //4.被引用的方法功能，需要满足当前的需求
        Arrays.sort(arr,Demo1_Function::subtraction);

        System.out.println(Arrays.toString(arr));
    }


    //可以是Java已经写好的方法，也可以是一些第三方的工具类
    public static int subtraction(int a, int b){
        return a-b;
    }
}
