package manzano;

public class Ex38 {

	public static void main(String[] args) {
		int soma = 0, media = 0, n = 0;
		
		int i = 50;
		while(i <= 70) {
			if(i % 2 == 0) {
				soma += i;
				n++;
			}
			 
			i++;
		}
		
		media = soma / n;
		System.out.println("A soma dos valores pares é: " + soma);
		System.out.print("A media dos valores pares é: " + media);

	}

}