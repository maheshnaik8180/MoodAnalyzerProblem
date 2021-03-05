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

    /**
     * Method To Analyze Mood
     * @return Mood
     */
    public String analyzeMood() {
        try {
            return message.contains("Sad") ? "SAD" : "HAPPY";
        } catch (NullPointerException e) {
            return "Happy";
        }
    }
}
