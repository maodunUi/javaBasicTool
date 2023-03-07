package cn.maodun.generate.thread.simple;

import java.util.concurrent.*;

/**
 * @author DELL
 * @date 2022/8/9
 */
public class FutureTaskTest {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println(System.currentTimeMillis());
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Future<?> future = executorService.submit(new FutureTask<>(() -> {
            Thread.sleep(5000);
            System.out.println("获取商品详情，花费5秒");
            return 1;
        }));

        Future<?> future1 = executorService.submit(new FutureTask<>(() -> {
            Thread.sleep(1000);
            System.out.println("询价，花费1秒");
            return 2;
        }));
        System.out.println("主线程我执行完成了");
        // get方法时阻塞的，应该使用timeout 限制

        executorService.execute(() -> {
            try {
                future.get();
                System.out.println("我是否后执行");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
        executorService.execute(() -> {
            try {
                future1.get();
                System.out.println("我是否先执行");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });

        System.out.println(System.currentTimeMillis());
    }
}
