import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String answer = "O número informado não pertence à sequencia";

		int num1 = 0;
		int num2 = 1;

		for (int i = 0; i < x + 2; i++) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			if (num2 == x || x==0) {
				answer = "O número informado pertence à sequencia";
			}
		}

		System.out.println(answer);
		sc.close();
	}

}
