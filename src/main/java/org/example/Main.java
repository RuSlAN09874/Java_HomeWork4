package org.example;


public class Main {
    public static void main(String[] args) {
/*
Создайте массив из 8 случайных целых чисел из интервала [1;50]
Выведите массив на консоль в строку.
Замените каждый элемент с нечетным индексом на ноль.
Снова выведете массив на консоль в отдельной строке.
 */
/*
Создайте массив из 5 случайных целых чисел из интервала [10;99]
Выведите его на консоль в строку.
Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.
 */
       //int[] array = ArrayNum.creadMass(8,1,50);
       int[] array = ArrayNum.creadMass(5,10,99);
       ArrayNum.printerArray(array);
       int[] array2 = ArrayNum.retMass(array);
       ArrayNum.printerArray(array2);
       // array = new int[]{1,2,3,4,5};
       ArrayNum.chacVozrast(array);

    }

    }
