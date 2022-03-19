package com.company;

public class Animal {
    private String diet;
    private String species;
    private String name;

    public Animal(String n, String spec, String food){
        diet = food;
        species = spec;
        name = n;
    }

    public String toString(){
        return name + " the " + species + " is a " + diet;
    }


}
