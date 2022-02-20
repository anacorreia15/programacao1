package ficha5;
import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		String nome = " ", apresentacao = " ";

		System.out.println("Introduza a apresentação: ");
		apresentacao = read.nextLine();
		System.out.println("Introduza o nome: ");
		nome = read.nextLine();

		System.out.println(apresentacao +" "+ nome);

		read.close();
	}

}
