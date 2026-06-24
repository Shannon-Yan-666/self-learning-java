package demo24_io;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * 目标：了解字符集
 * 1、在计算机中，任意数据都是以二进制的形式来存储的
 * 2、计算机中最小的储存单位是一个字节
 * 3、ASCII在计算机存储英文的时候，只用一个字节，8个bit位，二进制以0为开头
 * 4、简体中文版Windows，默认使用GBK字符集，GBK在计算机储存汉字的时候，使用两个字节，16个bit位，二进制以1为开头
 * 5、GBK字符集完全兼容，完全兼容ASCII字符集
 *
 * ASCII字符集：0~127，共128个字符。
 *         编码规则：前面补0，后补齐8位
 *         解码规则：直接转成十进制
 *
 * GBK字符集：系统显示为ANSI，完全兼容ASCII字符集
 *         2000年3月17日发布，收录21003个汉字，
 *         包含国家标准GB13000-1中的全部中日韩汉字，和BIG5编码中的所有汉字。
 *         英文编码规则：不足8位，前面补0
 *         汉字编码规则：不需要变动。汉字两个字节存储；（一个字节不够，三个字节浪费）
 *                    高位字节二进制一定以1开头，转成十进制之后是一个负数。（为了和英文区分开）
 *         汉字解码规则：直接转成十进制
 *
 * Unicode字符集：万国码
 *         国际标准字符集，将世界各种语言的每个字符定义一个唯一的编码，以满足跨语言、跨平台的文本信息转换。
 *         UTF：Unicode Transfer Format   字符集名称/转换/格式化
 *         重点：
 *         UTF-8编码规则：用 1~4个，可变长度的字节保存    （8个bit位）
 *                         英文：用一个字节表示，二进制首位是 0，转成十进制是正数。
 *                      简体中文：用三个字节表示，二进制首位以1开头，转成十进制是负数：
 *                              1110xxxx  10xxxxxx  10xxxxxx  （x使用二进制进行填补）
 *
 *         UTF-16编码规则:用 2~4个字节保存    （16个bit位）
 *         UTF-32编码规则:固定使用四个字节保存  （32个bit位）
 *
 *  出现乱码的原因：
 *          1、读取数据时未读取完整个汉字
 *              读取二进制字节---->解码为十进制字节---->查询对应的编码表---->得到相应字符
 *          2、编码和解码时的方式不统一：汉字UTF-8 3个字节、GBK 2个字节
 *              UTF-8编码方式：存储相应字符---->查询对应的编码表---->按照对应的编码规则转为二进制，使用3个字节进行存储
 *              GBK解码方式：读取2个二进制字节---->根据解码规则转换为十进制---->查询对应的编码表---->得到相应字符
 *
 *          解决方式：
 *                1、不要用字节流读取文本文件
 *                2、编码解码使用同一个码表，同一个编码方式
 */
public class Demo6_IO_Charset_ASCII_GBK_Unicode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /*
        Java中编码的方法：
            public  byte[]  getBytes()                          使用默认的方式进行编码（IDEA默认UTF-8，eclipse默认GBK）
            public  byte[]  getBytes(String  charsetName)       使用指定的方式进行编码
        Java中解码的方法：
            String(byte[] bytes)                                使用默认的方式进行解码（IDEA默认UTF-8，eclipse默认GBK）
            String(byte[] bytes , String  charsetName)          使用指定的方式进行解码
         */

        //1.编码
        String str ="Engfa好看";
        byte[] strBytes = str.getBytes();//英文1个字节、中文3个字节
        System.out.println(Arrays.toString(strBytes));//[69, 110, 103, 102, 97, -27, -91, -67, -25, -100, -117]

        //编译时异常：抛出处理
        byte[] strBytes1 = str.getBytes("GBK");//英文1个字节、中文2个字节
        System.out.println(Arrays.toString(strBytes1));//[69, 110, 103, 102, 97, -70, -61, -65, -76]

        //2.解码
        String str2 = new String(strBytes);
        System.out.println(str2);//Engfa好看

        String str3 = new String(strBytes,"GBK");
        System.out.println(str3);//Engfa濂界湅 （产生乱码）
    }
}
