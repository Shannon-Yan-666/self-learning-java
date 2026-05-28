package demo12_big_decimal_api;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *  目标：掌握BigDecimal的常用方法
 *       BingDecimal是一个对象，如果需要计算，需要使用方法进行操作
 * 常用方法：
 *                      方法名                                   说明
 * public BigDecimal add(BigDecimal val)                        加法
 * public BigDecimal subtract(BigDecimal val)                   减法
 * public BigDecimal multiply(BigDecimal val)                   乘法
 * public BigDecimal divide(BigDecimal val)                     除法
 * public BigDecimal divide(BigDecimal val, 精确几位, 舍入模式)    除法
 *                          <---|---|---|---|---|---|---|---|---|---|--->
 *                            -4  -3   -2  -1   0   1   2   3   4  5
 *                                 RoundingMode（枚举类）：舍入模式
 *                                                  UP：远离零方向舍入的舍入模式
 *                                                DOWN：向零方向舍入的舍入模式
 *                                             CEILING:向正无限大方向舍入
 *                                              FLOOR:向负无限大方向舍入
 *                                            HALF_UP:四舍五入（向上舍入）
 *                                          HALF_DOWN:四入无舍（向下舍入）
 */
public class demo2_Big_Decimal_method {
    public static void main(String[] args) {

        //创建对象
        BigDecimal bd1 =BigDecimal.valueOf(10.0);
        BigDecimal bd2 =BigDecimal.valueOf(2.0);
        BigDecimal bd7 =BigDecimal.valueOf(3.0);

        //add(BigDecimal val)   加法
        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd3);//12.0

        //subtract(BigDecimal val)  减法
        BigDecimal bd4 = bd1.subtract(bd2);
        System.out.println(bd4);//8.0

        //multiply(BigDecimal val)  乘法
        BigDecimal bd5 = bd1.multiply(bd2);
        System.out.println(bd5);//20.00

        //divide(BigDecimal val)    除法（除的尽）
        BigDecimal bd6 = bd1.divide(bd2);
        System.out.println(bd6);//5

        //divide(BigDecimal val, 精确几位, 舍入模式)    除法
        BigDecimal bd8 = bd1.divide(bd7, 2, RoundingMode.HALF_UP);
        //                                  RoundingMode（枚举类） 四舍五入舍入模式
        System.out.println(bd8);//3.33
    }
}
