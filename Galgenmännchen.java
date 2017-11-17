package fertig;
import java.util.*;

public class Galgenmännchen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int rundespieler = 0, anzahlspieler, anzahlrunden, leben = 11, raus, entscheidung = 0, mengeleerzeichen = 0, abbruch, anzahlbuchstabe = 0, speicherplatz, geratenmenge = 0, x = 0, platz = 0, prüfer = 0, endlos = 0, y = 0, test = 0;
		boolean nichts = false;
		String eingabe = "";

		System.out.print("Wie viele Spieler spielen mit (min. 2 Spieler)? ");
		anzahlspieler = Integer.valueOf(in.nextLine());
		double[] punkte = new double[anzahlspieler];
		for (abbruch = 0; anzahlspieler < 2; abbruch++) {
			System.out.print("Eingabe ungültig!\nEingabe neu eingeben: ");
			anzahlspieler = Integer.valueOf(in.nextLine());
			if (abbruch == 4) {
				System.out
						.println("Wenn du gelernt hast, welche Zahlen größer als 1 sind, komm wieder!\nProgramm wird nun beendet...");
				System.exit(0);
			}
		}
		String[] namen = new String[anzahlspieler];
		for (speicherplatz = 1; speicherplatz <= anzahlspieler; speicherplatz++) {
			System.out.print("Name von Spieler " + speicherplatz + ": ");
			namen[(speicherplatz - 1)] = in.nextLine();
		}
		speicherplatz = 0;
		System.out.println("1 Runde = jeder Spieler sucht ein Wort aus");
		System.out.print("Wie viele Runden sollen gespielt werden? ");
		anzahlrunden = Integer.valueOf(in.nextLine()) * anzahlspieler;
		String wort = "";
		while (anzahlrunden != 0) {
			System.out.println("Spieler " + (rundespieler + 1) + " ("
					+ namen[rundespieler] + ") beginnt mit der Runde!");
			raus = 1;
			String[] buchstabe = new String[100];
			System.out
					.println("Folgende Regeln sollten bei der Eingabe beachtet werden:\n- Das Wort darf nicht mehr als 100 Buchstaben haben!\n- Falls das Wort fehlerhaft ist, kann man es abbrechen und neu starten!\n- Alle Buchstaben sollten klein geschrieben werden!\n- Falls man mit dem Wort fertig ist, sollte man einfach 'ende' eingeben.");
			while (raus != 2) {
				while (raus != 0) {
					System.out.print((anzahlbuchstabe + 1) + ". Buchstabe: ");
					buchstabe[anzahlbuchstabe] = in.nextLine().toLowerCase();
					if (buchstabe[anzahlbuchstabe].equals("ende")) {
						raus = 0;
						buchstabe[anzahlbuchstabe] = null;
					} else {
						wort = "" + wort + "" + buchstabe[anzahlbuchstabe] + "";
						anzahlbuchstabe += 1;
					}
				}
				System.out
						.print("Wort: "
								+ wort
								+ "\nIst dieses Wort korrekt?\n0: Nein\n1: Ja\nEingabe: ");
				entscheidung = Integer.valueOf(in.nextLine());
				if (entscheidung == 0) {
					while (entscheidung != 100) {
						buchstabe[entscheidung] = null;
						entscheidung++;
					}
					anzahlbuchstabe = 0;
					wort = "";
					raus = 1;
				} else {
					raus = 2;
				}
			}
			System.out
					.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out
					.println("Die Worteingabe ist nun beendet und jeder darf wieder reingucken.");
			raus = 1;
			String[] anzeige = new String[100];
			for (speicherplatz = 0; speicherplatz != anzahlbuchstabe; speicherplatz++) {
				anzeige[speicherplatz] = "_";
			}
			speicherplatz = 25;
			String[] geraten = new String[26];
			while (leben != 0 && raus != 0) {
				System.out.println("\n\nIhr habt noch " + leben + " Leben!");
				speicherplatz = 25;
				System.out
						.println("Folgende Buchstaben habt ihr schon geraten: ");
				x = 0;
				if (test == 3){
					test = 3;
				}
				test++;
				while (geraten[speicherplatz] == null && x != 1) {
					speicherplatz--;
					if (speicherplatz == -1) {
						x = 1;
						speicherplatz = 0;
					}
				}
				speicherplatz -= x;
				x = 0;
				if (speicherplatz == -1) {
					System.out.print("keine");
				} else {
					do {
						System.out.print(geraten[speicherplatz] + ", ");
						speicherplatz--;
					} while (speicherplatz >= 0);
				}
				speicherplatz = -1;
				System.out
						.println("\nDiese Teile vom Wort habt ihr schon erraten: ");
				for (speicherplatz = 0; speicherplatz != 28; speicherplatz++) {
					if (anzeige[speicherplatz] == null) {
						speicherplatz = 27;
					} else {
						System.out.print(anzeige[speicherplatz]);
						System.out.print(" ");
					}
				}
				System.out.print("\nRatet nun einen Buchstaben: ");
				eingabe = in.nextLine();
				speicherplatz = 0;
				while (-1 < speicherplatz && speicherplatz != 26) {
					if (geraten[speicherplatz] == null) {
						nichts = true;
						geraten[speicherplatz] = "";
					}
					while (geraten[speicherplatz].equals(eingabe)) {
						System.out
								.print("Dieser Buchstabe wurde schon einmal verwendet!\nNeue Eingabe: ");
						eingabe = in.nextLine();
						speicherplatz = 0;
					}
					if (nichts == true) {
						nichts = false;
						geraten[speicherplatz] = null;
					}
					speicherplatz++;
				}
				speicherplatz = 0;
				while (speicherplatz != 100) {
					if (buchstabe[speicherplatz] == null) {
						nichts = true;
						buchstabe[speicherplatz] = "";
					}
					if (buchstabe[speicherplatz].equals(eingabe)) {
						x = 1;
						anzeige[speicherplatz] = "" + eingabe + "";
					}
					if (nichts == true) {
						nichts = false;
						buchstabe[speicherplatz] = null;
					}
					speicherplatz++;
					if (speicherplatz == 100 && x == 0) {
						System.out
								.println("Dieser Buchstabe kommt nicht im Wort vor!");
						leben--;
					}
				}
				if (x == 1) {
					System.out
							.println("Der geratene Buchstabe kommt im Wort vor!");
				}
				speicherplatz = 0;
				mengeleerzeichen = 0;
				while (speicherplatz != 100) {
					if (anzeige[speicherplatz] == null) {
						nichts = true;
						anzeige[speicherplatz] = "";
					}
					if (anzeige[speicherplatz].equals("_")) {
						mengeleerzeichen += 1;
					}
					if (nichts == true) {
						nichts = false;
						anzeige[speicherplatz] = null;
					}
					speicherplatz++;
				}
				speicherplatz = 0;
				if (mengeleerzeichen == 0) {
					raus = 0;
				}
				geraten[geratenmenge] = eingabe;
				geratenmenge++;
			}
			if (mengeleerzeichen == 0) {
				System.out.println("Gratulation! Ihr habt das Wort erraten!");
				speicherplatz = rundespieler + 1;
				raus = 0;
				while (raus == 0) {
					if (speicherplatz >= anzahlspieler) {
						speicherplatz = 0;
					}
					if (speicherplatz == rundespieler) {
						raus++;
					} else {
						punkte[speicherplatz]++;
						speicherplatz++;
					}
				}
				raus--;
			} else {
				speicherplatz = 0;
				System.out
						.println("Schade, ihr habt das Wort nicht erraten!\nEs wäre "
								+ wort + " gewesen.");
				punkte[rundespieler]++;
			}
			rundespieler++;
			if (rundespieler == anzahlspieler) {
				rundespieler = 0;
			}
			anzahlrunden--;
			entscheidung = 0;
			anzahlbuchstabe = 0;
			while (entscheidung != 100) {
				buchstabe[entscheidung] = null;
                anzeige[entscheidung] = null;
				entscheidung++;
			}
			anzahlbuchstabe = 0;
            leben = 11;
            entscheidung = 0;
            while (entscheidung != 26){
                geraten[entscheidung] = null;
                entscheidung++;
            }
            entscheidung = 0;
            geratenmenge = 0;
			wort = "";
			raus = 1;
		}
		x = 0;
		int[] gleich = new int[anzahlspieler];
		while (x != anzahlspieler) {
			System.out.println("\n\n\nSpielende!");
			System.out.println("\nRangliste: ");
			x = 0;
			platz = 1;
			while (x != anzahlspieler) {
				if (platz == anzahlspieler + 1) {
					System.exit(0);
				}
				while (prüfer != anzahlspieler) {
					if (prüfer == x) {
						prüfer += 1;
					}
					if (punkte[x] < punkte[prüfer]) {
						x = prüfer;
					} else {
						if (punkte[x] == punkte[prüfer]) {
							gleich[endlos] = prüfer;
							endlos++;
						}
					}
					prüfer += 1;
				}
				y = 0;
				System.out.println(platz + ". Platz: " + punkte[x]
						+ " Punkte		" + namen[x]);
				while (endlos != 0) {
					if (punkte[gleich[(endlos - 1)]] == punkte[x]) {
						System.out.println(platz + ". Platz: "
								+ punkte[gleich[(endlos - 1)]] + " Punkte		"
								+ namen[gleich[(endlos - 1)]]);
						y++;
					}
					platz += y;
					endlos -= 1;
				}
				endlos = 0;
				punkte[x] = -1;
				x = 0;
				platz += 1;
			}
			System.exit(0);
		}
		x++;
	}
}
