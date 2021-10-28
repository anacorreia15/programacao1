package ficha3;
import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);

		double salarioBruto = 0, taxaIrs = 0, salarioLiquido = 0, valorReter = 0;
		int nrTitulares, nrDependentes;

		System.out.println("Indique o valor do sal�rio(�): ");
		salarioBruto = read.nextDouble();
		System.out.println("Indique o n�mero de titulares (1 ou 2): ");
		nrTitulares = read.nextInt();
		System.out.println("Indique o n�mero de dependentes: ");
		nrDependentes = read.nextInt();

		if(salarioBruto >= 0) { //verifica se o salario � um valor positivo
			if(nrTitulares == 1 || nrTitulares ==2) { //verifica se o n� de titulares � 1 ou 2
				if (nrDependentes >= 0) { //verifica se o n� de dependentes � positivo
					if(salarioBruto >= 0 && salarioBruto < 500) {
						taxaIrs=0 - nrDependentes * 0.05;
					} else if(salarioBruto >= 500 && salarioBruto < 650) {
						if (nrTitulares == 1) {
							taxaIrs=1.5 - nrDependentes * 0.05;
						} else {
							taxaIrs=2.5 - nrDependentes * 0.05;
						}
					} else if(salarioBruto >= 650 && salarioBruto < 800) {
						if(nrTitulares == 1) {
							taxaIrs=3.5 - nrDependentes * 0.05;  
						} else {
							taxaIrs=5 - nrDependentes * 0.05;
						}
					} else if(salarioBruto >= 800 && salarioBruto < 1200) {
						if(nrTitulares == 1) {
							taxaIrs=5 - nrDependentes * 0.05;
						} else {
							taxaIrs=7 - nrDependentes * 0.05;
						}
					} else if(salarioBruto >= 1200 && salarioBruto < 2000) {
						if(nrTitulares == 1) {
							taxaIrs=10 - nrDependentes * 0.05;
						} else {
							taxaIrs=15 - nrDependentes * 0.05;
						}
					} else if(salarioBruto >= 2000 && salarioBruto < 3000) {
						if(nrTitulares == 1) {
							taxaIrs=20 - nrDependentes * 0.05;
						} else {
							taxaIrs=30 - nrDependentes * 0.05;
						}
					} else {
						if(nrTitulares == 1) {
							taxaIrs=35 - nrDependentes * 0.05;
						} else {
							taxaIrs=45 - nrDependentes * 0.05;
						}
					}
					taxaIrs = taxaIrs < 0? 0 : taxaIrs;
					System.out.println("IRS:" + taxaIrs); //print para verificar se a taxa de irs est� correta
					valorReter = (salarioBruto*taxaIrs)/100;
					salarioLiquido = salarioBruto - valorReter;

					System.out.printf("Sal�rio L�quido: %.2f \n", salarioLiquido);
					System.out.printf("Valor a reter: %.2f", valorReter);
				}else {
					System.out.println("N�mero de dependentes inv�lido.");
				}
			} else {
				System.out.println("N�mero de titulares inv�lido.");
			}
		} else {
			System.out.println("N�o s�o admitidos valores negativos.");
		}
		read.close();
	}
}
