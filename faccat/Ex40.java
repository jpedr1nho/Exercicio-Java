package faccat;

import java.util.Scanner;

public class Ex40 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
			System.out.println("Digite o nome do produto: ");
			String nome_produto = sc.next();
				
			System.out.println("Quantidade de "+nome_produto+" adquirida: ");
			float quantidade = sc.nextFloat();
				
			System.out.println("Valor unitário do "+nome_produto+":");
			float valor = sc.nextFloat();
			
			float total = quantidade * valor;

		if (quantidade <= 5){
		    float desconto = total-(total*2/100);
		    System.out.println("Parabéns! Você ganhou 2% de desconto nessa compra de R$"+total+" você pagará R$"+desconto+" em " +nome_produto);

		}else if(quantidade>5 && quantidade<=10){
		    float desconto = total-(total*3/100);
		    System.out.println("Parabéns! Você ganhou 3% de desconto nessa compra de R$"+total+" você pagará R$"+desconto+" em " +nome_produto);

		}else if(quantidade>10){
		    float desconto = total-(total*5/100);
		    System.out.println("Parabéns! Você ganhou 5% de desconto nessa compra de R$"+total+" você pagará R$"+desconto+" em " +nome_produto);
		}
		
		sc.close();
		}
}