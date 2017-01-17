package com.javarush.test.level04.lesson10.task05;

import java.io.*;

/* Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
           /* int[][]arr={{1,2,3,4,5,6,7,8,9,10},
                        {2,0,0,0,0,0,0,0,0,0},
                        {3,0,0,0,0,0,0,0,0,0},
                        {4,0,0,0,0,0,0,0,0,0},
                        {5,0,0,0,0,0,0,0,0,0},
                        {6,0,0,0,0,0,0,0,0,0},
                        {7,0,0,0,0,0,0,0,0,0},
                        {8,0,0,0,0,0,0,0,0,0},
                        {9,0,0,0,0,0,0,0,0,0},
                        {10,0,0,0,0,0,0,0,0,0}};

        int i=0;
        int j=0;
        while(j<10)
        {
            while(i<10)
            {
                if (arr[j][i]==0){
                    arr[j][i]=arr[0][i]*arr[j][0];
                    //arr[1][2]=arr[0][2]*arr[1][0]
                    i++;
                    System.out.print(arr[j][i]);
                }

                System.out.println("");
                j++;
            }
        }*/

        int i=1;
        int j=1;
        while(j<=10)
        {
            while(i<=10)
            {
                System.out.print(i*j + " ");
                i++;
            }
            i=1;
            System.out.println();
            j++;
        }


    }
}
