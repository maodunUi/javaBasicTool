package cn.maodun.generate.genericsClass;

/**
 * @author DELL
 * @date 2022/8/2
 */
public class Box<T extends  Number> {
    T t ;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
