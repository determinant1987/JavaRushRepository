package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human grPa1 = new Human("grPa1", true, 71, null, null);
        Human grPa2 = new Human("grPa2", true, 74, null, null);
        Human grMa1 = new Human("grMa1", false, 70, null, null);
        Human grMa2 = new Human("grMa2", false, 72, null, null);
        Human Pa = new Human("Pa", true, 25, grPa1, grMa1);
        Human Ma = new Human("Ma", false, 23, grPa2, grMa2);
        Human Olya = new Human("Olya", false, 5, Pa, Ma);
        Human Elisey = new Human("Elisey", true, 3, Pa, Ma);
        Human Kirill = new Human ("Kirill", true, 2, Pa, Ma);
        grPa1.toString();
        grPa2.toString();
        grMa1.toString();
        grMa2.toString();
        Pa.toString();
        Ma.toString();
        Olya.toString();
        Elisey.toString();
        Kirill.toString();
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;


        public Human(String name, boolean sex, int age,  Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;

        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;
            System.out.println(text);
            return text;
        }
    }

}
