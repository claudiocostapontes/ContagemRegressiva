package br.com.contagem;

// importe a classe Scanner
import java.util.Scanner;

public class Contagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// instancia o objeto
		Scanner leia = new Scanner(System.in);
		
		// declarar variável
		int x;
		
		// entrada de dados
		System.out.println("Informe um número inteiro:");
		x = leia.nextInt();
		
		// saída de dados
		while (x >= 0) {
			System.out.println(x);
			x--;
		}

	}

}
