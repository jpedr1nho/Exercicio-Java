package faccat;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] arg) {
		System.out.println("Ano de votar.");
		
		Scanner valor = new Scanner(System.in);
		
		int[] ano = new int [4]; 
		
		System.out.println("Digite o ano que voc� nasceu: ");
		ano[0] = valor.nextInt();
		
		System.out.println("Digite o ano atual: ");
		ano[1] = valor.nextInt();
		
		ano[2] = ano[1]-ano[0];
		
		if(ano[2]>=18) {
			
			System.out.println("� obrigat�rio exercer sua fun��o de votar esse ano.");
			
		}else if(ano[2]>=16) {
			
			System.out.println("Voc� poder� votar, s� n�o � obrigat�rio.");
			
		}else {
			System.out.println("Voc� n�o pode votar.");
		}
		
		valor.close();
	}
}