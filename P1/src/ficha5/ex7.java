package ficha5;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		String meses [] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
				"Outubro", "Novembro", "Dezembro"};
		String data = " ";

		System.out.println("Introduza uma data: (dd/mm/aaaa)");
		data = read.next();
		
		String [] temp= data.split("/");//array que guarda as várias strings entre /
		
		int mes = Integer.parseInt(temp[1]);//variavel mes guarda a string que está na posicao 1 e transforma-a num int
		
		System.out.println(temp[0] + " de " + meses[mes] + " de " + temp[2]);
		
		read.close();
	}

}
