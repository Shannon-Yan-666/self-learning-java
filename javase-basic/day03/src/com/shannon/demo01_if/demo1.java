package demo01_if;


import java.util.Scanner;

/**
 *  目标：掌握if书写形式和使用场景
 *  语法：
 *      单if:判断指定代码是否执行
 *      if-else: 从两端代码中选择一段执行（二选一）
 *      if else-if else:从多段代码中选择一段执行（多选一）
 */
public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 场景1：判断小王考完试后，是否接收爱的教育
        System.out.println("请输入本次考试成绩：");
        int score = sc.nextInt();
        if (score < 80){
            System.out.println("爱的教育~");
        }

        // 场景2：判断小王同学考试分时是奇数还是偶数
        if (score % 2 == 0){
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }

        // 场景3：判断考试等级，>=90 优秀，>=75 良好， >=60及格 ，不及格
        if (score >= 90 && score <= 100){
            System.out.println("优秀");
        } else if (score >= 75) {
            System.out.println("良好");
        } else if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }

        // 场景4：考试奖励
        // 100<分数>=95 自行车，分数>=90 游乐园，分数>=80 变形金刚，爱的教育
        if (score >= 95 && score <= 100){
            System.out.println("奖励自行车一辆");
        } else if (score >= 90) {
            System.out.println("奖励去游乐园");
        } else if (score >= 80) {
            System.out.println("奖励变形金刚");
        } else {
            System.out.println("爱的教育~");
        }
    }
}
