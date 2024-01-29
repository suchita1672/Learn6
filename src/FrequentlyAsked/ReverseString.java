package FrequentlyAsked;

public class ReverseString {
	
	
	
	public static void main(String[] args) {
		
		 String str = "hello  there";
		 String str1 = m1(str);
		 System.out.println(str1);
		
	}
		
		public static String m1 (String str) {
			
			StringBuffer sb = new StringBuffer(str);
			sb.reverse();
			return sb.toString();
			//System.out.println(str);
			
		}
		
	}


