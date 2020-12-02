package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testInheritance(){
        Student student = new Student(0);
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testImplementation(){
        Student student = new Student(0);
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testLearn(){
        Student student = new Student(0);
        student.learn(32);

        double expected = 32;
        double actual = student.getTotalStudyTime();
        // Then
        Assert.assertEquals(expected, actual, 0.00001);

    }
}
