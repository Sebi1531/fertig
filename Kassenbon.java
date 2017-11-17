package fertig;
import java.util.*;

public class Kassenbon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Kassenbon-Programm");
		int v = 1;
		int platz = -1;
		double total = 0;
		String[] name = new String[100];
		double[] anzahl = new double[1000];
		double[] preis = new double[1000];
		while (v == 1) {
			platz = platz + 1;
			System.out.print(" Name vom Produkt: ");
			name[platz] = in.nextLine();
			System.out.print(" Preis je Produkt: ");
			preis[platz] = Double.valueOf(in.nextLine());
			System.out.print("Menge vom Produkt: ");
			anzahl[platz] = Double.valueOf(in.nextLine());
			System.out.print("Kommt noch ein weiteres Produkt?\n 0 = Nein\n 1 = Ja\nAntwort: ");
			v = Integer.valueOf(in.nextLine());
			total = total + anzahl[platz] * preis[platz];
		}
		System.out.printf("              Preis: %1.2f ", total);
		System.out.print("\nVom Kunden bekommen: ");
		double gegeben = Double.valueOf(in.nextLine());
		double rück = gegeben - total;
		System.out.printf("Rückgeld: %1.2f ", rück);
		System.out.println("\n\n\n\n\n\n\n");
		System.out.println("              KASSENBON\n\n\n");
		while (platz >= 0) {
			System.out.println(name[platz]);
			System.out.println(anzahl[platz] + "x " + preis[platz] + " €");
			System.out.println("");
			platz = platz - 1;
		}
		System.out.println("\n-------------------------------------");
		System.out.printf("SUMME               EUR     %1.2f ", total);
		System.out.println("\n=====================================");
		System.out.printf("Gegeben             EUR     %1.2f ", gegeben);
		System.out.printf("\nRückgeld            EUR     %1.2f ", rück);
		double mwst = total * 0.19;
		double netto = total - mwst;
		System.out.printf("\n\nBetrag (Netto)      EUR     %1.2f ", netto);
		System.out.printf("\nMehrwertsteuer      EUR     %1.2f ", mwst);
		System.out.printf("\nBetrag (Brutto)     EUR     %1.2f ", total);

	}

}
