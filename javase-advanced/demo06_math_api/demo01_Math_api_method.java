package demo06_math_api;

/**
 * 目标：掌握 Math类的常用方法（java.lang包下的数学计算工具类，不需要导包）
 *
 * Math类-常用的方法：
 *                        方法名                           说明
 * public static int     abs( int a )                获取参数绝对值
 * public static double  ceil( double a )            向上取整
 * public static double  floor( double a )           向下取整
 * public static int     round( float a )            四舍五入
 * public static int     max( int a , int b )        获取两个int值中的较大值
 * public static int     min( int a , int b )        获取两个int值中的较小值
 * public static double  pow( double a ,double b )   返回 a 的 b 次幂的值
 * public static double  sqrt( double a )            返回 a 的平方根
 * public static double  cbrt( double a )            返回 a 的立方根
 * public static double  random( )                   返回值为double的随机值，范围[0.0 , 1.0)
 *                                                                    [左闭右开)，包头、不包尾巴
 */
public class demo01_Math_api_method {
    public static void main(String[] args) {
        //abs( int a )   获取参数绝对值
        System.out.println(Math.abs(66));//66
        System.out.println(Math.abs(-66));//66
        //bug:
        //以int类型为例，取值范围：-2147483648 ~ 2147483647
        //如果没有整数与负数对应，那么传递负数结果有误
        ///-2147483648 ，没有正数与之对应，所以abs结果产生bug
//        System.out.println(Math.abs(-2147483648));//-2147483648
        //JDK15出现的方法，底层多了一个int最小值判断
//        System.out.println(Math.absExact(-2147483648));

        //ceil( double a )  向上取整
        //进一法：往数轴的正方向进1位，向正无穷大方向获取距离最近的整数
        //----|--|--|----|----|---|--|---->正无穷大方向
        //   -13 .5 -12   0   12 .5  13
        System.out.println(Math.ceil(12.34));//13.0
        System.out.println(Math.ceil(12.54));//13.0
        System.out.println(Math.ceil(-12.34));//-12.0
        System.out.println(Math.ceil(-12.54));//-12.0

        System.out.println("---------------");

        //floor( double a )  向下取整
        //去尾法：往数轴的负方向进1位，向负无穷大方向获取距离最近的整数
        //负无穷大方向<----|----|----|----|----|---->正无穷大方向
        //             -13  -12   0   12   13
        System.out.println(Math.floor(12.34));//12.0
        System.out.println(Math.floor(12.54));//12.0
        System.out.println(Math.floor(-12.34));//-13.0
        System.out.println(Math.floor(-12.54));//-13.0

        System.out.println("---------------");

        //round( float a )   四舍五入
        System.out.println(Math.round(12.34));//12
        System.out.println(Math.round(12.54));//13
        System.out.println(Math.round(-12.34));//-12
        System.out.println(Math.round(-12.54));//-13

        System.out.println("---------------");

        //max( int a , int b )   获取两个int值中的较大值（底层三元运算符）
        System.out.println(Math.max(20, 30));//max
        System.out.println(Math.min(20, 30));//min

        System.out.println("---------------");

        //pow( double a ,double b )   返回 a 的 b 次幂的值
        System.out.println(Math.pow(2, 3));//8
        //细节：
        //      如果第二个参数是 0 ~ 1 之间的小数
        System.out.println(Math.pow(4, 0.5));//2
        System.out.println(Math.pow(2, -2));//0.25
        //建议：
        //第二个参数：一般传递大于等于1的正整数。
        //开根号：开平方根，可以使用sqrt方法
        System.out.println(Math.sqrt(4));//2，0
        //开根号：开立方根，可以使用cbrt方法
        System.out.println(Math.cbrt(8));//2，0

        System.out.println("---------------");

        //random( )  返回值为double的随机值，范围[0.0 , 1.0)
        double random = Math.random();
        //1 ~ 100 随机数获取：*100，然后floor方法向下取整（1~99），+1（1~100）
        System.out.println(Math.floor(random*100)+1);
    }
}
