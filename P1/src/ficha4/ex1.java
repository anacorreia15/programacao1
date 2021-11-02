package ficha4;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		
		System.out.println("Introduza um número inteiro positivo: ");
		int num1 = read.nextInt();
		int i = 0; //i funciona como iterador do ciclo
		
		if(num1 >= 0) { //verifica se o número é positivo
			while(i < num1) {
				System.out.println(i);
				i++; 
			}
		} else {
			System.out.println("Número inválido.");
		}
		
		/*
		 * O mesmo exercicio mas com o ciclo for
		 * */
		
		System.out.println("Introduza um número inteiro positivo: ");
		int num2 = read.nextInt();
		
		if(num2 >= 0) {
			for(int j = 0; j < num2; j++) {
				System.out.println(j);
			}
		} else {
			System.out.println("Número inválido.");
		}
		read.close();
	}

}
