package ficha4;

public class ex4a {

	public static void main(String[] args) {

		int soma = 0, i = 0;
		while(i < 10) {
			soma = soma + i;
			i++;
		}
		System.out.println("Nº de iterações: " + i);
		System.out.println("Soma: " + soma);

	/* FOR é uma forma mais compacta de escrever o while logo é mais adequado
	 * int soma = 0;
	 *  for( int i = 0; i < 10; i++) {
	 *  soma = soma + i;
	 *  }
	 */
	}
}
