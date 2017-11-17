package fertig;
import java.util.*;

public class Deal_or_no_Deal {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int n = 20, m = 0, x = 0, y = 20, runde = 0, ende = 0;
		double vorschlag = 0;
		String entscheidung = "";
		String [] rest = new String [20];
		while (y != 0){
			y = y - 1;
			rest [y] = "O ";
		}
		y = 0;
		double [] prozent = new double [4];
		prozent [0] = 0.77;
		prozent [1] = 0.85;
		prozent [2] = 0.88;
		prozent [3] = 0.92;
		String [] übrig = new String [20];
		übrig [0] = " 1";
		übrig [1] = " 2";
		übrig [2] = " 3";
		übrig [3] = " 4";
		übrig [4] = " 5";
		übrig [5] = " 6";
		übrig [6] = " 7";
		übrig [7] = " 8";
		übrig [8] = " 9";
		übrig [9] = "10";
		übrig [10] = "11";
		übrig [11] = "12";
		übrig [12] = "13";
		übrig [13] = "14";
		übrig [14] = "15";
		übrig [15] = "16";
		übrig [16] = "17";
		übrig [17] = "18";
		übrig [18] = "19";
		übrig [19] = "20";
		int [] koffer = new int [20];
		int [] geld = new int [20];
		while (x == 0){
			geld [0] = 1;
			geld [1] = 2;
			geld [2] = 5;
			geld [3] = 10;
			geld [4] = 20;
			geld [5] = 50;
			geld [6] = 100;
			geld [7] = 250;
			geld [8] = 500;
			geld [9] = 750;
			geld [10] = 1000;
			geld [11] = 2500;
			geld [12] = 5000;
			geld [13] = 10000;
			geld [14] = 20000;
			geld [15] = 25000;
			geld [16] = 50000;
			geld [17] = 100000;
			geld [18] = 150000;
			geld [19] = 250000;
			x = 1;
			if (y == 0){
				while (n != 0){
					m = (int) (Math.random() * n);
					koffer [n - 1] = geld [m];
					geld [m] = geld[n - 1];
					n = n - 1;
					x = 0;
				}
			}
			n = 0;
			m = 6;
			y = 1;
		}
		x = 0;
		y = 0;
		System.out.print("Willkommen bei 'Deal or no Deal'.\nDann wollen wir mal direkt beginnen!\nBitte wähle zuerst deinen Koffer aus!\nZahl (1-20): ");
		n = Integer.valueOf(in.nextLine()) - 1;
		while (n > 19 || n < 0){
			System.out.print("Den Koffer, den du ausgewählt hast, gibt es gar nicht!\nBitte wähle erneut einen Koffer aus. Es gibt insgesamt 20 Koffer (Koffer 1 - Koffer 20).\nZahl: ");
			n = Integer.valueOf(in.nextLine()) - 1;
		}
		übrig [n] = "  ";
		System.out.println("Dein Koffer ist also der Koffer " + (n + 1) + "!\nGleich wirst du eine Liste mit Zahlen sehen, welche alle Geldbeträge sind, die auf die Koffer verteilt wurden.\nEiner von diesen Beträgen ist in deinem Koffer!\nSteht ein 'O' vor der Zahl, heißt das, dass dieser Betrag noch nicht geöffnet wurde.\nSteht jedoch ein 'X' davor, dann war dieser Betrag in einen von den anderen 19 Koffern\n und ist somit auf jeden Fall nicht in deinem Koffer.\nZuerst wirst du nun 6 Koffer öffnen und somit werden auch 6 Beträge wegfallen.\nDann bietet der Banker einen Geldbetrag für den Koffer, welchen er kaufen will. Akzeptierst du den Deal, ist die Runde beendet.\nDann würde der Koffer geöffnet werden und bekommst dennoch den Betrag vom Banker.\nLehnst du ab, geht es weiter. Dann werden 5 Koffer geöffnet und anschließend bietet der Banker wieder einen Preis.\nDann werden 4 Koffer geöffnet und der Banker ist dran. Anschließend 3 Koffer und der Banker ist wieder dran\nZuletzt noch 2 Koffer und der Banker ist wieder dran.\nJetzt wird nun der letzte Koffer geöffnet. Anschließend bleibt nur noch ein Geldbetrag übrig und diesen Betrag hast du gewonnen!");
		System.out.println("Dann beginnen wir mal mit 'Deal or no Deal'!");
		while (ende == 0){
			while (m != 0){
				if (runde == 5){
					ende = 1;
				}
				System.out.println("Du musst in dieser Runde noch " + m + " Koffer öffnen!");
				System.out.println("Restliche Beträge: ");
				y = 0;
				while (y != 10){
					System.out.println(rest[y] + "" + geld[y] + "€ 	" + rest[y + 10] + "" + geld[y + 10] + "€");
					y = y + 1;
				}
				y = 0;
				System.out.println("Öffne einen Koffer deiner Wahl: ");
				while (y != 20){
					System.out.println(übrig[y] + " " + übrig[y + 1] + " " + übrig[y + 2] + " " + übrig[y + 3] + " " + übrig[y + 4]);
					y = y + 5;
				}
				y = 0;
				System.out.print("\nEingabe: ");
				x = Integer.valueOf(in.nextLine()) - 1;
				if (x < 0 || x > 19){
					System.out.println("Diesen Koffer gibt es doch gar nicht?!?!");
				} else {
					if (koffer[x] == 0){
						System.out.println("Dieser Koffer wurde schon geöffnet!");
					} else {
						if (runde == 4 && m == 1){
							System.out.println("Alle anderen Koffer wurden geöffnet und es gibt nun nur noch einen verschlossenen Koffer: Deinen!\nDann gucke ich mal rein. Es sind " + koffer[n] + "€! Gratulation!");
							System.out.println("\n\n\nProgramm wird nun beendet...");
							System.exit(0);
						}
						if (koffer[x] < 51){
							System.out.println("Volltreffer! In Koffer " + (x + 1) + " sind nur " + koffer[x] + "€! Da wurde der richtige Koffer getroffen!");
						} else {
							if (koffer[x] < 1001){
								System.out.println("Das ist doch ein gutes Ergebnis. In Koffer " + (x + 1) + " sind " + koffer[x] + "€! Das ist doch ein guter Koffer.");
							} else {
								if (koffer[x] < 10001){
									System.out.println("In Koffer " + (x + 1) + " sind " + koffer[x] + "€. Dieser Betrag ist halt ungefähr in der Mitte, also kann man es doch eigentlich akzeptieren.");
								} else {
									if (koffer[x] < 100001){
										System.out.println("Schade...\nIn Koffer " + (x + 1) + " sind " + koffer[x] + "€. Ein schwerer Rückschlag für die zukünftigen Angebote vom Banker! Jedoch isz vielleicht noch mehr in deinem Koffer...");
									} else {
										if (koffer[x] < 250001){
											System.out.println("Oh nein! Das waren " + koffer[x] + "€ in Koffer " + (x + 1) + "! Das ist eine nicht so schöne Runde...");
										}
									}
								}
							}
						}
						while (y != 20){
							if (koffer[x] == geld[y]){
								rest[y] = "X ";
							}
							y++;
						}
						y = 0;
						m--;
						koffer[x] = 0;
						übrig[x] = "  ";
					}
				}
				x = 0;
			}
			System.out.println("Der Bänker bereitet wieder einen Deal für den Koffer vor ...");
			while (y != 20){
				if (rest[y].equals("O ")){
					vorschlag = vorschlag + geld[y];
					x++;
				}
				y++;
			}
			x = (int) ((vorschlag / x)*prozent[runde]);
			System.out.print("Der Bänker bietet " + x + "€.\nWillst du auf diesen Deal eingehen?\nJa/Nein: ");
			entscheidung = String.valueOf(in.nextLine()).toLowerCase();
			if (entscheidung.equals("ja")){
				System.out.println("Der Kandidat geht auf den Deal ein und gewinnt " + x + "€!\nJedoch gibt es noch eine Frage: Wie viel Geld war im Koffer " + n + ", welchen er am Anfang ausgewählt hat? Wir gucken rein...");
				if (koffer[n] > x){
					System.out.println("Es wären " + koffer[n] + "€ gewesen und damit mehr als der Deal. Damit freut sich vermutlich der Banker über den Gewinn. Naja, man kann es ja nie wissen...\nIch gratuliere natürlich dennoch zu den " + x + "€! Glückwunsch!");
				}
				if (koffer[n] == x){
					System.out.println("Es wären exakt gleich viel wie der Deal, und zwar " + koffer[n] + "€ !!!\nFür den Banker hat es zwar nun nicht viel gebracht, du hast jedoch " + x + "€ gewonnen! Glückwunsch!");
				}
				if (koffer[n] < x){
					System.out.println("Wenn man den Kofferinhalt sieht, ist man doch eigentlich ganz froh, den Deal akzeptiert zu haben, schließlich ist im Koffer nur " + koffer[n] + "€!\nDer Banker wird sich natürlich ärgern, schließlich muss er diese Runde mal wieder einen Verlust akzeptieren.\nIch gratuliere auf jeden Fall zu " + x + "€! Glückwunsch!");
				}
				System.out.println("\n\n\n\nProgramm wird nun beendet...");
				System.exit(0);
			}
			System.out.println("Das ist zu wenig für den Kandidaten! Damit gehen wir in die " + (runde + 1) + ". Runde!");
			vorschlag = 0;
			entscheidung = "";
			x = 0;
			y = 0;
			runde = runde + 1;
			m = 6 - runde;
			if (runde == 4){
				m = m - 1;
			}
		}
	}
}
