package faccat;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] arg) {
		System.out.println("Soma de idades");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a idade da mulher 1 : ");
		int mulher1 = sc.nextInt();
		
		System.out.println("Digite a idade da mulher 2 : ");
		int mulher2 = sc.nextInt();

		System.out.println("Digite a idade da homem 1 : ");
		int homem1 = sc.nextInt();
		
		System.out.println("Digite a idade da homem 2 : ");
		int homem2 = sc.nextInt();
		
		
		//condição
		
		if((mulher1 == mulher2) || (homem1 == homem2)) {
			System.out.println("Não é válido a entrada de idades do mesmo gênero iguais.");
			
		}else if((mulher1 > mulher2) && (homem1 > homem2)) {
			int soma1 = mulher2+homem1; int soma2 = mulher1 + homem2;
			System.out.println("Soma da idade do homem 1 com a mulher 2 = "+soma1);
			System.out.println("Soma da idade do homem 2 com a mulher 1 = "+soma2);
			System.out.println("Mais velhos - "+homem1+" e "+mulher1+". Mais novos "+homem2+" e "+mulher2);
			
		}else if((mulher1 > mulher2) && (homem1 < homem2)) {
			int soma1 = mulher2+homem2; int soma2 = mulher1 + homem1;
			System.out.println("Soma da idade do homem 2 com a mulher 2 = "+soma1);
			System.out.println("Soma da idade do homem 1 com a mulher 1 = "+soma2);
			System.out.println("Mais velhos - "+homem2+" e "+mulher1+". Mais novos "+homem1+" e "+mulher2);
			
		}else if((mulher1 < mulher2) && (homem1 < homem2)) {
			int soma1 = mulher1+homem2; int soma2 = mulher2 + homem1;
			System.out.println("Soma da idade do homem 2 com a mulher 1 = "+ soma1); 
			System.out.println("Soma da idade do homem 1 com a mulher 2 = "+ soma2);
			System.out.println("Mais velhos - "+homem2+" e "+mulher2+". Mais novos "+homem1+" e "+mulher1);
		
		}else if((mulher1 < mulher2) && (homem1 > homem2)) {
			int soma1 = mulher1+homem1; int soma2 = mulher2 + homem2;
			System.out.println("Soma da idade do homem 1 com a mulher 1 = "+soma1);
			System.out.println("Soma da idade do homem 2 com a mulher 2 = "+soma2);
			System.out.println("Mais velhos - "+homem1+" e "+mulher2+". Mais novos "+homem2+" e "+mulher1);
		}
		
		
		
		
		
		sc.close();
	}
}