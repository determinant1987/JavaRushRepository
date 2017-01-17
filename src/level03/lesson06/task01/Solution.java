package com.javarush.test.level03.lesson06.task01;

/* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/

import com.sun.org.apache.xpath.internal.SourceTree;

public class Solution
{
    public static void main(String[] args)
    {
        String a1="Мама";
        String a2="Мыла";
        String a3="Раму";

        System.out.println(a1+a2+a3);
        System.out.println(a1+a3+a2);
        System.out.println(a2+a1+a3);
        System.out.println(a2+a3+a1);
        System.out.println(a3+a1+a2);
        System.out.println(a3+a2+a1);

    }
}