package ficha2;
import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int horas, minutos, segundos;
		System.out.println("Indique a quantidade de segundos:");
		segundos = read.nextInt();
		
		horas = segundos/3600;
		segundos %= 3600; // resto da divisão
		minutos = segundos/60;
		segundos %= 60;
		
		System.out.println(horas + "h:" + minutos + "m:" + segundos + "s");
		
		read.close();
	}

}
