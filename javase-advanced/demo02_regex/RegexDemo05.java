package demo02_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//爬取代码是固定的，真正需要写的是正则表达式的代码
/**
 * 需求：把下面文本中的座机电话，邮箱，手机号，热线都爬取出来。
 * 来黑马程序员学习Java，
 * 手机号：18512516758，18512508907
 * 联系邮箱：boniu@itcast.cn，
 * 座机电话：01036517895，010-98951256
 * 邮箱：bozai@itcast.cn,
 * 热线电话：400-618-9090，400-618-4000，4006184000，4006189090
 *
 * 手机号的正则表达式： 1[3-9]\d{9}
 * 邮箱的正则表达式： \w+@[\w&&[^_]]{2,6}(\.[a-zA-Z]{2,3}){1,2}
 * 座机电话的正则表达式：0\d{2,3}-?[1-9]\d{4,9}
 * 热线电话的正则表达式： 400-?[1-9]\\d{2}-?[1-9]\\d{3}
 */
public class RegexDemo05 {
    public static void main(String[] args) {
        String str1 = "abc学习Java"+
                "手机号码：18512516758，18512508907"+
                "联系邮箱：yyxxss@ttccst.cn"+
                "座机电话：01036517895，010-98951256"+
                "邮箱：ffmmll@mmcast.cn"+
                "热线电话：400-618-9090，400-618-4000，4006184000，4006189090";
        //校验正则表达式
        System.out.println("400-618-9090".matches("400-?[1-9]\\d{2}-?[1-9]\\d{3}"));
        System.out.println("400-618-4000".matches("400-?[1-9]\\d{2}-?[1-9]\\d{3}"));
        System.out.println("4006184000".matches("400-?[1-9]\\d{2}-?[1-9]\\d{3}"));
        System.out.println("4006189090".matches("400-?[1-9]\\d{2}-?[1-9]\\d{3}"));

        //满足4个条件，使用 ()|()|()|()
        String regex = "(1[3-9]\\d{9})" +
                "|(\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2})" +
                "|(0\\d{2,3}-?[1-9]\\d{4,9})" +
                "|(400-?[1-9]\\d{2}-?[1-9]\\d{3})";

        //1.获取正则表达式的对象 使用Pattern对象
        Pattern p = Pattern.compile(regex);

        //2.获取文本匹配器的对象 使用Matcher
        //利用m去读取，符合p规则的小串
        Matcher m = p.matcher(str1);

        //3.利用循环获取每一个数据
        //find 寻找字串返回ture，并记录索引
        while (m.find()){
            //group方法按照索引去获取字符串
            String group = m.group();
            //打印获取的全部字符串
            System.out.println(group);
        }
    }

}
