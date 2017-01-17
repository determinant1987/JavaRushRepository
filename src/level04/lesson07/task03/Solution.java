package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String num1 = reader.readLine();
        String num2 = reader.readLine();
        String num3 = reader.readLine();

        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int n3 = Integer.parseInt(num3);


        int[] arr = {n1, n2, n3};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>0){
                count++;
            }
        }
        System.out.println(count);
    }
}
