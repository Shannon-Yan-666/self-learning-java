package demo23_file;

import java.io.File;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * File类相关的API的练习题
 * 需求:统计一个文件夹中每种文件的个数并打印。(考虑子文件夹)
 * 打印格式如下:
             * txt:3个
             * doc:4个
             * jpg:6个
 *
 * 思路：File、递归、Map集合（键：值）
 */
public class Test5 {
    public static void main(String[] args) {
        File f1 = new File("D:\\aaa");
        HashMap<String, Integer> count = getCount(f1);
        System.out.println(count);
    }

    //定义一个方法
    //参数:要统计的文件夹
    //返回值：map集合 键：后缀名，值：次数
    public static HashMap<String,Integer> getCount(File file) {
        //创建一个map集合用来存放每种文件的计数
        HashMap<String,Integer> hashMap = new HashMap<>();
        //调用listFiles方法，获取所有内容并返回一个数组
        File[] files = file.listFiles();
            //遍历数组：获取每个文件/文件夹
            for (File f : files) {
                //判断：如果是文件，则获取文件完整名称
                if (f.isFile()){
                    //getName方法，获取文件名称
                    String name = f.getName();
                    //使用字符串split方法以 “.”  对文件名称进行切割，并存入字符串数组
                    String[] arr = name.split("\\.");
                    //判断字符串数组内的字符长度是否大于等于2
                    //如果大于等于2，那么最后索引为止的元素，才是文件的后缀名
                    if (arr.length >= 2){
                        //获取最大索引上的元素，该元素就是后缀名
                        String endName = arr[arr.length - 1];
                        //在map集合中判断，键是否存在
                        if (hashMap.containsKey(endName)){
                            //如果键存在，则自增并存回map集合中
                            //获取值已经存在的次数
                            int  count = hashMap.get(endName);
                            //当前类型的文件又出现了一次，自增
                            count++;
                            //将自增之后的结果，存回map集合
                            hashMap.put(endName,count);
                        }else {
                            //如果键不存在，则表示第一次出现，首次创建。
                            hashMap.put(endName, 1);
                        }
                    }
                    //判断：如果是文件夹，则递归
                }else {
                    //somMap：表示子文件夹中的每一种文件的个数。
                    HashMap<String, Integer> sonMap = getCount(f);
                    //获取sonMap集合中的每一个键值对
                    Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();
                    //遍历每一个键值对
                    for (Map.Entry<String, Integer> entry : entries) {
                        String key = entry.getKey();
                        int value = entry.getValue();
                        if (hashMap.containsKey(key)){
                            //存在：则获取对应的值，把值进行累加，并重新存入 集合中
                            int count = hashMap.get(key);
                            //      总值  +  新值
                            count = count + value;
                            //存入集合中
                            hashMap.put(key,count);

                        }else {
                            //不存在：则原封不动的存回集合中
                            hashMap.put(key, value);
                        }
                    }

                }
            }
            return hashMap;
    }
}
