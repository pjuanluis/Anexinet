package com.anexinet;

/**
 * Main class that works to execute all the operations within the package
 * com.anexinet
 *
 */
public class AnexinetApp {

    /**
     * Main method
     * @param args
     * @throws Exception
     */
    public static void main( String[] args ) throws Exception {
        Number number = new Number();
        Word words = new Word();

        //Exercise #1
        System.out.println(number.sum(100,200));
        //Exercise #2
        words.repeatedCharacters("Bottle", "Boat");
        //Exercise #4
        number.matrix();
        //Exercise #5
        System.out.println(number.getRomanNumeral(10));
        //Exercise #7
        words.largestWord("I have a lot of work");
    }

}
