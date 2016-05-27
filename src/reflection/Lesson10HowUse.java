package reflection;

/**
 * Created by mda on 5/13/16.
 */
public class Lesson10HowUse {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        TestReflection t = new TestReflection();

//        Class c = TestReflection.class;
        Class c = Class.forName("reflection.TestReflection");

        TestReflection t2 = (TestReflection) c.newInstance();
        t2.setName("Hello reflection!");

        System.out.println(t2.getName());

//        String s = (String) c.newInstance(); // java.lang.ClassCastException

        Class cS = String.class;

        String s = (String) cS.newInstance();

        System.out.println(s);

    }
}
