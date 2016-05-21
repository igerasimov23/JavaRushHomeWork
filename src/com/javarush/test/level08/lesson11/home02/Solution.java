package com.javarush.test.level08.lesson11.home02;

import java.util.HashSet;
import java.util.Set;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        System.out.println();
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> result = new HashSet<Cat>();

        //напишите тут ваш код
        for (int i = 0; i < 4; i++) {
            result.add(new Cat());
        }

        return result;
    }

    public static Set<Dog> createDogs()
    {
        //напишите тут ваш код
        HashSet<Dog> result = new HashSet<Dog>();
        for (int i=0; i<3; i++)
            result.add(new Dog());
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        //напишите тут ваш код
        HashSet<Object> pets = new HashSet<Object>();
        for (Cat c1 : cats)
            pets.add(c1);
        for (Dog d1 : dogs)
            pets.add(d1);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        //напишите тут ваш код
//        Iterator<Object> iterator = pets.iterator();
//        while (iterator.hasNext()){
//            iterator.next();
//            if (pets.contains(cats))
//                iterator.remove();
        for (Cat c1 : cats){
            pets.remove(c1);
        }



    }

    public static void printPets(Set<Object> pets)
    {
        //напишите тут ваш код
        for (Object o : pets)
            System.out.println(o);
//        Iterator<Object> iterator = pets.iterator();
//        while (iterator.hasNext()){
//            Object o = iterator.next();
//            System.out.println(o);



    }

    //напишите тут ваш код
    public static class Cat {}
    public static class Dog {}
}
