package faccat;

import java.util.Scanner;

public class Ex22 {
	public static void main(String[] arg) {
		System.out.println("Valor da hora extra");
		
		Scanner valor = new Scanner(System.in);
		
		float[] numero = new float [3];
		
		System.out.println("Horas trabalhada em 1 m�s: ");
		numero[0] = valor.nextFloat();
		
		System.out.println("Sal�rio por hora trabalhada:");
		numero[1] = valor.nextFloat();
		
		if (numero[0] <= 160){
			
			System.out.println("Seu sal�rio vai ser de: " + (numero[0]*numero[1]) + "R$.");
			
		} else{
			
		    numero[2] = (numero[0]*numero[1])+numero[0]-160*(50/100*numero[1]);
		    System.out.println("Seu sal�rio vai ser de: " + numero[2] + "R$.");
		    
		}
		
		valor.close();
		
	}
}