package ficha2;

public class ex10 {

	public static void main(String[] args) {
		
		int x1 = -30, x2 = 37, y1 = -9, y2 = 18;
		
		double distanciaEntre2Pontos = Math.sqrt((Math.pow(2, (x2-x1))) + (Math.pow(2, (y2-y1))));
		
		double m = ((y2-y1)/(x2-x1)); //m => inclina��o da reta
		double b = (y1 - x1)*m; // b=> ordenada na origem
		
		System.out.printf("A dist�ncia entre os pontos (%d , %d) e (%d , %d) �: %.3f.\n", x1, x2, y1, y2, distanciaEntre2Pontos);
		System.out.printf("A equa��o da reta dada pelos 2 pontos �: y = %.0fx + %.0f;", m, b);
	} 

}
