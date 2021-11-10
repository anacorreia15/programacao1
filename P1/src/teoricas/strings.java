package teoricas;

public class strings {

	public static void main(String[] args) {
		String nome = "Ana Raquel";
		System.out.println("Nº de caracteres: " + nome.length()); //.length conta o nr de caracterres da string (os espacos contam)
		
		//comparar Strings .equals
		//NÃO USAR == PARA STRINGS (COMPARA APENAS O LOCAL ONDE ESTÁ ARMAZENADO)
		//.equalsIgnoreCase não liga à diferenca de maiúsculas e minúsculas
		String s1 = "Coisas";
		String s2 = "nada";
		
		if(s1.equals(s2)) {
			System.out.println("são iguais");
		} else {
			System.out.println("não são iguais");
		}
		
		//comparar duas strings alfabeticamente
		//.compareTo() ou .compareToIgnoreCase()
		
		String nome1 = "Amália", nome2 = "Eusébio";
		System.out.println("Nomes ordenados alfabéticamente: ");
		if(nome1.compareTo(nome2) < 0) { 
			System.out.println(nome1 + ", " + nome2);
		} else if(nome.compareTo(nome2) > 0) {
			System.out.println(nome2 + ", " + nome1);
		}else {
			System.out.println("Nomes iguais: " + nome1);
		}
	}

}
