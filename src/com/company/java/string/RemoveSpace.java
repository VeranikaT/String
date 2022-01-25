package com.company.java.string;

/**
 * Удаление лишних пробелов
 * */

public class RemoveSpace {

    public static void removeSpace(String s){
        System.out.println("|" + s + "|");
        String str2 = s.replaceAll("\s{2,10}", "\s").trim();
        System.out.println("|" + str2 + "|");
    }
}
