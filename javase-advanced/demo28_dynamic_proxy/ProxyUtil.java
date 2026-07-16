package demo28_dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 类的作用：创建一个代理
 *
 * 需求：
 *      1、获取代理对象：
 *              代理对象 = ProxyUtil.createProxy(艺人对象)
 *      2、再调用代理的唱歌方法
 *              代理对象.sing(); 方法
 *              方法内部会调用invoke() 方法
 */
public class ProxyUtil {
    /*
     *方法作用：
     *     给艺人对象，创建一个代理
     * 形参：
     *      被代理的艺人对象
     * 返回值：
     *      给艺人创建的代理
     */

    public static Star createProxy(Artist artist) {
        //java.lang.reflect.Proxy类：提供了为对象产生代理对象的方法：

        //public static Object newProxyInstance(
        // ClassLoader loader,
        // Class<?>[] interfaces,
        // InvocationHandler h)

        //参数一：用于指定用哪个类加载器，去加载生成的代理类
        //参数二：指定接口，这些接口用于指定生成的代理长什么，也就是可以代理哪些方法
        //参数三：用来指定生成的代理对象要干什么事情

        Star star = (Star) Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(),//参数一：用于指定用哪个类加载器，去加载生成的代理类
                new Class[]{Star.class},//参数二：指定接口，这些接口用于指定生成的代理长什么，也就是可以代理哪些方法

                new InvocationHandler() {//参数三：用来指定生成的代理对象要干什么事情
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        /*
                            参数一：代理的对象
                            参数二：要运行的方法，sing
                            参数三：调用运行方法时，传递的实参，歌名
                         */
                        if ("sing".equals(method.getName())) {
                            System.out.println("准备话筒，收钱...");
                        } else if ("dance".equals(method.getName())) {
                            System.out.println("准备场地，收钱...");
                        }
                        //找艺人唱歌跳舞
                        //代码表现形式：调用艺人里面的sing/dance方法
                        return method.invoke(artist, args);
                    }
                });

        return star;
    }
}
