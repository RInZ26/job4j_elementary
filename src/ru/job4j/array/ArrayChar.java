package ru.job4j.array;

/**
 * @Class Класс для подражания String
 * @author RinZ26
 * @since 10.03.2020
 * @version 1
 */
public class ArrayChar {
    /**
     * Проверка на совпадение первых элементов у массива char
     * @param word проверяемое "слово"
     * @param pref проверяемый "префикс"
     * @return true - совпало, false - нет / префикс длиннее слова
     */
    public static boolean startsWith(char[] word, char[] pref) {
            if (pref.length > word.length)
                return false;
            for (int c = 0; c < pref.length; c++)
                if (word[c] != pref [c])
                    return false;
        return true;
    }
}