// mood analyzer
package com.moodanalyzer;

public class MoodAnalyzerException extends RuntimeException {
    ExceptionType type;

    enum ExceptionType {
        NULL, EMPTY
    }
    public MoodAnalyzerException(ExceptionType type,String exceptionMessage) {
        super(exceptionMessage);
        this.type = type;

    }
}
