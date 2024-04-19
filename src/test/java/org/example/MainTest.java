package org.example;

import com.sun.source.tree.AssertTree;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void testMood(){
        Main m = new Main("I am in Sad Mood");
        Main m1 = new Main("any");
        Assertions.assertEquals("Sad",m.getString());
        Assertions.assertEquals("Happy",m1.getString());
    }
}