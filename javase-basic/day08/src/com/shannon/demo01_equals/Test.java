package com.yanxiao.demo1_equals;

import java.util.Objects;

/**
 * 目标：了解Java中对象比较的方式
 * 方式：
 *          ==：
 *              基本类型数据，比较的是数值
 *              引用数据类型的数据，比较的是地址值
 * Object中的equals方法：
 *              引用数据类型的数据，比较的是地址值
 *              比较对象中的数据/内容，需要进行重写，自行设置比较规则（推荐使用快捷方式生成）
 *              // 快捷生成equals方法：alt + insert +equals and hashcode
 *              // 一顿点-->next
 * Objects中的equals方法：
 *              加入健壮性的判断：自带非空校验
 *              语法：Objects.equals(比较值1，比较值2)
 *
 *
 */
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("张三", 18);

        //需求：比较两个对象是否相同
        //方式一：==
        System.out.println("方式一（比较地址值）：" + (s1 == s2));

        //方式二：equals，被重写的是内容
        System.out.println("方式二（比较内容，重写equals：）" + (s1.equals(s2)));

        //注意事项：可能存在空指针异常风险
        //方式二，需要增加手动判断，确保比较值不能为空null
        if (s1 != null) {
            System.out.println("方式二（增加空指针校验：）"+s1.equals(s2));
        }

        //方式三：Objects工具类提供的比较方法equals
        //方式三，自动非空校验功能
        System.out.println(Objects.equals(s1, s2));
    }
}

