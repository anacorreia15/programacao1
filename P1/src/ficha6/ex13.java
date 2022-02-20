package ficha6;

public class ex13 {
	
	static int devolveIndice (int num, int []nums) {
		for (int i = 0; i < nums.length; i++) {
			if(num == nums[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int numeros [] = {12, 9, 30, 15, 2, 3, 20, 10};
		
		System.out.printf("O número está na posiçaõ %d", devolveIndice(3, numeros));
	}

}
