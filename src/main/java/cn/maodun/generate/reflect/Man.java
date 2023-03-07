package cn.maodun.generate.reflect;

/**
 * @author DELL
 * @date 2022/8/2
 */
public class Man extends Person{

     private String beard ;

    public String getBeard() {
        return beard;
    }

    public void setBeard(String beard) {
        this.beard = beard;
    }


    @Override
    public String toString() {
        return "Man{" +
                "beard='" + beard + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
