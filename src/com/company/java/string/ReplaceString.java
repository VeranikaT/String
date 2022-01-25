package com.company.java.string;

/**
 * Замена подстроки
 * */

public class ReplaceString {
    public static void replaceString(String sOld, String toReplace, String sNew){

        String res = sOld.replace(toReplace, sNew);

        System.out.println("New String: " + res);
    }
}
