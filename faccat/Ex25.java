package faccat;

import java.util.Scanner;

public class Ex25 {
	public static void main(String[] arg) {
		System.out.println("Saldo banc�rio");
		
		Scanner sc = new Scanner(System.in);
		
		float [] valor = new float [5];
		
		System.out.println("Digite o n�mero da conta: ");
		int conta = sc.nextInt();
		
		System.out.println("Digite o saldo em conta: ");
		valor[0] = sc.nextFloat();
		
		System.out.println("Digite a quantidade que est� devendo: ");
		valor[1] = sc.nextFloat();
		
		System.out.println("Digite o valor do seu cr�dito: ");
		valor[2] = sc.nextFloat();
		
		valor[3] = valor[0]-valor[1]+valor[2];
		
		if(valor[3] <= 0) {
			System.out.println("A conta: "+conta+" tem o total de R$"+valor[3]+" . Cuidado seu saldo est� negativado.");
		}else {
			System.out.println("A conta: "+conta+" tem o total de R$"+valor[3]+" . Seu saldo est� poisitivo.");
		}
		
		sc.close();
	}

}