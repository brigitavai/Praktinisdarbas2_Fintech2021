package com.example.praktinisdarbas2_fintech2021.utils;
public class ElementsCalculator {

    public static int getCharsCount(String inputText) {
        if (inputText != null ) {
            return inputText.length();
        }
        return 0;
    }

    public static int getCharsCount2(String inputText2) {  //WORDS
        if (inputText2.isEmpty()) return 0;
            return inputText2.split("\\s+").length;
        }


}