package com.company;

import java.util.Arrays;

public class Module_2 {

    public static void main(String[] args) {
        int[] array1 = {44, 32, 86, 19};
        int[] array21 = {1, 2, 3, 4};
        int[] array22 = {1, 3};
        int[] array3 = {1, 2, 3};
        System.out.println("Задача №1. Ответ:  " + repeat("hello", 3));
        System.out.println("Задача №2. Ответ:  " + differenceMaxMin(array1));
        System.out.println("Задача №3.1. Ответ:  " + isAvgWhole(array21));
        System.out.println("Задача №3.2. Ответ:  " + isAvgWhole(array22));
        System.out.println("Задача №4. Ответ:  " + Arrays.toString(cumulativeSum(array3)));
        System.out.println("Задача №5. Ответ:  " + getDemicalPlaces("43.23330"));
        System.out.println("Задача №6. Ответ:  " + Fibonacci(12));
        System.out.println("Задача №7. Ответ:  " + isValid("59a20"));
        System.out.println("Задача №8. Ответ:  " + isStrangePair("уауау", "ауауау"));
        System.out.println("Задача №9,1. Ответ:  " + isPrefix("automation", "auto-"));
        System.out.println("Задача №9,2. Ответ:  " + isSuffix("arachnophobia", "-phobia"));
        System.out.println("Задача №10. Ответ:  " + boxSeq(6));
    }

    //Задача №1
    public static String repeat(String a, int n) {
        String str = " ";
        for (int i = 0; i < a.length(); i++){
            char sym = a.charAt(i);
            for (int j = 1; j <= n; j++){
                str += sym;
            }
        }
        return str;
    }

    //Задача №2
    public static int differenceMaxMin(int arr[]) {
        int max = arr[1];
        int min = arr[1];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max ){
                max = arr[i];
            }
            if (arr[i] < min ){
                min = arr[i];
            }
        }
        int dmm = max - min;
        return dmm ;
    }

    //Задание №3
    public static boolean isAvgWhole(int arr[]) {
        double iaw = 0;
        for (int i = 0; i < arr.length; i++)
            iaw += arr[i];
        iaw = iaw/arr.length;
        if (iaw % 2==0){
            return true;
        }
        else  {
            return false;
        }

    }

    //Задание №4
    public static int[] cumulativeSum(int arr[]) {
        int[] mas = new int[arr.length];
        mas[0] = arr[0];
        for (int i = 1; i < arr.length; i++){
            mas[i] = arr[i] + mas[i-1];
        }
        return mas;
    }

    //Задание №5
    public static int getDemicalPlaces(String str) {
        int kol = 0;
        int ind = 0;
        for (int i = 0; i < str.length(); i++ ){
            if (str.charAt(i) == '.'){
                kol = 0;
                ind = 1;
            }
            else{
                kol++;
            }
        }
        if (ind == 1){
            return kol;
        }
        else {
            return 0;
        }
    }

    //Задание №6
    public static int Fibonacci(int num) {
        int a = 1;
        int b = 1;
        int sum = 0;
        if (num == 1)
            return 1;
        else
            for (int i = 2; i <= num; i++) {
                sum = a + b;
                b = a + b;
                a = b - a;
            }
        return sum;
    }

    //Задание №7
    public static boolean isValid(String str){
        try {
            double num = Double.parseDouble(str);
        } catch (NumberFormatException e){
            return false;
        }
        return str.length() <= 5;
    }

    //Задание №8
    public static boolean isStrangePair(String str1, String str2){
        return str1.charAt(0) == str2.charAt(str2.length()-1) && str1.charAt(str1.length() - 1) == str2.charAt(0);
    }

    //Задание №9
    public static boolean isPrefix(String str1, String str2){
        for (int i =0; i < str2.length()-1; i++){
            if (str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static boolean isSuffix(String str1, String str2){
        for (int i = str1.length() - str2.length() +1; i < str2.length(); i++){
            if (str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }
        return true;
    }

    //Задание №10
    public static int boxSeq(int shag) {
        int a = 0;
        for (int i = 1; i <= shag; i++) {
            if (i % 2 == 1) {
                a += 3;
            }
            else
                a -= 1;
        }
        return a;
    }
}
