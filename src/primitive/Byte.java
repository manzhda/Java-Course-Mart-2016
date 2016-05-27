package primitive;

/**
 * Created by mda on 4/22/16.
 */
public class Byte {

    public static void main(String[] args) {
        byte b = -128;
        System.out.println(Integer.toBinaryString(b));

        byte li = (byte) (b + 1);

        System.out.println(li);
    }
}
