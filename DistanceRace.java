package ru.geekbrains.lesson6.oop.zoo;

public class DistanceRace {
    public static void main(String[] args){

        Animals[] animal = {
                new Dog("Sharik",700, 40),
                new Dog("Bobik",500, 35),
                new Cat("Murka",645, 20),
                new Cat("Barsik",450, 25),
    };
        for (Animals a : animal) {
            a.run(150);
            a.swim(15);
            a.run(300);
            a.swim(20);
            a.run(650);
            a.swim(5);

        }
    }
}
