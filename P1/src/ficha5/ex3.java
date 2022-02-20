package ficha5;

public class ex3 {

	public static void main(String[] args) {

		int notas [] = {10, 8, 9, 4, 16, 18, 17, 6, 14, 13, 12, 11, 15, 13, 8, 7, 19, 13, 15, 19};
		int maiorNota = notas [0], menorNota = notas[0]; //variavies que recebem o 1º item do array para comparar com os seguintes
		int reprovados=0, aprovados=0;

		for(int i= 0; i < notas.length; i++) {
			if(notas[i] > maiorNota) {
				maiorNota = notas[i];
			} else if (notas[i] < menorNota) {
				menorNota = notas[i];	
			}

			if(notas[i] < 9.5) {
				reprovados++;
			} else {
				aprovados++;
			}
		}

		System.out.println("Nota mais alta: " + maiorNota);
		System.out.println("Nota mais baixa: " + menorNota);
		System.out.println("Nº de alunos reprovados: " + reprovados);
		System.out.println("Nº de alunos aprovados: " + aprovados);

	}

}
