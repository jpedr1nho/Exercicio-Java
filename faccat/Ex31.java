package faccat;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		System.out.println("Forma de um tri�ngulo");
		
		Scanner sc = new Scanner(System.in);
		
		int[] valor = new int[4];
		
		System.out.println("Digite um valor formar um tri�ngulo: ");
		valor[0] = sc.nextInt();
		
		System.out.println("Digite um valor formar um tri�ngulo: ");
		valor[1] = sc.nextInt();

		System.out.println("Digite um valor formar um tri�ngulo: ");
		valor[2] = sc.nextInt();
		
		if ((valor[0]<=valor[1]+valor[2]) && (valor[1]<=valor[2]+valor[0]) && (valor[2]<=valor[0]+valor[1])){
			System.out.println("Forma um tri�ngulo.");
				
		} else{
			System.out.println("N�o forma um tri�ngulo");
		}
	
		sc.close();
	}
	
}
