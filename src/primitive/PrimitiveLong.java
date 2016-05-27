package primitive;

/**
 * Created by mda on 4/22/16.
 */
public class PrimitiveLong {
    public static void main(String[] args) {
        long l1 = -9223372032559808513L - 2L;
        int i1 = (int) (l1); //2147483647

        System.out.println(l1);
        System.out.println(Long.toBinaryString(l1));
        System.out.println(i1);
        System.out.println(Integer.toBinaryString(i1));

    }
}
