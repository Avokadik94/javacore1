package ru.geekbrains.lesson6.oop.zoo;

public class Animals {
    private String type;
    private String name;
    private int maxDistanceRun;
    private int maxDistanceSwim;
    private static int counter;

    private Animals() {counter++;}

    public Animals(String type, String name, int distanceRun, int distanceSwim) {
        this();
        this.type = type;
        this.name = name;
        this.maxDistanceRun = distanceRun;
        this.maxDistanceSwim = distanceSwim;
    }

    public boolean run(int distance) {
        if (distance <= maxDistanceRun) {
            System.out.printf("%s %s run %d meters\r\n", type, name, distance);
            return true;
        } else System.out.printf("%s %s can't run %d meters\r\n", type, name, distance);
        return false;
    }

    public boolean swim(int distance) {
        if (distance <= maxDistanceSwim) {
            System.out.printf("%s %s swim %d meters\r\n", type, name, distance);
            return true;
        } else System.out.printf("%s %s can't swim %d meters\r\n", type, name, distance);
        return false;
    }
}


