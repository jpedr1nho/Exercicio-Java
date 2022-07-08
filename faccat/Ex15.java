package faccat;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] arg) {
		
		System.out.println("Valor positivo ou negativo");
		
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
	
		int numero = valor.nextInt();
		
		if(numero > 0) {
			
			System.out.println("Valor positivo.");
		
		}else {
			
			System.out.println("Valor negativo.");
		}
		
		valor.close();
	}
}