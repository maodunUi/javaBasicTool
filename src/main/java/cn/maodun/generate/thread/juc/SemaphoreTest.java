package cn.maodun.generate.thread.juc;

import java.util.concurrent.Semaphore;

/**
 * @author DELL
 * @date 2022/8/10
 */
public class SemaphoreTest {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3) ;
        for (int i = 0 ; i< 2 ; i++ ){
            new Thread(() -> {
                try {
                    semaphore.acquire();
                    Thread.sleep(1000);
                    System.out.println("running...");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    semaphore.release();
                }
            }).start();
        }

        for (int i = 0 ; i< 2 ; i++ ){
            new Thread(() -> {
                try {
                    semaphore.acquire();
                    Thread.sleep(1000);
                    System.out.println("running...");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    semaphore.release();
                }
            }).start();
        }
    }

}
