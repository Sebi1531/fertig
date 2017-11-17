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
		String [] �brig = new String [20];
		�brig [0] = " 1";
		�brig [1] = " 2";
		�brig [2] = " 3";
		�brig [3] = " 4";
		�brig [4] = " 5";
		�brig [5] = " 6";
		�brig [6] = " 7";
		�brig [7] = " 8";
		�brig [8] = " 9";
		�brig [9] = "10";
		�brig [10] = "11";
		�brig [11] = "12";
		�brig [12] = "13";
		�brig [13] = "14";
		�brig [14] = "15";
		�brig [15] = "16";
		�brig [16] = "17";
		�brig [17] = "18";
		�brig [18] = "19";
		�brig [19] = "20";
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
		System.out.print("Willkommen bei 'Deal or no Deal'.\nDann wollen wir mal direkt beginnen!\nBitte w�hle zuerst deinen Koffer aus!\nZahl (1-20): ");
		n = Integer.valueOf(in.nextLine()) - 1;
		while (n > 19 || n < 0){
			System.out.print("Den Koffer, den du ausgew�hlt hast, gibt es gar nicht!\nBitte w�hle erneut einen Koffer aus. Es gibt insgesamt 20 Koffer (Koffer 1 - Koffer 20).\nZahl: ");
			n = Integer.valueOf(in.nextLine()) - 1;
		}
		�brig [n] = "  ";
		System.out.println("Dein Koffer ist also der Koffer " + (n + 1) + "!\nGleich wirst du eine Liste mit Zahlen sehen, welche alle Geldbetr�ge sind, die auf die Koffer verteilt wurden.\nEiner von diesen Betr�gen ist in deinem Koffer!\nSteht ein 'O' vor der Zahl, hei�t das, dass dieser Betrag noch nicht ge�ffnet wurde.\nSteht jedoch ein 'X' davor, dann war dieser Betrag in einen von den anderen 19 Koffern\n und ist somit auf jeden Fall nicht in deinem Koffer.\nZuerst wirst du nun 6 Koffer �ffnen und somit werden auch 6 Betr�ge wegfallen.\nDann bietet der Banker einen Geldbetrag f�r den Koffer, welchen er kaufen will. Akzeptierst du den Deal, ist die Runde beendet.\nDann w�rde der Koffer ge�ffnet werden und bekommst dennoch den Betrag vom Banker.\nLehnst du ab, geht es weiter. Dann werden 5 Koffer ge�ffnet und anschlie�end bietet der Banker wieder einen Preis.\nDann werden 4 Koffer ge�ffnet und der Banker ist dran. Anschlie�end 3 Koffer und der Banker ist wieder dran\nZuletzt noch 2 Koffer und der Banker ist wieder dran.\nJetzt wird nun der letzte Koffer ge�ffnet. Anschlie�end bleibt nur noch ein Geldbetrag �brig und diesen Betrag hast du gewonnen!");
		System.out.println("Dann beginnen wir mal mit 'Deal or no Deal'!");
		while (ende == 0){
			while (m != 0){
				if (runde == 5){
					ende = 1;
				}
				System.out.println("Du musst in dieser Runde noch " + m + " Koffer �ffnen!");
				System.out.println("Restliche Betr�ge: ");
				y = 0;
				while (y != 10){
					System.out.println(rest[y] + "" + geld[y] + "� 	" + rest[y + 10] + "" + geld[y + 10] + "�");
					y = y + 1;
				}
				y = 0;
				System.out.println("�ffne einen Koffer deiner Wahl: ");
				while (y != 20){
					System.out.println(�brig[y] + " " + �brig[y + 1] + " " + �brig[y + 2] + " " + �brig[y + 3] + " " + �brig[y + 4]);
					y = y + 5;
				}
				y = 0;
				System.out.print("\nEingabe: ");
				x = Integer.valueOf(in.nextLine()) - 1;
				if (x < 0 || x > 19){
					System.out.println("Diesen Koffer gibt es doch gar nicht?!?!");
				} else {
					if (koffer[x] == 0){
						System.out.println("Dieser Koffer wurde schon ge�ffnet!");
					} else {
						if (runde == 4 && m == 1){
							System.out.println("Alle anderen Koffer wurden ge�ffnet und es gibt nun nur noch einen verschlossenen Koffer: Deinen!\nDann gucke ich mal rein. Es sind " + koffer[n] + "�! Gratulation!");
							System.out.println("\n\n\nProgramm wird nun beendet...");
							System.exit(0);
						}
						if (koffer[x] < 51){
							System.out.println("Volltreffer! In Koffer " + (x + 1) + " sind nur " + koffer[x] + "�! Da wurde der richtige Koffer getroffen!");
						} else {
							if (koffer[x] < 1001){
								System.out.println("Das ist doch ein gutes Ergebnis. In Koffer " + (x + 1) + " sind " + koffer[x] + "�! Das ist doch ein guter Koffer.");
							} else {
								if (koffer[x] < 10001){
									System.out.println("In Koffer " + (x + 1) + " sind " + koffer[x] + "�. Dieser Betrag ist halt ungef�hr in der Mitte, also kann man es doch eigentlich akzeptieren.");
								} else {
									if (koffer[x] < 100001){
										System.out.println("Schade...\nIn Koffer " + (x + 1) + " sind " + koffer[x] + "�. Ein schwerer R�ckschlag f�r die zuk�nftigen Angebote vom Banker! Jedoch isz vielleicht noch mehr in deinem Koffer...");
									} else {
										if (koffer[x] < 250001){
											System.out.println("Oh nein! Das waren " + koffer[x] + "� in Koffer " + (x + 1) + "! Das ist eine nicht so sch�ne Runde...");
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
						�brig[x] = "  ";
					}
				}
				x = 0;
			}
			System.out.println("Der B�nker bereitet wieder einen Deal f�r den Koffer vor ...");
			while (y != 20){
				if (rest[y].equals("O ")){
					vorschlag = vorschlag + geld[y];
					x++;
				}
				y++;
			}
			x = (int) ((vorschlag / x)*prozent[runde]);
			System.out.print("Der B�nker bietet " + x + "�.\nWillst du auf diesen Deal eingehen?\nJa/Nein: ");
			entscheidung = String.valueOf(in.nextLine()).toLowerCase();
			if (entscheidung.equals("ja")){
				System.out.println("Der Kandidat geht auf den Deal ein und gewinnt " + x + "�!\nJedoch gibt es noch eine Frage: Wie viel Geld war im Koffer " + n + ", welchen er am Anfang ausgew�hlt hat? Wir gucken rein...");
				if (koffer[n] > x){
					System.out.println("Es w�ren " + koffer[n] + "� gewesen und damit mehr als der Deal. Damit freut sich vermutlich der Banker �ber den Gewinn. Naja, man kann es ja nie wissen...\nIch gratuliere nat�rlich dennoch zu den " + x + "�! Gl�ckwunsch!");
				}
				if (koffer[n] == x){
					System.out.println("Es w�ren exakt gleich viel wie der Deal, und zwar " + koffer[n] + "� !!!\nF�r den Banker hat es zwar nun nicht viel gebracht, du hast jedoch " + x + "� gewonnen! Gl�ckwunsch!");
				}
				if (koffer[n] < x){
					System.out.println("Wenn man den Kofferinhalt sieht, ist man doch eigentlich ganz froh, den Deal akzeptiert zu haben, schlie�lich ist im Koffer nur " + koffer[n] + "�!\nDer Banker wird sich nat�rlich �rgern, schlie�lich muss er diese Runde mal wieder einen Verlust akzeptieren.\nIch gratuliere auf jeden Fall zu " + x + "�! Gl�ckwunsch!");
				}
				System.out.println("\n\n\n\nProgramm wird nun beendet...");
				System.exit(0);
			}
			System.out.println("Das ist zu wenig f�r den Kandidaten! Damit gehen wir in die " + (runde + 1) + ". Runde!");
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
