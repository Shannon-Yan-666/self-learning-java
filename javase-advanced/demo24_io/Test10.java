package demo24_io;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 综合练习：随机点名器
     * TxT文件中事先准备好80个学生信息，每个学生的信息独占一行。
        学生信息txt文件：slef_learning\names.txt
     * 要求1:每次被点到的学生，再次被点到的概率在原先的基础上降低一半
     * 举例:80个学生，点名5次，每次都点到小A，概率变化情况如下:
                                 * 第一次每人概率:1.25%。
                                 * 第二次小A概率:0.625%
                                 * 第三次小A概率:0.3125%
                                 * 第四次小A概率:0.15625%。
                                 * 第五次小A概率:0.078125%。
                                 * 其他学生概率:1.2579%
                                 * 其他学生概率:1.261867%
                                 * 其他学生概率:1.2638449%
                                 * 其他学生概率:1.26483386%
     * 提示:本题的核心就是带权重的随机（微服务架构）
 */
public class Test10 {
    public static void main(String[] args) throws IOException {
        //1、把文件中所有的学生信息读取到内存中
        ArrayList<StudentCall> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("slef_learning\\names.txt"));
        String line;
        while ((line = br.readLine()) !=null){
            //验证遍历到的每一个元素
//            System.out.println(line);
            String[] str = line.split("-");
            StudentCall studentCall = new StudentCall(str[0],str[1],Integer.parseInt(str[2]),Double.parseDouble(str[3]));
            list.add(studentCall);
        }
        br.close();
        //验证数组中的学生信息
//        System.out.println(list);

        //2、带权重的随机，计算权重的总和
        double weight = 0;
        for (StudentCall studentCall : list) {
            weight = weight + studentCall.getWeight();
        }
        //验证总权重值
//        System.out.println(weight);

        //3、计算每一个人的实际占比
        //创建数组存储每一个人的权重值，数组长度与list集合长度相同
        double[]arr = new double[list.size()];
        int index = 0;
        //遍历list集合中的每一个元素，获取每个人的权重并计算
        for (StudentCall studentCall : list) {
            //每个人的权重 除以 总权重值 = 每个人的权重占比，存入 数组
            arr[index] = studentCall.getWeight() / weight;
            //每存完一次，索引值+1
            index++;
        }
        //验证每一个人的权重占比值
//        System.out.println(Arrays.toString(arr));

        //4、计算每一个人的权重占比范围
        //[0.0125, 0.0125, 0.0125, 0.0125, 0.0125, 0.0125]
        // 0.0125, 0.25, 0.0375 , 0.05
        for (int i = 1; i < arr.length; i++) {
            //从1索引开始：0索引的值不用计算
            //前一个数的值 + 自身 = 权重占比范围
            arr[i] = arr[i-1] + arr[i];
        }
        //验证每一个人的权重占比范围
//        System.out.println(Arrays.toString(arr));

        //5、随机抽取
        //获取一个 0.0~1.0 之间的随机数
        double random = Math.random();
        //判断 随机数 在arr中的位置-二分查找法
        //binarySearch方法，返回：-插入点 - 1 = 结果
        //index2：是获取到的学生的最终索引值，用于在list集合中进行查找定位
        int index2 = -Arrays.binarySearch(arr, random) - 1;
        StudentCall studentCall = list.get(index2);
        //验证随机到的学生
        System.out.println(studentCall);

        //6、修改当前学生的权重
        double w = studentCall.getWeight() / 2;
        studentCall.setWeight(w);//把新的权重值，重新赋值回去
        //验证修改后的学生权重值，在集合中是否变更
//        System.out.println(list);

        //7、把集合中的数据，再次写入到文件中
        BufferedWriter bw = new BufferedWriter(new FileWriter("slef_learning\\names.txt"));
        for (StudentCall s : list) {
            bw.write(s.toString());
            bw.newLine();
        }
        bw.close();
    }
}
