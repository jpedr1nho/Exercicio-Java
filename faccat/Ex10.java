package faccat;

import java.util.Scanner;

public class Ex10 {
	
	public static void main (String[] arg) { 
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Custo final de um carro novo para o consumidor");
		
		System.out.print("Digite o pre�o de fabrica do autom�vel desejado: ");
		float valor = sc.nextFloat();
		
		
		float valorfabrica = valor*28/100+valor*45/100+valor;
		
		System.out.println("O valor final do autom�vel �: "+valorfabrica);
		
		
		sc.close();
		
	}
}