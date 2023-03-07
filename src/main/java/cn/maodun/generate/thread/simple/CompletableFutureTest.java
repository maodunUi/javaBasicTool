package cn.maodun.generate.thread.simple;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * @author DELL
 * @date 2022/8/9
 */
public class CompletableFutureTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("有返回值的异步任务");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "hello world";
        }).thenApply(number -> {
            System.out.println("第二次计算");
            return "第二次计算" + number ;
        });
        // 执行完成和异常时执行该方法
        completableFuture.whenComplete(new BiConsumer<String, Throwable>() {
            @Override
            public void accept(String s, Throwable throwable) {
                System.out.println("执行完成");
            }
        }) ;
        completableFuture.exceptionally(new Function<Throwable, String>() {
            @Override
            public String apply(Throwable throwable) {
            return "异常了" ;
            }
        }) ;

        String s = completableFuture.get();
        System.out.println(s);
    }
}
