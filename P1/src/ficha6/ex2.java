package ficha6;

import java.util.Scanner;

public class ex2 {

	static int devolveMaior(int num1, int num2) {
		
		return num1>num2 ? num1 : num2;
	}
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Introduza dois n�meros: ");	
		System.out.println("N�mero 1: "); 
		int num1 = read.nextInt();
		System.out.println("N�mero 2: ");
		int num2 = read.nextInt();
		
		int numMaior = devolveMaior(num1, num2);
		
		System.out.println("N�mero maior: " + numMaior);
		
		read.close();
	}

}
