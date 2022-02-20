package ficha6;

import java.util.Scanner;

public class ex3 {
	
	static boolean ePar(int num){
	
		return num % 2 == 0;
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Introduza um número: ");
		int num = read.nextInt();
		
		if(ePar(num)) {
			System.out.printf("O número %d é par!", num);
		} else {
			System.out.printf("O número %d é impar!", num);
		}
		
		//System.out.printf("%d é um numero %s", num, ePar(num)? "par" : "impar");
		
		read.close();
	}

}
