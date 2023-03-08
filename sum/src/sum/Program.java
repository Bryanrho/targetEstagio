package sum;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int indice = 13;
		int soma = 0;

		for (int k = 0; k < indice; k += 1) {
			soma += k;
		}

		System.out.println(soma);

		sc.close();
	}

}
