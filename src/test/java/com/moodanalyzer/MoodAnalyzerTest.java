package com.moodanalyzer;


import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    private String mood;
    private MoodAnalyzer moodCheck;

    /**
     * Testing Sad Mood
     */
    @Test
    public void testSadMood() {
        moodCheck = new MoodAnalyzer("I am in Sad Mood");
        mood = moodCheck.analyzeMood();
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }

    /**
     * Testing Happy Mood
     */
    @Test
    public void testHappyMood() {
        moodCheck = new MoodAnalyzer("I am in Any Mood");
        mood = moodCheck.analyzeMood();
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }

    /**
     * Test for Exception Handling
     */
    @Test
    public void testMoodIfNullReturnsHappy() {
        moodCheck = new MoodAnalyzer(null);
        mood = moodCheck.analyzeMood();
        Assert.assertThat(mood, CoreMatchers.is("Happy"));
    }

    

}
