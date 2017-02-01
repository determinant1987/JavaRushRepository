package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    HashSet<String> set = createSet();



    public static HashSet<String> createSet()
    {
        //напишите тут ваш код

        HashSet<String> set = new HashSet<String>();
        set.add("Лось01");
        set.add("Лось02");
        set.add("Лось03");
        set.add("Лось04");
        set.add("Лось05");
        set.add("Лось06");
        set.add("Лось07");
        set.add("Лось08");
        set.add("Лось09");
        set.add("Лось10");
        set.add("Лось11");
        set.add("Лось12");
        set.add("Лось13");
        set.add("Лось14");
        set.add("Лось15");
        set.add("Лось16");
        set.add("Лось17");
        set.add("Лось18");
        set.add("Лось19");
        set.add("Лось20");
        return set;


    }
}
