package org.example;

public class Task1 {
    //Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

    public static void main(String[] args) {
        int[] array = {2, 5, 7, 4};

        Task1 task1 = new Task1();
        if(task1.parity(array)){
            System.out.println("Всё хорошо");
        }
        System.out.println(task1.zero(array));
        System.out.println(task1.sum(array, 50));
    }

    public boolean parity(int[] arr) {
        if (arr.length % 2 != 0) {
            throw new RuntimeException("длина массива должна быть чётной");
        }
        return true;
    }

    public boolean zero(int[] arr) {
        boolean result = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                throw new RuntimeException("в массиве есть число 0");
            }
        }

        return result;
    }

    public int sum(int [] arr, int max){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        if(sum > max){
            throw new RuntimeException("сумма больше максимальной");
        }
        return sum;
    }
}
