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
 *              \W       [^\w]非单词字符
 *  数量词
 *               X?      X，一次或 0次
 *               X*      X，零次或多次
 *               X+      X，一次或多次
 *               X{n}    X，正好n次
 *               X{n,}   X，至少n次
 *               X{n,M}  X，至少n，但不超过 m次
 *
 *               (?!)     忽略后面字符的大小写
 *             a((?!)b)c  只忽略b的大小写
 */
public class RegexDemo01 {
    public static void main(String[] args) {
        //public boolean matches(String regex)
        //判断是否与正则表达式匹配，匹配返回ture
        /*
        字符类（[]内只匹配一个字符）
         */
        //需求1：只能是 a b c （一个[]只能相出现1个字符，超过1个则为不满足）
        System.out.println("======================");
        System.out.println("a".matches("[abc]"));//true
        System.out.println("z".matches("[abc]"));//false
        System.out.println("ab".matches("[abc]"));//false
        System.out.println("ab".matches("[abc][abc]"));//true

        //需求2：不能出现 a b c
        System.out.println("======================");
        System.out.println("a".matches("[^abc]"));//false
        System.out.println("z".matches("[^abc]"));//true
        System.out.println("zz".matches("[^abc]"));//false
        System.out.println("zz".matches("[^abc][^abc]]"));//true

        //需求3：a到z  A到Z（包括头尾范围）
        System.out.println("======================");
        System.out.println("a".matches("[a-zA-Z]"));//true
        System.out.println("z".matches("[a-zA-Z]"));//true
        System.out.println("aa".matches("[a-zA-Z]"));//false
        System.out.println("zz".matches("[a-zA-Z]"));//false
        System.out.println("0".matches("[a-zA-Z]"));//false
        System.out.println("0".matches("[a-zA-Z0-9]"));//false

        //需求4：[a-d[m-p]] a到d 或 m到p
        System.out.println("======================");
        System.out.println("a".matches("[a-d[m-p]]"));//true
        System.out.println("e".matches("[a-d[m-p]]"));//false
        System.out.println("0".matches("[a-d[m-p]]"));//false

        //需求5：[a-z&&[def]]  a-z和def的交际。为：d，e，f
        //细节：求两个范围的交集，必须写符号 &&
        //如果只写1个 & ，就不是交集，只代表字符“&”
        System.out.println("======================");
        System.out.println("0".matches("[a-z && [def]]"));//false
        System.out.println("e".matches("[a-z && [def]]"));//true

        //需求6：[a-z && [^bc]]  a-z 和 非bc的交集。等同于（[ad-z]）
        System.out.println("======================");
        System.out.println("a".matches("[a-z && [^bc]]"));//true

        //需求7：[a-z && [^m-p]]  a-z 和 除了m-p的交集。等同于（[a-lq-z]）
        System.out.println("======================");
        System.out.println("a".matches("[a-z && [^m-p]]"));//true
    }
}
