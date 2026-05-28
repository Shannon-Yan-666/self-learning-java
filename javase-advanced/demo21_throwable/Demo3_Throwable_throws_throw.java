package demo21_throwable;

/**
 * 目标：掌握异常的处理，抛出异常
 *      throws
 *          注意：写在方法定义处，表示声明一个异常
 *              告诉调用者，使用本方法可能会有哪些异常
 *          语法：（编译时异常，必须要写；运行时异常，可以不写。）
 *              public  void  方法()throws 异常类名1 , 异常类名2 ...{
 *                  ...
 *              }
 *      throw
 *          注意：写在方法内，结束方法
 *              手动抛出异常对象，交给调用者。方法中下面的代码不再执行了
 *          语法：
 *              public  void  方法(){
 *                  throw  new  NullPointerException();
 *              }
 */
public class Demo3_Throwable_throws_throw {
    public static void main(String[] args) {
        //需求：定义一个方法求数组的最大值
        int[] arr = null;
//        int[] arr = {1,2,3,4,5};
        int max = 0;

        //try catch 执行完毕后，执行不会停止，会继续执行下面的其他代码。
        try {
            max = getMax(arr);
        } catch (Exception e) {
            System.out.println("空指针异常");
        }
        System.out.println(max);
    }

    public static int getMax(int[] arr) {
        //为了增加方法的健壮性，先进行一个非空判断
        if (arr == null) {
            //手动创建一个异常对象，并把这个异常交给方法的调用者处理
            //此时方法就会借宿，下面的代码不会在执行了
            throw new NullPointerException();
        }
        System.out.println("看看我执行了么？");
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
