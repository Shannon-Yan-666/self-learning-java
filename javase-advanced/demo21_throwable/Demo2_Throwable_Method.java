package demo21_throwable;

/**
 * 目标：了解异常中，常用的方法
 * 方法：
 *          方法名                         说明
 * public  String  getMessage()         返回此 throwable 的详细消息字符串
 * public  String  toString()           返回此可抛出的简短描述
 * public  void  printStackTrace()      把异常的错误信息输出在控制台（仅使用红色字体打印，不会停止程序运行）
 */

public class Demo2_Throwable_Method {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        //快捷键：ctrl + alt + T
        try {
            System.out.println(arr[6]);
        } catch (Exception e) {
            String message = e.getMessage();
            System.out.println(message);//Index 6 out of bounds for length 5
            String string = e.toString();//ava.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
            System.out.println(string);

            e.printStackTrace();//无返回值，以红色的字体在控制台打印出来，不会结束虚拟机
        }

        System.out.println("看看我执行了吗？");

        //拓展：错误的输出语句（用来打印错误信息，红色字体打印）
        //了解，一般不会自己使用。正常是java底层或三方使用
        //打印顺序，有时候会不按照从上到下的顺序进行打印（与多线程有关）
        System.err.println(123);
    }
}
