package ficha4;
import java.util.Scanner;
/*
 * Exerc�cio resolvido com do-while
 * */
public class ex3a {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num, modulo;
		
		//do while executa a instru��o e so depois verifica a condi��o
		do {
			System.out.println("Introduza um n�mero inteiro: ");
			num = read.nextInt();
			
			if(num < 0) {
				modulo = -num;	
			} else {
				modulo = num;
			}
			System.out.println("|" + num + "|=" + modulo);
		} while(num != 0);
		
		read.close();
	}
}
