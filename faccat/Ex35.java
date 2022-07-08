package faccat;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		System.out.println("Álcool ou Gasolina");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Você irá reabastecer Álcool ou Gasolina? Digite a inicial A/G:");
		char valor1 = sc.next().charAt(0);
		
		System.out.println("Quantos litros de "+valor1+" você reabasteceu? :");
		float valor2 = sc.nextFloat();
		
		if(valor1 == 'a') {
			
			float calculo = valor2*2.90f;
			
			if(valor2 > 20) {
				float desconto = calculo-(5/100)*calculo;
				System.out.printf("Você pagará: %.2fR$",desconto);
				
			}else {
				float desconto = calculo-(3/100)*calculo;
				System.out.printf("Você pagará: %.2fR$",desconto);
			}
			
		}else if(valor2 == 'g') {
			
			float calculo = valor2*3.30f;
			
			if(valor2 > 20) {
				float desconto = calculo-(5/100)*calculo;
				System.out.printf("Você pagará: %.2fR$",desconto);
				
			}else {
				float desconto = calculo-(3/100)*calculo;
				System.out.printf("Você pagará: %.2fR$",desconto);
			}
			
		}
		
		
		
		sc.close();
	}
}