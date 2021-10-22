package ficha3;
import java.util.Scanner;

public class ex11 { 
	//DUVIDA
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.println("Indique uma data, começando pelo dia: ");
		int dia = read.nextInt();
		System.out.println("Depois o mês: ");
		int mes = read.nextInt();
		System.out.println("e finalmente o ano: ");
		int ano = read.nextInt();
		
		if(mes < 1 || mes > 12) {
			System.out.println("Insira um mês válido!");
		} else {
			System.out.println(dia + "/" + mes + "/" + ano);
		}
		
		switch(mes){
		case 1: System.out.println(dia + " de Janeiro de " + ano);
			break;
		case 2: System.out.println(dia + " de Fevereiro de " + ano);
			break;
		case 3: System.out.println(dia + " de Março de " + ano);
			break;
		case 4: System.out.println(dia + " de Abril de " + ano);
			break;
		case 5: System.out.println(dia + " de Maio de " + ano);
			break;
		case 6: System.out.println(dia + " de Junho de " + ano);
			break;
		case 7: System.out.println(dia + " de Julho de " + ano);
			break;
		case 8: System.out.println(dia + " de Agosto de " + ano);
			break;
		case 9: System.out.println(dia + " de Setembro de " + ano);
			break;
		case 10: System.out.println(dia + " de Outubro de " + ano);
			break;
		case 11: System.out.println(dia + " de Novembro de " + ano);
			break;
		case 12: System.out.println(dia + " de Dezembro de " + ano);
			break;
		default: System.out.println("Mês inválido.");
		}
		read.close();
	}
}
