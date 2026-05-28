package demo02_regex;
/**
 * 正则表达式 可以手册搜索-Pattern类
 *          .matches([])  返回boolean类型的结果
 *
 * 预定义字符（只匹配一个字符）： 字符  \  为转义字符，改变后面字符原本的含义
 *              字符       含义
 *               .        任何字符：通配符
 *              \d       数字:[0-9]
 *              \D       非数字：[^0-9]
 *              \s       空白字符：[\t\n\x0B\f\r]
 *              \S       非空白字符：[^\s]
 *              \w       [a-zA-Z_0-9] 英文、数字、下划线
 *              \W       [^\w]非英文、数字、下划线字符
 * 数量词
 *              X?      X，一次或 0次
 *              X*      X，零次或多次
 *              X+      X，一次或多次
 *              X{n}    X，正好n次
 *              X{n,}   X，至少n次
 *              X{n,M}  X，至少n，但不超过 m次
 *
 *             (?!)     忽略后面字符的大小写
 *  *        a((?!)b)c  只忽略b的大小写
 */
public class RegexDemo02 {
    public static void main(String[] args) {
        // . 表示任意一个字符
        System.out.println("你".matches(".."));//false
        System.out.println("你".matches("."));//true
        System.out.println("你z".matches(".."));//true

        //  \\d 表示任意一个数字
        //  简单记：\\ 两个\ 表示一个\。
        System.out.println("2========================");
        System.out.println("a".matches("\\d"));
        System.out.println("0".matches("\\d"));//true
        System.out.println("22".matches("\\d"));
        System.out.println("22".matches("\\d\\d"));//true

        //  \\w 表示一个单词字符 [a-zA-Z_0-9] 英文、数字、下划线
        System.out.println("3========================");
        System.out.println("a".matches("\\w"));//true
        System.out.println("2".matches("\\w"));//true
        System.out.println("21".matches("\\w"));
        System.out.println("你".matches("\\w"));

        //  \\W 表示非英文、数字、下划线字符  [^\w]
        System.out.println("4========================");
        System.out.println("你".matches("\\W"));//true
        System.out.println("_".matches("\\W"));
        System.out.println("a".matches("\\W"));
        System.out.println("1".matches("\\W"));
        //以上正则匹配只能校验单个字符。

        System.out.println("-------------------------");
        //必须是数字、字母、下划线 至少6位。
        System.out.println("22ad_12".matches("\\w{6,}"));//true
        System.out.println("243f".matches("\\w{6,}"));

        //必须是数字、字符 必须是4位。
        System.out.println("23dF".matches("[a-zA-Z0-9]{4}"));//true
        System.out.println("23_F".matches("[a-zA-Z0-9]{4}"));
        System.out.println("23dF".matches("[\\w&&[^_]]{4}"));//true
        System.out.println("23_F".matches("[\\w&&[^_]]{4}"));
    }
}
