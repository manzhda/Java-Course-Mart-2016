package io.file;

import java.io.File;

/**
 * Created by mda on 5/16/16.
 */
public class FileMain {
    public static void main(String[] args) {
        File path = new File(".");

        File[] list = path.listFiles();

        // Напечатать имена файлов
        for(int i = 0; i < list.length; i++) {
            System.out.println(list[i].getName());
        }
    }
}
