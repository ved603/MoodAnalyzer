package org.example;

public class Main {

    public String MoodAnalzer(String a) {
        if (a.equals("I am in Sad Mood")) {
            return "Sad";
        } else {
            return "Happy";
        }
    }
//    public static void main(String[] args) {
//
//        Main m =new Main();
//        m.MoodAnalzer("I am in Sad Mood");
//    }
//}
}