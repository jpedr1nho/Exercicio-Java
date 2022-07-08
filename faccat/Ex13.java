package faccat;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner (System.in);
		
		System.out.println("Média final");
		
		float[] nota = new float [4];
		
		System.out.println("Insira o valor da primeira nota (peso 2) : ");
		nota[0] = valor.nextFloat();
		
		System.out.println("Insira o valor da segunda nota (peso 3) : ");
		nota[1] = valor.nextFloat();
		
		System.out.println("Insira o valor da terceira nota (peso 5) : ");
		nota[2] = valor.nextFloat();
		
		nota[3] = ((2*nota[0])+(3*nota[1])+(5*nota[2]))/10;
		System.out.println("A média final é de: "+nota[3]);
		
		valor.close();
	}

}