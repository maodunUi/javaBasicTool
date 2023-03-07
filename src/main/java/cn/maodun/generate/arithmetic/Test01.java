package cn.maodun.generate.arithmetic;

/**
 * @author DELL
 * @date 2022/12/17
 */
public class Test01 {
    public static void main(String[] args) {
        int n = 100 ;
//        loopPrint(n);
        long startTime = System.currentTimeMillis();
        recursivePrint(n);
        long endTime = System.currentTimeMillis();
        System.out.println("call recursivePrint method total time " + (endTime - startTime));
    }

    private static void recursivePrint(int n) {
        if (n != 0) {
            recursivePrint(n-1);
            System.out.println(n);
        }
    }

    private static void loopPrint(int n) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("call loopPrint method total time " + (endTime - startTime));
    }

}
