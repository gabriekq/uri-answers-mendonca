import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	//	https://www.urionlinejudge.com.br/judge/pt/problems/view/2694
		
		Scanner console = new Scanner(System.in);
		
		int nCases = console.nextInt();
		
		for(int index=0; index < nCases; index++ ) {
			
			String input  = console.next();
			
			int value1 =  Integer.valueOf(input.split("([A-Z^a-z])+")[1]);
			
			int value2 =  Integer.valueOf(input.split("([A-Z^a-z])+")[2]);
			
			int value3 =  Integer.valueOf(input.split("([A-Z^a-z])+")[3]);
			
			int som = value1+ value2 + value3;
			
			System.out.println(som);	
		}
		

	}

}
