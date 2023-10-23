package cn.maodun.generate.thread.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class TaskExecutor {

    public <T> List<T> executeTasks(List<Callable<T>> tasks, long timeout, TimeUnit unit) {
        List<CompletableFuture<T>> futures = new ArrayList<>();
        for (Callable<T> task : tasks) {
            CompletableFuture<T> future = CompletableFuture.supplyAsync(() -> {
                try {
                    return task.call();
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            });
            futures.add(future);
        }

        CompletableFuture<Void> allFutures = CompletableFuture.allOf(
                futures.toArray(new CompletableFuture[0])
        );

        CompletableFuture<Void> timeoutFuture = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(unit.toMillis(timeout));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Timeout occurred.");
        });

        CompletableFuture<Object> anyFuture = CompletableFuture.anyOf(allFutures, timeoutFuture);

        try {
            anyFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        List<T> results = new ArrayList<>();
        for (CompletableFuture<T> future : futures) {
            if (future.isDone()) {
                try {
                    results.add(future.get());
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            }
        }
        return results;
    }
}
