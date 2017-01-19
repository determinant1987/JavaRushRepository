package com.javarush.test.level04.lesson10.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String num1 = reader.readLine();
        String num2 = reader.readLine();
        int m = Integer.parseInt(num1);
        int n = Integer.parseInt(num2);

        for(int i=0;i<m;i++){
            int j=0;
            for(;j<n;j++){
                System.out.print("8");
            }
           // int j=0;
            System.out.println("");

        }

    }
}
