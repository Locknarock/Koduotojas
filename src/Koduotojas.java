import java.util.Scanner;

public class Koduotojas {

	Scanner sc = new Scanner(System.in);

	public void kodas() {

		while (true) {
			rodytiMenu();
			int pasirinkimas = sc.nextInt();
			if (pasirinkimas == 0) {
				break;
			}
			atlikVeiksmus(pasirinkimas);
		}

		sc.close();

	}

	private void atlikVeiksmus(int pasirinkimas) {

		switch (pasirinkimas) {
		case 1 -> Uzkoduok.uzkoduoti();
		case 2 -> Atkoduok.atkoduoti();
		default -> System.out.println("Nera tokio pasirinkimo");
		}

	}

	private void rodytiMenu() {
		System.out.println("=============");
		System.out.println("0 - Iseiti");
		System.out.println("1 - Užkoduoti");
		System.out.println("2 - Atkoduoti");
		System.out.println("=============");

	}

}
