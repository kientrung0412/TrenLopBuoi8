package com.hanabi;

import com.hanabi.numberplay.NumberPlay;
import com.hanabi.propretyok.PropretyOK;
import com.hanabi.stringutil.StringUtil;

public class Main {

    public static void main(String[] args) {
//
//        StringUtil stringUtil = new StringUtil("GYD2131412GHjsajsdJDJ");
//        stringUtil.printUpperCaseCharacters();
//        stringUtil.findSmallestNumber();
//        NumberPlay numberPlay = new NumberPlay(11121);
        PropretyOK propretyOK = new PropretyOK("())(()(())()))((");

        propretyOK.standardized();

    }
}
