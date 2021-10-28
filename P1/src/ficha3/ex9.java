package ficha3;
import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		
		System.out.println("Indique a cilindrada do veículo (cm3): ");
		
		double cilindrada = read.nextDouble();
		double impostoAuto, taxa, parcela;
		
		if (cilindrada <= 1250) {
			taxa = 3.74;
			parcela = 2417.56;
		} else {
			taxa = 8.86;
			parcela = 8813.22;
		}
		
		impostoAuto = cilindrada * taxa - parcela;
		
		impostoAuto = impostoAuto < 0 ? 0 : impostoAuto; //verifica se o imposto é negativo, se for retorna 0
		
		System.out.println("O imposto automóvel do seu veículo é " + impostoAuto + "€");
		
		read.close();
	}

}
