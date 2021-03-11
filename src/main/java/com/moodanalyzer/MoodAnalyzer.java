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
            // If message is Empty throwing Custom Exception
            if (message.length() == 0) {
                throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.EMPTY, "Empty Mood");
            }

            return message.contains("Sad") ? "SAD" : "HAPPY";

        } catch (NullPointerException e) {
            throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.NULL, "Happy");
        }
    }
}

