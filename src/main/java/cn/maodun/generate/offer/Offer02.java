package cn.maodun.generate.offer;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * @author DELL
 * @date 2023/6/28
 */
public class Offer02 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(2);
        priorityQueue.add(4);
        priorityQueue.add(3);
        priorityQueue.add(0);
        priorityQueue.add(1);

        int size = priorityQueue.size();
        for (int i = 0 ; i < size ; i++){
            System.out.println(priorityQueue.poll());
        }
    }


    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (size > num.length || size < 1)
            return ret;
        PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2) -> o2 - o1);  /* 大顶堆 */
        for (int i = 0; i < size; i++)
            heap.add(num[i]);
        ret.add(heap.peek());
        for (int i = 0, j = i + size; j < num.length; i++, j++) {            /* 维护一个大小为 size 的大顶堆 */
            heap.remove(num[i]);
            heap.add(num[j]);
            ret.add(heap.peek());
        }
        return ret;
    }


}
