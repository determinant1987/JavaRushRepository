package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

import java.util.Arrays;

public class Solution
{
    public static void main(String[] args)
    {

/*
        String[] m1 = new String[10];
        String[] m2= new String[5];
        String[] m3 =new String[12];



        for (int i=0;i<10;i++){
            Zerg z = new Zerg();
            z.name = "Zerg" + i;
            m1[i] = z.name;

        }
        System.out.println(Arrays.toString(m1));

        for (int i=0;i<5;i++){
            Protos p = new Protos();
            p.name = "Protos" + i;
            m2[i]=p.name;
        }
        System.out.println(Arrays.toString(m2));

        for (int i=0;i<12;i++){
            Terran t = new Terran();
            t.name = "Terran" + i;
            m3[i]=t.name;

        }
        System.out.println(Arrays.toString(m3));*/

        Zerg z1 = new Zerg();
        z1.name = "Zerg1";
        Zerg z2 = new Zerg();
        z2.name = "Zerg2";
        Zerg z3 = new Zerg();
        z3.name = "Zerg3";
        Zerg z4 = new Zerg();
        z4.name = "Zerg4";
        Zerg z5 = new Zerg();
        z5.name = "Zerg5";
        Zerg z6 = new Zerg();
        z6.name = "Zerg6";
        Zerg z7 = new Zerg();
        z7.name = "Zerg7";
        Zerg z8 = new Zerg();
        z8.name = "Zerg8";
        Zerg z9 = new Zerg();
        z9.name = "Zerg9";
        Zerg z10 = new Zerg();
        z10.name = "Zerg10";

        Protos p1 = new Protos();
        p1.name = "Protos1";
        Protos p2 = new Protos();
        p2.name = "Protos2";
        Protos p3 = new Protos();
        p3.name = "Protos3";
        Protos p4 = new Protos();
        p4.name = "Protos4";
        Protos p5 = new Protos();
        p5.name = "Protos5";

        Terran t1 = new Terran();
        t1.name = "Terran1";
        Terran t2 = new Terran();
        t2.name = "Terran2";
        Terran t3 = new Terran();
        t3.name = "Terran3";
        Terran t4 = new Terran();
        t4.name = "Terran4";
        Terran t5 = new Terran();
        t5.name = "Terran5";
        Terran t6 = new Terran();
        t6.name = "Terran6";
        Terran t7 = new Terran();
        t7.name = "Terran7";
        Terran t8 = new Terran();
        t8.name = "Terran8";
        Terran t9 = new Terran();
        t9.name = "Terran9";
        Terran t10 = new Terran();
        t10.name = "Terran10";
        Terran t11 = new Terran();
        t11.name = "Terran11";
        Terran t12 = new Terran();
        t12.name = "Terran12";


    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}