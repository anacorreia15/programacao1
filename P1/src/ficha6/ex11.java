package ficha6;

public class ex11 {

	static int devolvePosicao (int []nums) {
		int maiorValor = nums[0];
		int posicao = 0;
		for(int i = 0; i < nums.length; i++) {
			if (nums[i] > maiorValor) {
				maiorValor = nums[i];
				posicao = i;
			}
		}
		return posicao;
	}

	public static void main(String[] args) {

		int numeros [] = {12, 9, 7, 15, 2, 3, 20, 10};

		System.out.printf("Número maior na Posição: %d", devolvePosicao(numeros));

	}

}
