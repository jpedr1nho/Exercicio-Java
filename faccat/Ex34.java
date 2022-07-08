package faccat;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		float x = sc.nextFloat();
		
		System.out.println("Digite um valor: ");
		float y = sc.nextFloat();

		float z = (x*y)+5;
		System.out.println("O valor de Z é: " + z);

		if (z <= 0){
			System.out.println("Resposta A");
			
		}else if(z<=100){
			System.out.println("Resposta B");
			
		}else{
			System.out.println("Resposta C");
		}
		
		sc.close();

	}

}