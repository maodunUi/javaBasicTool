package cn.maodun.generate.generateClass;

/**
 * @author xl
 * @date 2022/3/11
 * https://www.cnblogs.com/coprince/p/8603492.html
 */
public class GenericsClass<T> {

    private T key ;

    public GenericsClass(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }
}
