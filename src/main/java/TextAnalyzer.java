/**

        * File: Unit 5 Problem Set

        * Author: Joe Yang

 		* Date Created: May 15, 2026

        * Date Last Modified: May 18, 2026

        */


import java.util.Scanner;
import java.util.HashMap;
public class TextAnalyzer {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Input a sentence or paragraph: ");
		String paragraph = input.nextLine();

		// variables 
		int totalNumbChars = 0;
		int totalNumbWords = 0;
		int totalNumbVowels = 0;
		int totalNumbSpaces = 0;

		// takes the length of the paragraph/sentece
		totalNumbChars = paragraph.length();

		// turns every character in the paragraph lowercase, checks all the occurances for spaces and vowels
		for (int i = 0; i < paragraph.length(); i++ ){

			char a = Character.toLowerCase(paragraph.charAt(i));


			if (a == ' ') {
				totalNumbSpaces++;
			}

			if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'){
				totalNumbVowels++;

			}
		}

		// turns all the words to lowercase words and splits all words in the paragraph
		paragraph = paragraph.toLowerCase();

		// splits the paragraph into words
		String[] word = paragraph.trim().split("\\s+");

		
		totalNumbWords = word.length;


		HashMap<String, Integer > map = new HashMap<>(); // creates a hashmap which stores all the words and amount of times they appear

		// for loop that goes through all the words in the hashmap
		for (String words : word){

			// checks if a word already exists inside the hashmap
			if (map.containsKey(words)){

				// increases the word count by 1 if it appears multiple times
				map.put(words, map.get(words) + 1);
			}

			// if a word doesn't exist yet, adds itself to the hashmap and increases it's count by 1
			else{
				map.put(words, 1);
			}
	}


		// output
		System.out.println("\nTotal characters: " + totalNumbChars);
        System.out.println("Total words: " + totalNumbWords);
        System.out.println("Total vowels: " + totalNumbVowels);
        System.out.println("Total spaces: " + totalNumbSpaces);

		System.out.println("\nWord Frequency: ");

		for(String words : map.keySet())
        {
            System.out.println(words + ": " + map.get(words));
        }
	}
}





