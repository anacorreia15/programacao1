package ficha3;
import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		
		System.out.println("Indique a cilindrada do ve�culo (cm3): ");
		
		double cilindrada = read.nextDouble();
		double impostoAuto;
		
		if (cilindrada <= 1250) {
			impostoAuto = cilindrada * 3.74 - 2417.56;
		} else {
			impostoAuto = cilindrada * 8.86 - 8813.22; 
		}
		
		System.out.println("O imposto autom�vel do seu ve�culo � " + impostoAuto + "�");
		
		read.close();
	}

}
