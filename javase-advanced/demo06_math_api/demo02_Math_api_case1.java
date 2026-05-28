package demo06_math_api;

/**
 * 两道算法水题
 */
public class demo02_Math_api_case1 {
    public static void main(String[] args) {
        //需求1：判断一个数是否为一个质数
        System.out.println(isPrime(13));
        System.out.println(isPrime(997));

        //需求1.1：判断1~10000之间有多少个质数
        //获取程序运行开始时间
        long start = System.currentTimeMillis();//毫秒值

        for (int i = 1; i < 10000; i++) {
            boolean flag = isPrime(i);
            if (flag) {
                System.out.println(i);
            }
        }

        //获取程序运行结束时间
        long end = System.currentTimeMillis();//毫秒值
        //获取程序运行总时间
        System.out.println("总时间" + (end - start));//毫秒值

        //自幂数，一个n位自然数等于自身各个数位上数字的n次幂之和
        //举例1：三位数（水仙花数）    1^3 + 5^3 + 3^3 = 153
        //举例2：四位数（四叶玫瑰书）   1^4 + 6^4 + 3^4 + 4^3 = 1634
        //需求2：统计一共有多少个水仙花数

        //得到每一个三位数
        for (int i = 100; i <= 999; i++) {
            //个位
            int ge = i % 10;
            //十位
            int shi = i / 10 % 10;
            //百位
            int bai = i / 100 % 10;

            //判断每一位的三次方（.pow（））之和 跟本身进行比较
            double sum = Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3);
            if (sum == i) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {
//        int count = 0;
        for (int i = 2; i < Math.sqrt(n); i++) {
//            count++;
            if (n % i == 0) {
                return false;
            }
        }
//        System.out.println(count);
        return true;
    }
}
