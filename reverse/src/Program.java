import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String before = sc.nextLine();
		String after = "";

		for (int i = before.length() - 1; 0 <= i; i--) {
			after += before.charAt(i);
		}
		
		System.out.println(after);
		sc.close();
	}
}
