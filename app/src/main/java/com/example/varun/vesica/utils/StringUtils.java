package com.example.varun.vesica.utils;

/**
 * Created by varun on 24/8/16.
 */
public final class StringUtils {

    private StringUtils() {
        // No instances.
    }

    public static boolean isBlank(CharSequence string){
        return (string == null || string.toString().trim().length() == 0);
    }

    public static String valueOrDefault(String string, String defaultString) {
        return isBlank(string) ? defaultString : string;
    }

    public static String truncateAt(String string, int length) {
        return string.length() > length ? string.substring(0, length) : string;
    }
}
