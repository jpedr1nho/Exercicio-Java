package faccat;

import java.util.Scanner;

public class Ex26 {
	public static void main(String[] arg) {
		System.out.println("Quantodade no estoque");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome do produto: ");
		String produto = sc.next();
		
		System.out.println("Quantidade atual de "+produto+" no seu estoque: ");
		int atual = sc.nextInt();
		
		System.out.println("Quantidade mínima de "+produto+" no seu estoque: ");
		int minimo = sc.nextInt();
		
		System.out.println("Quantidade maxima de "+produto+" no seu estoque: ");
		int maxima = sc.nextInt();
		
		float media = (maxima+minimo)/2;
		
		if(atual < media) {
			System.out.printf("Séra necessário comprar mais "+produto+" para o seu estoque. Restante: %.0f", (media-atual) );
		}else{
			System.out.println("Não é necessario comprar mais "+produto+" para o seu estoque");
		}
		
		sc.close();
	}
}