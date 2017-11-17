package fertig;
import java.util.*;

public class Glücksspiel {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.print("Wie viele Spieler wollen mitspielen?\nAnzahl: ");
		int anzahl = Integer.valueOf(in.nextLine());
		String [] name = new String [anzahl];
		int [] angabe = new int [anzahl];
		int [] differenz = new int [anzahl];
		int [] gleich = new int [anzahl];
		int [] punkte = new int [anzahl];
		int anzahlII = 0;
		while (anzahlII != anzahl){
			anzahlII = anzahlII + 1;
			System.out.print("Name von Spieler "+anzahlII+": ");
			name [(anzahlII - 1)] = in.nextLine();
		}
		System.out.print("\nWie viele Punkte müssen erreicht werden, damit man gewinnt (je Runde bekommt der Gewinner 1 Punkt): ");
		int ziel = Integer.valueOf(in.nextLine());
		int runde = 0;
		int endlos = 0;
		while (endlos != 1){
			int zufall = (int)( Math.random() * 100);
			runde = runde + 1;
			anzahlII = 0;
			while (anzahlII != anzahl){
				anzahlII = anzahlII + 1;
				System.out.println("\n\nRunde " + runde + "\n");
				System.out.print(name[(anzahlII - 1)] + " (Spieler "+ anzahlII +"):\nGeben Sie ihren Tipp zwischen 1 und 100 ab: ");
				angabe [anzahlII - 1] = Integer.valueOf(in.nextLine());
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			}
			System.out.println("Die Zufallszahl beträgt "+ zufall + ".\n");
			System.out.println("Die Tipps: ");
			anzahlII = 0;
			while (anzahlII != anzahl){
				anzahlII = anzahlII + 1;
				System.out.println(name[(anzahlII - 1)] + ": " + angabe [(anzahlII - 1)]);
			}
			anzahlII = 0;
			System.out.println("\nDie Differenzen zwischen den Tipps und der Zufallszahl: ");
			while (anzahlII != anzahl){
				anzahlII = anzahlII + 1;
				differenz [anzahlII - 1] = angabe [anzahlII - 1] - zufall;
				if (differenz [anzahlII - 1] < 0){
					differenz [anzahlII - 1] = differenz [anzahlII - 1] * (-1);
				}
				System.out.println("Differenz von " + name[anzahlII - 1] + ": " + differenz [anzahlII - 1]);
			}
			anzahlII = 0;
			int prüfer = 0;
			int ruge = -1;
			int zahl = 0;
			int zahlII = 999;
			String gewinner = "" + name[0] + "";
			while (anzahl > anzahlII){
				if (prüfer == anzahlII){
					anzahlII += 1;
				}
				if (differenz[prüfer] > differenz[anzahlII]){
					ruge = anzahlII;
					gewinner = "" + name[anzahlII] + "";
					differenz[prüfer] = zahlII;
					prüfer = anzahlII;
				} else {
					if (differenz[prüfer] == differenz[anzahlII]){
						gleich[zahl] = differenz[anzahlII];
						zahl += 1;
						differenz[anzahlII] = zahlII;
					}
				}
				if (differenz[prüfer] < differenz[anzahlII]){
					differenz[anzahlII] = zahlII;
				}
				zahlII += 1;
				anzahlII += 1;
			}
			anzahlII = 0;
			while (zahl != 0){
				if (differenz[prüfer] >= gleich[zahl]){
					System.out.println("Min. 2 Personen haben die niedrigsten Differenzwerte, weswegen niemand einen Punkt bekommt.");
					gleich[0] = 998;
				}
				zahl -= 1;
			}
			if (gleich[0] != 998){
				System.out.println("Gewinner dieser Runde ist " + gewinner + ".");
				punkte [prüfer] += 1;
			}
			anzahlII = 0;
			while (anzahlII != anzahl){
				gleich[anzahlII] = -1;
				anzahlII += 1;
			}
			anzahlII = 0;
			while (anzahlII != anzahl){
				if (punkte [anzahlII] == ziel){
					System.out.println("\n\n\nSpielende!");
					System.out.println("Gewinner dieses Spieles ist: " + name [anzahlII]);
					System.out.println("\nRangliste: ");
					System.out.println("1. Platz: " + ziel + " Punkte		" + name [anzahlII]);
					punkte [anzahlII] = -1;
					prüfer = 0;
					anzahlII = 0;
					int platz = 2;
					while (anzahlII != anzahl){
						if (platz == anzahl + 1){
							System.exit(0);
						}
						while (prüfer != anzahl){
							if (prüfer == anzahlII){
								prüfer += 1;
							}
							if (punkte[anzahlII] < punkte[prüfer]){
								anzahlII = prüfer;
							} else {
								if (punkte[anzahlII] == punkte[prüfer]){
									gleich[endlos] = prüfer;
									endlos += 1;
								}
							}
							prüfer += 1;
						}
						runde = 0;
						System.out.println(platz + ". Platz: " + punkte [anzahlII] + " Punkte		" + name [anzahlII]);
						while (endlos != 0){
							if (punkte [gleich[(endlos - 1)]] == punkte [anzahlII]){
								System.out.println(platz + ". Platz: " + punkte [gleich[(endlos - 1)]] + " Punkte		" + name [gleich[(endlos - 1)]]);	
								runde += 1;
							}
							platz += runde;
							endlos -= 1;
						}
						endlos = 0;
						punkte[anzahlII] = -1;
						anzahlII = 0;
						platz += 1;
					}
					System.exit(0);
				}
				anzahlII = anzahlII + 1;
			}
			System.out.println("\nAktueller Punktestand: ");
			anzahlII = 0;
			while (anzahlII != anzahl){
				System.out.println(name[anzahlII] + ": " + punkte[anzahlII] + " Punkte");
				anzahlII = anzahlII + 1;
			}
		}
	}
}