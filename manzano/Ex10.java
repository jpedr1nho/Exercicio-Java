package manzano;
import java.util.*;

public class Ex10 {
	public static void main(String args[]) {
		float dolarHoje, dolar, real;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cota��o atual do dolar: ");
		dolarHoje = sc.nextFloat();
		
		System.out.println("Informe a quantidade em Dolar que ser� convertido: ");
		dolar = sc.nextFloat();
		
		real = dolar * dolarHoje;
		
		System.out.print(dolar + "$ em real �: R$" + real );
		
		
		sc.close();
	}

}