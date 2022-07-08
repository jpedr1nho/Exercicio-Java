package faccat;

import java.util.Scanner;

public class Ex17 {
	
	public static void main(String[] arg) {
		System.out.println("Média escolar");
		
		Scanner valor = new Scanner(System.in);
		
		float[] nota = new float [3];
		
		System.out.println("Digite o valor da primeira nota: ");
		nota[0] = valor.nextFloat();
		
		System.out.println("Digite o valor da segunda nota: ");
		nota[1] = valor.nextFloat();
		
		//média final;
		nota[2] = (nota[0]+nota[1])/2;
		
		if(nota[2]>=6) {
			System.out.println("--Parabéns você foi aprovado.--");
		}else {
			System.out.println("--Infelizmente você foi reprovado.--");
		}
		
		valor.close();
	}
}