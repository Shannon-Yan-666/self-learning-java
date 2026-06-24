package demo24_io;

import java.io.*;
import java.util.Scanner;

/**
 * 练习：登录注册2
 * 需求:写一个登陆小案例(添加锁定账号功能)
 * 步骤:
         * 将正确的用户名和密码手动保存在本地的userinfo.txt文件中。
         * 保存格式为:username=zhangsan&password=123&count=0
         * 让用户键盘录入用户名和密码
         * 比较用户录入的和正确的用户名密码是否一致
         * 如果一致则打印登陆成功
         * 如果不一致则打印登陆失败，连续输错三次被锁定
 */
public class Test12 {
    public static void main(String[] args) throws IOException {
        //1、读取正确的用户名和密码
        BufferedReader br = new BufferedReader(new FileReader("slef_learning\\userinfo.txt"));
        String line = br.readLine();
/*        String line;
        while ((line=br.readLine()) !=null){
            System.out.println(line);
        }*/
        br.close();

        String[] userInfo = line.split("&");
        String[] username= userInfo[0].split("=");//[username, zhangsan]
        String[] password= userInfo[1].split("=");//[password, 123]
        String[] count= userInfo[2].split("=");//[count, 0]

        String rightUsername = username[1];//正确的用户名
        String rightPassword = password[1];//正确的密码
        int countAll = Integer.parseInt(count[1]);//计数，连续输错的次数

        //2、用户键盘录入用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String ScUsername = sc.nextLine();
        System.out.println("请输入登录密码：");
        String ScPassword = sc.nextLine();

        //3、比较
        if (rightUsername.equals(ScUsername) && rightPassword.equals(ScPassword)&&countAll < 3){
            System.out.println("登录成功");
            writeInfo("username="+rightUsername+"&password="+rightPassword+"&count=0");
        }else {
            countAll++;
            if (countAll < 3){
                System.out.println("登录失败，还剩下" + (3-countAll) + "次机会");
            }
            else {
                System.out.println("账户被锁定");
            }
            writeInfo("username="+rightUsername+"&password="+rightPassword+"&count="+countAll);
        }
    }

    /*
        作用：写出一个字符串到本地文件中
        参数：要写出的字符串
     */
    public static void writeInfo(String content) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("slef_learning\\userinfo.txt"));
        bw.write(content);
        bw.close();
    }
}
