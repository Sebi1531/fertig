package fertig;
import java.util.*;

public class Taschenrechner {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		String weiter = "Ja";
		System.out.print("            Zahl: ");
		double summe = Double.valueOf(in.nextLine());
		double zahl = 0;
		while (weiter.equals("Ja")) {
			System.out.print("   Rechenzeichen: ");
			String zeichen = in.nextLine();
			if (zeichen.equals("+")) {
				System.out.print("            Zahl: ");
				zahl = Double.valueOf(in.nextLine());
				summe = summe + zahl;
			}
			if (zeichen.equals("-")) {
				System.out.print("            Zahl: ");
				zahl = Double.valueOf(in.nextLine());
				summe = summe - zahl;
			}
			if (zeichen.equals("*")) {
				System.out.print("            Zahl: ");
				zahl = Double.valueOf(in.nextLine());
				summe = summe * zahl;
			}
			if (zeichen.equals("/")) {
				System.out.print("            Zahl: ");
				zahl = Double.valueOf(in.nextLine());
				summe = summe / zahl;
			}
			System.out.println("Zwischenergebnis: "+ summe +"");
			System.out.println("Weitere Zahl? (Ja/Nein) ");
			weiter = in.nextLine();
		}
		System.out.println("\n\n         Ergebis: "+summe+"");
	}

}
