package ficha4;
import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
Scanner read = new Scanner(System.in);
		
		int num1, num2, result = 0, resto = 0;
		
		System.out.println("Introduza dois números inteiros: ");
		num1 = read.nextInt();
		num2 = read.nextInt();
	
		if (num1 > 0 && num2 > 0) {
		resto = num1;	
		while(resto - num2 >= 0) {
			result++;
			resto -= num2;	
		}
		System.out.println(num1 + "/" + num2 + "=" + result + " Resto = " + resto);
				
		
		} else {
			System.out.println("Números inválidos.");
		}
		
		read.close();

	}

}
