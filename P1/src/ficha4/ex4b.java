package ficha4;

public class ex4b {

	public static void main(String[] args) {
		
		int count = 1;
		while(count <= 10) {
			System.out.println( count*2 );
			count++;
		}
		System.out.println("N� de itera��es: " + count);
		
		/* FOR � uma forma mais compacta de escrever o while logo � mais adequado
		* for( int count = 1; count <= 10; count++) {
 		*	System.out.println( count*2 );
		* }
		 * */
	}

}
