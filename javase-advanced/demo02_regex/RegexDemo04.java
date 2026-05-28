package demo02_regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *  扩展需求：网络爬取数据
 *  把链接中所有的身份证号码爬取出来。
 */
public class RegexDemo04 {
    public static void main(String[] args) throws IOException {

        //创建一个URL对象
        URL url = new URL("https://www.google.com111");
        //打开链接：链接网址，保证网络是畅通的
        URLConnection conn = url.openConnection();
        //创建一个对象去读取网络中的数据
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        //获取正则表达式的对象 pattern
        String regex = "[1-9]\\d{17}";
        Pattern pattern = Pattern.compile(regex);

        //在读取的时候，每次读取一整行 readline方法
        //外层获取每一行
        while ((inputLine = br.readLine()) != null) {
//            System.out.println(inputLine);
            //使用文本匹配器对象matcher，按照pattern的规则去读取当前行信息
            Matcher matcher = pattern.matcher(inputLine);
            //读取当前行并打印出来
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
        //关闭
        br.close();
    }
}
