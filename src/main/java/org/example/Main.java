package org.example;

public class Main {

    void MoodAnalzer(String a){
        if(a.equals("I am in Sad Mood")){
            System.out.println("Sad ");
        }
        else{
            System.out.println("Happy");
        }
    }
    public static void main(String[] args) {

        Main m =new Main();
        m.MoodAnalzer("I am in Sad Mood");
    }
}