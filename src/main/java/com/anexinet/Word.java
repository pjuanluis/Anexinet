package com.anexinet;

import java.util.*;

/**
 * Class that performs different operations with wordplay
 */
public class Word {
    /**
     * Method that works to find repeated characters given two words
     * @param a String
     * @param b String
     * @throws Exception in case the words are the same
     *
     */
    public void repeatedCharacters(String a, String b) throws Exception {

        if (a.trim().equals(b.trim()))
            throw new Exception("The strings can't be equals");

        Set<Character> firstWord = new HashSet<>();
        Set<Character> secondWord = new HashSet<>();

        for (char i : a.toCharArray()) {
            firstWord.add(i);
        }

        for (char i : b.toCharArray()) {
            secondWord.add(i);
        }
        firstWord.retainAll(secondWord);
        System.out.println("Same characters " + firstWord);
    }

    /**
     * Method that works to detect the longest words in a sentence
     * and if it is repeated is discard
     * @param sentence String
     */
    public void largestWord(String sentence){

        String longest = Arrays.stream(sentence.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
        Set<String> unique = new HashSet<>(Arrays
                .asList(Arrays
                        .stream(sentence.split(" "))
                        .filter(word -> word.length() == longest.length())
                        .toArray(String[]::new)));
        unique.forEach(System.out::println);

    }
}
