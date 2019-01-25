package com.example.emulate.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author XiaoshanDu
 * @date 2019/1/23
 */
public class SingleThread {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for(int i=0;i<=10;i++){
            final int index = i;
            executorService.execute(new DemoThread(index));
        }
        executorService.shutdown();
    }

}
