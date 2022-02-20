package exerciciosTeste;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int num1 = 0, num2 = 0, num3 = 0, numMaior = 0;
		
		System.out.println("Indique 3 números:\nNumero 1: ");
		num1 = read.nextInt();
		System.out.println("Número 2: ");
		num2 = read.nextInt();
		System.out.println("Número 3: ");
		num3 = read.nextInt();
		
		
		if(num1 > num2 && num1 > num3){
			numMaior = num1;
		} else if (num2 > num1 && num2 > num3){
			numMaior = num2;
		} else {
			numMaior = num3;
		}
		
		System.out.println("O número maior é " + numMaior);
		
		read.close();

	}

}
