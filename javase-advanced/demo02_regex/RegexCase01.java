package demo02_regex;
/**
 *  案例：座机号码
 *      020-2324242 02122442 027-42424 0712-3242434
 *  思路：在书写座机号码正则表达式的时候，需要把正确的数据分为三部分
 *      1. 区号：前三位，0 + 任意数字，出现2-3位
 *             0\\d{2,3}
 *             0：表示区号一定是以 0 开头的。
 *             \\d{2,3}:表示区号从第二位开始可以是任意的数字，可以出现2到3次。
 *      2. - ：? 表示次数，0次或一次。
 *      3.号码：号码的第一位不能以 0 开头，从第二位开始可以是任意的数字，号码的总长度：5-10。
 *
 */
public class RegexCase01 {
    public static void main(String[] args) {
        String ragex = "0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("020-2324242".matches(ragex));
        System.out.println("02122442".matches(ragex));
        System.out.println("027-42424".matches(ragex));
        System.out.println("0712-3242434".matches(ragex));

        /**
         * 案例：邮箱号码
         * 3232323@qq.com   zhangsan@itcast.cnn
         * dleie009@163.com   dleiooo9@pci.com.cn
         *
         * 思路：
         * 在书写邮箱号码正则的时候需要把正确的数据分为三部分
         * 第一部分：@的左边\\w+
         *         任意的字母数字下划线，至少出现一次就可以了
         * 第二部分：@只能出现一次
         * 第三部分：
         *      3.1  .的左边[\\w&&[^_]]{2，6}
         *      3.2  任意的字母 + 数字，总共出现2-6次（此时不能出现下划线）
         *      3.3 大写字母，小写字母都可以，只能出现2-3次[a-zA-Z]{2，3}
         */

        //邮箱校验
        String ragex1 = "^\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        System.out.println("abc123@qq.com".matches(ragex1));
        System.out.println("zhangsan@itcast.cnn".matches(ragex1));
        System.out.println("adleie009@163.com".matches(ragex1));
        System.out.println("adleiooo9@pci.com.cn".matches(ragex1));

        //AnyRule插件生成：24小时正则表达式
        // ^ 从头  匹配到尾 $   中间补齐 \
        String ragex2="(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";
        System.out.println("23:02:03".matches(ragex2));

        //身份证号码校验
        String ragex3 ="(^\\d{8}(0\\d|10|11|12)([0-2]\\d|30|31)\\d{3}$)|(^\\d{6}(18|19|20)\\d{2}(0[1-9]|10|11|12)([0-2]\\d|30|31)\\d{3}(\\d|X|x)$)";
        System.out.println("41080219990222002X".matches(ragex3));

    }
}
