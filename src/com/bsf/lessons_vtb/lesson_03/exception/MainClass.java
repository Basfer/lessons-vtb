package com.bsf.lessons_vtb.lesson_03.exception;

import java.io.IOException;
import java.io.PrintWriter;

public class MainClass {
    private static void test() throws IOException {
        System.out.println("PrintWriter test");
        PrintWriter pw = new PrintWriter("report.txt");
        pw.close();
        System.out.println("PrintWriter OK");
    }

    public static void main(String[] args) {
        System.out.println("Start");
        Exception exc = null;
        try {
            int a = 10;
            int b = 22/a;
            int[] c = {1, 2, 3};
            c[b] = a;
            System.out.println("OK");
            throw new NumberFormatException("NFE Test");
        }
        catch (ArithmeticException e) {
            exc = e;
            System.out.println("Дeлeниe на ноль: " + e);
            System.out.print("ERROR: ");
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            exc = e;
            System.out.print("ERROR: ");
            e.printStackTrace();
            System.out.println("Индекс за пределами массива: " + e);
        }
        catch (NumberFormatException e) {
            exc = e;
            System.out.print("ERROR: ");
            e.printStackTrace();
            System.out.println("Неверный числовой формат: " + e);
        }
        finally {
            if (exc != null) {
                System.out.println("Исключение " + exc);
            }
        }
        System.out.println("END");

        try {
            test();
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
