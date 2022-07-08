package faccat;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		System.out.println("Seu número é Positivo, Negativo ou igual 0");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = sc.nextInt();
		
		if(valor == 0) {
			System.out.println("Valor igual a 0.");
			
		}else if(valor > 0) {
			System.out.println("Valor positivo.");
			
		}else {
			System.out.println("Valor negativo.");
		}
		
		sc.close();
	}

}