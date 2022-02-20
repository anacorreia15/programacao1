package ficha6;

public class ex10 {

	static void imprimeArray (int [] a) {
		ex9.imprimeArray(a, 0, a.length);
	}

	public static void main(String[] args) {

		int [] arrayNums = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

		imprimeArray(arrayNums);

	}

}
