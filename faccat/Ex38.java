package faccat;

import java.util.Scanner;

public class Ex38 {
	public static void main(String[] arg){
			System.out.println("Login");
			
			Scanner sc = new Scanner(System.in);
		
			System.out.println("Digite seu nome aqui: ");
			String nome = sc.next();
				
			
			System.out.println("Digite seu usuário: ");
			int usuario_acesso = sc.nextInt();

		if (usuario_acesso == 1234){
			System.out.println("Digite sua senha:  ");
			int senha_acesso = sc.nextInt();

				if (senha_acesso == 9999){
					System.out.println("Acesso permitido. Seje bem-vindo "+nome);
		    	
				}else{
					System.out.println("Acesso negado! Senha incorreta.");
				}
		    
		}else{
			System.out.println("Acesso negado! Usuário incorreto.");
		}

		
		sc.close();
	}
}