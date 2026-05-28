package demo11_big_integer_api;

import java.math.BigInteger;

/**
 *  目标：掌握BigInteger的常用方法
 *       BingInteger是一个对象，如果需要计算，需要使用方法进行操作
 *
 *                      方法名                                   说明
 * public   BigInteger add(BigInteger val)                      加法
 * public   BigInteger subtract(BigInteger val)                 减法
 * public   BigInteger multiply(BigInteger val)                 乘法
 * public   BigInteger divide(BigInteger val)                   除法，获取商
 * public   BigInteger[] divideAndRemainder(BigInteger val)     除法，获取商和余数
 * public   boolean equals(object x)                            比较是否相同
 * public   BigInteger pow(int exponent)                        次幂
 * public   BigInteger max/min(BigInteger val)                  返回较大值/较小值
 * public   int intValue(BigInteger val)                        转为int类型整数，超出范围数据有误

 */
public class demo2_Big_Integer_mehod {
    public static void main(String[] args) {

        //1.创建2个BigInteger对象（静态方法创建对象）
        BigInteger bd1 =BigInteger.valueOf(10);
        BigInteger bd2 =BigInteger.valueOf(5);

        //BigInteger add(BigInteger val)    加法
        BigInteger bd3 = bd1.add(bd2);
        System.out.println(bd3);
        //BigInteger subtract(BigInteger val)  减法
        //BigInteger multiply(BigInteger val)  乘法

        //BigInteger divide(BigInteger val)  除法，获取商
        BigInteger divide = bd1.divide(bd2);
        System.out.println(divide);

        //BigInteger[] divideAndRemainder(BigInteger val)  除法，获取商和余数
        BigInteger[] bigIntegers = bd1.divideAndRemainder(bd2);
        System.out.println(bigIntegers.length);
        System.out.println(bigIntegers[0]);//商
        System.out.println(bigIntegers[1]);//余数

        //boolean equals(object x)  比较是否相同
        System.out.println(bd1.equals(bd2));//false

        //BigInteger pow(int exponent)  次幂
        System.out.println(bd1.pow(2));//10的2次方：100

        //BigInteger max/min(BigInteger val)  返回较大值/较小值
        BigInteger max = bd1.max(bd2);
        System.out.println(max);

        //int intValue(BigInteger val)  转为int类型整数，超出范围数据有误
        BigInteger bd4 = BigInteger.valueOf(100);//不能超出int取值范围
        int i = bd4.intValue();
        System.out.println(i);

        long l = bd4.longValue();//long类型
        double v = bd4.doubleValue();//小数类型


    }
}
