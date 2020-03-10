package ru.job4j.array;

/**
 * @Class Класс для частичной реализации String
 * @author RinZ26
 * @since 10.03.2020
 * @version 1
 */
public class EndsWith {
    /**
     * Проверка заканчивается ли word на post
     * @param word - проверяемое "слово"
     * @param post - проверяемый "постфикс"
     * @return true - совпало, false - нет / длина постфикса больше чем слова
     */
    public static boolean endsWith(char[] word, char[] post){
            if (post.length > word.length)
                return false;
            for (int c = 0; c < post.length; c++)
                if (word[word.length - 1 - c] != post[post.length - 1 - c])
                    return false;
        return true;


    }
}
