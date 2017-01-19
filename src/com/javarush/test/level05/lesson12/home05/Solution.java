package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/
import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int summ=0;
        String name=reader.readLine();

        while(!(name.equals("сумма"))){

            int ame = Integer.parseInt(name);
            summ=summ+ame;
            name = reader.readLine();

        }
        System.out.println(summ);

    }
}
