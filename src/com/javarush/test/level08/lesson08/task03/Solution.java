package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("dfg", "dfg");
        map.put("ag","adsfg");
        map.put("sdfg", "fhfh");
        map.put("fgh", "djdf");
        map.put("dfh", "sfgjsgj");
        map.put("dfgjfgj", "hjdhj");
        map.put("dfj", "dfjdfj");
        map.put("dfjdfj","dfjdfj");
        map.put("dfhdfg", "dfgjdfgj");
        map.put("dfgh", "dfgh");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int count=0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {

            Map.Entry<String, String> pair = iterator.next();
            if(pair.getValue().equals(name)){
                count++;

            }


        }
        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        int count=0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {

            Map.Entry<String, String> pair = iterator.next();
            if(pair.getKey().equals(lastName)){
                count++;

            }


        }
        return count;
    }
}
