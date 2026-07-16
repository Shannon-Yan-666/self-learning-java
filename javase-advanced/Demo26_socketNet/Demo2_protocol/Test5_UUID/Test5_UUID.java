package Demo26_socketNet.Demo2_protocol.Test5_UUID;

import java.util.UUID;

/**
 * 练习：UUID类的使用
 *     利用静态方法生成随机的文件名
 */
public class Test5_UUID {
    public static void main(String[] args) {
        //随机且唯一
        String replace = UUID.randomUUID().toString().replace("-", "");
        System.out.println(replace);
    }
}
