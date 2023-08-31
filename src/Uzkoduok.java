import java.util.Scanner;

public class Uzkoduok {
	static Scanner sc = new Scanner(System.in);

	public static void uzkoduoti() {
		System.out.println("Įveskite tekstą arba žodį kuris bus užkoduotas");
		String zodis = sc.nextLine();
		String[] koduotasZodis = uzkoduoti(zodis);
		System.out.println("Jūsų užkoduotas tekstas/žodis: "); 
		for (String a : koduotasZodis)
			System.out.printf("%s ",a);
		System.out.println();
		
	}

	private static String[] uzkoduoti(String zodis) {
		char[] raides = new char[zodis.length()];
		for (int i = 0; i < zodis.length(); i++) {
			raides[i] = zodis.toUpperCase().charAt(i);
		}

		return uzkoduoti(raides);
	}

	private static String[] uzkoduoti(char[] raides) {
		String[] zodziai = new String[raides.length];

		for (int i = 0; i < raides.length; i++) {
			char raide = raides[i];
			zodziai[i] = uzkoduoti(raide);
		}

		return zodziai;
	}

	private static String uzkoduoti(char i) {
		
		
		return switch(i){
			case 'A'-> "Arbuzas";
			case 'B'-> "Baranka";
			case 'C'-> "Cepelinas";
			case 'D'-> "Dalgis";
			case 'E'-> "Ežeras";
			case 'F'-> "Fabrikas";
			case 'G'-> "Gamta";
			case 'H'-> "Herbas";
			case 'I'-> "Irklas";
			case 'J'-> "Jaukas";
			case 'K'-> "Kranas";
			case 'L'-> "Lizdas";
			case 'M'-> "Miškas";
			case 'N'-> "Namas";
			case 'O'-> "Operas";
			case 'P'-> "Pieva";
			case 'Q'-> "Queen";
			case 'R'-> "Radikalus";
			case 'S'-> "Sriuba";
			case 'T'-> "Tauta";
			case 'U'-> "Užeiga";
			case 'V'-> "Vampyras";
			case 'W'-> "Window";
			case 'X'-> "X-ray";
			case 'Y'-> "Yellow";
			case 'Z'-> "Zona";			
			default -> "Plunksna Pieva Pienas";
		};
		
			
		
	}

	
}
