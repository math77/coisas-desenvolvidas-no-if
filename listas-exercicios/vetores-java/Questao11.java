import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[] valor = new int[10];
		int[] pontMaior = new int[10];
		int[] pontMenor = new int[10];
		int contador = 0;
		int contador2 = 0;
		int valorMax = valor[0];

		for(int i = 0; i < valor.length; i++){
			System.out.println("Digite um valor ");
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
        
		int media = valorMax / 2;
		for(int i = 0; i < valor.length; i++){
            if(valor[i] >= media){
                pontMaior[contador] = valor[i];
                contador++;
                
            }else{
            	
            	pontMenor[contador2] = valor[i];
            	contador2++;
            	
            }
		}
		
		System.out.println("As pontua��es foram: ");
		for(int i = 0; i < valor.length; i++){
			System.out.println("  " +valor[i]);
			if(valor[i] > 100){
				System.out.println(valor[i]+ " n�o � v�lido ");
			}
		}
        
		System.out.println("Quantidade de maiores pontua��es: " +contador);
		System.out.println("Quantidade de menores pontua��es: " +contador2);
		System.out.println("----------------------------------------------");
		System.out.println("As maiores pontua��es foram: ");
		
		for(int i = 0; i < contador; i++){
			System.out.println("  " +pontMaior[i]);
		}
		
		System.out.println("--------------------------------");
		System.out.println("As menores pontua��es foram: ");
		
		for(int i = 0; i < contador2; i++){
			System.out.println("  " +pontMenor[i]);
		}
	}

}
