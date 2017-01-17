package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

import java.util.Arrays;

public class Solution
{
    public static void main(String[] args)
    {
        int[][] Arr= {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {2, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {3, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {4, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {5, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {6, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {7, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {8, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {9, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {10, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };


        int i;
        int j;
        for(i=0; i<10;i++){
           for(j=0;j<10;j++){
               if (Arr[i][j]==0) {
                   Arr[i][j]= Arr[i][0]*Arr[0][j];
               }
           }
       }
        for(i=0; i<10;i++){
            for(j=0;j<10;j++){
                System.out.print(Arr[i][j] + " ");
                }
            System.out.println();
            }
        }

    }
