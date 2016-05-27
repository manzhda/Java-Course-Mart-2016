package primitive;

/**
 * Created by mda on 4/22/16.
 */
public class Primitives {
    public static void main(String[] args) {
        int value = 2147483647;
//        int value = 0xFFFFFFFF;
//        for (int i = 0; i < 32; i++) {
//            int i2 = value << i;
//            System.out.println(i2);
//            System.out.println(Integer.toBinaryString(i2));
//        }

        for (int i = 0; i <= 32; i++) {
            int i2 = value >> i;
            System.out.println(i2);
            System.out.println(Integer.toBinaryString(i2));
        }
    }
}
