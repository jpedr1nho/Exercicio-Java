package faccat;

import java.util.Scanner;

public class Ex10 {
	
	public static void main (String[] arg) { 
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Custo final de um carro novo para o consumidor");
		
		System.out.print("Digite o preço de fabrica do automóvel desejado: ");
		float valor = sc.nextFloat();
		
		
		float valorfabrica = valor*28/100+valor*45/100+valor;
		
		System.out.println("O valor final do automóvel é: "+valorfabrica);
		
		
		sc.close();
		
	}
}