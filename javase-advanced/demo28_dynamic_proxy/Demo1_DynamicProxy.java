package demo28_dynamic_proxy;

/**
 * 目标：了解动态代理
 * 作用：可以无侵入式的给对象增强其他的功能
 *      调用者--→代理--→对象
 *      通过接口保证，对象和代理需要实现同一个接口。接口中，就是被代理的所有方法
 *
 *java.lang.reflect.Proxy类：提供了为对象产生代理对象的方法：
     * public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
     * 参数一：用于指定用哪个类加载器，去加载生成的代理类
     * 参数二：指定接口，这些接口用于指定生成的代理长什么，也就是可以代理哪些方法
     * 参数三：用来指定生成的代理对象要干什么事情
 */
public class Demo1_DynamicProxy {
    public static void main(String[] args) {
        /*需求：
 *      1、获取代理对象：
 *              代理对象 = ProxyUtil.createProxy(艺人对象)
 *      2、再调用代理的唱歌方法
 *              代理对象.sing(); 方法
 *              方法内部会调用invoke() 方法
         */
        //1、获取代理的对象
        Artist bonnie = new Artist("王邦邦");
        Star proxy = ProxyUtil.createProxy(bonnie);

        //2、调用唱歌的方法
        String result = proxy.sing("麻瓜提拉");
        System.out.println(result);

        //3、调用跳舞的方法
        proxy.dance();
    }
}
