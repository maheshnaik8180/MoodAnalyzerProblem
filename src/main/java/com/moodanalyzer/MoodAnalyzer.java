package com.moodanalyzer;
public class MoodAnalyzer {

    private String message;

    // Default Constructor
    public MoodAnalyzer() {
    }

    // Constructor with Parameter
    public MoodAnalyzer(String message) {
        this.message = message;
    }


    public String analyzeMood() {
        try {

            if (message.length() == 0) {

            }
            return message.contains("Sad") ? "SAD" : "HAPPY";
        } catch (NullPointerException e) {

            return "Happy";
        }
    }
}
