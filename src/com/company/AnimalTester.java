package com.company;

public class AnimalTester {
    public static void main(String[] args) {
        Animal Jack = new Animal ("Jack", "Lion", "Carnivore");
        Herbivore Kirtan = new Herbivore("Kirtan", "Giraffe");
        Elephant Dan = new Elephant("Dan", 3.14159265358979323846264883327950288);

        System.out.println(Jack);
        System.out.println(Kirtan);
        System.out.println(Dan);
    }
}
