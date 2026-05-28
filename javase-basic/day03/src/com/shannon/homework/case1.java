package homework;

import java.util.Random;
import java.util.Scanner;

// 包裹代码的快捷键 ctrl + alt + T

public class case1 {
    public static void main(String[] args) {
        numbercaicaicai();
    }

    public static void numbercaicaicai(){
        Random random = new Random();
        int number = random.nextInt(101);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入您猜测的数字：");
            int i = sc.nextInt();
            if (i == number) {
                System.out.println("您猜对了~");
                break;
            } else if (i > number) {
                System.out.println("您猜的数字大了~");
            } else {
                System.out.println("您猜测的数字小了~");
            }
        }
    }
}
