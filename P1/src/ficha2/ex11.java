package ficha2;

public class ex11 {

	public static void main(String[] args) {
		double preco = 99.55, precofinal, desconto;
		int percentagem = 10; //double porque n�o d� para fazer opera��es entre dois tipos de dados Xint*doubleX
		
		desconto = ((double)percentagem/100)*preco;
		precofinal = preco - desconto;
		
		System.out.printf("Pre�o:       %.2f\n", preco);
		System.out.println("% Desconto:  " + percentagem +"%");
		System.out.printf("Pre�o final: %.2f\n", precofinal);
		System.out.printf("Desconto:    %.2f\n", desconto);

	}

}
