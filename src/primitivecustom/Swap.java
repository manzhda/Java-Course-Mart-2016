package primitivecustom;

/**
 * Created by mda on 4/22/16.
 */
public class Swap {

    int c2 = a; //4

//    static int c = a;//1

    private static int a = 10;// 2

    static int b = 30;// 3

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);

//--------------------------------------------------------
        int a = 20;
        int b = 40;

        System.out.println("Primitive swap");
        System.out.println(a);
        System.out.println(b);

        swap(a, b);

        System.out.println(a);
        System.out.println(b);
//--------------------------------------------------------

        Swapable aClass = new Swapable(20);
        Swapable bClass = new Swapable(40);

        System.out.println("Custom swap");
        System.out.println(aClass);
        System.out.println(bClass);

        swap(aClass, bClass);

        System.out.println(aClass);
        System.out.println(bClass);
//--------------------------------------------------------

    }

    private static void swap(int a /*= 20*/, int b /* = 40*/) {
        int temp = a;
        a = b;
        b = temp;
    }

    private static void swap(Swapable a, Swapable b) {
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

    static class Swapable {
        int value;

        public Swapable(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Swapable{" +
                    "value=" + value +
                    '}';
        }
    }
}
