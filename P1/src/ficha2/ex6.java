package ficha2;
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		 
		int horas, minutos, segundos, total;
		 System.out.println("Introduza as horas:");
		 horas = read.nextInt();
		 System.out.println("Introduza os minutos:");
		 minutos = read.nextInt();
		 System.out.println("Introduza os segundos:");
		 segundos = read.nextInt();
		 
		 total = horas * 3600 + minutos * 60 + segundos;
		 
		 System.out.println("Total de segundos: " + total);
		 System.out.printf("%02dh%02dm%02ds = %d segundos \n", horas, minutos, segundos, total);
		 
		read.close();
	}

}
