package ficha6;

public class ex12 {

	static int devolveMaiorValor (int []nums) {
		int maiorValor = nums[ex11.devolvePosicao(nums)];
		
		return maiorValor;
	}

	public static void main(String[] args) {

		int numeros [] = {12, 9, 30, 15, 2, 3, 20, 10};

		System.out.printf("Número maior: %d Posição: %d", devolveMaiorValor(numeros) ,ex11.devolvePosicao(numeros));

	}

}
