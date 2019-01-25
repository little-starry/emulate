package com.example.emulate.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author XiaoshanDu
 * @date 2019/1/23
 */
public class FixedThread {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //ExecutorService executorService = new ThreadPoolExecutor(2, 2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
        for(int i=0;i<=10;i++){
            final int index = i;
            executorService.execute(new DemoThread(index));
        }
        executorService.shutdown();
    }

}
