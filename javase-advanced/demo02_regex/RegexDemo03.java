package demo02_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *有如下文本，请按照要求爬取数据。
 * Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，
 * 因为这两个是长期支持版本，下一个长期支持版本是Java17，
 * 相信在未来不久Java17也会逐渐登上历史舞台要求：找出里面所有的JavaXX
 *
 *   Pattern :正则表达式
 *   Matcher :文本匹配器，作用按照正则表达式的规则去读取字符串，从头开始读取。
 *            在大串中去找复合匹配规则的字串。
 */
public class RegexDemo03 {
    public static void main(String[] args) {

        String Str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，"+
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台要求：找出里面所有的JavaXX";

        //快捷键：ctrl+alt+m  抽取方法，命名位method1
//        method1(Str);

        //1.获取正则表达式的对象
        Pattern p = Pattern.compile("Java\\d{0,2}");
        //2.获取文本匹配器的对象，用matcher方法读取pattern规则的子串
        Matcher m = p.matcher(Str);
        //3.利用循环获取(重点) find方法底层会返回true，并返回索引 +1
        while (m.find()){
            //方法底层会根据find方法记录的索引进行字符串的截取
            //subString（起始索引，结束索引）；包头不包尾。截取的小串进行返回。
            String s = m.group();
            System.out.println(s);
        }


    }

    private static void method1(String Str) {
        //获取正则表达式的对象（静态方法：compile）
        Pattern pattern = Pattern.compile("Java\\d{0,2}");
        //获取文本匹配器的对象
        //matcher: 文本匹配器的对象
        //str: 大串
        //pattern: 规则
        Matcher matcher = pattern.matcher(Str);
        //使用文本匹配器从头开始读取，寻找是否有满足规则的子串
        //如果有，返回true（在底层记录子串的起始索引和结束索引+1） 0，4
        boolean b = matcher.find();

        //方法底层会根据find方法记录的索引进行字符串的截取
        //subString（起始索引，结束索引）；包头不包尾
        //（0，4）但是不包含4索引
        //会把截取的小串进行返回。
        String group = matcher.group();
        System.out.println(group);

        //第二次在调用find方法的时候，会继续读取后面的内容
        boolean b1 = matcher.find();
        String group1 = matcher.group();
        System.out.println(group1);
    }
}
