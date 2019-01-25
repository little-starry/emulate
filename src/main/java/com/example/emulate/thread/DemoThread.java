package com.example.emulate.thread;

/**
 * @author XiaoshanDu
 * @date 2019/1/23
 */
public class DemoThread implements Runnable {

    private Integer index;

    public DemoThread(Integer index){
        this.index = index;
    }

    @Override
    public void run() {
        try {
            System.out.println("线程序号:"+index+"开始处理！！！当前工作线程:"+System.identityHashCode(Thread.currentThread())+";");
            Thread.sleep(1000L);
            System.out.println("线程序号:"+index+";处理结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
