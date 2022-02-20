package ficha6;
import java.util.Scanner;

public class ex1 {
	
	
	static int calculaModulo(int num) {
		
		return num>0 ? num: -num;
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Introduza um número: ");
		int num1 = read.nextInt();
		
		int modulo = calculaModulo(num1);
		
		System.out.printf("|%d| = %d", num1, modulo);
		
		read.close();
	}

}
