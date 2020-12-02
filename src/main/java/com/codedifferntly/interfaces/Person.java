package com.codedifferntly.interfaces;

public class Person {

    private final long Id;
    private String name;

    public Person(long id){
        Id = id;
    }

    public long getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    @Override
    public String toString(){
        return Id + " " + getName();
    }
}
