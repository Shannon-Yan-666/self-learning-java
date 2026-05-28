package demo21_throwable;

/**
 * 目标：认识异常体系
 * 什么是异常？异常就是程序当中可能出现的问题
 * Throwable：祖宗
 *          Error：代表系统级别错误（属于严重问题）
 *                 系统一旦出现问题，sun公司会把这些错误封装成Error对象
 *                 Error是给sun公司自己使用的，不是给程序员用，开发人员不用管它。
 *
 *          Exception（父类）：异常，代表程序可能出现的问题。
 *                  通常会用Exception以及他的子类来封装程序出现的问题。
 *
 *              其他异常：编译时异常（子类）：编译阶段就会出现异常提醒，用于提醒程序员 。如（日期解析异常）
 *                              除了RuntimeException及其子类，其他都是编译时异常，在编译阶段需要处理。
 *              RuntimeException（子类）：运行时异常，如（数组索引越界异常）
 *                               本类及其子类，编译阶段不会出现异常提醒，程序运行时出现。
 *                               一般是程序员代码写错了，或参数传递错误带来的问题（水平不行）。
 *
 *  作用：
 *      1、异常是用来查询bug的关键参考信息
 *      2、异常可以作为方法内部的一种特殊返回值，以便通知调用者底层的执行情况
 *
 *  异常的三种处理方式：
 *      1、虚拟机默认处理异常的方式：
 *          把异常以红色字体打印在控制台，并结束程序。
 *      2、捕获：try...catch 不让程序停止
 *          一般用在调用处，能让代码继续往下运行。
 *      3、抛出：throw throws  告诉调用者出错了
 *          在方法中，出现异常了，方法就没有继续运行下去的意义了 ，采取抛出处理。
 *          让该方法借宿运行并告诉调用者出现了问题。
 *
 */
public class Demo1_Throwable {
    public static void main(String[] args) {
//        Student[]  arr = new Student[3];
//        String name =  arr[0].getName();//NullPointerException
//        System.out.println(name);

        Studen2 s2 = new Studen2();
        s2.setAge(50);
        //处理方式：
        //选择1：默认打印在控制台上
        //选择2：自己悄悄处理
        //选择3：抛出异常，交给上层调用者处理

    }
}
