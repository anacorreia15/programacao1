package ficha3;
import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);

		System.out.println("Indique o valor do sal�rio(�): ");

		double salarioBruto = read.nextDouble();
		double irs = 0, salarioLiquido = 0, valorReter = 0;

		if(salarioBruto >= 0) { // este if verifica se o valor introduzido pelo utilizador � positivo
			if(salarioBruto >= 0 && salarioBruto < 500) {
				irs=0;

				valorReter = salarioBruto*irs;
				salarioLiquido = salarioBruto - valorReter;

				System.out.printf("Sal�rio L�quido: %.2f \n", salarioLiquido);
				System.out.printf("Valor a reter: %.2f", valorReter);
			}else if(salarioBruto >= 500 && salarioBruto < 650) {
				irs=1.5;

				valorReter = (salarioBruto*irs)/100;
				salarioLiquido = salarioBruto - valorReter;

				System.out.printf("Sal�rio L�quido: %.2f \n", salarioLiquido);
				System.out.printf("Valor a reter: %.2f", valorReter);
			}else if(salarioBruto >= 650 && salarioBruto < 800) {
				irs=3.5;

				valorReter = (salarioBruto*irs)/100;
				salarioLiquido = salarioBruto - valorReter;

				System.out.printf("Sal�rio L�quido: %.2f \n", salarioLiquido);
				System.out.printf("Valor a reter: %.2f", valorReter);
			}else if(salarioBruto >= 800 && salarioBruto < 1200) {
				irs=5;

				valorReter = (salarioBruto*irs)/100;
				salarioLiquido = salarioBruto - valorReter;

				System.out.printf("Sal�rio L�quido: %.2f \n", salarioLiquido);
				System.out.printf("Valor a reter: %.2f", valorReter);
			}else if(salarioBruto >= 1200 && salarioBruto < 2000) {
				irs=10;

				valorReter = (salarioBruto*irs)/100;
				salarioLiquido = salarioBruto - valorReter;

				System.out.printf("Sal�rio L�quido: %.2f \n", salarioLiquido);
				System.out.printf("Valor a reter: %.2f", valorReter);
			}else if(salarioBruto >= 2000 && salarioBruto < 3000) {
				irs=20;
				
				valorReter = (salarioBruto*irs)/100;
				salarioLiquido = salarioBruto - valorReter;

				System.out.printf("Sal�rio L�quido: %.2f \n", salarioLiquido);
				System.out.printf("Valor a reter: %.2f", valorReter);
			}else {
				irs=35;

				valorReter = (salarioBruto*irs)/100;
				salarioLiquido = salarioBruto - valorReter;

				System.out.printf("Sal�rio L�quido: %.2f \n", salarioLiquido);
				System.out.printf("Valor a reter: %.2f", valorReter);
			}
		} else {
			System.out.println("N�o s�o admitidos valores negativos.");
		}
		read.close();
	}
}
