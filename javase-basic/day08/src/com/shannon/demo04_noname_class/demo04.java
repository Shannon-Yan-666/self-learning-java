package com.yanxiao.demo4_noname_class;

/**
 *  目标：掌握匿名内部类的语法格式和使用产场景
 *  作用：快速高效设计子类并创建子类对象-匿名内部类
 *      旧：喂养小猫一步到位：（1.设计小猫子类；2.重写eat方法；3.创建小猫子类对象。）
 *  语法：
 *      父类/接口 子类对象 = new 父类/接口(){
 *          重写方法
 *      }
 *  使用场景：调用方法时，需要传递一个父类/接口类型的参数
 *          选择1.设计子类/实现类，重写方法，创建子类/实现类对象（复用性）
 *          选择2.匿名内部类一步搞定（只使用一次，不用创建对象，不需要复用）
 *
 */
public class demo04 {
    public static void main(String[] args) {
        //写法1：喂养小猫
        //方法（new 父类）回车，一键创建匿名内部类，重写方法体
    feed(new Animal() {
        @Override
        void eat() {
            System.out.println("吃大鱼~");
        }
    });


    //写法1：喂养小狗
        feed(new Animal() {
            @Override
            void eat() {
                System.out.println("吃骨头");
            }
        });

        //写法2：用变量接
    Animal cat = new Animal() {
        @Override
        void eat() {
            System.out.println("吃小鱼~");
        }
    };
    cat.eat();

    }




    //定义：方法-喂所有动物
    public  static  void  feed(Animal animal){
        animal.eat();
    }
}

// 定义：抽象父类
abstract  class Animal{
    abstract  void eat();
}
