package ficha4;

public class ex2 {

	public static void main(String[] args) {
		char caracter = 0;
		
		for(int cod = 0; cod < 256; cod++, caracter++) {
			System.out.printf("%03d - %c\n", cod, caracter); 
		} //%03d - numero com 3 algarismos e se n�o tiver preenche com zeros
	}
}
