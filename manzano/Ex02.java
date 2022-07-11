package manzano;
import java.util.*;



public class Ex02 {
	public static void main(String args[]) {
		float fahr, celsius;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a temperatura em graus Fahrenheit");
		fahr = sc.nextFloat();
		
		celsius =  (fahr - 32) * 5 / 9;
		System.out.print(fahr + " F° em celisus é : " + celsius + "g°" );
		
	
		sc.close();
	}
}