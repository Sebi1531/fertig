package fertig;
import java.util.*;

public class Primzahlenrechner2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.print("Dieses Programm bietet folgende Optionen an:\n1: Es werden bestimmte Primzahlen benötigt (z.B. 5.-9.Primzahl)\n2: Sie wollen nur eine bestimmte Primzahl (z.B. 23. Primzahl)\nBitte geben Sie an, welche dieser Optionen Sie wollen (Zahl): ");
		int antwort = Integer.valueOf(in.nextLine());
		int [] primzahl = new int [1000000];
		if (antwort == 1){
			System.out.print("\nWelche Primzahlen wollen sie haben?\nVon: ");
			int von = Integer.valueOf(in.nextLine());
			System.out.print("Bis: ");
			int bis = Integer.valueOf(in.nextLine());
			primzahl [0] = 1;
			int mengee = 1;
			int prüfer = 1;
			int mengez = 0;
			int rest = 0;
			while (mengez <= bis){
				mengee = mengee - 1;
				rest = prüfer % primzahl [mengee];
				if (mengee == 0){
					primzahl [mengez] = prüfer;
					mengez = mengez + 1;
					if (von <= mengez && mengez <= bis){
						System.out.println(""+mengez+". Primzahl: "+prüfer+"");
					}
					prüfer = prüfer + 1;
					mengee = mengez;
				}
				if (rest == 0){
					prüfer = prüfer + 1;
					mengee = mengez;
				}
			}
			System.out.println("ENDE");
		}	
		if (antwort == 2){
			System.out.print("\nWelche Primzahl wollen sie haben?");
			int zahl = Integer.valueOf(in.nextLine());
			System.out.print("\n");
			primzahl [0] = 1;
			int mengee = 1;
			int prüfer = 1;
			int mengez = 0;
			int rest = 0;
			while (mengez <= zahl){
				mengee = mengee - 1;
				rest = prüfer % primzahl [mengee];
				if (mengee == 0){
					primzahl [mengez] = prüfer;
					mengez = mengez + 1;
					if (mengez == zahl){
						System.out.println(""+zahl+". Primzahl: "+prüfer+"");
					}
					prüfer = prüfer + 1;
					mengee = mengez;
				}
				if (rest == 0){
					prüfer = prüfer + 1;
					mengee = mengez;
				}
			}
			System.out.println("ENDE");
		}
	}

}
