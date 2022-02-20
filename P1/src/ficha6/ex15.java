package ficha6;

import java.util.Scanner;

public class ex15 {
	
	static boolean jogadaValida (char [] comb) {
		for(int i = 0; i < comb.length; i++) {
			if (comb[i] >= 'A' && comb[i] <= 'H') {
				return true;
			}
		}
		return false;
	}
	
	static int quantasCertas(String chave, String adivinha ) {
		
		return 0;
	}

	static int quantasForaSitio(String chave, String adivinha ) {
		
		return 0;
	}
	
	static void insereComb (char comb []) {
		Scanner read = new Scanner(System.in);
		
		for(int i = 0; i < comb.length; i++) {
			comb[i] = read.next().charAt(0);
		}
	}
	
	static void leComb (char comb []) {
		
		for(int i = 0; i < comb.length; i++) {
			System.out.print(comb[i] + " "); 
		}
	}
	
	public static void main(String[] args) {
		
		char [] combinacaoLetras = new char [4];
		
		System.out.println("Insira uma combinação de 4 letras:");
		insereComb(combinacaoLetras);
		
		leComb(combinacaoLetras);
		

	}

}
