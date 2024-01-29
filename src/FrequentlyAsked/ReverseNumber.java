package FrequentlyAsked;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no");
		
		int no = sc.nextInt();
		/*
		int rev = 0;
		while(no != 0) {
			rev = rev*10+no%10;
			no = no/10;
			
		}*/
		
//		StringBuffer sb = new StringBuffer(String.valueOf(no));
//		StringBuffer rev = sb.reverse();
		
		StringBuilder sbl = new StringBuilder();
		sbl.append(no);
		StringBuilder rev = sbl.reverse();
	
	System.out.println("reverse is:" +rev);

}
}