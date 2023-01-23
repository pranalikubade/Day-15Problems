package com.bridgelabz;

public class HashTableMain {
    public static void main(String[] args) {
        // String methods => read about these methods
        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] wordsArray = paragraph.split(" ");
        HashTable<String, Integer> hashTable = new HashTable<>(6);
        for (String word : wordsArray) {
            System.out.println(word + " => " + hashTable.getIndex(word));
            Integer currentFrequency = hashTable.get(word);
            if (currentFrequency == null) {
                hashTable.add(word, 1);
            } else {
                currentFrequency += 1;
                hashTable.add(word, currentFrequency);
            }

        }
        System.out.println(hashTable);


    }
}
