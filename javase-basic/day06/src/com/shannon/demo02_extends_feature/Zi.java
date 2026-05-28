package com.yanxiao.demo02_extends_feature;
/**
 * 继承中的成员访问特点-成员变量（变量名冲突/重名）
 * this： 调用本类成员
 * super： 调用父类成员
 *
 * 继承中的成员访问特点-成员方法（方法重写）
 * 当父类的方法需要修改/不好用
 * 子类做自己独有的功能实现，就需要采用方法重写/方法覆盖
 *
 * 注意事项：
 *      1.父类中私有的方法不能被重写
 *      2.子类修饰符访问权限必须大于父类
 *      3.父类的构造方法不会被继承
 * 方法重写格式：
 *          方法名称/参数/返回值类型，都相同
 */
public class Zi extends Fu {
    int num = 6666;//子类变量

    public void println(){
        int num = 9999;//局部变量
        System.out.println("访问局部变量：" + num);//就近原则，访问局部变量
        System.out.println("访问子类变量：" + this.num);//使用this关键字，访问类的成员变量
        System.out.println("访问父类变量" + super.num);//使用super关键字，访问父类的成员变量
    }

    public void show(){
        System.out.println("子类独有方法");//子类独有的方法
    }

    @Override
    //使用快捷键：alt + insert --> Overrid Method
    public void method() {
        System.out.println("子类重写的方法");
    }
}
