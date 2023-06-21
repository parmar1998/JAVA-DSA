package com.cn.string;

import java.util.Arrays;

public class string {
	
	    public static String scrambleWords(String sentence) {
	        String[] words = sentence.split(" ");
	        StringBuilder scrambledSentence = new StringBuilder();

	        for (int i = 0; i < words.length; i++) {
	            String word = words[i];
	            String scrambledWord;

	            if ((i + 1) % 2 == 0) {
	                // Even position: Rearrange characters in alphabetical order
	                scrambledWord = rearrangeCharacters(word, true);
	            } else {
	                // Odd position: Rearrange characters in reverse alphabetical order
	                scrambledWord = rearrangeCharacters(word, false);
	            }
	            scrambledSentence.append(scrambledWord).append(" ");
	        }
	        return scrambledSentence.toString().trim();
	    }

	    private static String rearrangeCharacters(String word, boolean ascendingOrder) {
	        char[] characters = word.toCharArray();
	        // Sort the characters excluding the first and last character
	        Arrays.sort(characters, 1, characters.length - 1);
	        // Reverse the characters if in descending order
	        if (!ascendingOrder) {
	            for (int i = 1, j = characters.length - 2; i < j; i++, j--) {
	                char temp = characters[i];
	                characters[i] = characters[j];
	                characters[j] = temp;
	            }
	        }

	        return new String(characters);
	    }

	   
	

	public static void main(String[] args) {
		String s="abc";
		String g="abc";
		String s1=new String("abc");
		String g1=new String("abc");
		System.out.println(s.equals(g));
		System.out.println(s1.equals(g1));
		
	}
}
