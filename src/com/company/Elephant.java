package com.company;

public class Elephant extends Herbivore{

    private double length;
    public Elephant(String name1, double len){
        super(name1, "Elephant");
        length = len;
    }
    public String toString(){
        return super.toString() + " with tusks " + length + " meters long";
    }
}
