package cn.maodun.generate.reflect;

/**
 * @author DELL
 * @date 2022/7/9
 */
public class Person extends Animal{

     public String name ;

     public Integer age ;

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
