package ficha5;
import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		String nome = " ";
		
		System.out.println("Introduza o nome: ");
		nome = read.nextLine();			

		String nomes [] = nome.split(" ");
		
		System.out.println(nomes[nomes.length-1] + ", " + nomes[0]);
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.printf(" %s ", nomes[i].charAt(0));
		}
		
		read.close();
	}

}
