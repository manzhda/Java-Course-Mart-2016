package io.file;

import java.io.File;
import java.io.FileFilter;

/**
 * Created by mda on 5/16/16.
 */
public class FileMainFilter {
    public static void main(String[] args) {
        File path = new File(".");

        // Получить массив объектов
        File[] list = path.listFiles(new FileFilter() {
            public boolean accept(File file) {

                String filter = "bin";

                String f = file.getName();

                return f.indexOf(filter) != -1;
            }
        });

        // Напечатать имена файлов
        for(int i = 0; i < list.length; i++) {
            System.out.println(list[i].getName());
        }
    }
}
