package demo12_big_decimal_api;

import java.math.BigDecimal;

/**
 * 目标：BigDecimal(大的小数)API常用方法
 * 作用：用于小数的精确失真问题，精确计算， 用来表示很大的小数
 *
 * 构造方法获取BigDecimal对象（较大的小数，超出double取值范围）
 * public BigDecimal(double val)
 * public BigDecimal(String val)
 *
 * 静态方法获取BigDecimal对象（较小）
 * public static BigDecimal valueOf(double val)
 *
 */
public class demo1_Big_Decimal_api {
    public static void main(String[] args) {

        //1.通过传递double类型的小数，来创建对象
        //细节：这种方式有可能是不精确的，所以不建议使用
        BigDecimal bd1 = new BigDecimal(0.01);//不精确
        BigDecimal bd2 = new BigDecimal(0.09);//不精确

//        System.out.println(bd1);
//        System.out.println(bd2);

        //2.通过传递字符串表述的小数，来创建对象（推荐使用）
        //细节：如果要表示的数字较大，超过double取值范围，推荐使用构造方法
        BigDecimal bd3 = new BigDecimal("0.01");
        BigDecimal bd4 = new BigDecimal("0.03");
        BigDecimal bd5 = bd3.add(bd4);
        System.out.println(bd3);
        System.out.println(bd5);//0.04

        //3.通过静态方法获取对象（推荐使用）
        //细节：如果要表示的数字不大，没有超过double取值范围，推荐使用静态方法
        //     [0~10]之间的整数，方法会返回底层已经创建好的对象，不会创建new新的对象
        BigDecimal bd6 = BigDecimal.valueOf(10);
        System.out.println(bd6);

    }
}
