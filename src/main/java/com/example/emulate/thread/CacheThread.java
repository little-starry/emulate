package com.example.emulate.thread;

import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author XiaoshanDu
 * @date 2019/1/23
 */
public class CacheThread {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        //等同于如下代码
        //ExecutorService executorService = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
        for(int i=0;i<=10;i++){
            final int index = i;
            executorService.execute(new DemoThread(index));
        }
        executorService.shutdown();
    }

}
