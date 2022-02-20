package exerciciosTeste;

public class exercicio5 {

	public static void main(String[] args) {
		int num = 5;

		for(int i = 0; i < num; i++){
			for(int j = num; j > 0; j--) {
				if(i >= j-1){
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
