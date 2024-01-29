package FrequentlyAsked;

public class Reverse {
	
	

	    public static void main(String[] args) {
	        int number = 42;
	        String text = "hello";

	        // Call the method to convert the integer and String to uppercase
	        String[] result = convertToUppercase(number, text);

	        // Display the result
	        System.out.println("Uppercase Integer: " + result[0]);
	        System.out.println("Uppercase String: " + result[1]);
	    }

	    // Method to convert an integer and a String to uppercase
	    private static String[] convertToUppercase(int number, String text) {
	        // Convert the integer to uppercase String
	        String uppercaseNumber = String.valueOf(number).toUpperCase();

	        // Convert the String to uppercase
	        String uppercaseText = text.toUpperCase();

	        // Return the results as an array
	        return new String[]{uppercaseNumber, uppercaseText};
	    }
	}

	



