package faccat;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		System.out.println("Ordem crescente");
		
		Scanner sc = new Scanner(System.in);
		
		int[] valor = new int[4];
		
		System.out.println("Digite o primeiro valor: ");
		valor[0] = sc.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		valor[1] = sc.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		valor[2] = sc.nextInt();

		if ((valor[0] == valor[1]) || (valor[1] == valor[2]) || (valor[2] == valor[0])){
		    System.out.println("Valores iguais.");
		    
		}else if((valor[0]>valor[1]) && (valor[1]>valor[2])){
			 System.out.println(valor[2]+" "+valor[1]+" "+valor[0]);
			 
		}else if((valor[0]>valor[1]) && (valor[1]<valor[2])){
			 System.out.println(valor[1]+" "+valor[2]+" "+valor[0]);
			 
		}else if((valor[0]<valor[1]) && (valor[0]>valor[2]) && (valor[1]>valor[2])){
			 System.out.println(valor[2]+" "+valor[0]+" "+valor[1]);
			 
		}else if((valor[1]>valor[0]) && (valor[0]<valor[2]) && (valor[1]>valor[2])){
			 System.out.println(valor[0]+" "+valor[2]+" "+valor[1]);
			 
		}else if((valor[2]>valor[1]) && (valor[1]<valor[0])){
			 System.out.println(valor[1]+" "+valor[0]+" "+valor[2]);
			 
		}else{
			 System.out.println(valor[0]+" "+valor[1]+" "+valor[2]);
			 
		}
		
		sc.close();
	}

}
