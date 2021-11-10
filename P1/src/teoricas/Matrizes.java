package teoricas;
import java.util.Scanner;

/*	
 * 
 * ARRAYS MULTIDIMENSIONAIS
 * 
 * */

public class Matrizes {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int [][] matriz = new int [3][3]; //matriz 3x3 (3 linhas 3 colunas)
		
		//escreve no array
		for (int i = 0; i < matriz.length; i++) {  //cada linha é um array 
			for (int j = 0; j < matriz[i].length; j++) { 
				System.out.printf("Linha %d coluna %d:", i, j);
				matriz[i][j]= read.nextInt();
			}
		}
		
		//lê o array
		System.out.println("Matriz: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) { 
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(); //mudança de linha
		}
		
		read.close();
	}

}
