package manzano;
import java.util.*;

public class Ex52 {

	public static void main(String[] args) {
		int valor;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		valor = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			int mult = valor * i;
			
			System.out.println(valor + " x " + i + " = " + mult);
		};

		sc.close();
	}

}