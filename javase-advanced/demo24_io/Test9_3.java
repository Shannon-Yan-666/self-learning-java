package demo24_io;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.util.*;

/**
 * 利用Hutool包生成数据
 */
public class Test9_3 {
    public static void main(String[] args) {
        //1、定义变量用来记录网址
        //【网址反扒，无法使用】！！！
        String lastNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String boyNameNet = "https://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "https://www.haoming8.cn/baobao/7641.html";

        //2、爬取数据
        String lastNameStr = HttpUtil.get(lastNameNet);
        String boyNameStr = HttpUtil.get(boyNameNet);
        String girlNameStr = HttpUtil.get(girlNameNet);

        //3、利用正则表达式获取数据
        //3、通过正则表达式，把其中符合要求的数据获取出来
        List<String> lastNameTempList = ReUtil.findAll("(.{4})(，|。)",lastNameStr, 1);
        List<String> boyNameTempList = ReUtil.findAll("([\\u4E00-\\u9FA5]{2})(，|。)", boyNameStr, 1);
        List<String> girlNameTempList = ReUtil.findAll("(.. ){4}..", girlNameStr, 0);

        System.out.println(lastNameTempList);
        System.out.println(boyNameTempList);
        System.out.println(girlNameTempList);

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
        //细节：胡涂包的相对路径，不是相对于当前项目而言的，而是相对于class文件而言的
        FileUtil.writeLines(list,"names.txt","UTF-8");
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
}
