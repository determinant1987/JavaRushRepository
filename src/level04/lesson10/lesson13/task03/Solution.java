package com.javarush.test.level04.lesson10.lesson13.task03;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int i=0;
        int j=0;
        for(i=10;i>0;i--){
            for(j=i;j<=10;j++){
                System.out.print("8");

            }
            //j=i;
            System.out.println("");

        }

    }
}
