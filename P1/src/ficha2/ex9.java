package ficha2;
import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.printf("Indique um ângulo em graus: ");
		double graus = read.nextDouble();
		double coseno, seno, tangente, cotangente, rad;
		
		//para calcular cos, sin, tan e cotg é necessario converter graus para radianos
		rad = Math.toRadians(graus);
		coseno = Math.cos(rad);
		seno = Math.sin(rad);
		tangente = Math.tan(rad);
		cotangente = coseno/seno;
		
		System.out.printf("Cos: %.3f \n", coseno);
		System.out.printf("Sin: %.3f \n", seno);
		System.out.printf("Tan: %.3f \n", tangente);
		System.out.printf("Cotg: %.3f \n", cotangente);
		
		read.close();
	}

}
