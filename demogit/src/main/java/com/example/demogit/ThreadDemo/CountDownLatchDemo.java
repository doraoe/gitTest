package com.example.demogit.ThreadDemo;

import java.util.concurrent.CountDownLatch;

/**
 * 倒计数器
 */
public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(6);
        for (int i = 0; i < 6; i++) {
            new Thread(()->{
                System.out.println("线程"+Thread.currentThread().getName()+"上完自习出教室");
                countDownLatch.countDown();
            },String.valueOf(i)).start();
        }
        countDownLatch.await();
        System.out.println("线程"+Thread.currentThread().getName()+"关教室门");
    }
}