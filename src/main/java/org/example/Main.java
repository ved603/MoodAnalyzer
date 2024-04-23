package org.example;

enum Mood{
    Happy,Sad,NULL,EMPTY;
}
public class Main extends Exception {
    String str;

    public Main() {
    }

    public Main(String a) {

        this.str = a.toLowerCase();
    }

    public String getString() {
        Mood mood;
        try {
            if (str == null)
            {
                mood = Mood.NULL;
                throw new AnalyzerException("Happy");
            }
            else if(str.isEmpty())
            {
                mood = Mood.EMPTY;
                throw new AnalyzerException("Invalid Mood");
            }

        }

        catch (Exception e)
        {
            return e.getMessage();
        }


        if (str.contains("sad"))
        {
            mood = Mood.Sad;
        }
        else if (str.contains("happy"))
        {
            mood = Mood.Happy;
        }
        else{
            mood = Mood.EMPTY;
        }
        return mood.toString();
    }
}