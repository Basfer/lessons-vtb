package com.bsf.lessons_vtb.lesson_03.exception;

public class HW {
    private static int testArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4) throw new MyArraySizeException("Размерность массива - " + arr.length  + " вместо " + 4);
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) throw new MyArraySizeException("Размерность массива [" + i + "] - " + arr[i].length  + " вместо " + 4);
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    int val = Integer.parseInt(arr[i][j]);
                    res += val;
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверное значение в ячейке массива [" + i + "][" + j + "]=" + arr[i][j]);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] arr = {
                {"2", "0", "23", "6"},
                {"5", "8", "6", "5", "5"},
                {"7", "7", "5", "4"},
                {"0", "5", "5", "6"}
        };
        System.out.println("Сумма элементов массива arr" + testArray(arr));
    }
}
