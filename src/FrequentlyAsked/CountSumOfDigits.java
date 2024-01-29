package FrequentlyAsked;

import java.util.Scanner;

public class CountSumOfDigits {
	
	public static void main(String[] args) {
		
		int num = 1234;
		int sum =0;
		while(num>0) {
			sum = sum+num%10;
			num = num/10;
			
			System.out.println("sum of digits in a no:" +sum);
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a no:" );
		int no = sc.nextInt();
		int sum1 = calculate(no);
		System.out.println("sum of digits:" +sum1);
		}
		
	}
	
	private static int calculate (int no) {
		int sum1 = 0;
		
		while(no !=0) {
			sum1= sum1+ no %10;
			no= no /10;
		}
		return sum1;
			
			
			
		}
	}


