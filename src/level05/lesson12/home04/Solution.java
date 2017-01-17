package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

import java.util.Date;
import java.text.SimpleDateFormat;



public class Solution
{
    public static void main(String[] args)
    {

        Date d = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("dd MM yyyy");

        System.out.println(format1.format(d));

        //напишите тут ваш код
       /* Calendar cal = Calendar.getInstance();
        //System.out.println(cal.DATE +" "+ cal.MONTH + " "+cal.YEAR);
        int date = cal.get(cal.DAY_OF_MONTH);
        int month = cal.get(cal.MONTH);
        int year = cal.get(cal.YEAR);

        System.out.println(date +" "+ month+1 + " "+year);*/
    }


}
