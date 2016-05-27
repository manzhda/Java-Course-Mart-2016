package primitivecustom;

/**
 * Created by alexe on 22.04.2016.
 */
public class TypeVars {
    public static void main(String[] args) {
        int i = 4;
        int j = i;
        System.out.println("Primitive types:");
        System.out.println();
        System.out.println("i=" + i + ";  " + "j=" + j + ";");
        ++j;
        System.out.println("After increment ++j");
        System.out.println("i=" + i + ";  " + "j=" + j + ";");
        System.out.println("------------------------------------------------");

        System.out.println();
        System.out.println("Reference types:");
        System.out.println();

        Dog thisDog = new Dog("Sparky");
        Dog thatDog = thisDog;
        System.out.println("thisDog=" + thisDog.GetName() + ";  "
                + "thatDog=" + thatDog.GetName() + ";");
        System.out.println("thisDog=" + thisDog + ";  "
                + "thatDog=" + thatDog + ";");
        System.out.println();

        thatDog.SetName("Wolfie");
        System.out.println("After rename thatDog to Wolfie");
        System.out.println();
        System.out.println("thisDog=" + thisDog.GetName() + ";  "
                + "thatDog=" + thatDog.GetName() + ";");
        System.out.println("thisDog=" + thisDog + ";  "
                + "thatDog=" + thatDog + ";");
    }
}