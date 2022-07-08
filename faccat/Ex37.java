package faccat;

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int preco1,preco2;

		System.out.println("Quantos kg foi comprado em morangos: ");
		int morango = sc.nextInt();
		
		System.out.println("Quantos kg foi comprado em maçãs: ");
		int macas = sc.nextInt();
		
		if (morango>5){
		    preco1=(int) (morango*2.2);
		} else {
		    preco1=(int) (morango*2.5);
		}

		if (macas>5){
		    preco2=(int) (macas*1.5);
		} else {
		    preco2=(int) (macas*1.8);
		}

		int ktotal = macas+morango;

		int pTotal = preco1+preco2;

		if ((pTotal>25) || (ktotal>8)){
			System.out.println("No total Você ira pagar é R$"+(pTotal-(pTotal*10/100)));
		} else {
			System.out.println("No total Você ira pagar é R$"+pTotal);
		}
		
		sc.close();
		
	}

}