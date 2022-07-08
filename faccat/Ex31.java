package faccat;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		System.out.println("Forma de um triângulo");
		
		Scanner sc = new Scanner(System.in);
		
		int[] valor = new int[4];
		
		System.out.println("Digite um valor formar um triângulo: ");
		valor[0] = sc.nextInt();
		
		System.out.println("Digite um valor formar um triângulo: ");
		valor[1] = sc.nextInt();

		System.out.println("Digite um valor formar um triângulo: ");
		valor[2] = sc.nextInt();
		
		if ((valor[0]<=valor[1]+valor[2]) && (valor[1]<=valor[2]+valor[0]) && (valor[2]<=valor[0]+valor[1])){
			System.out.println("Forma um triângulo.");
				
		} else{
			System.out.println("Não forma um triângulo");
		}
	
		sc.close();
	}
	
}
