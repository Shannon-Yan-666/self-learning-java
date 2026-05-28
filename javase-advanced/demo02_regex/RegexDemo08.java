package demo02_regex;

/**
 *  replaceALL方法： 按照正则表达式的规则进行替换
 *  public String replaceALL(String regex , String newStr)
 *
 *  split方法： 按照正则表达式的规则，对字符串进行切割
 *  public String[] split(String regex )
 *
 */
public class RegexDemo08 {
    public static void main(String[] args) {

        //需求：
        // 字符串："小诗诗dqwefqwfqw12312小丹丹dqwefqwfqw12312小惠惠"
        //要求1：把字符串中三个姓名之间的字母替换位vs
        //要求2：把字符串的三个姓名切割出来

        String str= "小诗诗dqwefqwfqw12312小丹丹dqwefqwfqw12312小惠惠";
//        要求1：把字符串中三个姓名之间的字母替换位vs
        //底层原理：
        //创建文本解析器对象，从头读取字符串中的内容，只要满足，就使用第二个参数去替换
        String result = str.replaceAll("[\\w&&[^_]]+", "vs");
        System.out.println(result);

//        要求2：把字符串的三个姓名切割出来
        String[] arr = str.split("[\\w&&[^_]]+");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
