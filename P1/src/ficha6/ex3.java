package ficha6;

import java.util.Scanner;

public class ex3 {
	
	static boolean ePar(int num){
	
		return num % 2 == 0;
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Introduza um n�mero: ");
		int num = read.nextInt();
		
		if(ePar(num)) {
			System.out.printf("O n�mero %d � par!", num);
		} else {
			System.out.printf("O n�mero %d � impar!", num);
		}
		
		//System.out.printf("%d � um numero %s", num, ePar(num)? "par" : "impar");
		
		read.close();
	}

}
