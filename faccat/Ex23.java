package faccat;

import java.util.Scanner;

public class Ex23 {
	public static void main(String[] arg) {
		System.out.println("Peso ideal");
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Indique seu sexo: (F ou M)");
		char sexo = sc.next().charAt(0);
		
		System.out.println("Iforme sua altura em metros: "); 
		float altura = sc.nextFloat();
		
		//condição;
		
		if(sexo == 'F') {
			float pesoIdeal = (62.1f*altura)-44.7f;
			System.out.printf("Seu peso ideal é: %.2f Kg",pesoIdeal);
			
		}else if(sexo == 'M') {
			float pesoIdeal = (72.7f*altura)-58;
			System.out.printf("Seu peso ideal é: %.2f Kg",pesoIdeal);
		
		}else {
			System.out.println("Valor 'sexo' inválido!");
		}
		
		sc.close();
		
	}
}
