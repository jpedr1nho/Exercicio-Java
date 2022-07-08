package faccat;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] arg) {
		System.out.println("Valor de maçãs compradas");
		
		Scanner valor = new Scanner (System.in);
		
		System.out.println("Digite o número de maçãs que deseja comprar: ");
		int numero = valor.nextInt();
		
		if(numero >= 12) {
			float preco = numero*1;
			System.out.println("Você irá pagar um total de "+preco+"R$ em "+numero+" maçãs.");
		}else {
			float preco = numero*1.3f;
			System.out.printf("Você irá pagar um total de: %.2fR$ em "+numero+" maçãs.",preco);
		}
		
		valor.close();
	}
}
