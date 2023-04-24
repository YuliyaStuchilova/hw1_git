package org.example;

import java.util.Arrays;

public class Task2 {
    //Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен разности элементов
// двух входящих массивов в той же ячейке. Если длины массивов не равны,
// необходимо как-то оповестить пользователя.

    public static void main(String[] args) {
        int [] arr1 = {9,8,7,6,5};
        int [] arr2 = {1,2,3,4,5};

        Task2 task2 = new Task2();
        System.out.println(Arrays.toString(task2.result_array(arr1, arr2)));

    }

    public int [] result_array (int [] arr1, int [] arr2){
        int [] result = new int [arr1.length];
        if(arr1.length!= arr2.length){
            throw new RuntimeException("длины массивов не равны");
        }else{
            for (int i = 0; i < result.length; i++) {
                result[i] = arr1[i]-arr2[i];
            }
        }

        return result;
    }
}
