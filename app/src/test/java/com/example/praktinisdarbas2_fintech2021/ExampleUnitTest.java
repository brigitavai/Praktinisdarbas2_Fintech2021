package com.example.praktinisdarbas2_fintech2021;

import com.example.praktinisdarbas2_fintech2021.utils.ElementsCalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void TextCountChars01(){
        final String givenString = "";

        final int expectedResult = 0;
        final int actualResult = ElementsCalculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void TextCountChars02(){
        final String givenString = "Hello world";

        final int expectedResult = 11;
        final int actualResult = ElementsCalculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void TextCountChars03(){
        final String givenString = "      ";

        final int expectedResult = 6;
        final int actualResult = ElementsCalculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void TextCountChars04(){
        final String givenString = "labas, pasauli!";

        final int expectedResult = 15;
        final int actualResult = ElementsCalculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void TextCountWords01(){
        final String givenString = "";

        final int expectedResult = 0;
        final int actualResult = ElementsCalculator.getCharsCount2(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void TextCountWords02(){
        final String givenString = "Hello world";

        final int expectedResult = 2;
        final int actualResult = ElementsCalculator.getCharsCount2(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void TextCountWords03(){
        final String givenString = "      ";

        final int expectedResult = 0;
        final int actualResult = ElementsCalculator.getCharsCount2(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void TextCountWords04(){
        final String givenString = "labas, pasauli!";

        final int expectedResult = 2;
        final int actualResult = ElementsCalculator.getCharsCount2(givenString);

        assertEquals(expectedResult, actualResult);
    }
}