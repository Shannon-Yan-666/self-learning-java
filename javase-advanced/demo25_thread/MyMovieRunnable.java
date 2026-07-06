package demo25_thread;

public class MyMovieRunnable implements Runnable {
    //细节，Runnable只会创建一次，没有必要添加static关键字
    int ticket = 0;

    @Override
    public void run() {
        //1、循环
/*      2、同步代码块（抽取为同步方法）
            1、选中synchronized中的代码块，快捷键：ctrl+alt+m，抽取成方法
            2、删除同步代码块的synchronized
            3、将抽取的方法，添加synchronized关键字
            */
        //3、判断共享数据是否到了末尾，如果到了
        //4、判断共享数据是否到了末尾，如果没到

        while(true) {
            if (extracted()) break;
        }
    }

    //非静态方法：锁对象是this
    private synchronized  boolean extracted() {
        if (ticket == 100) {
            return true;
        }else {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                 e.printStackTrace();
            }
            ticket++;
            System.out.println(Thread.currentThread().getName()+"，在卖第："+ticket+" 张票！！");
        }
        return false;
    }
}
