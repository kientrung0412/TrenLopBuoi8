package com.hanabi.numberplay;

public class NumberPlay {

    private String value;

    public NumberPlay(int number) {
        this.value = Integer.toString(number);
    }

    public void isNiceNumber() {

        boolean rs;

        if (value.length() > 1) {
            int sum = 0;
            for (int i = 0; i < value.length() / 2; i++) {
                sum += Character.getNumericValue(value.charAt(i));
            }
            if (value.length() % 2 == 1) {
                for (int i = value.length() / 2 + 1; i < value.length(); i++) {
                    sum -= Character.getNumericValue(value.charAt(i));
                }
            } else {
                for (int i = value.length() / 2; i < value.length(); i++) {
                    sum -= Character.getNumericValue(value.charAt(i));
                }
            }


            if (sum == 0) {
                rs = true;
            } else {
                rs = false;
            }

        } else {
            rs = true;
        }

        System.out.println(rs);
    }
}
