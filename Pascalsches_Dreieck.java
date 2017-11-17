package fertig;
import java.util.*;

public class Pascalsches_Dreieck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int n, x, y, wechsel = 1, runde;
		System.out
				.print("Wie viele Reihen sollen gezeigt werden (wenn du nun z.B.(a + b)^3, musst du auf den Grad (bei diesem Beispiel 3) eingeben)?\nEingabe: ");
		n = Integer.valueOf(in.nextLine()) - 1;
		runde = n;
		int[] eins = new int[(n + 3)];
		int[] zwei = new int[(n + 3)];
		System.out
				.print("Die 2. Spalte vom Pascalschen Dreieck: x  y\nBeim normalen Dreieck wäre x = 1 und y = 1.\nBeachte! Die beiden Variablen vertreten nicht a und b!\nGib x ein: ");
		x = Integer.valueOf(in.nextLine());
		System.out.print("Gib y ein: ");
		y = Integer.valueOf(in.nextLine());
		System.out.println(x + " " + y);
		eins[1] = x;
		eins[2] = y;
		x = 1;
		while (runde != 0) {
			if (wechsel == 1) {
				zwei[x] = eins[x] + eins[(x - 1)];
				if (zwei[x] != 0) {
					System.out.print(zwei[x] + " ");
				}
				x++;
				if (x == (n + 3)) {
					System.out.println("");
					runde--;
					wechsel = 2;
					x = 1;
				}
			} else {

				eins[x] = zwei[x] + zwei[(x - 1)];
				if (eins[x] != 0) {
					System.out.print(eins[x] + " ");
				}
				x++;
				if (x == (n + 3)) {
					runde--;
					System.out.println("");
					wechsel = 1;
					x = 1;
				}
			}
		}
	}
}
