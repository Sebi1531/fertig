package fertig;
import java.util.*;

public class Tagausrechnung {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		String [] tage = new String [7];
		tage [0] = "Samstag";
		tage [1] = "Sonntag";
		tage [2] = "Montag";
		tage [3] = "Dienstag";
		tage [4] = "Mittwoch";
		tage [5] = "Donnerstag";
		tage [6] = "Freitag";
		int [] monate = new int [7];
		monate [0] = 0;
		monate [1] = 1;
		monate [2] = 2;
		monate [3] = 3;
		monate [4] = 4;
		monate [5] = 5;
		monate [6] = 6;
		System.out.print("TT/MM/JJJJ\n  Geben Sie den Tag an: ");
		int tag = Integer.valueOf(in.nextLine());
		System.out.print("Geben Sie den Monat an: ");
		int monat = Integer.valueOf(in.nextLine());
		System.out.print(" Geben Sie das Jahr an: ");
		int jahr = Integer.valueOf(in.nextLine());
		int zei = tag % 7;
		int zzw = 0;
		if (monat == 4 || monat == 7){
			zzw = 0;
		}
		if (monat == 1 || monat == 10){
			zzw = 1;
		}
		if (monat == 5){
			zzw = 2;
		}
		if (monat == 8){
			zzw = 3;
		}
		if (monat == 2 || monat == 3 || monat == 12){
			zzw = 4;
		}
		if (monat == 6){
			zzw = 5;
		}
		if (monat == 9){
			zzw = 6;
		}
		int lezi = jahr % 100;
		int zdr = lezi / 12;
		int zvi = lezi - zdr * 12;
		int zfü = zvi / 4;
		int zse = 0;
		int schalte = lezi % 4;
		int schaltz = jahr % 100;
		int schaltd = jahr % 400;
		if (schaltd == 0){
			schaltz = 1;
		}
		if (schalte == 0 && schaltz != 0 && monat <= 2){
			zse = -1;
		}
		int vozi = jahr / 100;
		int zsi = 0;
		if (vozi == 16 || vozi == 20){
			zsi = -1;
		}
		if (vozi == 17 || vozi == 21){
			zsi = 4;
		}
		if (vozi == 18 || vozi == 22){
			zsi = 2;
		}
		int total = (zei + zzw + zdr + zvi + zfü + zse + zsi) % 7;
		String wochentag = tage [total];
		System.out.println("Der " + tag + "." + monat + "." + jahr + " ist ein " + wochentag + "!");
	}

}
