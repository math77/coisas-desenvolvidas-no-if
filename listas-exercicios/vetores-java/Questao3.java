import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[] num = new int[10];
		
		for(int i = 0; i < num.length; i++) {
			System.out.println("Digite um n�mero ");
			num[i] = leia.nextInt();
			
		}
        
		for(int i = 0; i < num.length; i++){
			if(num[i] % 2 == 0){
				System.out.println("O n�mero " +num[i]+ " � par ");
				
			}else{
				System.out.println("O n�mero " +num[i]+ " � �mpar");
			}
		}
	}

}
