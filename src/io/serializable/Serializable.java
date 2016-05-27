package io.serializable;

import java.io.IOException;

/**
 * Created by mda on 5/16/16.
 */
public class Serializable {

    public static void main(String[] args) {
        try {
            // Сериализация
            java.io.ObjectOutputStream ois = new java.io.ObjectOutputStream(new java.io.FileOutputStream("files/out/state.bin"));

            ois.writeDouble(3.14159265D);

            ois.writeObject("The value of PI");

            ois.writeObject(new Point(10, 253)); //запись объекта класса Point

            ois.flush();
            ois.close();


            // Десериализация
            java.io.ObjectInputStream ois_d = new java.io.ObjectInputStream(new java.io.FileInputStream("files/out/state.bin"));

            System.out.println("Double: " + ois_d.readDouble());

            System.out.println("String: " + ois_d.readObject().toString());

            System.out.println("Point: " + (Point) ois_d.readObject());

            ois_d.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
