package com.imagenation.sql.Utils;

public class Utils {
    
    public static <T> String formatArguments(String first, String last, String separator, T[] arguments) {
        String output = first;

        for (int i = 0; i < arguments.length; i++) {
            output += arguments[i].toString();

            if(i != arguments.length - 1) {
                output += separator;
            }
        }

        return output += last;
    }

    public static <T> String formatArguments(String first, String last, String separator, T[] arguments, char parenthesize) {
        String output = first;

        for (int i = 0; i < arguments.length; i++) {
            output += parenthesize + arguments[i].toString() + parenthesize;

            if(i != arguments.length - 1) {
                output += separator;
            }
        }

        return output += last;
    }

}
