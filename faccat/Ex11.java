package faccat;

import java.util.Scanner;

public class Ex11 {

	public static void main (String[] arg) {
		Scanner valor = new Scanner (System.in);
		
		float[] salario = new float [6];
		
		System.out.println("Digite o salário fixo: ");
		salario[0] = valor.nextFloat();
		
		System.out.println("Digite o valor da sua comissão: ");
		salario[1] = valor.nextFloat();
		
		System.out.println("Quantidade de carros vendido: ");
		salario[2] = valor.nextFloat();
		
		System.out.println("Lucro total das vendas: ");
		salario[3] = valor.nextFloat();
		
		salario[4] = salario[1]*salario[2];
		salario[5] = salario[4]+salario[0]+(5/100*salario[3]); 
		
		System.out.println("Seu salário desse mês é de: "+salario[5]+"R$");
		
		valor.close();
	}
	
}