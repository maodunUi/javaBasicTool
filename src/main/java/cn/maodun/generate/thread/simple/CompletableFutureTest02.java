package cn.maodun.generate.thread.simple;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

/**
 * @author DELL
 * @date 2022/8/9
 */
public class CompletableFutureTest02 {
    public static void main(String[] args) {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "hello world1";
        });

        CompletableFuture<String> completableFuture2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "hello world2";
        });

        completableFuture.acceptEither(completableFuture2, new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("最快的结果：" + s);
            }
        }) ;
    }


}
