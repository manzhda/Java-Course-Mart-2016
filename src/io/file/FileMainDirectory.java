package io.file;

import java.io.File;
import java.io.FileFilter;

/**
 * Created by mda on 5/16/16.
 */
public class FileMainDirectory {
    public static void main(String[] args) {
        File path = new File(".");

        File ideaDirectory = new File(new File(".."), ".idea");
        System.out.println("----");
        System.out.println(" directory = " + ideaDirectory.isDirectory());
        System.out.println(ideaDirectory.getName());
        System.out.println("----");

        File[] list = path.listFiles();

        // Напечатать имена файлов
        for(int i = 0; i < list.length; i++) {
            System.out.println("directory = " + list[i].isDirectory() + ", \t name = " + list[i].getName());
        }
    }
}
