package demo22_throwable_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1_Exception {
    public static void main(String[] args) throws ParseException {

        //编译时异常
        //必须在编译阶段，手动处理，否则代码报错
        String time = "2030年1月1日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(time);//快捷键：Alt + 回车（抛出parse方法的异常）
        System.out.println(date);

        //运行时异常
        //在编译阶段是不需要处理的，是代码运行时出现的异常
        int[]arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(arr[10]);//索引越界

    }
}
