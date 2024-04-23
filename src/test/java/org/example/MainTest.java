package org.example;

import com.sun.source.tree.AssertTree;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void testMood() throws AnalyzerException{
        Main m = new Main("I am in Sad Mood");
        Main m1 = new Main("I am in Happy Mood ");
        Main m2 = new Main();
            String res=m.getString();
            String res1 = m1.getString();
            String res2 = m2.getString();
            assertEquals("Sad", res);
            assertEquals("Happy", res1);
            assertEquals("Happy",res2);

    }
}