package org.example;

import java.util.Arrays;

public class Task3 {

    //* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен частному элементов
// двух входящих массивов в той же ячейке. Если длины массивов не равны,
// необходимо как-то оповестить пользователя.
// Важно: При выполнении метода единственное исключение,
//которое пользователь может увидеть - RuntimeException, т.е. ваше.
    public static void main(String[] args) {
        int[] arr1 = {20, 10, 15, 6, 5};
        int[] arr2 = {1, 5, 3, 2, 5};

        Task3 task3 = new Task3();
        System.out.println(Arrays.toString(task3.result_array1(arr1, arr2)));

    }

    public int[] result_array1(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        if (arr1.length != arr2.length) {
            throw new RuntimeException("длины массивов не равны");
        } else {
            for (int i = 0; i < result.length; i++) {
                if (arr2[i] == 0) {
                    throw new RuntimeException("на ноль делить нельзя!");
                } else {
                    result[i] = arr1[i] / arr2[i];
                }
            }
        }

        return result;
    }
}