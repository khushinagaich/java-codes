package string;

import java.util.Scanner;

public class CountWord {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = scanner.nextLine().trim();
	        
	        if (str.isEmpty()) {
	            System.out.println("Word count: 0");
	        } else {
	            String[] words = str.split("\\s+");
	            System.out.println("Word count: " + words.length);
	        }
	    }
	}



