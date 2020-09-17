package com.example.demogit.test;

import java.util.concurrent.TimeUnit;

public class SyncDemo {
    private Object object = new Object();
    private Object object2 = new Object();

    private String string = "string1";
    private String string2 = "string2";

    public static void main(String[] args) {
        SyncDemo demo = new SyncDemo();
        /*//方法
        new Thread(()->{
            demo.read();
        }).start();
        new Thread(()->{
            demo.write();
        }).start();*/

        //this
/*        new Thread(()->{
            demo.saythis1();
        }).start();
        new Thread(()->{
            demo.saythis2();
        }).start();
        new Thread(()->{
            demo.sayNothis();
        }).start();*/

       /* //object
        new Thread(()->{
            demo.sayObject1();
        }).start();
        new Thread(()->{
            demo.sayObject2();
        }).start();
        new Thread(()->{
            demo.sayObject3();
        }).start();*/

        /*//String
        new Thread(()->{
            demo.sayString1();
        }).start();
        new Thread(()->{
            demo.sayString2();
        }).start();
        new Thread(()->{
            demo.sayString3();
        }).start();*/
    }

    private synchronized void read(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("read---"+Thread.currentThread().getName());
    }
    private synchronized void write(){
        System.out.println("write--"+Thread.currentThread().getName());
    }

    private void saythis1(){
        synchronized (this){
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("saythis1--"+Thread.currentThread().getName());
        }
    }

    private void saythis2(){
        synchronized (this){
            System.out.println("saythis2--"+Thread.currentThread().getName());
        }
    }

    private void sayNothis(){
        System.out.println("sayNothis--"+Thread.currentThread().getName());
    }

    private void sayObject1(){
        synchronized (object){
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("sayObject1--"+Thread.currentThread().getName());
        }
    }

    private void sayObject2(){
        synchronized (object){
            System.out.println("sayObject2--"+Thread.currentThread().getName());
        }
    }
    private void sayObject3(){
        synchronized (object2){
            System.out.println("sayObject3--"+Thread.currentThread().getName());
        }
    }

    private void sayString1(){
        synchronized (string){
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("sayString1--"+Thread.currentThread().getName());
        }
    }

    private void sayString2(){
        synchronized (string){
            System.out.println("sayString2--"+Thread.currentThread().getName());
        }
    }
    private void sayString3(){
        synchronized (string2){
            System.out.println("sayString3--"+Thread.currentThread().getName());
        }
    }
}