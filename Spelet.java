import java.util.Scanner;

public class Spelet{
	public static void main(String[] args) {
		
		Plan plan = new Plan();
		System.out.println("Välkommen namn spelare 1:");
		Scanner scanner = new Scanner(System.in);
		String spelareUno = scanner.nextLine();
		Spelare spelare1 = new Spelare(spelareUno, 'X', 1);

		System.out.println(spelare1);

		System.out.println(plan);



	}
}