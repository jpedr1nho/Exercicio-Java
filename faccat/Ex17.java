package faccat;

import java.util.Scanner;

public class Ex17 {
	
	public static void main(String[] arg) {
		System.out.println("M�dia escolar");
		
		Scanner valor = new Scanner(System.in);
		
		float[] nota = new float [3];
		
		System.out.println("Digite o valor da primeira nota: ");
		nota[0] = valor.nextFloat();
		
		System.out.println("Digite o valor da segunda nota: ");
		nota[1] = valor.nextFloat();
		
		//m�dia final;
		nota[2] = (nota[0]+nota[1])/2;
		
		if(nota[2]>=6) {
			System.out.println("--Parab�ns voc� foi aprovado.--");
		}else {
			System.out.println("--Infelizmente voc� foi reprovado.--");
		}
		
		valor.close();
	}
}