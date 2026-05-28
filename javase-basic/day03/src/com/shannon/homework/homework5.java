package homework;

/**
 * 题目5：四位数位和相等统计
 * 训练目标：强化对多位数（四位数）的结构分析能力，练习复
 * 杂的逻辑表达式判断及统计功能。
 * 需求描述：打印所有四位数中 个位+干位== 百位+十位 的数
 * 字；最后要打印符合条件的数字的总数量;
 * 打印格式如下：1010；1021；1032；1043；
 * 以上满足条件的四位数总共有615个。
 * 实现提示：
 * 1.定义计数器count，初始化为0。
 * 2.使用for循环遍历所有四位数（1000到9999）。
 * 3.在循环中，分别计算出干位、百位、十位、个位。干位:i/
 * 1000；百位:i/100%10；十位:i/10%10；个位:i%
 * 10.
 * 4.使用if判断个位+干位==百位+十位是否成立。
 * 5.若成立，打印该数字并使count协1。
 * 6.循环结束后，按照指定格式打印总数。
 *
 */
public class homework5 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        for (int i = 1000; i < 10000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000;
            if (ge + qian == shi + bai){
//                System.out.println(i);
                count++;
                sum += i;
            }
        }
        System.out.println("数量："+ count +"个，总和：" + sum);
    }
}
