package manzano;
import java.util.*;

public class Ex27 {

	public static void main(String[] args) {
		int valor;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um  n�mero: ");
		valor = sc.nextInt();
		
		if(valor <= 3) {
			System.out.println(valor);
		} else {
			System.out.println("Valor incorreto");
		}

		sc.close();
	}

}