package faccat;

import java.util.Scanner;

public class Ex32 {
	public static void main(String[] arg) {
		System.out.println("Time campeão");
		
		Scanner sc = new Scanner(System.in);
		
		//Time 1
		
		System.out.println("Escreva o nome do primeiro time: ");
		String time1 = sc.nextLine();
		
		System.out.println("Total de gols feito pelo "+time1+": ");
		int gol1 = sc.nextInt();
		
		//Time 2
		
		System.out.println("Escreva o nome do segundo time: ");
		String time2 = sc.nextLine();
		
		System.out.println("Total de gols feito pelo "+time2+": ");
		int gol2 = sc.nextInt();
		
		//Condição
		
		if(gol1 == gol2) {
			System.out.println(time1+" vs "+time2+" resultou em empate.");
			
		}else if(gol1 > gol2) {
			System.out.println("¨"+time1+" vs "+time2+"¨ o time "+time1+" venceu essa partida.");
			
		}else {
			System.out.println("¨"+time1+" vs "+time2+"¨ o time "+time2+" venceu essa partida.");
		}
		
		sc.close();
	}
}
