package faccat;

import java.util.Scanner;

public class Ex25 {
	public static void main(String[] arg) {
		System.out.println("Saldo bancário");
		
		Scanner sc = new Scanner(System.in);
		
		float [] valor = new float [5];
		
		System.out.println("Digite o número da conta: ");
		int conta = sc.nextInt();
		
		System.out.println("Digite o saldo em conta: ");
		valor[0] = sc.nextFloat();
		
		System.out.println("Digite a quantidade que está devendo: ");
		valor[1] = sc.nextFloat();
		
		System.out.println("Digite o valor do seu crédito: ");
		valor[2] = sc.nextFloat();
		
		valor[3] = valor[0]-valor[1]+valor[2];
		
		if(valor[3] <= 0) {
			System.out.println("A conta: "+conta+" tem o total de R$"+valor[3]+" . Cuidado seu saldo está negativado.");
		}else {
			System.out.println("A conta: "+conta+" tem o total de R$"+valor[3]+" . Seu saldo está poisitivo.");
		}
		
		sc.close();
	}

}