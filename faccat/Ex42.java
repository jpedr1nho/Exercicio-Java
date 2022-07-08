package faccat;

import java.util.Scanner;

public class Ex42 {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o c�digo do oper�rio: ");
		String codigo = sc.next();
		
		System.out.println("Informe a ANO de nascimento: ");
		int ano_nascimento = sc.nextInt();
		
		System.out.println("Informe o ano de entrada do oper�rio "+codigo);
		int ano_empresa = sc.nextInt();
		
		System.out.println("Digite o ano atual: ");
		int ano_atual = sc.nextInt();

		int ano_aposentar = (ano_atual - ano_nascimento);
		int ano_de_empresa = (ano_atual - ano_empresa);

		if (ano_aposentar>=65){
			System.out.println("O oper�rio "+codigo+" j� poder� dar entrada em sua aposentadoria por idade m�nima.");

		}else if (ano_de_empresa>=30){
			System.out.println("O oper�rio "+codigo+" j� poder� dar entrada em sua aposentadoria por m�nima de 30 anos trabalhados.");

		}else if(ano_aposentar>=60 && ano_de_empresa>=25){
			System.out.println("O oper�rio "+codigo+" j� poder� dar entrada em sua aposentadoria por idade de 60 anos ou mais e m�nimo de 25 ano anos trabalhados.");
		    
		}else{
			System.out.println("O oper�rio " +codigo+" n�o pode se aposentar. Sem requerimentos b�sicos.");
		}
		sc.close();
	}
}