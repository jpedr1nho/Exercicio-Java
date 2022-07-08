package faccat;

import java.util.Scanner;

public class Ex21 {
	public static void main(String[] arg) {
		System.out.println("Partida de Xadrez.");
		
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Digite o número em horas do inicio de sua partida:");
		int horaInicial = valor.nextInt();
		
		System.out.println("Digite o número em horas do fim de sua partida:");
		int horaFinal = valor.nextInt();
		
		int duracao = horaFinal - horaInicial;
		
		if(duracao>24 || duracao<=0) {
			System.out.println("Jogo encerrado, duração maior que 24 horas.");
		}else {
			System.out.println("Seu jogo durou: " + duracao + " horas.");
		}
		
		valor.close();
	}
}