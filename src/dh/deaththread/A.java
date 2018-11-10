package dh.deaththread;

import java.util.concurrent.locks.Lock;

/**
 * @Description: $description$
 * @Author: daihong
 * @Date: Created in  2018/10/31
 */
public class A {
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run(){
                synchronized (lock1){
                    System.out.println("thread1 get lock1");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (lock2){
                        System.out.println("thread1 get lock2");

                    }
                }
                System.out.println("thread1 end");
            }
        }.start();

        new Thread(){
            @Override
            public void run(){
                synchronized (lock2){
                    System.out.println("thread2 get lock2");
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (lock1){
                        System.out.println("thread2 get lock1");
                    }
                }
                System.out.println("thread2 end");
            }
        }.start();
    }
}
