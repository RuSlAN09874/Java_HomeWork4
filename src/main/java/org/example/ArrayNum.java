package org.example;

import java.util.Random;

public class ArrayNum {
    public static int[] creadMass(int size,int min,int max) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            // array[i] = random.nextInt(max - min + 1) + min;
            array[i] = random.nextInt(min,max + 1);

        }
        return array;
    }
    public static void printerArray(int[] array){
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static int[] retMass(int[] array){
        for (int i = 0; i < array.length; i +=2) {
            array[i] = 0;
        }
        return array;
    }
    public static void chacVozrast(int[] array){
        for (int i = 1; i < array.length; i++) {
            if (array[i]<=array[i-1]) {
                System.out.println("Массив не является возростающим");
                return;
            }
        }
        System.out.println("Массив строго возрастающий");
    }
}
