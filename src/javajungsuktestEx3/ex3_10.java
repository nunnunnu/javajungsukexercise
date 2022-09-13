package javajungsuktestEx3;

public class ex3_10 {
	public static void main(String[] args) {
		char ch = 'A';
		
		char lowerCase = (char) (ch<='A'&&ch<='Z'?ch+32:ch);
				
		System.out.println("ch : "+ch);
		System.out.println("ch to lowerCase : "+lowerCase);
	}
}
