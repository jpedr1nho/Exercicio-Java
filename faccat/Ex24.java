package faccat;

import java.util.Scanner;

public class Ex24 {
	public static void main(String[] args) {
		System.out.println("Salário $$$$$$$");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do seu salário fixo: ");
		float fixo = sc.nextFloat();
		
		System.out.println("Digite o valor total das vendas: ");
		float vendas = sc.nextFloat();
		
		if(vendas <= 1500) {
			float comissao = (fixo*3/100)+fixo;
			System.out.printf("O valor do seu salário esse mês é de: %.2fR$",comissao);
		}else {
			float comissao = (fixo*5/100)+fixo;
			System.out.printf("O valor do seu salário esse mês é de: %.2fR$",comissao);
		}
		
		sc.close();
	}
}