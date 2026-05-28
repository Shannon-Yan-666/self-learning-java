package demo22_throwable_exception;

/**
 *  目标：异常的处理，自己处理（捕获异常）
 *  作用：当代码出现异常时，可以让程序继续往下执行。
 *  注意：如果要捕获多个异常，且异常之间存在父子关系，那么父类一定要写在最下面。
 *  格式：
 *      try{
 *          可能出现异常的代码;
 *      } catch（异常类名 变量名）{
 *          异常的处理代码;
 *      }
 */
public class Demo2_Exception_RryCatch {
    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5};

        try {
            System.out.println(arr[6]);//报错：ArrayIndexOutOfBoundsException
            //底层：会 new ArrayIndexOutOfBoundsException(); 对象
            //     这个对象与catch小括号中的变量进行对比，确认变量是否可以接收对象
            //     如果可以被变量接收，就表示该异常被捕获（抓住），则执行catch内相应代码
            //     catch内所有代码执行完毕，继续执行try...catch体系下面的其他代码

            System.out.println(2/0); //报错：ArithmeticException
            //      如果try中遇到了问题，那么try下面的其他代码不会继续执行
            //      会直接跳转到对应的catch当中，执行catch里面的与具体
            //      如果没有对应的catch与之匹配，那么还是会交给虚拟机进行处理
        }catch(ArrayIndexOutOfBoundsException|ArithmeticException e){
            //了解：JDK7以后，可以在catch中同时捕获多个异常，中间用 | 进行分隔
            //表示如果出现了A异常或者B异常，采取同一种处理方案

            //出现异常的处理方式
            System.out.println("索引越界了");
        }catch (Exception e) {//父类
            System.out.println("我是大总管");
        }

        System.out.println("看看我执行了么？");
    }
}
