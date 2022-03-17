package com.company;

public class Elephant extends Herbivore{
    private String name;
    private double length;
    public Elephant(String name, double len){
        super("Elephant", name);
        length = len;
    }
    public String toString(){
        return super.toString() + " with tusks " + length + " meters long";
    }
}
