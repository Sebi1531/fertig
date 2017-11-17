package fertig;
import java.util.*;

public class Primzahlenrechner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.print("Dieses Programm bietet folgende Optionen an:\n1: Es werden bestimmte Primzahlen ben�tigt (z.B. 5.-9.Primzahl)\n2: Sie wollen nur eine bestimmte Primzahl (z.B. 23. Primzahl)\n3: Sie wollen in einem bestimmten Bereich alle Primzahlen (z.B. zwischen den Zahlen 53 und 123)\nBitte geben Sie an, welche dieser Optionen Sie wollen (Zahl): ");
		int antwort = Integer.valueOf(in.nextLine());
		if (antwort == 1){
			System.out.print("\nWelche Primzahlen werden ben�tigt?\nVon: ");
			int von = Integer.valueOf(in.nextLine());
			System.out.print("Bis: ");
			int bis = Integer.valueOf(in.nextLine());
			System.out.print("\n");
			int menge = 0;
			int teiler = 3;
			int pr�fer = 1;
			int rest = 0;
			while (menge < bis){
				teiler = teiler - 2;
				rest = pr�fer % teiler;
				if (teiler == 1){
					menge = menge + 1;
					if (von <= menge && menge <= bis){
						System.out.println(""+menge+". Primzahl: "+pr�fer+"");
					}
					pr�fer = pr�fer + 2;
					teiler = pr�fer;
					rest = 1;
					}
				if (rest == 0){
					pr�fer = pr�fer + 2;
					teiler = pr�fer;
				}
			}
			System.out.println("ENDE");
		}
		if (antwort == 2){
			System.out.print("\nWelche Primzahl wird ben�tigt?");
			int primzahl = Integer.valueOf(in.nextLine());
			System.out.print("\n");
			int menge = 0;
			int teiler = 3;
			int pr�fer = 1;
			int rest = 0;
			while (menge < primzahl){
				teiler = teiler - 2;
				rest = pr�fer % teiler;
				if (teiler == 1){
					menge = menge + 1;
					if (menge == primzahl){
						System.out.println(""+primzahl+". Primzahl: "+pr�fer+"");
					}
					pr�fer = pr�fer + 2;
					teiler = pr�fer;
					rest = 1;
				}
				if (rest == 0){
					teiler = pr�fer;
					pr�fer = pr�fer + 2;
				}
			}
			System.out.println("ENDE");
		}
		if (antwort == 3){
			System.out.print("\nIn welchem Zahlenbereich sollen die Primzahlen rausgesucht werden?\nVon: ");
			int von = Integer.valueOf(in.nextLine());
			System.out.print("Bis: ");
			int bis = Integer.valueOf(in.nextLine());
			System.out.print("\n");
			int menge = 0;
			int teiler = von;
			if (teiler == 1){
				teiler = teiler + 1;
			}
			int pr�fer = von;
			int rest = pr�fer % teiler;
			if (rest == 0){
				pr�fer = pr�fer + 1;
			}
			while (von <= pr�fer && pr�fer <= bis){
				teiler = teiler - 2;
				rest = pr�fer % teiler;
				if (teiler == 1){
					menge = menge + 1;
					System.out.println(""+menge+". Primzahl: "+pr�fer+"");
					pr�fer = pr�fer + 2;
					teiler = pr�fer;
					rest = 1;
				}
				if (rest == 0){
					pr�fer = pr�fer + 2;
					teiler = pr�fer;
				}
			}
			System.out.println("ENDE");
		}
	}

}
