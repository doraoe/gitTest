package com.example.demogit.ThreadDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoneDemo2 {
    public static void main(String[] args) {
        int num = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(num);
        Semaphore semaphore = new Semaphore(num);
        for (int i = 0; i < 10; i++) {
            executorService.execute(() -> {
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + "---------线程开始");
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + "======线程完毕");
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        for (int i = 0; i < 10; i++) {
            try {
                semaphore.acquire();
                executorService.execute(() -> {
                    System.out.println(Thread.currentThread().getName() + "---------线程开始");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "======线程完毕");
                    semaphore.release();
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}