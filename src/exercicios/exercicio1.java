package exercicios;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
Scanner leia = new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.println("Digite o primeiro numero: ");
		n1=leia.nextInt();
		System.out.println("Digite o segundo numero: ");
		n2=leia.nextInt();
		System.out.println("Digite o terceira numero: ");
		n3=leia.nextInt();
		
		leia.close();
		
		if(n1 > n2 & n2 > n3 || n1 > n3 && n3 > n2 ) {
			System.out.println(n1 + " � o maior numero");
		}
		if(n2 > n1 & n1 > n3 || n2 > n3 && n3 > n1 ) {
			System.out.println(n2 + " � o maior numero");
		}
		if(n3 > n1 & n1 > n2 || n3 > n2 && n2 > n1 ) {
			System.out.println(n3 + " � o maior numero");
		}
	}

}
