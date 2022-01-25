package com.company.java.string;

public class Main {

    public static void main(String[] args) {

        String s = " Go    bACk    tO    tHe    drAWing         boARd ";

        RemoveSpace.removeSpace(s);

        CountUpperLower.countLetters(s);

        String s1 = "There is absolutely no way I'm going to do this.";
        String s2 = "absolutely no";
        String s3 = "the";
        
        ReplaceString.replaceString(s1, s2, s3);

    }
}
