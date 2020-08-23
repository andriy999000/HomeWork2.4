package com.google;

import java.sql.SQLOutput;
import java.util.Scanner;

import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
//        Задание 4
//        Проверить работу переполнения мантиссы числа в java.
//        1.Создать переменную типа byte и проинициализировать ее максимальным значением.
//        2.Выполнить операцию "инкремент" для этой переменной.
//        3.Вывести значение на экран.


        byte b = 127;
        b++;
        System.out.println(b);


//        Задание 4
//        Написать тернарную операцию, которая определяет четность числа и формирует
//        соответствующую строку, которая выводится на экран
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\nВведите любое число:");
        int number = scanner.nextInt();
        int i = number % 2;

        System.out.println(i == 0 ? "Ваше число чётное!" : "Ваше число не чётное!");




    }
}
