package fertig;
import java.util.*;

public class Binärrechner {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.print("Welche Richtung willst du?\n0: Dezimal -> Binär\n1: Binär -> Dezimal\nZahl: ");
		int entscheidung = Integer.valueOf(in.nextLine());
		int abbruch = 0;
		while (entscheidung != 0 && entscheidung != 1){
			System.out.print("Eingabe fehlerhaft!\nZahl: ");
			entscheidung = Integer.valueOf(in.nextLine());
			abbruch += 1;
			if (abbruch == 3){
				System.out.println("Programm wird nun beendet...");
				System.exit(0);
			}
		}
		if (entscheidung == 0){
			System.out.print("Gib die ganzzahlige Zahl an, welche du umformen möchtest: ");
			int zahl = Integer.valueOf(in.nextLine());
			int x = 2;
			int y = 1;
			while (x < zahl){
				x = x * 2;
			}
			x = x / 2;
			System.out.print("Binärcode (" + zahl + "): ");
			while (y != 0){
				if (zahl - x >= 0){
					System.out.print("1");
					zahl = zahl - x;
				} else {
					System.out.print("0");
				}
				if (x == 1){
					System.out.println("\nProgramm wird nun beendet...");
					System.exit(0);
				}	
				x = x / 2;
			}
		}
		if (entscheidung == 1){
			System.out.print("1 = true; 0 = false (-> Bsp. für Binärcode: 0101)\nBitte den Binärcode eingeben: ");
			int code = Integer.valueOf(in.nextLine());
			int x = 1;
			int y = 10;
			int summe = 0;
			while (code != 0){
				if ((code % y) != 0){
					summe = summe + x;
					code = code - (code % y);
				}
				y *= 10;
				x *= 2;
			}
			System.out.println("Die Zahl vom Binärcode ist " + summe + "!");
		}
	}

}
