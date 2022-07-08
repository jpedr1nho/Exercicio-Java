package faccat;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		System.out.println("Ler dois valores");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int valor1 = sc.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int valor2 = sc.nextInt();
		
		if(valor1 > valor2) {
			System.out.println("O primeiro valor é o maior : "+valor1);
			
		}else if(valor1 < valor2) {
			System.out.println("O segundo valor é o maior : "+valor2);
			
		}else {
			System.out.println("Valores iguais.");
		}
		
		sc.close();

	}

}