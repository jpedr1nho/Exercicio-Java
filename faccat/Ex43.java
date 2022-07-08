package faccat;

import java.util.Scanner;

public class Ex43 {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Digite um valor inteiro de um dos lados do seu tri�ngulo: ");
		int a = sc.nextInt();
		
		System.out.println("Digite um valor inteiro de um dos lados do seu tri�ngulo: ");
		int b = sc.nextInt();
		
		System.out.println("Digite um valor inteiro de um dos lados do seu tri�ngulo: ");
		int c = sc.nextInt();

		if (a<(b+c) && b <(a+c) && c <(a+b)){
		    if (a==b && b==c){
		    	System.out.println("Tri�ngulo Equil�tero");
		    }else if (a==b || b==c || a==c){
		    	System.out.println("Tri�ngulo Is�celes");
		    }else{
		    	System.out.println("Tri�ngulo Escaleno");
		    }
		}else{
			System.out.println("N�o � possivel formar um tri�ngulo");
		}

		/* A   B   C   Mens
		   1   2   3   N�o forma um tri�ngulo
		   3   4   5   Escaleno
		   2   2   4   N�o forma um tri�ngulo
		   4   4   4   Equil�tero
		   5   3   3   Is�celes
		*/
		
		sc.close();
	}
}