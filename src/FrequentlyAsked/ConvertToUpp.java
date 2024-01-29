package FrequentlyAsked;

public class ConvertToUpp {
	
	public static void main(String[] args) {
		int a = 10;
		String str = "jjjlllooz";
		
		String [] result = m1(a,str);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}
	
	public static String[] m1(int a ,String str) {
		
		String Uppno = String.valueOf(a).toUpperCase();
		
		String Uppstr = str.toUpperCase();
		return new String [] {Uppno,Uppstr};
		
	}
	

}
