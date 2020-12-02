package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void constructorTest(){
        String name = "LoveBuggy";
        long Id = 0;
        Person person = new Person(Id);
        person.setName(name);

        // When
        String expected = "0 LoveBuggy";
        String actual = person.toString();
        // Then
        Assert.assertEquals("Constructor test",expected, actual);
    }
    @Test
    public void getIdTest(){
        Person person = new Person(0);

        long expected = 0;
        long actual = person.getId();
        // Then
        Assert.assertEquals("get Id Test",expected, actual);
    }

    @Test
    public void setName(){
        Person person = new Person(0);
        person.setName("Earl");

        String expected = "Earl";
        String actual = person.getName();
        // Then
        Assert.assertEquals("Set Name",expected, actual);
    }
    //TODO getName test

}

