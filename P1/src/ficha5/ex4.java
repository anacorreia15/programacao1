package ficha5;

public class ex4 {

	public static void main(String[] args) {

		int temperaturas [] = {35, 38, 37, 34, 36, 38, 37, 36, 34, 33, 32, 31, 35, 33, 38, 
				37, 39, 35, 35, 39, 37, 36, 38, 34, 32, 34, 36, 38, 37, 38, 30};

		int tempMax = temperaturas[0], tempMin = temperaturas[0]; //inicializa as variaveis com a primeira 
		int soma = 0, diaMax = 0, diaMin = 0; 					//posi��o do array para poder comparar
		double media = 0;

		for(int i = 0; i< temperaturas.length; i++){

			if( tempMax < temperaturas[i]) { //verifica a temperatura mais alta e mais baixa do array
				tempMax = temperaturas[i];
				diaMax = i;
			} else {
				tempMin = temperaturas[i];
				diaMin = i;
			}

			soma += temperaturas[i];
		}
		media = ((double) soma)/temperaturas.length;

		System.out.println("Temperatura m�xima: " + tempMax +"�C dia- " + (diaMax+1));
		System.out.println("Temperatura m�nima: " + tempMin +"�C dia- " + (diaMin+1));
		System.out.printf("Temperatura m�dia:%.1f�C\n",media);

		for(int j = 0; j < temperaturas.length; j++) {
			if(tempMax == temperaturas[j]) {
				System.out.println("Dia " + (j+1) + "- " + temperaturas[j] + "�C - M�xima");
			} else if (tempMin == temperaturas[j]) {
				System.out.println("Dia " + (j+1) + "- " + temperaturas[j] + "�C - M�nima");
			} else if (temperaturas[j]>media) {
				System.out.println("Dia " + (j+1) + "- " + temperaturas[j] + "�C - Acima da m�dia");
			} else {
				System.out.println("Dia " + (j+1) + "- " + temperaturas[j] + "�C - Abaixo da m�dia");
			}
		}
	}
}
