package ficha2;

public class ex11 {

	public static void main(String[] args) {
		double preco = 99.55, precofinal, desconto;
		int percentagem = 10; //double porque não dá para fazer operações entre dois tipos de dados Xint*doubleX
		
		desconto = ((double)percentagem/100)*preco;
		precofinal = preco - desconto;
		
		System.out.printf("Preço:       %.2f\n", preco);
		System.out.println("% Desconto:  " + percentagem +"%");
		System.out.printf("Preço final: %.2f\n", precofinal);
		System.out.printf("Desconto:    %.2f\n", desconto);

	}

}
