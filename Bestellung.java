package fertig;
import java.util.*;

public class Bestellung {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String beenden = "", namefirma = "", strassefirma = "", hausnummerfirma = "", plzfirma = "", stadtfirma = "", namekunde = "", strassekunde = "", hausnummerkunde = "", plzkunde = "", stadtkunde = "";
		int ende = 0, menge = 0;
		double gesamt = 0, mwst;
		String[] namen = new String[100];
		double[] je = new double[100];
		int[] anzahl = new int[100];
		Scanner in = new Scanner(System.in);
		System.out.print("Informationen über Firma eingeben?\nJa/Nein: ");
		String entscheidungfirma = in.nextLine().toLowerCase();
		if (entscheidungfirma.equals("ja")) {
			System.out.print("Name der Firma: ");
			namefirma = in.nextLine();
			System.out.print("Adresse von Firma:\nStraße: ");
			strassefirma = in.nextLine();
			System.out.print("Hausnummer: ");
			hausnummerfirma = in.nextLine();
			System.out.print("PLZ: ");
			plzfirma = in.nextLine();
			System.out.print("Stadt: ");
			stadtfirma = in.nextLine();
		}
		System.out.print("Information über Kunden eingeben?\nJa/Nein: ");
		String entscheidungkunden = in.nextLine().toLowerCase();
		if (entscheidungkunden.equals("ja")) {
			System.out.print("Name des Kunde: ");
			namekunde = in.nextLine();
			System.out.print("Adresse von Kunde:\nStraße: ");
			strassekunde = in.nextLine();
			System.out.print("Hausnummer: ");
			hausnummerkunde = in.nextLine();
			System.out.print("PLZ: ");
			plzkunde = in.nextLine();
			System.out.print("Stadt: ");
			stadtkunde = in.nextLine();
		}
		System.out.println("\n\n\nMan kann maximal 100 Produkte eingeben!");
		while (ende == 0) {
			System.out.print("Name vom " + (menge + 1) + ". Produkt: ");
			namen[menge] = in.nextLine();
			System.out.print("Preis von einem " + namen[menge] + ": ");
			je[menge] = Double.valueOf(in.nextLine());
			System.out.print("Anzahl von " + namen[menge] + ": ");
			anzahl[menge] = Integer.valueOf(in.nextLine());
			System.out.print("Ende (Ja/Nein): ");
			beenden = in.nextLine().toLowerCase();
			if (beenden.equals("ja") || menge == 101) {
				ende++;
			} else {
				menge++;
			}
		}
		System.out.println("\n\n\n\n\n\n\n\n\n");
		if (entscheidungfirma.equals("ja")) {
			System.out.print(namefirma + ", " + strassefirma + " "
					+ hausnummerfirma + ", " + plzfirma + " " + stadtfirma
					+ "\n\n\n");
		}
		if (entscheidungkunden.equals("ja")) {
			System.out.print("An: \n" + namekunde + "\n" + strassekunde + " " + hausnummerkunde + "\n" + plzkunde + " " + stadtkunde + "\n\n\n\n");
		}
		while (menge != -1){
			System.out.println(namen [menge]);
			System.out.println(anzahl [menge] + "x " + je [menge] + "                                           " + (je [menge] * anzahl [menge]));
			gesamt += je [menge] * anzahl [menge];
			menge--;
		}
		mwst = gesamt * 0.19;
		System.out.println("________________________________________________");
		System.out.println("GESAMT: " + gesamt + " €");
		System.out.println("\nNettogehalt: " + (gesamt - mwst) + " €");
		System.out.println("MwSt (19€): " + mwst + " €");
		System.out.println("Bruttogehalt: " + gesamt + " €");
	}

}
