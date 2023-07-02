package cn.maodun.generate.offer;

import java.util.Stack;

/**
 * 题目：定义栈的数据结构，请在该类型中实现一个能够得到栈的最小
 * 元素的min函数。在该栈中，调用min、push及pop的时间复杂度都是O(I)
 * <p>
 * 1.构造两个栈
 * 一个数据栈
 * 一个最小栈
 *
 * @author DELL
 * @date 2023/7/2
 */
public class Offer30 {


    static Stack<Integer> dataStack = new Stack<>();

    static Stack<Integer> minStack = new Stack<>();

    public static void main(String[] args) {

    }

    static void push(Integer value) {
        dataStack.push(value);

        if (minStack.size() == 0 || minStack.pop() < value) {
            minStack.push(value);
        } else {
            minStack.push(minStack.pop());
        }

    }

    static Integer pop() {
        Integer value = null;
        if (dataStack.size() > 0 && minStack.size() > 0) {
            value = dataStack.pop();
            minStack.pop();
        }
        return value;
    }

    static Integer min() {
        if (dataStack.size() > 0 && minStack.size() > 0) {

            return minStack.pop();
        }
        return null;
    }
}
