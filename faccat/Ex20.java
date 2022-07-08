package faccat;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] arg) {
		System.out.println("Ordem crescente.");
		
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int numero1 = valor.nextInt(); 
		
		System.out.println("Digite o segundo valor: ");
		int numero2 = valor.nextInt(); 
		
		if(numero1<numero2) {
			System.out.println("A ordem é: "+numero1+" "+numero2);
		}else {
			System.out.println("A ordem é: "+numero2+","+numero1);
		}
		
		valor.close();
	}
}