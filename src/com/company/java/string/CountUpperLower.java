package com.company.java.string;

/**
 * Количество строчных и прописных букв в строке
 * */

public class CountUpperLower {

    public static void countLetters(String s){

        String str = s.replaceAll("\s", "");
        System.out.println("|" + str + "|");

        int upper = 0, lower = 0;

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
        }

        System.out.println("Lower case letters : " + lower);
        System.out.println("Upper case letters : " + upper);
    }
}
