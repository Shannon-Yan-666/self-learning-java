package demo11_big_integer_api;

import java.math.BigInteger;
import java.util.Random;

/**
 * 目标：BigInteger(大的整数) API常用方法
 * 在Java中，整数有四种类型 : byte , short , int , long。
 * 在底层占用字节个数 : byte1个字节、short2个字节、int4个字节、long8个字节。
 *
 *                      方法名                         说明
 * public BigInteger(int num, Random rand)       获取随机大整数，范围:[0~2的num次方-1]
 * public BigInteger(String val)                获取指定的大整数（用的比较多，获取数字非常大且不确定数字大小，可以使用此方法）
 * public BigInteger(String val, int radix)     获取指定进制的大整数（不常用）
 *
 * public static BigInteger valueOf(long val)   静态方法获取BigInteger的对象,内部有优化（获取数字比较小，在long的取值范围内，可以使用此方法 ）
 *
 * 细节:
 *      对象一旦创建里面的数据不能发生改变
 *      只要进行计算，都会产生一个新的BigInteger对象
 */
public class demo1_Big_Integer_api {
    public static void main(String[] args) {

        //1.获取一个随机的大整数 BigInteger(int num, Random rand)
        Random rand = new Random();
        //                             [0~2 的 4次方 -1]
        BigInteger bd1 = new BigInteger(4,rand);
        System.out.println(bd1);//[0 ~ 15]


        //2. 获取一个指定的大整数 BigInteger(String val)
        //细节：字符串中必须是整数，否则报错
        BigInteger bd2 = new BigInteger("100");
        System.out.println(bd2);

        //3.获取指定进制的大整数（不常用） BigInteger(String val, int radix)
        //细节1：字符串中的数字必须是整数
        //细节2：字符串中的数字必须要跟进制吻合，比如二进制中，只能写0和1，写其他就报错。
        BigInteger bd3 = new BigInteger("100",2);
        System.out.println(bd3);

        //4.静态方法获取BigInteger的对象,内部有优化  BigInteger valueOf(long val)
        //细节： 能表示的范围比较小，只能在long的取值范围之内，如果超出范围就不行了。
        //      在内部对常用的数字： -16 ~ 16 进行了优化
        //      提前把-16 ~ 16 先创建好了BigInteger的对象，如果多次获取不会重新创建新的。
        BigInteger bd4 = BigInteger.valueOf(100);
        System.out.println(bd4);

        System.out.println(Long.MAX_VALUE);//9223372036854775807L long的最大值
    }
}
