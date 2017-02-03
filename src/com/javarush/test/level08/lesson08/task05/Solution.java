package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);


        for (Map.Entry<String, String> pair : map.entrySet()){
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Benson", "Igor");
        map.put("Bensn", "Igor");
        map.put("Benzson", "Igo");
        map.put("Bensonu", "Ior");
        map.put("Bson", "gor");
        map.put("Bon", "RIgor");
        map.put("Benn", "Igor");
        map.put("Bens", "Igor");
        map.put("Bensond", "Igor4");
        map.put("Bendfs", "Igor");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        //создаем две мапы, чтобы их сравнивать между собой, не затрагивая главную мапу
        //так как по ней можно проходить только один раз в методе
        //removeItemFromMapByValue, потому что в нем реализовано удаление map.remove из
        //интерфейса самой карты, но в цикле for each неявно используется итератор
        //который не допускает применения других интерфейсов, из-за чего у всех постоянно
        // и возникает жуткая ошибка ConcurrentModificationException

        HashMap<String, String> copy1 = new HashMap<String, String>(map);
        HashMap<String, String> copy2 = new HashMap<String, String>(map);

        //в первом цикле берем первое имя из первой копии
        for (Map.Entry<String, String> pair1: copy1.entrySet())
        {
            int count = 0;

            //во втором цикле сравниваем первое имя из первой копии со всеми именами
            //из второй копии, если одно совпадение, то имя встречается один раз,
            //если больше одного, то несколько и его надо удалить в исходной МамеМапе)))

            for (Map.Entry<String, String> pair2: copy2.entrySet()) {
                if (pair1.getValue().equals(pair2.getValue())) {
                    count++;
                }
            }

            //то есть, если больше одного совпадения, то удаляем в главной мапе
            //все позиции с нужным именем с помощью любезно предоставленного нам метода
            if (count > 1) {
                removeItemFromMapByValue(map, pair1.getValue());
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
