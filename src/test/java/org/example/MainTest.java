package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void testMood(){
        Main m = new Main();
        Assertions.assertEquals("Sad",m.MoodAnalzer("I am in sad"));
    }
}