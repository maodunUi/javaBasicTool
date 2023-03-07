package cn.maodun.generate.thread.simple;

/**
 * @author DELL
 * @date 2022/8/11
 */
public class DieLock {
    Object A = new Object() ;
    Object B = new Object() ;
    void test() {
        Thread t1 = new Thread(() ->  {
            synchronized (A){

            }
        },"t1") ;
    }
}
