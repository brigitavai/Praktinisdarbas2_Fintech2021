package com.example.praktinisdarbas2_fintech2021.utils;
public class ElementsCalculator {

    public static int getCharsCount(String inputText) {
        if (inputText != null ) {
            return inputText.length();
        }
        return 0;
    }

    public static int getCharsCount2(String[] inputText2) {
        if (inputText2 != null ) {
            return inputText2.length;
        }
        return 0;
    }
}