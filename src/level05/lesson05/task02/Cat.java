package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/
/*class ass
{
    public static void main(String[] args)
    {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.age = 1;
        cat1.weight = 5;
        cat1.strength = 10;

        cat2.age = 2;
        cat2.weight = 3;
        cat2.strength = 4;


        System.out.println(cat2.fight(cat1));

    }
}*/
public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat()
    {
    }



    public boolean fight(Cat anotherCat)
    {
        return /*(this.age < anotherCat.age) && (this.weight > anotherCat.weight) && */(this.strength > anotherCat.strength);

    }
}
