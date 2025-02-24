package string;

import java.util.Scanner;

public class vowels {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = scanner.nextLine().toLowerCase();
	        
	        int vowelCount = 0, consonantCount = 0;
	        for (char ch : str.toCharArray()) {
	            if (ch >= 'a' && ch <= 'z') {
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                    vowelCount++;
	                } else {
	                    consonantCount++;
	                }
	            }
	        }

	        System.out.println("Vowels: " + vowelCount);
	        System.out.println("Consonants: " + consonantCount);
	    }
	}



