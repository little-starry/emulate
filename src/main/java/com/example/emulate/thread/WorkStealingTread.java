package com.example.emulate.thread;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author XiaoshanDu
 * @date 2019/1/23
 */
public class WorkStealingTread {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newWorkStealingPool();
        for(int i=0;i<=10;i++){
            final int index = i;
            executorService.execute(new DemoThread(index));
        }
        executorService.shutdown();
    }

}
