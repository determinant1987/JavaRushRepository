package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String salary = reader.readLine();
        String time = reader.readLine();

        int Psalary = Integer.parseInt(salary);
        int Ptime = Integer.parseInt(time);

        System.out.println(name + " получает " + salary + " через " + time + " лет.");

    }
}