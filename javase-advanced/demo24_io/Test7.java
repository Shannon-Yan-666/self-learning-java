package demo24_io;

import java.io.*;

/**
 * 综合练习7：软件运次数
 * 需求：
 * 实现一个验证程序运次数的程序，要求如下：
     * 1.当程序运超过3次时给出提示:本软件只能免费使3次,欢迎您注册会员后继续使用~
     * 2.程序运行演示如下：
     * 第一次运控制台输出:欢迎使本软件,第1次使免费~
     * 第二次运控制台输出:欢迎使本软件,第2次使用免费~
     * 第三次运控制台输出:欢迎使本软件,第3次使免费~
     * 第四次及之后运控制台输出:本软件只能免费使3次,欢迎您注册会员后继续使用~
 */
public class Test7 {
    public static void main(String[] args) throws IOException {
        //1、把文件中的数字读取到内存中
        BufferedReader br = new BufferedReader(new FileReader("slef_learning\\count.txt"));
        String line = br.readLine();
        int count = Integer.parseInt(line);
        count++;

        //2、判断
        // >=3 可以使用; <=3 提示注册
        if (count <= 3) {
            System.out.println("欢迎使用本软件，第"+count+"次，免费使用~");
        }else {
            System.out.println("本软件只能免费使用3次，欢迎您注册会员后继续使用~");
        }

        //3、把当前资政之后的count，写出到文件道中
        BufferedWriter bw = new BufferedWriter(new FileWriter("slef_learning\\count.txt"));
        bw.write(count+"");//+""变成字符串写出，确保原样写出
        bw.close();

    }
}
