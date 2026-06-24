package demo24_io;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 备选方案：内置数据实现（推荐，稳定不依赖网站）
 * 由于目标网站页面大概率已失效，无法稳定爬取。
 * 对于 “制造假数据” 的学习需求，更稳妥的方式是直接把姓氏、名字数据内置到代码中，完全不依赖网络和站点状态：
 */
public class Test9_2 {
    // 百家姓（截取常用部分，可按需扩展）
    private static final String[] LAST_NAMES = {
            "赵","钱","孙","李","周","吴","郑","王","冯","陈","褚","卫",
            "蒋","沈","韩","杨","朱","秦","尤","许","何","吕","施","张"
    };
    // 男生名字库
    private static final String[] BOY_NAMES = {"子轩","浩宇","浩然","博文","宇轩","子涵","雨泽","皓轩","梓轩"};
    // 女生名字库
    private static final String[] GIRL_NAMES = {"子涵","欣怡","梓涵","晨曦","紫涵","诗涵","梦琪","嘉怡","子萱","雨涵"};

    public static void main(String[] args) {
        // 随机生成10个男生姓名
        List<String> boyNames = generateFakeNames(10, true);
        System.out.println("随机男生姓名：");
        for (String name : boyNames) {
            System.out.println(name);
        }

        //随机生成10个女生名字
        List<String> girlNames = generateFakeNames(10, false);
        System.out.println("随机女生姓名：");
        for (String name : girlNames) {
            System.out.println(name);
        }
    }

    /**
     * 批量生成随机假姓名
     * @param count 生成数量
     * @param isMale true=男生姓名，false=女生姓名
     * @return 随机姓名列表
     */
    public static List<String> generateFakeNames(int count, boolean isMale) {
        List<String> result = new ArrayList<>();
        Random random = new Random();
        String[] namePool = isMale ? BOY_NAMES : GIRL_NAMES;

        for (int i = 0; i < count; i++) {
            String lastName = LAST_NAMES[random.nextInt(LAST_NAMES.length)];
            String firstName = namePool[random.nextInt(namePool.length)];
            result.add(lastName + firstName);
        }
        Collections.shuffle(result);
        return result;
    }
}