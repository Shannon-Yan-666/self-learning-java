package demo02_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 贪婪爬取和非贪婪爬取
 *  贪婪爬取：在爬取数据的时候尽可能多的获取数据（Java当中，默认是贪婪爬取）
 *  非贪婪爬取：在爬取数据的时候尽可能的少获取数据
 *
 *  正则表达式符号：
         *      只写 + 和 *     表示贪婪匹配
         *          +?         非贪婪匹配
         *          *?         非贪婪匹配
 *  示例：
         *       ab+:
         *       贪婪爬取：abbbbbbbbbbbbbbbbb
         *       非贪婪爬取：ab
 *
 * 有如下文本，请按照要求爬取数据。
 * Java自从95年问世以来，abbbbbbbbbbbbbbbbbaaaaaaaaaaaaaaaaaa
 * 经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长期支持版本，
 * 下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台
 *
 * 需求1：按照ab+的方式爬取ab，b尽可能多获取
 * 需求2：按照ab+的方式爬取ab，b尽可能少获取
 *
 */
public class RegexDemo07 {
    public static void main(String[] args) {
        String str1 = " java自从95年问世以来，经历了很多版本，abbbbbbbbbbbbbbbbbaaaaaaaaaaaaaaaaaa" +
                "目前企业中用的最多的是Java8和JAva11，因为这两个是长期支持版本，" +
                " 下一个长期支持版本是JaVa17，相信在未来不久JavA17也会逐渐登上历史舞台";

        //1.定义正则表达式
        //需求1：按照ab+的方式爬取ab，b尽可能多获取
        String regex1 = "ab+";

        //需求2：按照ab+的方式爬取ab，b尽可能少获取
        String regex2 = "ab+?";

        //2.Pattern获取上方正则表达式对象
        Pattern p = Pattern.compile(regex2);

        //3.Matcher获取文本匹配器的对象
        //利用m去读取，符合p规则的小串
        Matcher m = p.matcher(str1);

        //4.while循环+ find方法，读取获取每个符合规则的元素索引
        while (m.find()){
            //group根据索引获取获取每个元素
            String group = m.group();
            System.out.println(group);
        }
    }
}
