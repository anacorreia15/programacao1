package ficha6;

public class ex14 {

	static int devolveValor (int indice, int []nums)  {
		
		int valor = nums[indice];

		return valor;
	}

	public static void main(String[] args) {

		int numeros [] = {12, 9, 30, 15, 2, 3, 20, 10};
		int posicao = ex13.devolveIndice(10, numeros);
		

		System.out.printf("O número %d está na posiçaõ %d", devolveValor(posicao, numeros), posicao);

	}

}
