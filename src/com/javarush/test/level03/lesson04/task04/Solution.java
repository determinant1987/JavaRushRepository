package com.javarush.test.level03.lesson04.task04;

/* Произведение 10 чисел
Вывести на экран произведение 10 чисел от 1 до 10. Результат - 1 число.
Подсказка: будет три миллиона с хвостиком.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        System.out.println(factorial(10));

    }

    private static int factorial(int i)
    {
        int start = 1;
        for (int j=1;j<=i;j++){
            start=start*j;
        }
    return start;
    }

}