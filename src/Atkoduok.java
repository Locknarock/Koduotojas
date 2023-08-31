import java.util.Scanner;

public class Atkoduok {
	static Scanner sc = new Scanner(System.in);

	public static void atkoduoti() {
		System.out.println("Įveskite tekstą kuris bus atkoduotas");
		String tekstas = sc.nextLine();
		String[] koduotasTekstas = atkoduoti(tekstas);
		System.out.println("Jūsų atkoduotas tekstas: ");
		for (String a : koduotasTekstas)
			System.out.printf("%s ", a);
		System.out.println();
		

		// for (char a:koduotasTekstas)
		// System.out.println(a);

	}

	private static String[] atkoduoti(String tekstas) {

		String[] zodziai = tekstas.toLowerCase().split(" ", 0);
		char[] raides = new char[zodziai.length];
		for (int i = 0; i < zodziai.length; i++) {
			raides[i] = (char) zodziai[i].charAt(0);
		}

		return atkoduoti(raides);

	}

	private static String[] atkoduoti(char[] raides) {

		String[] zodis = String.valueOf(raides).split("ppp", 0);

		return zodis;
	}
	
}
