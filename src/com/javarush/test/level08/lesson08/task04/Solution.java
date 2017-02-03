package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);

        for (Map.Entry<String, Date> pair : map.entrySet()){
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("AUGUST 1 1980"));
        map.put("tallon", new Date("JULY 1 1980"));
        map.put("allone", new Date("SEPTEMBER 1 1980"));
        map.put("Stne", new Date("OCTOBER 1 1980"));
        map.put("Slone", new Date("DECEMBER 1 1980"));
        map.put("Stae", new Date("AUGUST 1 1980"));
        map.put("Stlone", new Date("MAY 1 1980"));
        map.put("Ste", new Date("JUNE 1 1980"));
        map.put("Stloneee", new Date("MAY 1 1980"));
        map.put("e", new Date("MARCH 1 1980"));


        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Date> pair = iterator.next();
            if(pair.getValue().getMonth() >= 5 && pair.getValue().getMonth() <= 7){
                iterator.remove();
            }
        }



    }
}
