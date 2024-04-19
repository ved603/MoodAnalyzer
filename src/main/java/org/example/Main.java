package org.example;

public class Main {
    String str = "";
    public Main(){

    }
    public Main(String a) {
        this.str = a.toLowerCase();
    }

    public String getString() {
        if (str.contains("sad")) {
            return "Sad";
        }
        else if (str.contains("any")) {
            return "Happy";
        }

        else{
                return "";
            }
        }
    }