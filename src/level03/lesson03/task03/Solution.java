package com.javarush.test.level03.lesson03.task03;

/* 10 процентов
Реализуйте метод addTenPercent, который увеличивает переданное целое число на 10%.
Исправьте ошибку в сигнатуре метода.
Подсказка: подумайте, какие у этого метода входные и выходные данные.
*/
public class Solution
{
    public static double addTenPercent(int i) {

        double a = i+0.1*i;
        return a;
        /*double a = ((10*i)/100);

        double b = a+(double)i;
        return b;*/
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(10));
    }
}
