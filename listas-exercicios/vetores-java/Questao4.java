import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[] vetor1 = new int[20];
		int[] vetor2 = new int[20];
		int contador = 0;
		
		for(int i = 0; i < vetor1.length; i++){
			System.out.println("Digite um n�mero ");
			vetor1[i] = leia.nextInt();
			
		}
        
		for(int i = 0; i < vetor1.length; i++){
			if(vetor1[i] % 2 == 0){
				vetor2[contador] = vetor1[i];
				contador++;
				
			}
		}
		
		System.out.println("A quantidade de n�mero pares �: " +contador);
		for(int i = 0; i < contador; i++){
			System.out.println("Os n�meros pares s�o " +vetor2[i]);
		}
	}

}
