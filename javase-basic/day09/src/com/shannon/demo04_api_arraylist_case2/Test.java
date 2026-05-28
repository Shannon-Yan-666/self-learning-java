package com.yanxiao.demo04_api_arraylist_case2;

import java.util.ArrayList;
import java.util.Objects;

/**
 *  目标：掌握从集合中删除数据
 *
 *  注意：遍历结合删除数据是，可能出现漏删的情况（每次删除一位，后面的数据会自动补位，前进一位）
 *  解决：
 *      方式一：作废本次删除操作，底部上来的数据重写操作一次
 *              i--
 *      方式二：倒着删除，递补上来的数据都是处理后的数据
 *              i = list.size()-1 ; i >= 0 ; i--
 *
 *
 */
public class Test {
    public static void main(String[] args) {
        //1.创建ArrayList集合，存储待删除的多个文本数据
        ArrayList<String> list = new ArrayList<String>();
        list.add("test");
        list.add("张三");
        list.add("李四");
        list.add("test");
        list.add("test");

        //2.遍历集合
        // 倒着是删除：for (int i = list.size() - 1; i >= 0; i--)
        for (int i = 0; i < list.size(); i++) {
            String data = list.get(i);
            //3.获取集合中的每一个数据，判断是否是test
            if (Objects.equals(data, "test")) {
                //4.如果是就删除此数据（add/remove/set/get）
                //4.1根据位置删除
                list.remove(i);
                //4.1.1根据数据删除
//                list.remove(data);
                //4.2退后一位（集合中会自动往前进一位，所以需要退回一位）
                i--;
            }
        }
        //5.打印集合中的数据
        System.out.println(list);
    }
}
