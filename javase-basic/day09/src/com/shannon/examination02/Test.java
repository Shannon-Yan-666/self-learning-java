package com.yanxiao.examination02;

import java.util.ArrayList;

/**
 * 1.定义父类Animal 包含name，age属性和一个抽象的eat方法
 * 2.定义两个子类Dog和Cat，Dog特有方法lookHome，Cat特有方法catchMouse
 * 3.毛和狗吃的东西不一样，Dog吃骨头，Cat吃鱼
 * 4.定义测试类Test，完成以下要求：
 * ①在Test测试类中定义静态方法，public static void printAnimal(Animal[]animal)，
 * 此方法内部需要实现：打印年龄大于2岁的动物信息
 * ②在main方法中完成以下功能：创建5个Animal对象并赋值，加入AnimalⅡ]数组中，调用printAnimal方法
 * 补充说明：方法中的数组，可以自行选择是否替换成集合来实现
 * public static void printAnimal(Animal)
 * animal)
 * public static void printAnimal(ArrayList<Animal> animal)
 */
public class Test {
    public static void main(String[] args) {
        //创建5个Animal对象并赋值
        Animal a1 = new Dog("南丹",3);
        Animal a2 = new Dog("丫丫",4);
        Animal a3 = new Dog("旺财",2);
        Animal c1 = new Cat("Film",1);
        Animal c2 = new Cat("老金",5);

        //创建集合
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(a1);
        animals.add(a2);
        animals.add(a3);
        animals.add(c1);
        animals.add(c2);
        printAnimal(animals);
    }

    public static void printAnimal(ArrayList<Animal> animals) {
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getAge() > 2){
                System.out.println("名字："+ animals.get(i).getName() +"，年龄：" + animals.get(i).getAge());
            }

        }
    }
}
