package demo03_for;

public class case1 {

    public static void main(String[] args) {
      method1();
      method2();
    }

    public static  void method1() {
        //1.定义变量sum，记录累加求和的结果数据
        int sum = 0;
        //2.使用for循环批量生成1~100之间的所有偶数
        for (int i = 2; i <= 100; i += 2) {
            //3.把每次产生的偶数i ，累加到sum上。
            sum += i;
        }
        //4. 打印sum中的结果
        System.out.println("1~100之间的所有偶数和：" + sum);
    }

    public static  void method2() {
        int sum = 0;
        for (int i =1; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println("1~100之间的所有奇数和：" + sum);
    }
}
