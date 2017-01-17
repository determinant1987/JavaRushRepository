package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import java.io.*;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String number1 = reader.readLine();
        String number2 = reader.readLine();
        String number3 = reader.readLine();
        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);
        int num3 = Integer.parseInt(number3);
        int[] ar= {num1, num2, num3};

        if ((ar[0]!=ar[1])&&(ar[0]!=ar[2])){
        System.out.println("1");
        }
        if ((ar[1]!=ar[0])&&(ar[1]!=ar[2])){
        System.out.println("2");
        }
        if ((ar[2]!=ar[0])&&(ar[2]!=ar[1])){
        System.out.println(("3"));
    }
    }
}
