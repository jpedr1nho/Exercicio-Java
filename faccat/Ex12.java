package faccat;

import java.util.Scanner;

public class Ex12 {

	public static void main (String[] arg) {
		
		Scanner valor = new Scanner (System.in);
		
		System.out.println("Converter Fahrenheit para Celsius");
		
		System.out.println("Digite a temperetura em Fahrenheit: ");
		float temperatura1 = valor.nextFloat();
		
		float temperatura2 = (temperatura1-32)*5/9;
		System.out.println("A temperatura em Celsius é: "+temperatura2+"°C");
		
		valor.close();
	}
}