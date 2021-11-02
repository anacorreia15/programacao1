package ficha4;
import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int x, y, resultado = 1; //1 � o elemento neutro da multiplica��o(n�o afeta o resultado quando multiplicado)
		
		System.out.println("Introduza dois n�meros: \nN�mero 1: ");
		x = read.nextInt();
		System.out.println("N�mero 2: ");
		y = read.nextInt();
		
		for(int i = y; i >= 1; i--) { 
			resultado *= x;
		}
		System.out.println(x + "^" + y + ": " + resultado);
		
		read.close();
		
		/* 
		 *  L�gica:
		 * x^y
		 * 2^3 = 2*2*2
		 * resultado*=x
		 * 1� vez no ciclo: i=3(y); 1(resultado)*= 2(x) [guarda o resultado de itera��o para itera��o]
		 * 2�vez no ciclo: i=2(y--); 2(res)*=2(x)
		 * 3�vez no ciclo: i=1(y--); 4(res)*=2(x)
		 * resultado = 8;
		 * 
		 * */
	}

}
