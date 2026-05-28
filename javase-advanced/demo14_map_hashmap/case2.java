package demo14_map_hashmap;

import java.util.*;

/**
       需求2：统计投票人数
           某个班级80名学生，现在需要组成秋游活动
           班长提供了四个景点依次是(A、B、C、D)
           每个学生只能选择一个景点
           请统计出最终明个景点想去的人数最多。
 */
public class case2 {
    public static void main(String[] args) {

        //1.定义一个数组，存储4个景点
        String[]arr = {"A","B","C","D"};

        //2.利用随机数模拟80个同学的投票，并把投票的结果存储起来
        ArrayList<String> list = new ArrayList<>();//存储投票结果
        Random rand = new Random(); //创建随机数
        for (int i = 0; i < 80; i++) {
            int index = rand.nextInt(arr.length);//获取随机的索引
            list.add(arr[index]);//添加到集合中
        }

        //3.统计投票结果
        Map<String,Integer>hm = new HashMap<>();
        for (String name : list) {
            //判断当前经典在map集合中是否存在
            if (hm.containsKey(name)) {
                //存在
                //先获取当前景点已经被投票的次数，并+1
                hm.put(name,hm.get(name)+1);
            }else {
                //不存在
                hm.put(name,1);
            }
        }
        System.out.println(hm);

        //4.求最大值
        int max = Collections.max(hm.values());
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() == max) {
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }


    }
}
