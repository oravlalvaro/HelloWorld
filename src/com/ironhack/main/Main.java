package com.ironhack.main;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        String productName = " Producto uno      ";
        String date = "17/06/2021 ";

        System.out.println(productFormatter(productName, date));

        int[] numbers = {5,4,3,2,1};
        ej1(numbers);

        int[] numbers2 = {1,2,3,4,5};
        ej2_1(numbers2);

        int[] numbers3 = {1,2,3,4,5};
        ej2_2(numbers3);
    }

    public static String productFormatter (String productName, String date){
        return (productName.trim()+"_"+date.trim()).replace(" ","_").toUpperCase();
    }

    public static void ej1 (int[] numbers){
        System.out.println("Ejercicio 1");
        int num0 = numbers[0];
        for (int i=0; i < numbers.length; i++){
            if (i == numbers.length-1){
                numbers[i]=numbers[i]*num0;
            }
            else {
                numbers[i] = numbers[i] * numbers[i + 1];
            }
//            System.out.println(numbers[i]);
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void ej2_1 (int[] numbers){
        System.out.println("Ejercicio 2.1");
        for (int i=0; i< numbers.length/2; i++){
            int x = numbers[i];
            numbers[i]=numbers[numbers.length-(i+1)];
            numbers[numbers.length-(i+1)]=x;
        }
        System.out.println(Arrays.toString(numbers));
    }
    public static void ej2_2 (int[] numbers){
        System.out.println("Ejercicio 2.2");
        int[] aux = new int[numbers.length];
        for (int i = numbers.length-1, j=0; i>=0; i--, j++){
            aux[j]=numbers[i];
        }
        System.out.println(Arrays.toString(aux));
//        for (int num : aux){
//            System.out.println(num);
//        }
    }
}
