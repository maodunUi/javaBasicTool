package cn.maodun.generate.offer;

/**
 * @author DELL
 * @date 2023/6/27
 */
public class Offer50 {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9};
        System.out.println(a['!']);
    }

    public static int FirstNotRepeatingChar(String str) {
        int[] cnts = new int[128];
        for (int i = 0; i < str.length(); i++)
            cnts[str.charAt(i)]++;
        for (int i = 0; i < str.length(); i++)
            if (cnts[str.charAt(i)] == 1)
                return i;
        return -1;
    }
}
