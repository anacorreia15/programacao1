package ficha5;
import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		String nomeUser = " ";

		System.out.println("Introduza o nome: ");
		nomeUser = read.nextLine(); //nextLine l� para al�m do espa�o

		System.out.println("N� caracteres: " + nomeUser.replace(" ", "").length()); 

		System.out.println("Primeira letra: " + nomeUser.charAt(0));
		System.out.println("�ltima letra: " + nomeUser.charAt(nomeUser.length()-1));

		read.close();
	}

}
