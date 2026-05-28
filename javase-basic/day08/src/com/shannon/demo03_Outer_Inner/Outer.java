package com.yanxiao.demo3_Outer_Inner;

/**
 * 成员内部类
 */
//外部类
public class Outer {
    private int age = 28;

    //内部类
    class Inner{
        public String name = "张三";
        public  int age = 18;

        public  void  test(){
            int age = 10;
            System.out.println(age);//访问局部变量
            System.out.println(this.age);//访问内部类变量
            System.out.println(Outer.this.age);//访问外部类成员变量
        }
    }

    public  void show() {
        Inner inner = new Inner();
        System.out.println(inner.name);
    }
}
