package com.company;

public class Animal {
    private String diet;
    private String species;
    private String name;

    public Animal(String food, String spec, String n){
        diet = food;
        species = spec;
        name = n;
    }

    public String toString(){
        return name + " the " + species + " is a " + diet;
    }


}
