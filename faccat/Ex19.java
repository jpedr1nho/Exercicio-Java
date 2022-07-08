package faccat;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] arg) {
		System.out.println("Qual valor é maior.");
		
		Scanner valor = new Scanner (System.in);
		
		int[] numero = new int [3];
		
		System.out.println("Digite o primeiro valor: ");
		numero[0] = valor.nextInt(); 
		
		System.out.println("Digite o segundo valor: ");
		numero[1] = valor.nextInt(); 
		
		if(numero[0]>numero[1]) {
			System.out.println(numero[0]+" é maior que "+numero[1]);
		}else {
			System.out.println(numero[1]+" é maior que "+numero[0]);
		}
				
		valor.close();
	}
}
