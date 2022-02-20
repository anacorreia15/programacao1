package exerciciosTeste;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("Introduza um número: ");
		num = read.nextInt();
		
		System.out.println("Divisores:");
		for(int i = 1; i <= num; i++){
			if(num%i==0){
				System.out.println(i);
			}
			
		}
		
		read.close();

	}

}
