package demo02_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 带有选择性的数据爬取
 *
 * 有如下文本，请按照要求爬取数据。
 * Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长期支持版本，
 * 下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台
 *
 * 需求1：爬取版本号为8，11，17的Java文本，但是只要Java，不显示版本号。
 * 需求2：爬取版本号为8，11，17的Java文本。正确爬取结果为：Java8 Java11 Java17 Java17
 * 需求3：爬取除了版本号为8，11，17的Java文本
 */
public class RegexDemo06 {
    public static void main(String[] args) {
        String str1 = " java自从95年问世以来，经历了很多版本，" +
                "目前企业中用的最多的是Java8和JAva11，因为这两个是长期支持版本，" +
                " 下一个长期支持版本是JaVa17，相信在未来不久JavA17也会逐渐登上历史舞台";

        //需求1：爬取版本号为8，11，17的Java文本，但是只要Java，不显示版本号。
        //1.定义正则表达式
        //? ：代表前面的数据 Java
        //= ：代表在Java后面拼接的数据
        // 在获取的时候，只获取前半部分
        //?i ：表示忽略大小写 （不显示纯小写的java，因为后面没有跟版本号）
        String regex1 = "((?i)Java)(?=8|11|17)";

        //需求2：爬取版本号为8，11，17的Java文本。正确爬取结果为：Java8 Java11 Java17 Java17
        String regex2 = "((?i)Java)(8|11|17)";
        // :  冒号获取前后整体所有的东西
        String regex3 = "((?i)Java)(?:8|11|17)";

        //需求3：爬取除了版本号为8，11，17的Java文本
        // ! : 去除的意思
        String regex4 = "((?i)Java)(?!8|11|17)";

        //2.Pattern获取上方正则表达式对象
        Pattern p = Pattern.compile(regex4);

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
