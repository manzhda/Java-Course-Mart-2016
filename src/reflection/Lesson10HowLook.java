package reflection;

import java.lang.reflect.Method;

/**
 * Created by mda on 5/13/16.
 */
public class Lesson10HowLook {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c = Class.forName("reflection.TestReflection");


        System.out.println("______________ Interfaces _______________");
        Class[] faces = c.getInterfaces();
        for (int i = 0; i < faces.length; i++)
            System.out.println(faces[i]);

        System.out.println("_____________ Methods ________________");

        Method[] methods = c.getMethods();
        for (int i = 0; i < methods.length; i++)
            System.out.println(methods[i]);

        System.out.println("_____________ Methods Declared ________________");

        Method[] declaredmethods = c.getDeclaredMethods();
        for (int i = 0; i < declaredmethods.length; i++)
            System.out.println(declaredmethods[i]);

        System.out.println("_____________________________");



    }
}
