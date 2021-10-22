package ficha2;
import java.util.Scanner;


public class ex5 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);		
		
		double temperaturaCelsius, temperaturaFahr;
		System.out.println("Indique a temperatura em graus Celsius: ");
		temperaturaCelsius = read.nextDouble();
		 
		temperaturaFahr = 1.8*temperaturaCelsius + 32;
		
		System.out.println("A temperatura em Fahrenheit é " + temperaturaFahr);
		
		read.close();
	}

}
