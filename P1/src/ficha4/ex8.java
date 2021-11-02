package ficha4;
import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int x, y, resultado = 1; //1 é o elemento neutro da multiplicação(não afeta o resultado quando multiplicado)
		
		System.out.println("Introduza dois números: \nNúmero 1: ");
		x = read.nextInt();
		System.out.println("Número 2: ");
		y = read.nextInt();
		
		for(int i = y; i >= 1; i--) { 
			resultado *= x;
		}
		System.out.println(x + "^" + y + ": " + resultado);
		
		read.close();
		
		/* 
		 *  Lógica:
		 * x^y
		 * 2^3 = 2*2*2
		 * resultado*=x
		 * 1ª vez no ciclo: i=3(y); 1(resultado)*= 2(x) [guarda o resultado de iteração para iteração]
		 * 2ªvez no ciclo: i=2(y--); 2(res)*=2(x)
		 * 3ªvez no ciclo: i=1(y--); 4(res)*=2(x)
		 * resultado = 8;
		 * 
		 * */
	}

}
