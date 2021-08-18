package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        for (char index = 0; index < pref.length; index++) {
            if (word[index] != pref[index]) {
                    return false;
                }

        }
        return true;

        }

    }

