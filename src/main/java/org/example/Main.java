package org.example;

public class Main
{
    public static final int NUM_LETTERS = 5;

    public static final int CONCAT_ELEMENTS_START_IDX = 1;
    public static final int NUM_ELEMENTS_TO_CONCAT = 2;
    public static final int CONCAT_CHAR_ID = 3;

    public static void main(String[] args)
    {
        Person[] people = new Person[3];
        people[0] = new Person("Enrico", 25);
        people[1] = new Person("Rossella", 30);
        people[2] = new Person("Francesco", 35);

        String[] names = new String[people.length];
        for (int i = 0; i < people.length; i++)
            names[i] = people[i].getName();

        printFirstNLetters(names, NUM_LETTERS);

        String thirdLetters = nthLettersChains(names, CONCAT_ELEMENTS_START_IDX, NUM_ELEMENTS_TO_CONCAT, CONCAT_CHAR_ID);
        System.out.printf("%s%n", thirdLetters);
    }

    static void printFirstNLetters(String[] array, int numLetters)
    {
        for (String s : array)
        {
            if (s.length() >= numLetters)
                System.out.printf("%s%n", s.substring(0, numLetters));
        }
    }

    static String nthLettersChains(String[] array, int k, int n, int charIdx)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = k; i < k + n; i++)
        {
            if (array[i].length() > charIdx-1)
                sb.append(array[i].charAt(charIdx-1));
        }

        return sb.toString();
    }
}
