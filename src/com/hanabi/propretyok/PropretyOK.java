package com.hanabi.propretyok;

public class PropretyOK {

    private String string;

    public PropretyOK(String string) {
        this.string = string;
    }

    public void standardized() {

        while (string.contains("()")) {
            string = string.replace("()", "");
        }
        if (string.isEmpty()) {
            System.out.println("Đúng");
        } else {
            System.out.println("Sai");
        }

    }
}
