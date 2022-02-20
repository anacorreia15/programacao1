package ficha5;

public class ex8 {

	public static void main(String[] args) {

		String meses [] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
				"Outubro", "Novembro", "Dezembro"};
		double lucro [] = {1000.54, 900.65, 850.23, 1024.48, 1003.70, 999, 834.89, 895.96, 989.44, 1000, 1100.20, 2500.54};
		double totalLucro = 0;

		for(int i = 0; i<meses.length; i++) {	
			totalLucro += lucro[i];		
			System.out.printf("%-14s - %9.2f€\n", meses[i], lucro[i]);	
		}
		System.out.printf("%-12s %9.2f€", "Total anual:",totalLucro);
	}

}
