package com.hanabi.stringutil;

import java.util.Arrays;

public class StringUtil {

    private String string;

    public StringUtil(String string) {
        this.string = string;
    }

    public void printUpperCaseCharacters() {
        String str = string.replaceAll("[^A-Z]", "");
        String[] upperCase = str.split("");
        System.out.println(Arrays.toString(upperCase).substring(1, str.length()));
    }

    public void findSmallestNumber() {
        String str = string.replaceAll("[^0-9]", "");
        if (str.length() > 0) {
            String[] numbers = str.split("");
            Arrays.sort(numbers);
            System.out.println(numbers[0]);
        } else {
            System.out.println("Không có số");
        }
    }
}
