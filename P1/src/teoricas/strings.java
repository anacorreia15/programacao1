package teoricas;

public class strings {

	public static void main(String[] args) {
		String nome = "Ana Raquel";
		System.out.println("N� de caracteres: " + nome.length()); //.length conta o nr de caracterres da string (os espacos contam)
		
		//comparar Strings .equals
		//N�O USAR == PARA STRINGS (COMPARA APENAS O LOCAL ONDE EST� ARMAZENADO)
		//.equalsIgnoreCase n�o liga � diferenca de mai�sculas e min�sculas
		String s1 = "Coisas";
		String s2 = "nada";
		
		if(s1.equals(s2)) {
			System.out.println("s�o iguais");
		} else {
			System.out.println("n�o s�o iguais");
		}
		
		//comparar duas strings alfabeticamente
		//.compareTo() ou .compareToIgnoreCase()
		
		String nome1 = "Am�lia", nome2 = "Eus�bio";
		System.out.println("Nomes ordenados alfab�ticamente: ");
		if(nome1.compareTo(nome2) < 0) { 
			System.out.println(nome1 + ", " + nome2);
		} else if(nome.compareTo(nome2) > 0) {
			System.out.println(nome2 + ", " + nome1);
		}else {
			System.out.println("Nomes iguais: " + nome1);
		}
	}

}
