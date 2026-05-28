package com.yanxiao.demo05_oop_javabean;

/**
 *
 * 测试类
 */
public class DrinkMachineTest {
    public static void main(String[] args) {
        //创建Javabean，存储饮水机的数据。
        // set方法：修改/赋值
        DrinkMachine dm1 = new DrinkMachine();
        dm1.setBrand("美的饮水机");
        dm1.setColor("黑色");
        dm1.setSize(25);
        dm1.setImage("https://medi.jpg");

        // get方法取值
        System.out.println(dm1.getBrand()+","+dm1.getColor()+","+dm1.getSize()+","+dm1.getImage());
    }
}
