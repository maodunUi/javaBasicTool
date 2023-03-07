package cn.maodun.generate.thread.juc;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author DELL
 * @date 2022/8/10
 */

public class DataContainer {
    private Object data ;
    private ReentrantReadWriteLock rw = new ReentrantReadWriteLock() ;
    private ReentrantReadWriteLock.ReadLock r = rw.readLock() ;
    private ReentrantReadWriteLock.WriteLock w = rw.writeLock() ;

    public Object read() {
        System.out.println("获取读锁。。。。");
        r.lock();
        try {
            System.out.println("进行数据读取。");
            Thread.sleep(1000);
            return data ;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println("释放读锁。。。。");
            r.unlock();
        }
        return null ;
    }

    public void write() {
        System.out.println("获取写锁。。。。");
        w.lock();
        try {
            System.out.println("进行数据写入。");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println("释放写锁。。。。");
            w.unlock();
        }
    }

    public static void main(String[] args) {

    }
}
