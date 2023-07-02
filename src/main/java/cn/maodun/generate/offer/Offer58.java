package cn.maodun.generate.offer;

/**
 * @author DELL
 * @date 2023/6/28
 */
public class Offer58 {
    public static void main(String[] args) {
        Offer58 offer58 = new Offer58();

        String s = offer58.ReverseSentence("i am a student.");


        System.out.println(s);
    }


    public String ReverseSentence(String str) {
        int n = str.length();
        char[] chars = str.toCharArray();
        int i = 0, j = 0;
        while (j <= n) {
            if (j == n || chars[j] == ' ') {
                reverse(chars, i, j - 1);
                i = j + 1;
            }
            j++;
        }
        reverse(chars, 0, n - 1);
        return new String(chars);
    }

    private void reverse(char[] c, int i, int j) {
        while (i < j)
            swap(c, i++, j--);
    }

    private void swap(char[] c, int i, int j) {
        char t = c[i];
        c[i] = c[j];
        c[j] = t;
    }
}
