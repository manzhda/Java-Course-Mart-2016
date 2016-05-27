package io.aggregation;

import java.io.*;
import java.util.Scanner;

/**
 * Created by mda on 5/16/16.
 */
public class Aggregation {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        int i = 2;

        System.out.print("Введите целое число: ");


        if (sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
            i = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную


            InputStream in = new FileInputStream("data.txt");

            if (i == 1) {
                in = new PrintConsoleOne(in);
            }

            BufferedInputStream bis = new BufferedInputStream(in);

            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("files/out/data_copy.txt"));
            int c = 0;
            while (true) {
                c = bis.read();
                if (c != -1)
                    bos.write(c);
                else
                    break;
            }
            bis.close();
            bos.flush(); /*освобождаем буфер (принудительно записываем содержимое буфера в файл) */
            bos.close(); //закрываем поток записи (обязательно!)

        } else {
            System.out.println("Вы ввели не целое число");
        }

    }
}
