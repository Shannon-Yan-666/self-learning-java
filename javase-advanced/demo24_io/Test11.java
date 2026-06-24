package demo24_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 练习：登录注册1
 * 需求:写一个登陆小案例。
 * 步骤:
         * 将正确的用户名和密码手动保存在本地的userinfo.txt文件中。
         * 路径：slef_learning\\userinfo.txt
         * 保存格式为:username=zhangsan&password=123
         * 让用户键盘录入用户名和密码
         * 比较用户录入的和正确的用户名密码是否一致
         * 如果一致则打印登陆成功
        * 如果不一致则打印登陆失败
 */
public class Test11 {
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
        String rightUsername = username[1];//正确的用户名
        String rightPassword = password[1];//正确的密码

        //2、用户键盘录入用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String ScUsername = sc.nextLine();
        System.out.println("请输入登录密码：");
        String ScPassword = sc.nextLine();

        //3、比较
        if (rightUsername.equals(ScUsername) && rightPassword.equals(ScPassword)){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
    }
}
