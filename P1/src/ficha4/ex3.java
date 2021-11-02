package ficha4;
import java.util.Scanner;
/*
 * Exercício resolvido com while
 * */
public class ex3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.println("Introduza um número inteiro: ");
		int num = read.nextInt();
		int modulo = 0;

		while(num != 0) { //sai do ciclo quando num=0
			if(num < 0) {
				modulo = -num;	
			} else {
				modulo = num;
			}
			System.out.println("|" + num + "|=" + modulo);

			System.out.println("Introduza um número inteiro: ");
			num = read.nextInt();
		}
		read.close();
	}
}
