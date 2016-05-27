package reflection;

/**
 * Created by mda on 5/13/16.
 */
public class Lesson10HowGet {
    public static void main(String[] args) {
//        Class c = new Class<String>(ClassLoader.getSystemClassLoader());

        // Методом объекта
        Class c1 = "".getClass();
        // При помощи суффикса class
        Class c2 = String.class;
        // Статическим методом класса Class
        try {
            Class c3 = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        Class c4 = Double.TYPE;

    }
}
