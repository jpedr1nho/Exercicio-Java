package manzano;
import  java.util.*;

public class Ex39 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        int area = 0, largura = 0, comprimento = 0; 
	        String resposta;
	        String nomeComodo; 

	        int i = 1;
	        while(i <= 1) {
	            System.out.println("Digite o nome do c�modo"); 
	            nomeComodo = sc.next(); 

	            System.out.println("Digite a largura do "+nomeComodo); 
	            largura = sc.nextInt(); 

	            System.out.println("Digite o comprimento "+nomeComodo); 
	            comprimento = sc.nextInt(); 

	            area = largura * comprimento;

	            System.out.println("Deseja continuar ? SIM ou N�O");
	            resposta = sc.next().toUpperCase();

	            System.out.println("Essa foi sua resposta: " + resposta); 

	            if(resposta.equals("N�O")) {
	                i = 2; 
	            }

	        }

	        System.out.println("A �rea total da resid�ncia � igual a " + area); 


	        sc.close();
	    }

}
