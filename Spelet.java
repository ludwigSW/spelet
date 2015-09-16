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

		System.out.println("Spelar 1 börjar välja en ruta genom att skriva in ett tal mellan 1-9");

		// Räkna omgångar

		// Kolla nuvarande spelare med IF-statement, if(omgång är udda nr = spelare1 tur)

		





	}
}