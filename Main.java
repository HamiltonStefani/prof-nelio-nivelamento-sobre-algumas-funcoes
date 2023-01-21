package sobreAlgumasFuncoes;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os três números: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		/*if(a > b && a > c) {
			System.out.println("O maior é o: " + a);
		}else if(b > c) {
			System.out.println("O maior é o: " + b);
			
		}else {
			System.out.println("O maior é o: " + c);
		}*/
		
		// Outra opção:
		
		int higher = max(a, b, c);
		showResult(higher);
		
		sc.close();

	}
	
	// fora do public static void main(String[] args)
	public static int max(int x, int y, int z) {
		int aux;
		if(x > y && x > z) {
			aux = x;
		}else if(y > z){
			aux = y;
		}else {
			aux = z;
		}
		return aux;
	}

		public static void showResult(int value) {
			System.out.println("Higher = " + value);
		}

}


