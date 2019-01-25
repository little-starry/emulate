package com.example.emulate.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author XiaoshanDu
 * @date 2019/1/23
 */
public class ScheduledThread {

    public static void main(String[] args) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(2);
        for(int i=0;i<=10;i++){
            final int index = i;
            newScheduledThreadPool.schedule(new DemoThread(index),3,TimeUnit.SECONDS);
        }
        newScheduledThreadPool.shutdown();
    }

}
