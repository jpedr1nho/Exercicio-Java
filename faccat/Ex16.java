package faccat;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] arg) {
		System.out.println("Valor de ma��s compradas");
		
		Scanner valor = new Scanner (System.in);
		
		System.out.println("Digite o n�mero de ma��s que deseja comprar: ");
		int numero = valor.nextInt();
		
		if(numero >= 12) {
			float preco = numero*1;
			System.out.println("Voc� ir� pagar um total de "+preco+"R$ em "+numero+" ma��s.");
		}else {
			float preco = numero*1.3f;
			System.out.printf("Voc� ir� pagar um total de: %.2fR$ em "+numero+" ma��s.",preco);
		}
		
		valor.close();
	}
}
