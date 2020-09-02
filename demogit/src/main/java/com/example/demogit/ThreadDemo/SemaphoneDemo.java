package com.example.demogit.ThreadDemo;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * 信号量
 * 多线程抢多个共享资源互斥调用
 * 并发线程数控制
 */
public class SemaphoneDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                try {
                    System.out.println("线程："+Thread.currentThread().getName()+"开始前当前可用车位："+semaphore.availablePermits());
                    semaphore.acquire();
                    System.out.println("线程："+Thread.currentThread().getName()+"--->抢到车位");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("线程："+Thread.currentThread().getName()+"------------->离开车位");
                    System.out.println("线程："+Thread.currentThread().getName()+"离开后当前可用车位："+semaphore.availablePermits());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    semaphore.release();
                }
            },String.valueOf(i)).start();
        }

    }

}