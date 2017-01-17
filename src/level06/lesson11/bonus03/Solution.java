package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int num1 =Integer.parseInt(reader.readLine()) ;
        int num2 =Integer.parseInt(reader.readLine()) ;
        int num3 =Integer.parseInt(reader.readLine()) ;
        int num4 =Integer.parseInt(reader.readLine()) ;
        int num5 =Integer.parseInt(reader.readLine()) ;

        int[] arr = {num1,num2,num3,num4,num5};

                for(int i=0;i< arr.length-1;i++){
                    for(int j=i+1;j<arr.length;j++){
                        if (arr[j]<arr[i]){
                            int temp = arr[i];
                            arr[i]=arr[j];
                            arr[j]=temp;
                        }
                    }
                }
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
