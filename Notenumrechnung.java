package fertig;
import java.util.*;

public class Notenumrechnung {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int ende = 0, richtung, summe = 0, name, menge = 1, extra = 0;
		double durchschnitt;
		int [] noten = new int [100];
		String [] namen = new String [100];
		System.out.print("In welche Richtung soll geändert werden?\n1: Notenpunkte (0-15) -> Noten (1-6)\n2: Noten (1-6) -> Notenpunkte (0-15)\nEingabe: ");
		richtung = Integer.valueOf(in.nextLine());
		System.out.print("Soll zu den Noten Namen (z.B. Fächer) gespeichert werden?\n1: Ja\n2: Nein\nEingabe: ");
		name = Integer.valueOf(in.nextLine());
		System.out.println("Du darfst maximal 100 Noten eingeben!");
		while (ende == 0) {
			System.out.println("Wenn du beenden möchtest, gib -1 ein.");
			System.out.print(menge + ". Note: ");
			noten [(menge - 1)] = Integer.valueOf(in.nextLine());
			if (noten[(menge - 1)] == -1) {
				noten [(menge - 1)] = 0;
				ende++;
			} else {
				if (name == 1){
					System.out.print("Name zur Note: ");
					namen [(menge - 1)] = String.valueOf(in.nextLine());
				}
				menge++;
			}
			if (menge == 100) {
				System.out.println("Limit erreicht!");
				ende++;
			}
		}
		menge--;
		if (richtung == 1){
			for (int i = menge; i != 0; i--){
				if (name == 1){
					System.out.print(namen [(i - 1)] + "	");
				}
				System.out.print("Notenpunkte: " + noten [(i - 1)] + "	");
				if (noten [(i - 1)] == 0){
					extra++;
				}
				noten [(i - 1)] = (int) (extra + 5 - noten [(i - 1)] / 3);
				extra = 0;
				summe += noten [(i - 1)];
				System.out.println("Note: " + noten [(i - 1)] + "");
			}
			durchschnitt = (double) (summe / menge);
			System.out.println("Durchschnitt aller Noten: " + durchschnitt + " (in Noten)");
		}
		if (richtung == 2){
			for (int i = menge; i != 0; i--){
				if (name == 1){
					System.out.print(namen [(i - 1)] + "	");
				}
				System.out.println("Note: " + noten [(i - 1)] + "");
				noten [(i - 1)] = (int) (18 - 3 * noten [(i - 1)]);
				summe += noten[(i - 1)];
				System.out.print("Notenpunkte: " + noten [(i - 1)] + "	");
			}
			menge++;
			durchschnitt = summe / menge;
			System.out.println("Durchschnitt aller Noten: " + durchschnitt + " (in Notenpunkten)");
		}
	}
}