package ficha2;
import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Indique um valor em Graus:");
		double graus = read.nextDouble();
		
		//pode ser usado função ja existente no java => Math.toRadians(graus);
		double radianos =  (Math.PI/180)*graus;
		double grados = 0.9*graus;
		
		//%.xf -> onde x é o numero de casas decimais que se pretende APENAS NO PRINTF
		System.out.printf("Graus: %.1f \n", graus);
		System.out.printf("Radianos: %.4f \n", radianos);
		System.out.printf("Grados: %.1f", grados);
		
		read.close();
	}

}
