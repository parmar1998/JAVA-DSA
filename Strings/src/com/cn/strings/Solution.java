package com.cn.strings;

public class Solution {

	// Compress the String
	public static String Compression(String str) {
		String ans = "";
		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
				count++;
				i++;
			}
			ans += str.charAt(i);

			if (count > 1) {
				ans += count;
			}
		}
		return ans;
	}

	// Count words
	public static int CountWords(String str) {
		int c = 1;

		if (str.length() >= 0 && str.length() <= 100000) {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
					c++;
				}
			}
		}
		return c;
	}

	// print character Array
	public static void printCharArray(String str) {
		int n = str.length();
		int freq[] = new int[n];
		char str1[] = str.toCharArray();
		for (int i = 0; i < n; i++) {
			freq[i] = 1;
			for (int j = i + 1; j < n; j++) {
				if (str1[i] == str1[j]) {
					freq[i]++;
					str1[j] = '0';
				}
			}
		}
		for (int i = 0; i < freq.length; i++) {
			if (str1[i] != ' ' && str1[i] != '0') {
				System.out.print(str1[i] + "" + freq[i] + " ");
			}
		}
	}

	// highest occurring char
	public static char highestOccuringchar(String str) {
		int ASCII_SIZE = 256;
		int count[] = new int[ASCII_SIZE];
		int len = str.length();
		for (int i = 0; i < len; i++) {
			count[str.charAt(i)]++;
		}
		int max = -1;
		char result = ' ';
		for (int i = 0; i < len; i++) {
			if (max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}
		return result;
	}

	// check for palindrome String
	public static boolean Palindrome(String str) {
		Boolean given = true;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				given = false;
			}
		}
		return given;
	}

	// remove all occurrences of a character in string
	public static String removeAllOccurences(String str, char ch) {
		String newString = "";
		for (int i = 0; i < str.length(); i++) {
			if (ch != str.charAt(i)) {
				newString = newString + str.charAt(i);
			}
		}
		return newString;
	}

	// remove consecutive duplicate char
	public static String removeConsecutiveDuplicatewords(String str) {
		if (str.length() <= 1)
			return str;
		if (str.charAt(0) == str.charAt(1))
			return removeConsecutiveDuplicatewords(str.substring(1));
		else
			return str.charAt(0) + removeConsecutiveDuplicatewords(str.substring(1));
	}

	// reverse String word wise
	public static String reverseWordWise(String input) {
		int x = input.indexOf(" ");

		if (x == -1)
			return input;

		return reverseWordWise(input.substring(x + 1)) + " " + input.substring(0, x);
	}

	// reverse each alphabet in sentence
	public static String reverseEacword(String str) {
		String newstr = "";
		int a = str.length();
		for (int i = 0; i < str.length(); i++) {
			newstr = newstr + str.charAt(a - 1);
			a--;
		}
		String g[] = newstr.split(" ");
		int n = g.length;
		String string = "";

		for (int i = 0; i < n; i++) {
			string = string + g[n - i - 1] + " ";
		}
		return string;
	}

	// smallest word in sentence
	public static String minLengthWord(String input) {
		String arr[] = input.split(" ");
		int min_length = Integer.MAX_VALUE;
		String smallest = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() < min_length) {
				smallest = arr[i];
				min_length = arr[i].length();
			}
		}
		return smallest;
	}

	// word and their character
	public static void charCount(String str) {
		int freq[] = new int[str.length()];
		System.out.println("The entered  String is " + str);
		char str1[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			freq[i] = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (str1[i] == str1[j]) {
					freq[i]++;
					str1[j] = '0';
				}
			}
		}

		System.out.println("Frequencies of the characters in the String are as below");
		System.out.println("Characters frequencies");

		for (int i = 0; i < freq.length; i++) {
			if (str1[i] != ' ' && str1[i] != '0') {
				System.out.println(str1[i] + " " + freq[i]);
			}
		}
	}

	public static void main(String[] args) {
		String test="dsa nonad fonda";
		String t=	reverseEacword(test);
		System.out.println(t);
	}
}
