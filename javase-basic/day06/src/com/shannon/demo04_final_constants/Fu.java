package com.yanxiao.demo04_final_constants;

/**
 * final 修饰方法：最终方法，不能被子类重写
 * 使用场景：父类强制子类使用其方法
 * 注意事项：
 *      1.final修饰的是基本数据类型，数据值不能改变
 *      2.final修饰的是引用数据类型，地址值不能改变，但地址里面存储的内容可以改变/修改。
 *      3.成员变量如果被final修饰，在定义时/构造方法结束之前，完成赋值
 *
 * 常量类：
 *      定义一系列常量： public static final 修饰的变量
 * 常量命名规范：
 *      每个字母全部大写，多个单子之间使用下划线分隔
 * 优点：
 *      1.提高代码的可读性，使用单词替换数值
 *      2.统一管理，提高可维护性和可管理性
 *  使用：
 *      类名.常量名称
 */

// final修饰类：最终类，不能被继承
public final class Fu {

    public final void eat() {
        System.out.println("吃凉皮");
    }

    // final修饰变量：最终变量，只能赋值一次，不可修改，常量
    // final修饰变量：在定义时/构造方法结束之前，必须完成赋值（也可以在构造方法内赋值）
    final static String phone = "10888888888";

    // 最终变量
    // final修饰变量：在定义时/构造方法结束之前，必须完成赋值（也可以在构造方法内赋值）
    final String name = "张三";//成员变量

    // 常量
    // 1.将使用的数值抽取成常量，统一管理和维护
    //            单词  ORDER：订单 STATUS:状态 NORMAL：正常
    public static final int ORDER_STATUS_NORMAL =0; // 订单状态：正常

    public static final double PRODUCT_DISCOUNT = 0.8; //商品折扣

    public static final int ORDER_STATUS_PAY = 1; //订单状态：支付状态
    public static final int ORDER_STATUS_CANCEL = 2; //订单状态：取消状态
    public static final int ORDER_STATUS_PAY_SUCCESS = 3; //订单状态：成功状态
    public static final int ORDER_STATUS_PAY_WAITING = 4; //订单状态：待支付状态

    //2.将频繁使用的提示信息抽取成常量，统一管理和维护
    public static final String RQUEST_ERROR = "请求失败，请检查网络是否存在问题";

    //3.将项目的配置信息抽取成常量
    public static final String PROJECT_NAME = "仓库项目";
    public static final String PROJECT_VERSION = "1.0";


    public void test(){
        int age = 18;//局部变量
        // 被变量已被final修饰，不能被修改/重新赋值
        //name = "李四";
        //修改变量的值：
        // final修饰的值，不能被修改
        //phone = "19999999";
    }

}
