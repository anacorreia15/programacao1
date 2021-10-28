package ficha3;
import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		
		double salarioBruto = 0, irs = 0, salarioLiquido = 0, valorReter = 0;
		
		System.out.println("Indique o valor do salário(€): ");
		salarioBruto = read.nextDouble();
	
		if(salarioBruto >= 0) { // este if verifica se o valor introduzido pelo utilizador é positivo
			if(salarioBruto >= 0 && salarioBruto < 500) {
				irs=0;
			}else if(salarioBruto >= 500 && salarioBruto < 650) {
				irs=1.5;
			}else if(salarioBruto >= 650 && salarioBruto < 800) {
				irs=3.5;
			}else if(salarioBruto >= 800 && salarioBruto < 1200) {
				irs=5;
			}else if(salarioBruto >= 1200 && salarioBruto < 2000) {
				irs=10;
			}else if(salarioBruto >= 2000 && salarioBruto < 3000) {
				irs=20;
			}else {
				irs=35;
			}
			valorReter = (salarioBruto*irs)/100;
			salarioLiquido = salarioBruto - valorReter;

			System.out.printf("Salário Líquido: %.2f€\n", salarioLiquido);
			System.out.printf("Valor a reter: %.2f€", valorReter);
		} else {
			System.out.println("Não são admitidos valores negativos.");
		}
		read.close();
	}
}
