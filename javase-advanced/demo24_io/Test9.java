package demo24_io;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 综合练习：制造假数据（网址反爬了，无法实现）
 * 需求：制造假数据也是开发中的一个能力，在各个网上爬取数据，是其中一个方法。
 * 获取姓氏：赵钱孙李周吴郑王
 * https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0
 * 男生名字：子轩浩宇浩然博文宇轩子涵雨泽皓轩梓轩
 * http://www.haoming8.cn/baobao/10881.html
 * 获取女生名字：子涵欣怡梓涵晨曦紫涵诗涵梦琪嘉怡子萱雨涵
 * http://www.haoming8.cn/baobao/7641.html
 */
public class Test9 {
    public static void main(String[] args) throws IOException {
        //1、定义变量用来记录网址
        //【网址反扒，无法使用】！！！
        String lastNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String boyNameNet = "https://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "https://www.haoming8.cn/baobao/7641.html";

        //2、爬取数据
        String lastNameStr = webCrawler(lastNameNet);
        String boyNameStr = webCrawler(boyNameNet);
        String girlNameStr = webCrawler(girlNameNet);

//        System.out.println(lastNameStr);
//        System.out.println(boyNameStr);
//        System.out.println(girlNameStr);

        //3、通过正则表达式，把其中符合要求的数据获取出来
        ArrayList<String>lastNameTempList = getData(lastNameStr,"(.{4})(，|。)",1);
        ArrayList<String>boyNameTempList = getData(boyNameStr,"([\\u4E00-\\u9FA5]{2})(，|。)",1);
        ArrayList<String>girlNameTempList = getData(girlNameStr,"(.. ){4}..",0);

        //4、处理数据
        //lastNameTempList（姓氏）
//        System.out.println(lastNameTempList);
        //处理方案：把每一个姓氏拆开并添加到一个新的集合当中
        ArrayList<String>lastNameList = new ArrayList<>();
        for (String str : lastNameTempList) {
            //str依次表示集合中的每一个元素：赵钱孙李  周吴郑王
            //遍历str内的每个元素，得到每一个姓氏
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);//每个姓氏
                lastNameList.add(c + "");//添加字符串姓氏
            }
        }
        //boyNameTempList（男生的名字）
//        System.out.println(boyNameTempList);
        //处理方案：去除其中的重复元素
        ArrayList<String>boyNameList = new ArrayList<>();
        for (String str : boyNameTempList) {
            if (!boyNameList.contains(str)) {
                boyNameList.add(str);
            }
        }

        //girlNameTempList（女生的名字）
//        System.out.println(girlNameTempList);
        //处理方案：把里面的每一个元素用空格进行切割，得到每一个女生的名字
        ArrayList<String>girlNameList = new ArrayList<>();
        for (String str : girlNameTempList) {
            String[] arr = str.split(" ");
            for (int i = 0; i < arr.length; i++) {
                girlNameList.add(arr[i]);
            }
        }

        //5、生成数据
        //姓名（唯一）-性别-年龄
        ArrayList<String> list = getInfos(lastNameList, boyNameList, girlNameList, 10, 10);
        Collections.shuffle(list);
        System.out.println(list);

        //6、写出数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("路径"));
        for (String str : list) {
            bw.write(str);
            bw.newLine();
        }
        bw.close();
    }

    /*
        作用：获取男生和女生的信息
        格式：姓名-性别-年龄  张三-男-23
        形参：
            参数一：装着姓氏的集合
            参数二：装着男生名字的集合
            参数三：装着女生名字的集合
            参数四：男生的个数
            参数五：女生的个数
     */
    public static ArrayList<String> getInfos(ArrayList<String>lastNameList,ArrayList<String>boyNameList,ArrayList<String>girlNameList,int boycount,int girlcount){
        //1、生成不重复的名字
        HashSet<String> boyhs = new HashSet<>();
        while (true){
            //判断：如果生成的名字数量足够了，就跳出循环
            if (boyhs.size()==boycount){
                break;
            }
            //随机
            Collections.shuffle(lastNameList);
            Collections.shuffle(boyNameList);
            boyhs.add(lastNameList.get(0)+boyNameList.get(0));
        }
//        System.out.println(boyhs);
        //2、生成女生不重复的名字
        HashSet<String> girlhs = new HashSet<>();
        while (true){
            if (girlhs.size()==girlcount){
                break;
            }
            Collections.shuffle(lastNameList);
            Collections.shuffle(girlNameList);
            girlhs.add(lastNameList.get(0)+girlNameList.get(0));
        }
//        System.out.println(girlhs);

        //3、按照格式输出
        ArrayList<String> list = new ArrayList<>();
        //随机数：随机年龄
        Random rand = new Random();
        //3.1生成男生的信息
        for (String boyName : boyhs) {
            //年龄范围【18~27】
            int age = rand.nextInt(10) + 18; //范围：0~9 +18
            list.add(boyName + "-男-" + age);
        }
        //3.2生成女生的信息
        for (String girlName : girlhs) {
            //年龄范围【18~25】
            int age = rand.nextInt(8) + 18;//范围：0~7 +18
            list.add(girlName + "-女-" + age);
        }

        return list;
    }

    /*
        作用：根据正则表达式获字符串中的数据
        参数一：完整的字符串
        参数二：正则表达式
        参数三：索引
        返回值：想要的数据
     */
    private static ArrayList<String> getData(String str, String ragex,int index) {
        //1、创建集合存放数据
        ArrayList<String>list = new ArrayList<>();
        //2、按照正则表达式，去获取数据
        Pattern pattern = Pattern.compile(ragex);
        //3、按照pattern的规则，到str中获取数据
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(index);
            list.add(group);
        }
        return list;
    }

    /*
        作用：从网络中爬取数据，把数据拼接成字符串返回
        形参：网址
        返回值：爬取到的所有数据
     */
    public static String webCrawler(String net) throws IOException {
        //1、定义一个StringBuilder拼接爬取到的数据
        StringBuilder sb = new StringBuilder();
        //2、创建一个URL对象
        URL url = new URL(net);
        //3、链接上这个网址
        //细节：保证网络是畅通的，而且这个网址是可以链接上的。（网址可以访问）
        URLConnection conn = url.openConnection();
        //4、读取数据
        //getInputStream字节流，需要通过转换流，转换为字符流
        InputStreamReader isr = new InputStreamReader(conn.getInputStream());
        char[] buffer = new char[1024];
        int count = 0;
        while ((count = isr.read(buffer)) != -1) {
            sb.append(buffer, 0, count);
        }
/*        int ch;
        while ((ch = isr.read()) != -1) {
            sb.append((char) ch);
        }*/
        //5、释放资源
        isr.close();
        //6、把读取到的数据返回
        return sb.toString();

    }
}
