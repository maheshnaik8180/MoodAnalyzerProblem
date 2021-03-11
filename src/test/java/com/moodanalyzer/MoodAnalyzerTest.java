package com.moodanalyzer;


import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    private String mood;
    private MoodAnalyzer moodCheck;

    /**
     Testing Sad Mood
     */
    @Test
    public void testSadMood() {
        moodCheck = new MoodAnalyzer("I am in Sad Mood");
        mood = moodCheck.analyzeMood();
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }

    /**
     Testing Happy Mood
     */
    @Test
    public void testHappyMood() {
        moodCheck = new MoodAnalyzer("I am in Any Mood");
        mood = moodCheck.analyzeMood();
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }

    //* Test for Exception Handling: Null

    @Test
    public void testMoodIfNullReturnsHappy() {
        moodCheck = new MoodAnalyzer(null);
        try {
            mood = moodCheck.analyzeMood();
        } catch (MoodAnalyzerException e) {
            Assert.assertEquals("Happy", e.getMessage());
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.NULL, e.type);
        }
    }

    /**
     * Test for Exception Handling: Empty Message
     */
    @Test
    public void testMoodIfEmptyReturnsEmptyMood() {
        moodCheck = new MoodAnalyzer(" ");
        try {
            mood = moodCheck.analyzeMood();
        } catch (MoodAnalyzerException e) {
            Assert.assertEquals("Empty Mood", e.getMessage());
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.EMPTY, e.type);
        }
    }
}

