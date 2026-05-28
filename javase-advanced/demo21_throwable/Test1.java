package demo21_throwable;

import java.util.Scanner;

/**
 * 综合案例：键盘录入数据
 * 需求:
     * 键盘录入自己心仪的女朋友姓名和年龄。
     * 姓名的长度在3~10之间，
     * 年龄的范围为18-40岁
     * 超出这个范围是异常数据不能赋值，需要重新录入，一直录到正确为止。
 * 提示:
     * 需要考虑用户在键盘录入时的所有情况。
     * 比如:录入年龄时超出范围，录入年龄时录入了abc等情况
 */
public class Test1 {
    public static void main(String[] args) {
        //1.创建键盘录入的对象
        Scanner sc = new Scanner(System.in);
        //2.创建女朋友对象
        GirlFriend gf = new GirlFriend();

        while (true) {
            try {
                //3.接收姓名
                System.out.println("输入名字：");
                String name = sc.nextLine();
                gf.setName(name);

                //4.接收年龄
                System.out.println("输入年龄：");
                String ageStr = sc.nextLine();//比int好用，可以录入任意内容
                int age = Integer.parseInt(ageStr);//转换为int类型
                gf.setAge(age);
                //如果有所数据录入正确，就会跳出循环
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                continue;  //遇到continue会回到上面去，也可以省略不写
            }catch (NameFormatException  e) {
                e.printStackTrace();
                continue;
            }catch (AgeOutBoundsException e) {
                e.printStackTrace();
            }
        }

        //5.打印
        System.out.println(gf);
    }
}
