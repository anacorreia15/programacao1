package ficha5;
import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		String nomeUser = " ";

		System.out.println("Introduza o nome: ");
		nomeUser = read.nextLine(); //nextLine lê para além do espaço

		System.out.println("Nº caracteres: " + nomeUser.replace(" ", "").length()); 

		System.out.println("Primeira letra: " + nomeUser.charAt(0));
		System.out.println("Última letra: " + nomeUser.charAt(nomeUser.length()-1));

		read.close();
	}

}
