package faccat;

import java.util.Scanner;

public class Ex14 {
		public static void main(String[] arg) {
			
			System.out.println("Maior ou menor que 10");
			
			Scanner valor = new Scanner (System.in);
			
			System.out.println("Digite um valor: ");
			int numero = valor.nextInt();
			
			if(numero>10) {
				System.out.println("Valor maior que 10.");
			}else {
				System.out.println("Valor menor que 10.");
			}
			
			valor.close();
	}
}