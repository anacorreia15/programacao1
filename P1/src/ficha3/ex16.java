package ficha3;
import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);

		int tipoCombustivel, cilindrada, ano;
		double impostoAnual = 0;

		System.out.println("Escolha o tipo de combust�vel do ve�culo:");
		System.out.println("Gasolina - Press 1\nOutros produtos - Press 2");
		tipoCombustivel  = read.nextInt();

		System.out.println("Indique a cilindrada do ve�culo: ");
		cilindrada = read.nextInt();

		System.out.println("Indique o ano do seu ve�culo: ");
		ano = read.nextInt();

		if (cilindrada >= 0) {
			if(tipoCombustivel == 1) {
				if(cilindrada <= 1000) {
					if (ano >= 1977 && ano < 1990) { //3�escal�o
						impostoAnual = 5.19;
					} else if (ano >= 1990 && ano < 1995) { //2�escal�o
						impostoAnual = 8.64;
					} else if (ano >= 1995) { //1�escal�o
						impostoAnual = 15.52;
					} else {
						System.out.println("Ano inv�lido.");
					}
				} else if (cilindrada > 1000 && cilindrada <= 1300) {
					if (ano >= 1977 && ano < 1990) { //3�escal�o
						impostoAnual = 8.10;
					} else if (ano >= 1990 && ano < 1995) { //2�escal�o
						impostoAnual = 15.52;
					} else if (ano >= 1995) { //1�escal�o
						impostoAnual = 31.00;
					} else {
						System.out.println("Ano inv�lido.");
					}
				} else if (cilindrada > 1300 && cilindrada <= 1750) {
					if (ano >= 1977 && ano < 1990) { //3�escal�o
						impostoAnual = 10.93;
					} else if (ano >= 1990 && ano < 1995) { //2�escal�o
						impostoAnual = 24.15;
					} else if (ano >= 1995) { //1�escal�o
						impostoAnual = 48.15;
					} else {
						System.out.println("Ano inv�lido.");
					}
				} else if (cilindrada > 1750 && cilindrada <= 2600) {
					if (ano >= 1977 && ano < 1990) { //3�escal�o
						impostoAnual = 22.96;
					} else if (ano >= 1990 && ano < 1995) { //2�escal�o
						impostoAnual = 58.54;
					} else if (ano >= 1995) { //1�escal�o
						impostoAnual = 121.55;
					} else {
						System.out.println("Ano inv�lido.");
					}
				}else if (cilindrada > 2600 && cilindrada <= 3500) {
					if (ano >= 1977 && ano < 1990) { //3�escal�o
						impostoAnual = 44.22;
					} else if (ano >= 1990 && ano < 1995) { //2�escal�o
						impostoAnual = 92.92;
					} else if (ano >= 1995) { //1�escal�o
						impostoAnual = 193.20;
					} else {
						System.out.println("Ano inv�lido.");
					}
				} else {
					if (ano >= 1977 && ano < 1990) { //3�escal�o
						impostoAnual = 65.92;
					} else if (ano >= 1990 && ano < 1995) { //2�escal�o
						impostoAnual = 158.22;
					} else if (ano >= 1995) { //1�escal�o
						impostoAnual = 342.20;
					} else {
						System.out.println("Ano inv�lido.");
					}
				}
			} else if (tipoCombustivel == 2) {
				if(cilindrada <= 1500) {
					if (ano >= 1977 && ano < 1990) { //3�escal�o
						impostoAnual = 5.19;
					} else if (ano >= 1990 && ano < 1995) { //2�escal�o
						impostoAnual = 6.64;
					} else if (ano >= 1995) { //1�escal�o
						impostoAnual = 15.52;
					} else {
						System.out.println("Ano inv�lido.");
					}
				} else if (cilindrada > 1500 && cilindrada <= 2000) {
					if (ano >= 1977 && ano < 1990) { //3�escal�o
						impostoAnual = 8.10;
					} else if (ano >= 1990 && ano < 1995) { //2�escal�o
						impostoAnual = 15.52;
					} else if (ano >= 1995) { //1�escal�o
						impostoAnual = 31.00;
					} else {
						System.out.println("Ano inv�lido.");
					}
				} else if (cilindrada > 2000 && cilindrada <= 3000) {
					if (ano >= 1977 && ano < 1990) { //3�escal�o
						impostoAnual = 10.93;
					} else if (ano >= 1990 && ano < 1995) { //2�escal�o
						impostoAnual = 24.15;
					} else if (ano >= 1995) { //1�escal�o
						impostoAnual = 48.15;					
					} else {
						System.out.println("Ano inv�lido.");
					}
				} else {
					if (ano >= 1977 && ano < 1990) { //3�escal�o
						impostoAnual = 22.96;
					} else if (ano >= 1990 && ano < 1995) { //2�escal�o
						impostoAnual = 58.54;
					} else if (ano >= 1995) { //1�escal�o
						impostoAnual = 121.55;
					} else {
						System.out.println("Ano inv�lido.");
					}
				}
			} else {
				System.out.println("Tipo de combust�vel inv�lido.");
			}
			System.out.println("Valor do imposto anual de circula��o: " + impostoAnual + "�" );
		} else {
			System.out.println("Cilindrada inv�lida.");
		}
		read.close();
	}
}
