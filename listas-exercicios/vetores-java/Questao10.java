import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[] valor = new int[50];
		int valorMax = valor[0];


		for(int i = 0; i < valor.length; i++){
			System.out.println("Digite o valor da pontua��o  ");
			valor[i] = leia.nextInt();

			if((valor[i] >= 0) && (valor[i] <= 100)){
				if(valor[i] > valorMax){
					valorMax = valor[i];
				}
				System.out.println("Valor v�lido! ");

			}else{

				System.out.println("Valor inv�lido! ");

			}

		}

		System.out.println("Essas s�o as pontua��es: ");
		for(int i = 0; i < valor.length; i++){
			System.out.println("   " +valor[i]);

		}

		System.out.println("A maior pontua��o foi: " +valorMax);

		for(int i = 0; i < valor.length; i++){
			if(valor[i] > 100){
				System.out.println("O valor " +valor[i]+ " n�o � uma pontua��o v�lida ");
			}
		}
	}

}



