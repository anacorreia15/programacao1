package ficha5;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int opcao = 0, numeroBilhetes = 0, total = 0;
		int [] plateia = {200, 100, 100, 10};
		int [] precos = {30, 20, 40, 70};
		String [] zonas = {"1� Plateia", "2� Plateia", "Balc�o", "Camarote"};

		do {
			for(int i = 0; i<zonas.length; i++) {
				System.out.printf("%d- %s \t(%d�)\t- %3d lugares dispon�veis\n", i+1, zonas[i], precos[i], plateia[i]);
			}
			System.out.println("0- Sair");

			do {
				System.out.println("Escolha uma op��o (0-4): ");
				opcao = read.nextInt();
			} while (opcao < 0 || opcao > 4);

			if(opcao != 0) {
				System.out.println("Indique o n�mero de bilhetes: ");
				numeroBilhetes = read.nextInt();

				if(numeroBilhetes >= 0) {
					if (plateia[opcao-1] >= numeroBilhetes) {

						plateia[opcao-1] -= numeroBilhetes;
						total = precos[opcao-1]*numeroBilhetes;

						System.out.println("Total: " + total + "�");
						System.out.println();
					} else {
						System.out.println("N�o h� bilhetes suficientes!");
					}
				} else {
					System.out.println("N�mero de bilhetes inv�lido");
				}
			} else {
				System.out.println("Obrigado pela visita!");
			}

		} while (opcao != 0);

		read.close();
	}

}
