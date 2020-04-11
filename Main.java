package com.brunoyam.unit_1;

import com.brunoyam.unit_1.utils.Generator;

import java.util.Arrays;

public class Main {

    /*
    Условия:
    oneDimensionArray - массив содержащий не меньше 3 и не больше 99 элементов типа int.
    Среди них всегда есть хотя бы одно положительное, хотя бы одно отрицательное и хотя бы один 0.

    Подсказки:

    Для выполнения задания вспомните максимальные и минимальные значения целочисленных типов.

    Длина массива хранится в поле length. Например, длину массива myArray можно получить так: int myArrayLength = myArray.length

    Для выходя из метода используется ключевое слово return. Если после него стоит значение (или переменная), то это значение будет возвращено как результат работы метода.

    Метод main расположен последним в классе (находится в самом низу)

     */

    private static int[] oneDimensionArray = Generator.getOneDimensionArray();

    private static void level1() {
        /*
         Выберите подходящий тип переменных, в которые будут сохраняться значения.
         Не забудьте, что метод, вычисляющий значение переменной должен возвращать тот же тип.
        */
        int minValue = findMinValue(oneDimensionArray);
        int maxValue = findMaxValue(oneDimensionArray);
        int sumOfValues = sumValues(oneDimensionArray);
        int firstPositiveIndex = getFirstPositiveIndex(oneDimensionArray);
        int firstNegativeIndex = getFirstNegativeIndex(oneDimensionArray);


        System.out.println("First part");

        System.out.println("min: " + minValue);
        System.out.println("max: " + maxValue);
        System.out.println("sum: " + sumOfValues);

        System.out.println();
        System.out.println("length: " + oneDimensionArray.length);
        System.out.println("first positive index: " + firstPositiveIndex);
        System.out.println("first negative index: " + firstNegativeIndex);
    }

    private static void level2() {

        /*
         Выберите подходящий тип переменных, в которые будут сохраняться значения.
         Не забудьте, что метод должен возвращать значение тогот же типа.
        */
        int lastPositiveIndex = getLastPositiveIndex(oneDimensionArray);
        int lastNegativeIndex = getLastNegativeIndex(oneDimensionArray);
        byte[] positiveNegativeNumber = countPositiveNegative(oneDimensionArray);

        System.out.println("last positive index: " + lastPositiveIndex);
        System.out.println("last negative index: " + lastNegativeIndex);
        System.out.println("total positives: " + positiveNegativeNumber[0]);
        System.out.println("total negatives: " + positiveNegativeNumber[1]);
    }

    /* Укажите тип значения, которое будет возвращать метод*/
    private static int findMinValue(int[] arrayOfValues) {
        /* Укажите тип переменной */
        int minValue = 0;
        /*
           Используя цикл for переберите все значения массива и сохраните минимальное в переменную minValue.
         */

        System.out.println(arrayOfValues.length);
        for(int i=0;i<=arrayOfValues.length-1;i++){
            if (arrayOfValues[i]<minValue){
                minValue=arrayOfValues[i];
            }
        }
        //System.out.println(minValue);
        return minValue;

    }

    /* Укажите тип значения, которое будет возвращать метод*/
    private static int findMaxValue(int[] arrayOfValues) {
        /* Укажите тип переменной */
        int maxValue = 0;
        /*
           Используя цикл for переберите все значения массива и сохраните максимальное в переменную maxValue.
         */
        for(int i=0;i<=arrayOfValues.length-1;i++){
            if (arrayOfValues[i]>maxValue){
                maxValue=arrayOfValues[i];
            }
        }
        //System.out.println(maxValue);
        return maxValue;
    }

    /* Укажите тип значения, которое будет возвращать метод*/
    private static int sumValues(int[] arrayOfValues) {
        /* Укажите тип переменной */
        int sum = 0;
        /* Используя цикл for переберите все значения массива, просуммируйте и сохраните сумму всех значений в переменную sum. */
        for(int i=0;i<=arrayOfValues.length-1;i++){
            sum = sum + arrayOfValues[i];
        }
        //System.out.println(sum);
        return sum;
    }

    /* Укажите тип значения, которое будет возвращать метод*/
    private static int getFirstPositiveIndex(int[] arrayOfValues) {
        /* Укажите тип переменной */
        int firstPositiveIndex = 0;
        /* Используя цикл while найдите индекс первого положительного значения в массиве и сохраните в переменную firstPositiveIndex */
       for (int i = 0; i<=arrayOfValues.length-1;i++){
           if (arrayOfValues[i]>0){
               firstPositiveIndex = i;
               break;
           }
       }

        return firstPositiveIndex;
    }

    /* Укажите тип значения, которое будет возвращать метод*/
    private static int getFirstNegativeIndex(int[] arrayOfValues) {
        /* Укажите тип переменной */
        int firstNegativeIndex = 0;
        /* Используя цикл while найдите первое отрицательное значение и сохраните в переменную firstNegativeIndex */
        for (int i = 0; i<=arrayOfValues.length-1;i++){
            //System.out.println("+++++++");
            //System.out.println(arrayOfValues.length);
            if (arrayOfValues[i]<0){
                firstNegativeIndex = i;
                break;
            }
        }

        return firstNegativeIndex;
    }

    /* Укажите тип значения, которое будет возвращать метод*/
    private static int getLastPositiveIndex(int[] arrayOfValues) {
        /*
        Найдите последнее положительное значение в массиве.
        Верните найденное значение используя ключевое слово return.
         */
        int lastPositiveIndex = 0;
        for (int i = 0; i<=arrayOfValues.length-1;i++){
            //System.out.println("+++++++");
            //System.out.println(arrayOfValues[i]);
            if (arrayOfValues[i]>0){
                lastPositiveIndex = i;
                /*System.out.println("++++++");
                System.out.println(i);
                System.out.println(arrayOfValues[i]);
                System.out.println(arrayOfValues[arrayOfValues.length-1]);*/
            }
        }
        return lastPositiveIndex;
    }

    /* Укажите тип значения, которое будет возвращать метод*/
    private static int getLastNegativeIndex(int[] arrayOfValues) {
        /*
        Найдите последнее отрицательное значение в массиве.
        Верните найденное значение используя ключевое слово return.
         */
    int lastNegativeIndex = 0;
        for (int i = 0; i<=arrayOfValues.length-1;i++){
        //System.out.println("+++++++");
        //System.out.println(arrayOfValues[i]);
            if (arrayOfValues[i]<0){

            lastNegativeIndex = i;
                /*System.out.println(i);
                System.out.println(arrayOfValues[i]);
                System.out.println(arrayOfValues[arrayOfValues.length-1]);*/
            }
        }

        return lastNegativeIndex;
}


    private static byte[] countPositiveNegative(int[] arrayOfValues) {
        byte[] result = new byte[2];

        /*
        Посчитайте количество положительных и отрицательных значений в массиве arrayOfValues.
        Результат сохраните в массив result:
            В первый элемент - количество положительных
            Во второй элемент - количество отрицательных
         */
        byte allPositives = 0;
        byte allNegatives = 0;

        for (int i = 0; i<=arrayOfValues.length-1;i++){
            if (arrayOfValues[i]>0){
                allPositives = (byte) (allPositives + 1);
            }
            else if (arrayOfValues[i]<0){
                allNegatives = (byte) (allNegatives + 1);
            }
        }
        result[0] = allPositives;
        result[1] = allNegatives;
        return result;
    }
    /*private static void getAllArray(int[] arrayOfValues) {
        for (int i = 0; i<=arrayOfValues.length-1;i++) {
            System.out.println(i);
        }
    }*/

    public static void main(String[] args) {
        level1();
        level2();
    }
}
