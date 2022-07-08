package faccat;

import java.util.Scanner;

public class Ex43 {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Digite um valor inteiro de um dos lados do seu triângulo: ");
		int a = sc.nextInt();
		
		System.out.println("Digite um valor inteiro de um dos lados do seu triângulo: ");
		int b = sc.nextInt();
		
		System.out.println("Digite um valor inteiro de um dos lados do seu triângulo: ");
		int c = sc.nextInt();

		if (a<(b+c) && b <(a+c) && c <(a+b)){
		    if (a==b && b==c){
		    	System.out.println("Triângulo Equilátero");
		    }else if (a==b || b==c || a==c){
		    	System.out.println("Triângulo Isóceles");
		    }else{
		    	System.out.println("Triângulo Escaleno");
		    }
		}else{
			System.out.println("Não é possivel formar um triângulo");
		}

		/* A   B   C   Mens
		   1   2   3   Não forma um triângulo
		   3   4   5   Escaleno
		   2   2   4   Não forma um triângulo
		   4   4   4   Equilátero
		   5   3   3   Isóceles
		*/
		
		sc.close();
	}
}