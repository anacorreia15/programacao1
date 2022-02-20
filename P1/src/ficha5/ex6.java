package ficha5;
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int contador [] = {0, 0, 0, 0, 0};	
		int idades [] = {15, 20, 16, 22, 18, 20, 17, 17, 18, 20, 21, 22, 23, 17, 18, 19, 19, 19, 
				18, 17, 17, 21, 20, 24, 21, 20, 15, 15, 16, 20};
		String categorias [] = {"<= 17 anos:", "18 anos:","19 anos:", "20 anos:", ">= 21 anos:"};		

		for(int i = 0; i<idades.length; i++) {
			if(idades[i]<=17) {
				contador[0]++;
			} else if (idades[i]<=20) {
				contador[idades[i]-17]++;
			} else {
				contador[4]++;
			}
		}

		for(int j = 0; j<categorias.length;j++) {
			System.out.println(categorias[j] + contador[j]);
		}

		System.out.println();
		
		for(int k = 0; k<categorias.length; k++) {
			System.out.print(categorias[k]);
			//ta errado VER DEPOIS
			for(int i = 0; i<contador.length; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

		read.close();
	}

}
