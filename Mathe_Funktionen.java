package fertig;
import java.util.*;

public class Mathe_Funktionen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int [] auswahl = new int [17];
		String [] ergebnis = new String [15];
		int n = 0, ne = 0, nz = 0, zahl = 0, ganz;
		double a = 0, b = 0, c = 0, p, q, r, ae = 0, az = 0, ce = 0, cz = 0, nd = 0, nv, me, be = 0, mz, bz = 0, xe = 0, ye = 0, xz = 0, yz, xd, yd;
		String funktione = "";
		String funktionz = "";
		String funktiond = "";
		String zeichene = "";
		String zeichenz = "";
		String zeichend = "";
// Allgemeine Informationen zum Programm
		System.out.println("Bedienungsinformation:");
		System.out.println(" - Sie können auch mehrere Informationen verlangen. Sie müssen dafür eine Zahl eingeben, Enter drücken ");
		System.out.println("   und anschließend eine weitere Zahl angeben. Wenn sie mit den Angaben fertig sind, müssen sie '0' eingeben.");
		System.out.println(" - Definitionen der Variablen: ");
		System.out.println("    m = Steigung einer linearen Funktion");
		System.out.println("    n = y-Achsenschnittpunkt einer linearen Funktion");
		System.out.println("    y = könnte man auch mit 'f(x)' ersetzen");
		System.out.println("    a = Steigung einer quadratischen Funktion");
		System.out.println("   xs = x-Wert des Scheitelpunktes");
		System.out.println("   ys = y-Wert des Scheitelpunktes");
		System.out.println(" - Auf Grund vom Variablentyp 'double' kann es sein, dass die Konsole z.B. statt '2.7' '2.6999999999999999' auswirft.");
		System.out.println("   Sollte so ein Ergebnis auftauchen, sollten Sie auf jeden Fall misstrauisch sein.");
		System.out.println(" - Falls Sie eine Zahl mit Nachkommastellen benutzen wollen, müssen Sie das Komma mit einem Punkt ersetzen.");
		System.out.println("   z.B.: 2,469 -> 2.469");
		System.out.println(" - In der Scheitelpunktsform heißt es:");
		System.out.println("   f(x)=a(x-xs)^2 +ys");
		System.out.println("   Wenn nun in der Klammer '(x-3)' steht, bitte 3 eingeben. Würde es '(x+3)' heii0en, bitte -3 eingeben.");
		// Auswahlmöglichkeiten
		System.out.println("\n\n\nWelche Sachen wollen Sie erfahren: ");
		System.out.println("  0 = Angabe fertig");
		System.out.println("Allgemein:");
		System.out.println("  1 = Schnittpunkte von Funktionen berechnen");
		System.out.println("  2 = Kontrolle, ob ein Punkt auf einer Funktion liegt");
		System.out.println("  3 = Treffpunkt der x- und y-Achsen einer Funktion berechnen");
		System.out.println("  4 = 2 Funktionen addieren");
		System.out.println("  5 = Wertetabelle (Zahlenbereich x = -5 bis x = 5)");
		System.out.println("  6 = Funktionsgleichung mit Punkten (lineare Funktion: 2 Punkte / quadratische Funktion: 3 Punkte) berechnen");
		System.out.println("Lineare Funktionen:                          y = m*x + n");
		System.out.println("  7 = Steigung der orthogonalen Geraden einer Funktion berechnen (ohne Punkt)");
		System.out.println("  8 = Funktionsgleichung der orthogonalen Geraden einer Funktion berechnen (mit Punkt)");
		System.out.println("  9 = Schnittwinkel zwischen 2 linearen Funktionen / linearer Funktion und x-Achse");
		System.out.println(" 10 = m und P(x|y) gegeben -> b wird ausgerechnet");
		System.out.println(" 11 = b und P(x|y) gegeben -> m wird ausgerechnet");
		System.out.println("Quadratische Funktionen:                     y = a(x-xs)^2 + ys                   y = a*x^2+b*x+c");
		System.out.println(" 12 = Scheitelpunkt in Allgemeinform umberechnen / Allgemeinform in Scheitelpunktform umberechnen");
		System.out.println(" 13 = durch 2 Nullstellen und einem Punkt die Steigung berechnen");
		System.out.println("Rest: ");
		System.out.println(" 14 = Abstand zwischen 2 Punkten berechnen");
		System.out.println(" 15 = Mittelpunkt von 2 Punkten berechnen\n\n");
// Speicherung der Auswahl
		do {
			System.out.print("Angabe: ");
			auswahl[n] = Integer.valueOf(in.nextLine());
			if (auswahl[n] == 0){
				nz = 1;
			} 
			if (auswahl[n] <= 15 && 0 <= auswahl[n]){
				n = n + 1;
				ganz = 1;
			} else {
				System.out.println("Fehlerhafte Eingabe: Sie dürfen nur Zahlen zwischen 0 und 22 eingeben");
				System.out.println("Zahl wurde nicht abgespeichert, bitte geben sie eine korrekte Zahl an.");
				ganz = 0;
			}
			if (n < 16 && nz == 0){
				while (ne <= 15 && zahl == 0){
					if (n-ganz == ne){
						ne = ne + 1;
					}
					if (ne <= n){
						if (auswahl[n-ganz] == auswahl[ne]){
							System.out.println("Fehlerhafte Eingabe: Diese Angabe wurde schon gegeben.");
							System.out.println("Zahl wurde nicht abgespeichert, bitte geben sie eine korrekte Zahl an.");
							n = n - ganz;
							ne = 17;
						}
					} else {
						zahl = 1;
					}
					ne = ne + 1;
				}
				ne = 0;
				zahl = 0;
				ganz = 0;
			}
		} while (nz != 1 && n != 16);
		nz = 0;
		ne = 0;
		ganz = 0;
		n = n - 1;
// Berechnung der verlangten Informationen
		while (n != 0){
			n = n - 1;
//Allgemein
			if (auswahl[n] == 1){
				while (ne < 1 || ne > 3){
					if (nz == 0){
						System.out.print("Schnittpunkte von 2 quadratischen Funktionen\nIn welcher Form ist die 2. Funktion gegeben:\nQuadratische Funktion:\n 1: Allgemeinform (y = ax^2+bx+c)\n 2: Scheitelpunktform (y = a(x-xs)^2 + ys)\nLineare Funktion:\n 3: Lineare Funktion (y = mx + b)\nZahl: ");
					}
					if (nz == 1){
						System.out.print("Fehlerhafte Eingabe: Die eingegebene Zahl war nicht zwischen 1 und 3.\nBitte noch einmal versuchen: ");
					}
					ne = Integer.valueOf(in.nextLine());
					nz = 1;
				}
				nz = 0;
				if (ne == 1){
					System.out.print("a 1. Funktion: ");
					ae = Double.valueOf(in.nextLine());
					System.out.print("b 1. Funktion: ");
					be = Double.valueOf(in.nextLine());
					System.out.print("c 1. Funktion: ");
					ce = Double.valueOf(in.nextLine());
					if (ae == 0){
						zeichene = "";
						ganz = 1;
					} else {
						if (ae % 1 == 0){
							nz = (int) ae;
							zeichene = " " + nz + "x^2";
						} else {
							zeichene = " " + ae + "x^2";
						}
					}
					if (be == 0){
						zeichenz = "";
						if (ganz == 1){
							ganz = 2;
						} else {
							ganz = 0;
						}
					} else {
						if (be % 1 == 0){
							nz = (int) be;
							if (nz >= 0 && ganz == 0){
								zeichenz = " +" + nz + "x";
							} else {
								ganz = 0;
								zeichenz = " " + nz + "x";
							}
						} else {
							if (be >= 0 && ganz == 0){
								zeichenz = " +" + be + "x";
							} else {
								ganz = 0;
								zeichenz = " " + be + "x";
							}
						}
					}
					if (ce == 0){
						zeichend = "";
						if (ganz == 2){
							funktione = "f(x)= x-Achse";
							ganz = 3;
						} else {
							ganz = 0;
						}
					} else {
						if (ce % 1 == 0){
							nz = (int) ce;
							if (nz >= 0 && ganz == 0){
								zeichend = " +" + nz + "";
							} else {
								ganz = 0;
								zeichend = " " + nz + "";
							}
						} else {
							if (ce >= 0 && ganz == 0){
								zeichend = " +" + ce + "";
							} else {
								ganz = 0;
								zeichend = " " + ce + "";
							}
						}
					}
					if (ganz != 3){
						funktione = "f(x)= " + zeichene + "" + zeichenz +"" + zeichend + "";
					}
				}
				if (ne == 2){
					System.out.print(" a 1. Funktion: ");
					ae = Double.valueOf(in.nextLine());
					System.out.print("xs 1. Funktion: ");
					ae = Double.valueOf(in.nextLine());
					System.out.print("ys 1. Funktion: ");
					ae = Double.valueOf(in.nextLine());
					if (ae == 0){
						zeichene = "";
						ganz = 1;
					} else {
						if (ae % 1 == 0){
							nz = (int) ae;
							zeichene = " " + nz + "";
						} else {
							zeichene = " " + ae + "";
						}
					}
					if (ganz == 1){
						zeichenz = "";
						ganz = 2;
					} else {
						if (xe == 0){
							ganz = 0;
							zeichenz = "x^2";
						} else {
							ganz = 0;
							if (xe % 1 == 0){
								nz = (int) xe;
								if (nz >= 0){
									zeichenz = "(x+" + nz + ")^2";
								} else {
									zeichenz = " (x" + nz + ")^2";
								}
							} else {
								if (xe >= 0){
									zeichenz = " (x+" + xe + ")^2";
								} else {
									zeichenz = " (x" + xe + ")^2";
								}
							}
						}
					}
					if (ye == 0){
						zeichend = "";
						if (ganz == 2){
							funktione = "f(x)= x-Achse";
							ganz = 3;
						} else {
							ganz = 0;
						}
					} else {
						if (ye % 1 == 0){
							nz = (int) ye;
							if (nz >= 0 && ganz == 0){
								zeichend = " +" + nz + "";
							} else {
								ganz = 0;
								zeichend = " " + nz + "";
							}
						} else {
							if (ye >= 0 && ganz == 0){
								zeichend = " +" + ye + "";
							} else {
								ganz = 0;
								zeichend = " " + ye + "";
							}
						}
					}
					if (ganz != 3){
						funktione = "f(x)= " + zeichene + "" + zeichenz + "" + zeichend + "";
					}
					be = -2 * ae * xe;
					ce = ae * xe * xe + ye;
				}
				if (ne == 3){
					System.out.print("m 1. Funktion: ");
					me = Double.valueOf(in.nextLine());
					System.out.print("b 1. Funktion: ");
					be = Double.valueOf(in.nextLine());
					if (me == 0){
						zeichene = "";
						ganz = 1;
					} else {
						if (me % 1 == 0){
							nz = (int) me;
							zeichene = "" + nz + "x";
						} else {
							zeichene = "" + me + "x";
						}
					}
					if (be == 0){
						zeichenz = "";
						if (ganz == 1){
							funktione = "f(x)= x-Achse";
							ganz = 2;
						} else {
							ganz = 0;
						}
					} else {
						if (be % 1 == 0){
							nz = (int) be;
							if (nz >= 0 && ganz == 0){
								zeichenz = " +" + nz + "";
							} else {
								ganz = 0;
								zeichenz = " " + nz + "";
							}
						} else {
							if (be >= 0 && ganz == 0){
								zeichenz = " +" + be + "";
							} else {
								ganz = 0;
								zeichenz = " " + be + "";
							}
						}
					}
					if (ganz != 2){
						funktione = "f(x)= " + zeichene + "" + zeichenz + "";
					}
					ae = 0;
					ce = be;
					be = me;
				}
				zeichene = "";
				zeichenz = "";
				zeichend = "";
				ganz = 0;
				xe = 0;
				ye = 0;
				me = 0;
				ne = 0;
				nz = 0;
				while (ne < 1 || ne > 3){
					if (nz == 0){
						System.out.print("Schnittpunkte von 2 quadratischen Funktionen\nIn welcher Form ist die 2. Funktion gegeben:\nQuadratische Funktion:\n 1: Allgemeinform (y = ax^2+bx+c)\n 2: Scheitelpunktform (y = a(x-xs)^2 + ys)\nLineare Funktion:\n 3: Lineare Funktion (y = mx + b)\nZahl: ");
					}
					if (nz == 1){
						System.out.print("Fehlerhafte Eingabe: Die eingegebene Zahl war nicht zwischen 1 und 3.\nBitte noch einmal versuchen: ");
					}
					ne = Integer.valueOf(in.nextLine());
					nz = 1;
				}
				nz = 0;
				if (ne == 1){
					System.out.print("a 2. Funktion: ");
					az = Double.valueOf(in.nextLine());
					System.out.print("b 2. Funktion: ");
					bz = Double.valueOf(in.nextLine());
					System.out.print("c 2. Funktion: ");
					cz = Double.valueOf(in.nextLine());
					if (az == 0){
						zeichene = "";
						ganz = 1;
					} else {
						if (az % 1 == 0){
							nz = (int) az;
							zeichene = " " + nz + " x^2";
						} else {
							zeichene = " " + az + " x^2";
						}
					}
					if (bz == 0){
						zeichenz = "";
						if (ganz == 1){
							ganz = 2;
						} else {
							ganz = 0;
						}
					} else {
						if (bz % 1 == 0){
							nz = (int) bz;
							if (nz >= 0 && ganz == 0){
								zeichenz = " +" + nz + " x";
							} else {
								ganz = 0;
								zeichenz = " " + nz + " x";
							}
						} else {
							if (bz >= 0 && ganz == 0){
								zeichenz = " +" + bz + " x";
							} else {
								ganz = 0;
								zeichenz = " " + bz + " x";
							}
						}
					}
					if (cz == 0){
						zeichend = "";
						if (ganz == 2){
							funktionz = "g(x)= x-Achse";
							ganz = 3;
						} else {
							ganz = 0;
						}
					} else {
						if (cz % 1 == 0){
							nz = (int) cz;
							if (nz >= 0 && ganz == 0){
								zeichend = " +" + nz + "";
							} else {
								ganz = 0;
								zeichend = " " + nz + "";
							}
						} else {
							if (cz >= 0 && ganz == 0){
								zeichend = " +" + cz + "";
							} else {
								ganz = 0;
								zeichend = " " + cz + "";
							}
						}
					}
					if (ganz != 3){
						funktionz = "g(x)=" + zeichene + "" + zeichenz +"" + zeichend + "";
					}
				}
				if (ne == 2){
					System.out.print(" a 2. Funktion: ");
					az = Double.valueOf(in.nextLine());
					System.out.print("xs 2. Funktion: ");
					xz = Double.valueOf(in.nextLine());
					System.out.print("ys 2. Funktion: ");
					yz = Double.valueOf(in.nextLine());
					if (az == 0){
						zeichene = "";
						ganz = 1;
					} else {
						if (az % 1 == 0){
							nz = (int) az;
							zeichene = " " + nz + "";
						} else {
							zeichene = " " + az + "";
						}
					}
					if (ganz == 1){
						zeichenz = "";
						ganz = 2;
					} else {
						if (xz == 0){
							ganz = 0;
							zeichenz = "x^2";
						} else {
							if (xz % 1 == 0){
								nz = (int) xz;
								if (nz >= 0){
									zeichenz = "(x+" + nz + ")^2";
								} else {
									zeichenz = " (x" + nz + ")^2";
								}
							} else {
								if (xz >= 0){
									zeichenz = " (x+" + xz + ")^2";
								} else {
									zeichenz = " (x" + xz + ")^2";
								}
							}
						}
					}
					if (yz == 0){
						zeichend = "";
						if (ganz == 2){
							funktionz = "g(x)= x-Achse";
							ganz = 3;
						} else {
							ganz = 0;
						}
					} else {
						if (yz % 1 == 0){
							nz = (int) yz;
							if (nz >= 0 && ganz == 0){
								zeichend = " +" + nz + "";
							} else {
								ganz = 0;
								zeichend = " " + nz + "";
							}
						} else {
							if (yz >= 0 && ganz == 0){
								zeichend = " +" + yz + "";
							} else {
								ganz = 0;
								zeichend = " " + yz + "";
							}
						}
					}
					if (ganz != 3){
						funktionz = "g(x)= " + zeichene + "" + zeichenz + "" + zeichend + "";
					}
					bz = -2 * az * xz;
					cz = az * xz * xz + yz;
				}
				if (ne == 3){
					System.out.print("m 2. Funktion: ");
					mz = Double.valueOf(in.nextLine());
					System.out.print("b 2. Funktion: ");
					bz = Double.valueOf(in.nextLine());
					if (mz == 0){
						zeichene = "";
						ganz = 1;
					} else {
						if (mz % 1 == 0){
							nz = (int) mz;
							zeichene = "" + nz + " x";
						} else {
							zeichene = "" + mz + " x";
						}
					}
					if (bz == 0){
						zeichenz = "";
						if (ganz == 1){
							funktionz = "g(x)= x-Achse";
							ganz = 2;
						} else {
							ganz = 0;
						}
					} else {
						if (bz % 1 == 0){
							nz = (int) bz;
							if (nz >= 0 && ganz == 0){
								zeichenz = " +" + nz + "";
							} else {
								ganz = 0;
								zeichenz = " " + nz + "";
							}
						} else {
							if (bz >= 0 && ganz == 0){
								zeichenz = " +" + bz + "";
							} else {
								ganz = 0;
								zeichenz = " " + bz + "";
							}
						}
					}
					if (ganz != 2){
						funktionz = "g(x)= " + zeichene + "" + zeichenz + "";
					}
					az = 0;
					cz = bz;
					bz = mz;
				}
				zeichene = "";
				zeichenz = "";
				zeichend = "";
				ganz = 0;
				xz = 0;
				yz = 0;
				mz = 0;
				ne = 0;
				nz = 0;
				a = ae - az;
				b = be - bz;
				c = ce - cz;
				if (a == 0){
					 if (b == 0){
						 if (c == 0){
							 	ergebnis [zahl] = "Die Schnittpunkte der beiden Funktionen " + funktione + " und " + funktionz + ":\nEs konnte kein Schnittpunkt herausgefunden werden, weil beide Funktionen identisch sind.";
								zahl = zahl + 1;
								ne = 1;
						 } else {
							ergebnis [zahl] = "Die Schnittpunkte der beiden Funktionen " + funktione + " und " + funktionz + ":\nEs konnte kein Schnittpunkt herausgefunden werden, weil die beiden Funktionen parallel zueinander liegen.";
							zahl = zahl + 1;
							ne = 1;
						 }
					 } else {
						 if (c == 0){
							 xe = 0;
							 xz = 0;
						 } else {
							 xe = -ce / be;
							 xz = -ce / be;
						 }
					 }
				} else {
					p = b / a;
					q = c / a;
					r = p * p / 4 - q;
					if (r > 0){
						xe = -p / 2 + Math.sqrt(r);
						xz = -p / 2 - Math.sqrt(r);
					} else {
						if (q == 0){
							xe = -p / 2;
							xz = -p / 2;
						} else {
							ergebnis [zahl] = "Die Schnittpunkte der beiden Funktionen " + funktione + " und " + funktionz + ":\nWeil die PQ-Formel nicht aufgelöst werden konnte, kann man sagen, dass die beiden Funktionen keinen Schnittpunkt haben.";
							zahl = zahl + 1;
							ne = 1;
						}
					}
				}
				if (ne == 0){
					ye = ae * xe * xe + be * xe + ce;
					if (xe != xz){
						yz = az * xz * xz + bz * xz + cz;
						ergebnis [zahl] = "Die Schnittpunkte der beiden Funktionen " + funktione + " und " + funktionz + ":\nS1(" + xe + "|" + ye + ")\nS2(" + xz + "|" + yz + ")";
						zahl = zahl + 1;
					} else {
						ergebnis [zahl] = "Die Schnittpunkte der beiden Funktionen " + funktione + " und " + funktionz + ":\nS(" + xe + "|" + ye + ")";
						zahl = zahl + 1;
					}
				}
				funktione = "";
				funktionz = "";
				ne = 0;
				nz = 0;
			}
			if (auswahl[n] == 2){
				while (ne < 1 || ne > 3){
					if (nz == 0){
						System.out.print("Kontrolle, ob ein Punkt auf einer Funktion liegt\nIn welcher Form ist die Funktion gegeben:\nQuadratische Funktion:\n 1: Allgemeinform (y = ax^2+bx+c)\n 2: Scheitelpunktform (y = a(x-xs)^2 + ys)\nLineare Funktion:\n 3: Lineare Funktion (y = mx + b)\nZahl: ");
					}
					if (nz == 1){
						System.out.print("Fehlerhafte Eingabe: Die eingegebene Zahl war nicht zwischen 1 und 3.\nBitte noch einmal versuchen: ");
					}
					ne = Integer.valueOf(in.nextLine());
					nz = 1;
				}
				nz = 0;
				if (ne == 1){
					System.out.print("a Funktion: ");
					ae = Double.valueOf(in.nextLine());
					System.out.print("b Funktion: ");
					be = Double.valueOf(in.nextLine());
					System.out.print("c Funktion: ");
					ce = Double.valueOf(in.nextLine());
					if (ae == 0){
						zeichene = "";
						ganz = 1;
					} else {
						if (ae % 1 == 0){
							nz = (int) ae;
							zeichene = " " + nz + "x^2";
						} else {
							zeichene = " " + ae + "x^2";
						}
					}
					if (be == 0){
						zeichenz = "";
						if (ganz == 1){
							ganz = 2;
						} else {
							ganz = 0;
						}
					} else {
						if (be % 1 == 0){
							nz = (int) be;
							if (nz >= 0 && ganz == 0){
								zeichenz = " +" + nz + "x";
							} else {
								ganz = 0;
								zeichenz = " " + nz + "x";
							}
						} else {
							if (be >= 0 && ganz == 0){
								zeichenz = " +" + be + "x";
							} else {
								ganz = 0;
								zeichenz = " " + be + "x";
							}
						}
					}
					if (ce == 0){
						zeichend = "";
						if (ganz == 2){
							funktione = "f(x)= x-Achse";
							ganz = 3;
						} else {
							ganz = 0;
						}
					} else {
						if (ce % 1 == 0){
							nz = (int) ce;
							if (nz >= 0 && ganz == 0){
								zeichend = " +" + nz + "";
							} else {
								ganz = 0;
								zeichend = " " + nz + "";
							}
						} else {
							if (ce >= 0 && ganz == 0){
								zeichend = " +" + ce + "";
							} else {
								ganz = 0;
								zeichend = " " + ce + "";
							}
						}
					}
					if (ganz != 3){
						funktione = "f(x)= " + zeichene + "" + zeichenz +"" + zeichend + "";
					}
				}
				if (ne == 2){
					System.out.print(" a Funktion: ");
					ae = Double.valueOf(in.nextLine());
					System.out.print("xs Funktion: ");
					xe = Double.valueOf(in.nextLine());
					System.out.print("ys Funktion: ");
					ye = Double.valueOf(in.nextLine());
					if (ae == 0){
						zeichene = "";
						ganz = 1;
					} else {
						if (ae % 1 == 0){
							nz = (int) ae;
							zeichene = " " + nz + "";
						} else {
							zeichene = " " + ae + "";
						}
					}
					if (ganz == 1){
						ganz = 2;
						zeichenz = "";
					} else {
						if (xe == 0){
							ganz = 0;
							zeichenz = "x^2";
						} else {
							ganz = 0;
							if (xe % 1 == 0){
								nz = (int) xe;
								if (nz >= 0){
									zeichenz = "(x+" + nz + ")^2";
								} else {
									zeichenz = " (x" + nz + ")^2";
								}
							} else {
								if (xe >= 0){
									zeichenz = " (x+" + xe + ")^2";
								} else {
									zeichenz = " (x" + xe + ")^2";
								}
							}
						}
					}
					if (ye == 0){
						zeichend = "";
						if (ganz == 2){
							ganz = 3;
							funktione = "f(x)= x-Achse";
						} else {
							ganz = 0;
						}
					} else {
						if (ye % 1 == 0){
							nz = (int) ye;
							if (nz >= 0 && ganz == 0){
								zeichend = " +" + nz + "";
							} else {
								ganz = 0;
								zeichend = " " + nz + "";
							}
						} else {
							if (ye >= 0 && ganz == 0){
								zeichend = " +" + ye + "";
							} else {
								ganz = 0;
								zeichend = " " + ye + "";
							}
						}
					}
					if (ganz != 3){
						funktione = "f(x)= " + zeichene + "" + zeichenz + "" + zeichend + "";
					}
					be = -1 * (2 * ae * xe);
					ce = ae * xe * xe + ye;
				}
				if (ne == 3){
					System.out.print("m Funktion: ");
					me = Double.valueOf(in.nextLine());
					System.out.print("b Funktion: ");
					be = Double.valueOf(in.nextLine());
					if (me == 0){
						zeichene = "";
						ganz = 1;
					} else {
						if (me % 1 == 0){
							nz = (int) me;
							zeichene = "" + nz + "x";
						} else {
							zeichene = "" + me + "x";
						}
					}
					if (be == 0){
						zeichenz = "";
						if (ganz == 1){
							ganz = 2;
							funktione = "f(x)= x-Achse";
						} else {
							ganz = 0;
						}
					} else {
						if (be % 1 == 0){
							nz = (int) be;
							if (nz >= 0 && ganz == 0){
								zeichenz = " +" + nz + "";
							} else {
								ganz = 0;
								zeichenz = " " + nz + "";
							}
						} else {
							if (be >= 0 && ganz == 0){
								zeichenz = " +" + be + "";
							} else {
								ganz = 0;
								zeichenz = " " + be + "";
							}
						}
					}
					if (ganz != 3){
						funktione = "f(x)= " + zeichene + "" + zeichenz + "";
					}
					ae = 0;
					ce = be;
					be = me;
				}
				zeichene = "";
				zeichenz = "";
				zeichend = "";
				ne = 0;
				ganz = 0;
				System.out.print("x Punkt: ");
				xe = Double.valueOf(in.nextLine());
				System.out.print("y Punkt: ");
				ye = Double.valueOf(in.nextLine());
				nd = ae * xe * xe + be * xe + ce;
				if (xe % 1 == 0){
					nz = (int) xe;
					zeichene = "" + nz + "";
				} else {
					zeichene = "" + xe + "";
				}
				if (ye % 1 == 0){
					nz = (int) ye;
					zeichenz = "" + nz + "";
				} else {
					zeichenz = "" + ye + "";
				}
				if (nd % 1 == 0){
					nz = (int) nd;
					zeichend = "" + nz + "";
				} else {
					zeichend = "" + nd + "";
				}
				if (nd == ye){
					ergebnis [zahl] = "Kontrolle, ob der Punkt P (" + zeichene + "|" + zeichenz + ") auf der Funktion " + funktione + " liegt:\nDer Punkt liegt auf der Funktion.";
				} else {
					ergebnis [zahl] = "Kontrolle, ob der Punkt P (" + zeichene + "|" + zeichenz + ") auf der Funktion " + funktione + " liegt:\nDie Funktion trifft bei x = " + zeichene + " auf " + zeichend + " und liegt somit nicht auf der Geraden.";
				}
				zahl = zahl + 1;
				zeichene = "";
				zeichenz = "";
				zeichend = "";
			}
			if (auswahl[n] == 3){
				while (ne < 1 || ne > 3){
					if (nz == 0){
						System.out.print("Treffpunkt einer Funktion auf der x- und y-Achse berechnen\nIn welcher Form ist die Funktion gegeben:\nQuadratische Funktion:\n 1: Allgemeinform (y = ax^2+bx+c)\n 2: Scheitelpunktform (y = a(x-xs)^2 + ys)\nLineare Funktion:\n 3: Lineare Funktion (y = mx + b)\nZahl: ");
					}
					if (nz == 1){
						System.out.print("Fehlerhafte Eingabe: Die eingegebene Zahl war nicht zwischen 1 und 3.\nBitte noch einmal versuchen: ");
					}
					ne = Integer.valueOf(in.nextLine());
					nz = 1;
				}
				if (ne == 1){
					System.out.print("a Funktion: ");
					ae = Double.valueOf(in.nextLine());
					System.out.print("b Funktion: ");
					be = Double.valueOf(in.nextLine());
					System.out.print("c Funktion: ");
					ce = Double.valueOf(in.nextLine());
					if (ae == 0){
						zeichene = "";
						ganz = 1;
					} else {
						if (ae % 1 == 0){
							nz = (int) ae;
							zeichene = " " + nz + "x^2";
						} else {
							zeichene = " " + ae + "x^2";
						}
					}
					if (be == 0){
						zeichenz = "";
						if (ganz == 1){
							ganz = 2;
						} else {
							ganz = 0;
						}
					} else {
						if (be % 1 == 0){
							nz = (int) be;
							if (nz >= 0 && ganz == 0){
								zeichenz = " +" + nz + "x";
							} else {
								ganz = 0;
								zeichenz = " " + nz + "x";
							}
						} else {
							if (be >= 0 && ganz == 0){
								zeichenz = " +" + be + "x";
							} else {
								ganz = 0;
								zeichenz = " " + be + "x";
							}
						}
					}
					if (ce == 0){
						zeichend = "";
						if (ganz == 2){
							ganz = 3;
							funktione = "f(x)= x-Achse";
						} else {
							ganz = 0;
						}
					} else {
						if (ce % 1 == 0){
							nz = (int) ce;
							if (nz >= 0 && ganz == 0){
								zeichend = " +" + nz + "";
							} else {
								ganz = 0;
								zeichend = " " + nz + "";
							}
						} else {
							if (ce >= 0 && ganz == 0){
								zeichend = " +" + ce + "";
							} else {
								ganz = 0;
								zeichend = " " + ce + "";
							}
						}
					}
					if (ganz != 3){
						funktione = "f(x)= " + zeichene + "" + zeichenz +"" + zeichend + "";
					}
				}
				if (ne == 2){
					System.out.print(" a Funktion: ");
					ae = Double.valueOf(in.nextLine());
					System.out.print("xs Funktion: ");
					xe = Double.valueOf(in.nextLine());
					System.out.print("ys Funktion: ");
					ye = Double.valueOf(in.nextLine());
					if (ae == 0){
						zeichene = "";
						ganz = 1;
					} else {
						if (ae % 1 == 0){
							nz = (int) ae;
							zeichene = " " + nz + "";
						} else {
							zeichene = " " + ae + "";
						}
					}
					if (ganz == 1){
						ganz = 2;
						zeichenz = "";
					} else {
						if (xe == 0){
							zeichenz = "x^2";
						} else {
							ganz = 0;
							if (xe % 1 == 0){
								nz = (int) xe;
								if (nz >= 0){
									zeichenz = "(x+" + nz + ")^2";
								} else {
									zeichenz = " (x" + nz + ")^2";
								}
							} else {
								if (xe >= 0){
									zeichenz = " (x+" + xe + ")^2";
								} else {
									zeichenz = " (x" + xe + ")^2";
								}
							}
						}
					}
					if (ye == 0){
						zeichend = "";
						if (ganz == 2){
							ganz = 3;
							funktione = "f(x)= x-Achse";
						} else {
							ganz = 0;
						}
					} else {
						if (ye % 1 == 0){
							nz = (int) ye;
							if (nz >= 0 && ganz == 0){
								zeichend = " +" + nz + "";
							} else {
								ganz = 0;
								zeichend = " " + nz + "";
							}
						} else {
							if (ye >= 0 && ganz == 0){
								zeichend = " +" + ye + "";
							} else {
								ganz = 0;
								zeichend = " " + ye + "";
							}
						}
					}
					if (ganz != 3){
						funktione = "f(x)= " + zeichene + "" + zeichenz + "" + zeichend + "";
					}
					be = -1 * (2 * ae * xe);
					ce = ae * xe * xe + ye;
				}
				if (ne == 3){
					System.out.print("m Funktion: ");
					me = Double.valueOf(in.nextLine());
					System.out.print("b Funktion: ");
					be = Double.valueOf(in.nextLine());
					if (me == 0){
						zeichene = "";
						ganz = 1;
					} else {
						if (me % 1 == 0){
							nz = (int) me;
							zeichene = "" + nz + "x";
						} else {
							zeichene = "" + me + "x";
						}
					}
					if (be == 0){
						zeichenz = "";
						if (ganz == 1){
							ganz = 2;
							funktione = "f(x)= x-Achse";
						} else {
							ganz = 0;
						}
					} else {
						if (be % 1 == 0){
							nz = (int) be;
							if (nz >= 0 && ganz == 0){
								zeichenz = " +" + nz + "";
							} else {
								ganz = 0;
								zeichenz = " " + nz + "";
							}
						} else {
							if (be >= 0 && ganz == 0){
								zeichenz = " +" + be + "";
							} else {
								ganz = 0;
								zeichenz = " " + be + "";
							}
						}
					}
					if (ganz != 2){
						funktione = "f(x)= " + zeichene + "" + zeichenz + "";
					}
					ae = 0;
					ce = be;
					be = me;
				}
				zeichene = "";
				zeichenz = "";
				zeichend = "";
				ganz = 0;
				ne = 0;
				if (ae == 0){
					 if (be == 0){
						 if (ce == 0){
							 	ergebnis [zahl] = "Schnittpunkte der Funktion " + funktione + " mit der x- und y-Achse:\nMan kann keinen eindeutigen Schnittpunkt festlegen, weil die Funktion identisch mit der x-Achse ist.";
								zahl = zahl + 1;
								ne = 1;
						 } else {
							ergebnis [zahl] = "Schnittpunkte der Funktion " + funktione + " mit der x- und y-Achse:\nMan kann keinen Schnittpunkt festlegen, weil die Funktion parallel zur x-Achse liegt.";
							zahl = zahl + 1;
							ne = 1;
						 }
					 } else {
						 if (ce == 0){
							 xe = 0;
							 xz = 0;
						 } else {
							 xe = -ce / be;
							 xz = -ce / be;
						 }
					 }
				} else {
					p = be / ae;
					q = ce / ae;
					r = p * p / 4 - q;
					if (r > 0){
						xe = -p / 2 + Math.sqrt(r);
						xz = -p / 2 - Math.sqrt(r);
					} else {
						if (q == 0){
							xe = -p / 2;
							xz = -p / 2;
						} else {
							ergebnis [zahl] = "Schnittpunkte der Funktion " + funktione + " mit der x- und y-Achse:\nMan kann keinen eindeutigen Schnittpunkt festlegen.";
							zahl = zahl + 1;
							ne = 1;
						}
					}
				}
				zeichene = "\nx-Achsenschnittpunkte: ";
				if (ne == 0){
					ye = ae * xe * xe + be * xe + ce;
					if (ye == 0){
						zeichenz = "\n S(" + xe + "|" + ye + ")";
					} else {
						zeichene = "";
						ganz = 1;
					}
					if (xe != xz){
						yz = az * xz * xz + bz * xz + cz;
						if (yz == 0){
							zeichend = "\n S(" + xz + "|" + yz + ")";
						} else {
							zeichenz = "";
							nz = 1;
						}
						if (ganz == 1 && nz == 1){
							zeichend = "";
						}
						ergebnis [zahl] = "Schnittpunkte der Funktion " + funktione + " mit der x- und y-Achse:" + zeichene + "" + zeichenz + "" + zeichend + "\ny-Achenschnittpunkte:\n S (0|" + ce + ")";
						zahl = zahl + 1;
						ganz = 0;
						nz = 0;
					} else {
						if (zeichene.equals(-1)){
							ergebnis [zahl] = "Schnittpunkte der Funktion " + funktione + " mit der x- und y-Achse:\nMan kann keinen eindeutigen Schnittpunkt festlegen.";
							zahl = zahl + 1;
						}
						ergebnis [zahl] = "Schnittpunkte der Funktion " + funktione + " mit der x- und y-Achse:" + zeichene + "" + zeichenz + "\ny-Achenschnittpunkte:\n S (0|" + ce + ")";
						zahl = zahl + 1;
					}
				}
				funktione = "";
				zeichene = "";
				zeichenz = "";
				zeichend = "";
				ne = 0;
				
			}
			if (auswahl[n] == 4){
				while (ne < 1 || ne > 3){
					if (nz == 0){
						System.out.print("2 Funktionen addieren\nEine Funktion mit gerader Potenz und eine Funktion mit ungerader Potenz kann nicht addiert werden.\nIn welcher Form ist die 1. Funktion gegeben:\nQuadratische Funktion:\n 1: Allgemeinform (y = ax^2+bx+c)\n 2: Scheitelpunktform (y = a(x-xs)^2 + ys)\nLineare Funktion:\n 3: Lineare Funktion (y = mx + b)\nZahl: ");
					}
					if (nz == 1){
						System.out.print("Fehlerhafte Eingabe: Die eingegebene Zahl war nicht zwischen 1 und 3.\nBitte noch einmal versuchen: ");
					}
					ne = Integer.valueOf(in.nextLine());
					nz = 1;
				}
				p = ne;
				nz = 0;
				if (ne == 1){
					System.out.print("a 1. Funktion: ");
					ae = Double.valueOf(in.nextLine());
					System.out.print("b 1. Funktion: ");
					be = Double.valueOf(in.nextLine());
					System.out.print("c 1. Funktion: ");
					ce = Double.valueOf(in.nextLine());
					if (ae == 0){
						zeichene = "";
						ganz = 1;
					} else {
						if (ae % 1 == 0){
							nz = (int) ae;
							zeichene = " " + nz + "x^2";
						} else {
							zeichene = " " + ae + "x^2";
						}
					}
					if (be == 0){
						zeichenz = "";
						if (ganz == 1){
							ganz = 2;
						} else {
							ganz = 0;
						}
					} else {
						if (be % 1 == 0){
							nz = (int) be;
							if (nz >= 0 && ganz == 0){
								zeichenz = " +" + nz + "x";
							} else {
								ganz = 0;
								zeichenz = " " + nz + "x";
							}
						} else {
							if (be >= 0 && ganz == 0){
								zeichenz = " +" + be + "x";
							} else {
								ganz = 0;
								zeichenz = " " + be + "x";
							}
						}
					}
					if (ce == 0){
						zeichend = "";
						if (ganz == 2){
							ganz = 3;
							funktione = "f(x)= x-Achse";
						} else {
							ganz = 0;
						}
					} else {
						if (ce % 1 == 0){
							nz = (int) ce;
							if (nz >= 0 && ganz == 0){
								zeichend = " +" + nz + "";
							} else {
								ganz = 0;
								zeichend = " " + nz + "";
							}
						} else {
							if (ce >= 0 && ganz == 0){
								zeichend = " +" + ce + "";
							} else {
								ganz = 0;
								zeichend = " " + ce + "";
							}
						}
					}
					if (ganz != 3){
						funktione = "f(x)= " + zeichene + "" + zeichenz +"" + zeichend + "";
					}
				}
				if (ne == 2){
					System.out.print(" a 1. Funktion: ");
					ae = Double.valueOf(in.nextLine());
					System.out.print("xs 1. Funktion: ");
					xe = Double.valueOf(in.nextLine());
					System.out.print("ys 1. Funktion: ");
					ye = Double.valueOf(in.nextLine());
					if (ae == 0){
						zeichene = "";
						ganz = 1;
					} else {
						if (ae % 1 == 0){
							nz = (int) ae;
							zeichene = " " + nz + "";
						} else {
							zeichene = " " + ae + "";
						}
					}
					if (ganz == 1){
						ganz = 2;
						zeichenz = "";
					} else {
						if (xe == 0){
							zeichenz = "x^2";
						} else {
							if (xe % 1 == 0){
								nz = (int) xe;
								if (nz >= 0){
									zeichenz = "(x+" +-1 * nz + ")^2";
								} else {
									zeichenz = " (x" +-1 * nz + ")^2";
								}
							} else {
								if (xe >= 0){
									zeichenz = " (x+" +-1 * xe + ")^2";
								} else {
									zeichenz = " (x" +-1 * xe + ")^2";
								}
							}
						}
					}
					if (ye == 0){
						zeichend = "";
						if (ganz == 2){
							funktione = "f(x)= x-Achse";
						} else {
							ganz = 0;
						}
					} else {
						if (ye % 1 == 0){
							nz = (int) ye;
							if (nz >= 0 && ganz == 0){
								zeichend = " +" + nz + "";
							} else {
								ganz = 0;
								zeichend = " " + nz + "";
							}
						} else {
							if (ye >= 0 && ganz == 0){
								zeichend = " +" + ye + "";
							} else {
								ganz = 0;
								zeichend = " " + ye + "";
							}
						}
					}
					if (ganz != 3){
						funktione = "f(x)= " + zeichene + "" + zeichenz + "" + zeichend + "";
					}
					be = -2 * ae * xe;
					ce = ae * xe * xe + ye;
				}
				if (ne == 3){
					System.out.print("m 1. Funktion: ");
					me = Double.valueOf(in.nextLine());
					System.out.print("b 1. Funktion: ");
					be = Double.valueOf(in.nextLine());
					if (me == 0){
						zeichene = "";
						ganz = 1;
					} else {
						if (me % 1 == 0){
							nz = (int) me;
							zeichene = "" + nz + "x";
						} else {
							zeichene = "" + me + "x";
						}
					}
					if (be == 0){
						zeichenz = "";
						if (ganz == 1){
							ganz = 2;
							funktione = "f(x)= x-Achse";
						} else {
							ganz = 0;
						}
					} else {
						if (be % 1 == 0){
							nz = (int) be;
							if (nz >= 0 && ganz == 0){
								zeichenz = " +" + nz + "";
							} else {
								ganz = 0;
								zeichenz = " " + nz + "";
							}
						} else {
							if (be >= 0 && ganz == 0){
								zeichenz = " +" + be + "";
							} else {
								ganz = 0;
								zeichenz = " " + be + "";
							}
						}
					}
					if (ganz != 2){
						funktione = "f(x)= " + zeichene + "" + zeichenz + "";
					}
					ae = 0;
					ce = be;
					be = me;
				}
				zeichene = "";
				zeichenz = "";
				zeichend = "";
				ganz = 0;
				ne = 0;
				nz = 0;
				while (ne < 1 || ne > 3){
					if (nz == 0){
						System.out.print("2 Funktionen addieren\nEine Funktion mit gerader Potenz und eine Funktion mit ungerader Potenz kann nicht addiert werden.\nIn welcher Form ist die 2. Funktion gegeben:\nQuadratische Funktion:\n 1: Allgemeinform (y = ax^2+bx+c)\n 2: Scheitelpunktform (y = a(x-xs)^2 + ys)\nLineare Funktion:\n 3: Lineare Funktion (y = mx + b)\nZahl: ");
					}
					if (nz == 1){
						System.out.print("Fehlerhafte Eingabe: Die eingegebene Zahl war nicht zwischen 1 und 3.\nBitte noch einmal versuchen: ");
					}
					ne = Integer.valueOf(in.nextLine());
					nz = 1;
				}
				q = ne;
				nz = 0;
				if (ne == 1){
					System.out.print("a 2. Funktion: ");
					az = Double.valueOf(in.nextLine());
					System.out.print("b 2. Funktion: ");
					bz = Double.valueOf(in.nextLine());
					System.out.print("c 2. Funktion: ");
					cz = Double.valueOf(in.nextLine());
					if (az == 0){
						zeichene = "";
						ganz = 1;
					} else {
						if (az % 1 == 0){
							nz = (int) az;
							zeichene = " " + nz + "x^2";
						} else {
							zeichene = " " + az + "x^2";
						}
					}
					if (bz == 0){
						zeichenz = "";
						if (ganz == 1){
							zeichenz = "";
							ganz = 2;
						} else {
							ganz = 0;
						}
					} else {
						if (bz % 1 == 0){
							nz = (int) bz;
							if (nz >= 0 && ganz == 0){
								zeichenz = " +" + nz + "x";
							} else {
								ganz = 0;
								zeichenz = " " + nz + "x";
							}
						} else {
							if (bz >= 0 && ganz == 0){
								zeichenz = " +" + bz + "x";
							} else {
								ganz = 0;
								zeichenz = " " + bz + "x";
							}
						}
					}
					if (cz == 0){
						zeichend = "";
						if (ganz == 2){
							funktionz = "g(x)= x-Achse";
							ganz = 3;
						} else {
							ganz = 0;
						}
					} else {
						if (cz % 1 == 0){
							nz = (int) cz;
							if (nz >= 0 && ganz == 0){
								zeichend = " +" + nz + "";
							} else {
								ganz = 0;
								zeichend = " " + nz + "";
							}
						} else {
							if (cz >= 0 && ganz == 0){
								zeichend = " +" + cz + "";
							} else {
								ganz = 0;
								zeichend = " " + cz + "";
							}
						}
					}
					funktionz = "g(x)= " + zeichene + "" + zeichenz +"" + zeichend + "";
				}
				if (ne == 2){
					System.out.print(" a 2. Funktion: ");
					az = Double.valueOf(in.nextLine());
					System.out.print("xs 2. Funktion: ");
					xz = Double.valueOf(in.nextLine());
					System.out.print("ys 2. Funktion: ");
					yz = Double.valueOf(in.nextLine());
					if (az == 0){
						zeichene = "";
						ganz = 1;
					} else {
						if (az % 1 == 0){
							nz = (int) az;
							zeichene = " " + nz + "";
						} else {
							zeichene = " " + az + "";
						}
					}
					if (ganz == 1){
						ganz = 2;
						zeichenz = "";
					} else {
						if (xz == 0){
							zeichenz = "x^2";
						} else {
							if (xz % 1 == 0){
								nz = (int) xz;
								if (nz >= 0 && ganz == 0){
									zeichenz = "(x+" + nz + ")^2";
								} else {
									ganz = 0;
									zeichenz = "(x" + nz + ")^2";
								}
							} else {
								if (xz >= 0 && ganz == 0){
									zeichenz = "(x+" + xz + ")^2";
								} else {
									ganz = 0;
									zeichenz = "(x" + xz + ")^2";
								}
							}
						}
					}
					if (yz == 0){
						zeichend = "";
						if (ganz == 2){
							ganz = 3;
							funktionz = "g(x)= x-Achse";
						} else {
							ganz = 0;
						}
					} else {
						if (yz % 1 == 0){
							nz = (int) yz;
							if (nz >= 0 && ganz == 0){
								zeichend = " +" + nz + "";
							} else {
								ganz = 0;
								zeichend = " " + nz + "";
							}
						} else {
							if (yz >= 0 && ganz == 0){
								zeichend = " +" + yz + "";
							} else {
								ganz = 0;
								zeichend = " " + yz + "";
							}
						}
					}
					if (ganz != 3){
						funktionz = "g(x)= " + zeichene + "" + zeichenz + "" + zeichend + "";
					}
					bz = -2 * az * xz;
					cz = az * xz * xz + yz;
				}
				if (ne == 3){
					System.out.print("m 2. Funktion: ");
					mz = Double.valueOf(in.nextLine());
					System.out.print("b 2. Funktion: ");
					bz = Double.valueOf(in.nextLine());
					if (mz == 0){
						zeichene = "";
						ganz = 1;
					} else {
						if (mz % 1 == 0){
							nz = (int) mz;
							zeichene = "" + nz + "x";
						} else {
							zeichene = "" + mz + "x";
						}
					}
					if (bz == 0){
						zeichenz = "";
						if (ganz == 1){
							ganz = 2;
							funktionz = "g(x)= x-Achse";
						} else {
							ganz = 0;
						}
					} else {
						if (bz % 1 == 0){
							nz = (int) bz;
							if (nz >= 0 && ganz == 0){
								zeichenz = " +" + nz + "";
							} else {
								ganz = 0;
								zeichenz = " " + nz + "";
							}
						} else {
							if (bz >= 0 && ganz == 0){
								zeichenz = " +" + bz + "";
							} else {
								ganz = 0;
								zeichenz = " " + bz + "";
							}
						}
					}
					if (ganz != 2){
						funktionz = "g(x)= " + zeichene + "" + zeichenz + "";
					}
					az = 0;
					cz = bz;
					bz = mz;
				}
				zeichene = "";
				zeichenz = "";
				zeichend = "";
				ganz = 0;
				ne = 0;
				nz = 0;
				if ((p == 1 && q == 3) || (p == 2 && q == 3) || (p == 3 && q == 1) || (p == 3 && q == 2)){
					ergebnis [zahl] = "Addition der beiden Funktionen " + funktione + " und " + funktionz + ":\nWeil der eine Exponent gerade ist und der andere Exponent ungerade, konnte die Rechnung nicht durchgeführt werden.";
				} else {
					a = ae + az;
					b = be + bz;
					c = ce + cz;
					if (p == 3 && q == 3){
						me = b;
						be = c;
						if (me == 0){
							zeichene = "";
						} else {
							if (me % 1 == 0){
								ne = (int) me;
								zeichene = "" + ne + "x";
							} else {
								zeichene = "" + me + "x";
							}
						}
						if (be == 0){
							zeichenz = "";
						} else {
							if (be % 1 == 0){
								nz = (int) be;
								if (nz >= 0){
									zeichenz = " +" + nz + "";
								} else {
									zeichenz = " " + nz + "";
								}
							} else {
								if (be >= 0){
									zeichenz = " +" + be + "";
								} else {
									zeichenz = " " + be + "";
								}
							}
						}
						ergebnis [zahl] = "Addition der beiden Funktionen " + funktione + " und " + funktionz + ":\nDie Addition der beiden Funktionen beträgt als Funktionsgleichung h(x)=" + zeichene + "" + zeichenz + "";
					} else {
						if (a != 0){
							zeichene = "" + a + "x^2";
						}
						if (b >= 0){
							zeichenz = "+";
						}
						if (c >= 0){
							zeichend = "+";
						}
						zeichene = "";
						zeichenz = "";
						zeichend = "";
						if (a != 0){
							zeichene = "" + a + "";
						}
						if ((b/a) < 0){
							zeichenz = "-";
						} else {
							zeichenz = "+";
						}
						xe = b / (2 * a);
						if (xe < 0){
							xe = xe * -1;
						}
						ye = -1 * a * (b / (2 * a)) * (b / (2 * a)) + c;
						if (ye >= 0){
							zeichend = "+";
						}
						ergebnis [zahl] = "Addition der beiden Funktionen " + funktione + " und " + funktionz + ":\nDie Addition der beiden Funktionen beträgt als Funktionsgleichung h(x)=" + zeichene + "(x" + zeichenz + "" + xe + ")^2 " + zeichend + "" + ye + ".";
					}
				}
				zahl = zahl + 1;
				zeichene = "";
				zeichenz = "";
				zeichend = "";
				funktione = "";
				funktionz = "";
				p = 0;
				q = 0;
				ne = 0;
				nz = 0;
				funktione = "";
				funktionz = "";
			}
			if (auswahl[n] == 5){
				while (ne < 1 || ne > 3){
					if (nz == 0){
						System.out.print("Wertetabelle (Zahlenbereich x = -5 bis x = 5)\nIn welcher Form ist die Funktion gegeben:\nQuadratische Funktion:\n 1: Allgemeinform (y = ax^2+bx+c)\n 2: Scheitelpunktform (y = a(x-xs)^2 + ys)\nLineare Funktion:\n 3: Lineare Funktion (y = mx + b)\nZahl: ");
					}
					if (nz == 1){
						System.out.print("Fehlerhafte Eingabe: Die eingegebene Zahl war nicht zwischen 1 und 3.\nBitte noch einmal versuchen: ");
					}
					ne = Integer.valueOf(in.nextLine());
					nz = 1;
				}
				nz = 0;
				if (ne == 1){
					System.out.print("a Funktion: ");
					ae = Double.valueOf(in.nextLine());
					System.out.print("b Funktion: ");
					be = Double.valueOf(in.nextLine());
					System.out.print("c Funktion: ");
					ce = Double.valueOf(in.nextLine());
					if (ae == 0){
						zeichene = "";
						ganz = 1;
					} else {
						if (ae % 1 == 0){
							nz = (int) ae;
							zeichene = " " + nz + " x^2";
						} else {
							zeichene = " " + ae + " x^2";
						}
					}
					if (be == 0){
						zeichenz = "";
						if (ganz == 1){
							ganz = 2;
						} else {
							ganz = 0;
						}
					} else {
						if (be % 1 == 0){
							nz = (int) be;
							if (nz >= 0 && ganz == 0){
								zeichenz = " +" + nz + " x";
							} else {
								ganz = 0;
								zeichenz = " " + nz + " x";
							}
						} else {
							if (be >= 0 && ganz == 0){
								zeichenz = " +" + be + " x";
							} else {
								ganz = 0;
								zeichenz = " " + be + " x";
							}
						}
					}
					if (ce == 0){
						zeichend = "";
						if (ganz == 2){
							funktione = "f(x)= x-Achse";
							ganz = 3;
						} else {
							ganz = 0;
						}
					} else {
						if (ce % 1 == 0){
							nz = (int) ce;
							if (nz >= 0 && ganz == 0){
								zeichend = " +" + nz + "";
							} else {
								ganz = 0;
								zeichend = " " + nz + "";
							}
						} else {
							if (ce >= 0 && ganz == 0){
								zeichend = " +" + ce + "";
							} else {
								ganz = 0;
								zeichend = " " + ce + "";
							}
						}
					}
					if (ganz != 3){
						funktione = "f(x)=" + zeichene + "" + zeichenz +"" + zeichend + "";
					}
				}
				if (ne == 2){
					System.out.print("a Funktion: ");
					ae = Double.valueOf(in.nextLine());
					System.out.print("xs Funktion: ");
					xe = Double.valueOf(in.nextLine());
					System.out.print("ys Funktion: ");
					ye = Double.valueOf(in.nextLine());
					if (ae == 0){
						zeichene = "";
						ganz = 1;
					} else {
						if (ae % 1 == 0){
							nz = (int) ae;
							zeichene = " " + nz + "";
						} else {
							zeichene = " " + ae + "";
						}
					}
					if (ganz == 1){
						ganz = 2;
						zeichenz = "";
					} else {
						if (xe == 0){
							zeichenz = "x^2";
						} else {
							if (xe % 1 == 0){
								nz = (int) xe;
								if (nz >= 0){
									zeichenz = "(x+" +-1 * nz + ")^2";
								} else {
									zeichenz = " (x" +-1 * nz + ")^2";
								}
							} else {
								if (xe >= 0){
									zeichenz = " (x+" +-1 * xe + ")^2";
								} else {
									zeichenz = " (x" +-1 * xe + ")^2";
								}
							}
						}
					}
					if (ye == 0){
						zeichend = "";
						if (ganz == 2){
							funktione = "f(x)= x-Achse";
						} else {
							ganz = 0;
						}
					} else {
						if (ye % 1 == 0){
							nz = (int) ye;
							if (nz >= 0 && ganz == 0){
								zeichend = " +" + nz + "";
							} else {
								ganz = 0;
								zeichend = " " + nz + "";
							}
						} else {
							if (ye >= 0 && ganz == 0){
								zeichend = " +" + ye + "";
							} else {
								ganz = 0;
								zeichend = " " + ye + "";
							}
						}
					}
					if (ganz != 3){
						funktione = "f(x)= " + zeichene + "" + zeichenz + "" + zeichend + "";
					}
					be = -2 * ae * xe;
					ce = xe * xe + ye;
				}
				if (ne == 3){
					System.out.print("m 1. Funktion: ");
					me = Double.valueOf(in.nextLine());
					System.out.print("b 1. Funktion: ");
					be = Double.valueOf(in.nextLine());
					if (me == 0){
						zeichene = "";
						ganz = 1;
					} else {
						if (me % 1 == 0){
							nz = (int) me;
							zeichene = "" + nz + "x";
						} else {
							zeichene = "" + me + "x";
						}
					}
					if (be == 0){
						zeichenz = "";
						if (ganz == 1){
							ganz = 2;
							funktione = "f(x)= x-Achse";
						} else {
							ganz = 0;
						}
					} else {
						if (be % 1 == 0){
							nz = (int) be;
							if (nz >= 0 && ganz == 0){
								zeichenz = " +" + nz + "";
							} else {
								ganz = 0;
								zeichenz = " " + nz + "";
							}
						} else {
							if (be >= 0 && ganz == 0){
								zeichenz = " +" + be + "";
							} else {
								ganz = 0;
								zeichenz = " " + be + "";
							}
						}
					}
					if (ganz != 2){
						funktione = "f(x)= " + zeichene + "" + zeichenz + "";
					}
					ae = 0;
					ce = be;
					be = me;
				}
				zeichene = "";
				zeichenz = "";
				zeichend = "";
				ergebnis [zahl] = "Wertetabelle von x = -5 bis x = 5 bei der Funktion " + funktione + "\n x  y\n -5 " + (ae * 25 + be * (-5) + ce) + "\n -4 " + (ae * 16 + be * (-4) + ce) + "\n -3 " + (ae * 9 + be * (-3) + ce) + "\n -2 " + (ae * 4 + be * (-2) + ce) + "\n -1 " + (ae + be * (-1) + ce) + "\n 0  " + ce + "\n 1  " + (ae + be + ce) + "\n 2  " + (ae * 4 + be * 2 + ce) + "\n 3  " + (ae * 9 + be * 3 + ce) + "\n 4  " + (ae * 16 + be * 4 + ce) + "\n 5  " + (ae * 25 + be * 5 + ce) + "";
				zahl = zahl + 1;
				ne = 0;
				nz = 0;
			}
			if (auswahl[n] == 6){
				while (ne < 1 || ne > 3){
					if (nz == 0){
						System.out.print("Funktionsgleichung mit Punkten (lineare Funktion: 2 Punkte / quadratische Funktion: 3 Punkte) berechnen\nIn welcher Form soll das Ergebnis gegeben werden:\nQuadratische Funktion (es werden 3 Punkte benötigt):\n 1: Allgemeinform (y = ax^2+bx+c)\n 2: Scheitelpunktform (y = a(x-xs)^2 + ys)\nLineare Funktion (es werden 2 Punkte benötigt):\n 3: Lineare Funktion (y = mx + b)\nZahl: ");
					}
					if (nz == 1){
						System.out.print("Fehlerhafte Eingabe: Die eingegebene Zahl war nicht zwischen 1 und 3.\nBitte noch einmal versuchen: ");
					}
					ne = Integer.valueOf(in.nextLine());
					nz = 1;
				}
				nz = 0;
				System.out.print("x 1. Punkt: ");
				xe = Double.valueOf(in.nextLine());
				System.out.print("y 1. Punkt: ");
				ye = Double.valueOf(in.nextLine());
				System.out.print("x 2. Punkt: ");
				xz = Double.valueOf(in.nextLine());
				System.out.print("y 2. Punkt: ");
				yz = Double.valueOf(in.nextLine());
				if (xe % 1 == 0){
					nz = (int) xe;
					zeichene = "" + nz + "";
				} else {
					zeichene = "" + xe + "";
				}
				if (ye % 1 == 0){
					nz = (int) ye;
					zeichenz = "" + nz + "";
				} else {
					zeichenz = "" + ye + "";
				}
				funktione = "P(" + zeichene + "|" + zeichenz + ")";
				if (xz % 1 == 0){
					nz = (int) xz;
					zeichene = "" + nz + "";
				} else {
					zeichene = "" + xz + "";
				}
				if (yz % 1 == 0){
					nz = (int) yz;
					zeichenz = "" + nz + "";
				} else {
					zeichenz = "" + yz + "";
				}
				funktionz = "Q(" + zeichene + "|" + zeichenz + ")";
				zeichene = "";
				zeichenz = "";
				if (ne == 1 || ne == 2){
					System.out.print("x 3. Punkt: ");
					xd = Double.valueOf(in.nextLine());
					System.out.print("y 3. Punkt: ");
					yd = Double.valueOf(in.nextLine());
					if (xd % 1 == 0){
						nz = (int) xd;
						zeichene = "" + nd + "";
					} else {
						zeichene = "" + xe + "";
					}
					if (yd % 1 == 0){
						nz = (int) yd;
						zeichenz = "" + nd + "";
					} else {
						zeichenz = "" + ye + "";
					}
					funktiond = "P(" + zeichene + "|" + zeichenz + ")";
					zeichene = "";
					zeichenz = "";
					a = -1 * ((yz - ye) * (xz - xd) - (yd - yz) * (xe - xz)) / ((xe * xe - xz * xz) * (xz - xd) - (xz * xz - xd * xd) * (xe - xz));
					b = -1 * (a * (xe * xe - xz * xz) + yz - ye) / (xe - xz);
					c = -1 * (a * xe * xe + b * xe - ye);
					if (ne == 1){
						if (a == 0){
							zeichene = "";
							ganz = 1;
						} else {
							if (a % 1 == 0){
								nz = (int) a;
								zeichene = "" + nz + "x^2";
							} else {
								zeichene = "" + a + "x^2";
							}
						}
						if (b == 0){
							zeichenz = "";
							if (ganz == 1){
								ganz = 2;
							} else {
								ganz = 0;
							}
						} else {
							if (b % 1 == 0){
								nz = (int) b;
								if (nz >= 0 && ganz == 0){
									zeichenz = " +" + nz + "x";
								} else {
									ganz = 0;
									zeichenz = " " + nz + "x";
								}
							} else {
								if (b >= 0 && ganz == 0){
									zeichenz = " +" + b + "x";
								} else {
									ganz = 0;
									zeichenz = " " + b + "x";
								}
							}
						}
						if (c == 0){
							zeichend = "";
							if (ganz == 2){
								ganz = 3;
								zeichend = " x-Achse";
							} else {
								ganz = 0;
							}
						} else {
							if (c % 1 == 0){
								nz = (int) c;
								if (nz >= 0 && ganz == 0){
									zeichend = " +" + nz + "";
								} else {
									ganz = 0;
									zeichend = " " + nz + "";
								}
							} else {
								if (c >= 0 && ganz == 0){
									zeichend = " +" + c + "";
								} else {
									ganz = 0;
									zeichend = " " + c + "";
								}
							}
						}
						ergebnis [zahl] = "Eine quadratische Funktion mit Hilfe der 3 Punkte " + funktione + ", " + funktionz + "\n und " + funktiond + " bestimmen:\nf(x)=" + zeichene + "" + zeichenz + "" + zeichend + "";
						zahl = zahl + 1;
					} if (ne == 2){
						nd = b / (2 * a);
						nv = -a * (b / (2 * a)) * (b / (2 * a)) + c;
						if (b/a < 0){
							zeichend = "-";
						}
						if (b/a > 0){
							zeichend = "+";
						}
						if (nd < 0){
							nd = nd * -1;
						}
						if (a == 0){
							zeichene = "";
							ganz = 1;
						} else {
							if (a % 1 == 0){
								nz = (int) a;
								zeichene = "" + nz + "";
							} else {
								zeichene = "" + a + "";
							}
						}
						if (ganz == 1){
							ganz = 2;
							zeichenz = "";
						} else {
							if (nd == 0){
								zeichenz = "x^2";
							} else {
								if (nd % 1 == 0){
									nz = (int) nd;
									zeichenz = " (x" + zeichend + "" + nz + ")^2";
								} else {
									zeichenz = " (x" + zeichend + "" + nd + ")^2";
								}
							}
						}
						zeichend = "";
						if (nv == 0){
							zeichend = "";
							if (ganz == 2){
								zeichend = " x-Achse";
							} else {
								ganz = 0;
							}
						} else {
							if (nv % 1 == 0){
								nz = (int) nv;
								if (nz >= 0 && ganz == 0){
									zeichend = " +" + nz + "";
								} else {
									ganz = 0;
									zeichend = " " + nz + "";
								}
							} else {
								if (nv >= 0 && ganz == 0){
									zeichend = " +" + nv + "";
								} else {
									ganz = 0;
									zeichend = " " + nv + "";
								}
							}
						}
						ergebnis [zahl] = "Eine quadratische Funktion mit Hilfe der 3 Punkte " + funktione + ", " + funktionz + "\n und " + funktiond + " bestimmen:\nf(x)=" + zeichene + "" + zeichenz + "" + zeichend + "";
						zahl = zahl + 1;
					}
				}
				if (ne == 3){
					me = (yz - ye)/(xz - xe);
					be = -me * xe + ye;
					if (me == 0){
						zeichene = "";
						ganz = 1;
					} else {
						if (me % 1 == 0){
							nz = (int) me;
							zeichene = "" + nz + "x";
						} else {
							zeichene = "" + me + "x";
						}
					}
					if (be == 0){
						zeichenz = "";
						if (ganz == 1){
							ganz = 2;
							zeichenz = " x-Achse";
						} else {
							ganz = 0;
						}
					} else {
						if (be % 1 == 0){
							nz = (int) be;
							if (nz >= 0 && ganz == 0){
								zeichenz = " +" + nz + "";
							} else {
								ganz = 0;
								zeichenz = " " + nz + "";
							}
						} else {
							if (be >= 0 && ganz == 0){
								zeichenz = " +" + be + "";
							} else {
								ganz = 0;
								zeichenz = " " + be + "";
							}
						}
					}
					ergebnis [zahl] = "Funktionsgleichung, die durch die beiden Punkte " + funktione +" und " + funktionz + " herausgefunden werden:\nf(x) = " + zeichene + "" + zeichenz + "";
					zahl = zahl + 1;
				}
				funktione = "";
				funktionz = "";
				funktiond = "";
				zeichene = "";
				zeichenz = "";
				zeichend = "";
				ganz = 0;
				ne = 0;
				nz = 0;
				nd = 0;
				nv = 0;
			}
// Lineare Funktionen
			if (auswahl[n] == 7){
				System.out.print("Steigung der orthogonalen Geraden einer Funktion berechnen (ohne Punkt)\nm Funktion: ");
				me = Double.valueOf(in.nextLine());
				mz = -1 / me;
				if (me % 1 == 0){
					nz = (int) me;
					zeichene = "" + nz + "";
				} else {
					zeichene = "" + me + "";
				}
				if (mz % 1 == 0){
					nz = (int) mz;
					zeichenz = "" + nz + "";
				} else {
					zeichenz = "" + mz + "";
				}
				ergebnis [zahl] = "Die Steigung der Geraden, welche orthogonal zur Funktion mit der Steigung m = " + zeichene + " liegt, beträgt:\nm = " + zeichenz + "";
				zahl = zahl + 1;
				zeichene = "";
				zeichenz = "";
				ne = 0;
				nz = 0;
			}
			if (auswahl[n] == 8){
				System.out.print("Funktionsgleichung der orthogonalen Geraden einer Funktion berechnen (mit Punkt)\nm Funktion: ");
				me = Double.valueOf(in.nextLine());
				System.out.print("Nun wird noch ein Punkt benötigt, wo die orthogonale Gerade durchläuft:\nx Punkt: ");
				xe = Double.valueOf(in.nextLine());
				System.out.print("y Punkt: ");
				ye = Double.valueOf(in.nextLine());
				mz = -1 / me;
				bz = -mz * xe + ye;
				if (me == 0){
					zeichene = "";
				} else {
					if (me % 1 == 0){
						nz = (int) me;
						zeichene = "" + nz + "";
					} else {
						zeichene = "" + me + "";
					}
				}
				if (mz == 0){
					zeichenz = "";
					ganz = 1;
				} else {
					if (mz % 1 == 0){
						nz = (int) mz;
						zeichenz = "" + nz + "x";
					} else {
						zeichenz = "" + mz + "x";
					}
				}
				if (bz == 0){
					zeichend = "";
					if (ganz == 1){
						ganz = 2;
						funktione = " x-Achse";
					} else {
						ganz = 0;
					}
				} else {
					if (bz % 1 == 0){
						nz = (int) bz;
						if (nz >= 0 && ganz == 0){
							zeichend = " +" + nz + "";
						} else {
							ganz = 0;
							zeichend = " " + nz + "";
						}
					} else {
						if (bz >= 0 && ganz == 0){
							zeichend = " +" + bz + "";
						} else {
							ganz = 0;
							zeichend = " " + bz + "";
						}
					}
				}
				if (ganz != 2){
					funktione = "" + zeichenz + "" + zeichend + "";
				}
				if (xe % 1 == 0){
					nz = (int) xe;
					zeichenz = "" + nz + "";
				} else {
					zeichenz = "" + xe + "";
				}
				if (ye % 1 == 0){
					nz = (int) ye;
					zeichend = "" + nz + "";
				} else {
					zeichend = "" + ye + "";
				}
				ergebnis [zahl] = "Die Funktionsgleichung der Geraden, welche orthogonal zur Funktion mit der\n Steigung m = " + zeichene + " liegt und den Punkt P (" + zeichenz + "|" + zeichend + ") trifft, ist:\nf(x)=" + funktione + "";
				zahl = zahl + 1;
				zeichene = "";
				zeichenz = "";
				zeichend = "";
				funktione = "";
				ganz = 0;
			}
			if (auswahl[n] == 9){
				System.out.print("Schnittwinkel zwischen 2 linearen Funktionen\nWenn der Schnittwinkel zwischen x-Achse und einer linearen Funktion bestimmt werden soll, bitte bei einer\n der Steigungen m = 0 angeben.\nm 1. Funktion: ");
				me = Double.valueOf(in.nextLine());
				System.out.print("m 2. Funktion: ");
				mz = Double.valueOf(in.nextLine());
				nd = Math.toDegrees(Math.atan(me)) - Math.toDegrees(Math.atan(mz));
				if (nd < 0){
					nd = nd * (-1);
				}
				if (me % 1 == 0){
					nz = (int) me;
					zeichene = "" + nz + "";
				} else {
					zeichene = "" + me + "";
				}
				if (mz % 1 == 0){
					nz = (int) mz;
					zeichenz = "" + nz + "";
				} else {
					zeichenz = "" + mz + "";
				}
				if (nd % 1 == 0){
					nz = (int) nd;
					zeichend = "" + nz + "°";
				} else {
					zeichend = "" + nd + "°";
				}
				ergebnis [zahl] = "Der Schnittwinkel zwischen den beiden linearen Funktionen mit den jeweiligen Steigungen m = " + zeichene + " und m = " + zeichenz + ":\nDer Schnittwinkel beträgt " + zeichend + ".";
				zahl = zahl + 1;
				zeichene = "";
				zeichenz = "";
				zeichend = "";
				nz = 0;
			}
			if (auswahl[n] == 10){
				System.out.print("m und P(x|y) gegeben -> b wird ausgerechnet\nm Funktion: ");
				me = Double.valueOf(in.nextLine());
				System.out.print("x Punkt: ");
				xe = Double.valueOf(in.nextLine());
				System.out.print("y Punkt: ");
				ye = Double.valueOf(in.nextLine());
				be = -me * xe + ye;
				if (me % 1 == 0){
					nz = (int) me;
					zeichene = "" + nz + "";
				} else {
					zeichene = "" + me + "";
				}
				if (xe % 1 == 0){
					nz = (int) xe;
					zeichenz = "" + nz + "";
				} else {
					zeichenz = "" + xe + "";
				}
				if (ye % 1 == 0){
					nz = (int) ye;
					zeichend = "" + nz + "";
				} else {
					zeichend = "" + ye + "";
				}
				funktione = "P(" + zeichenz + "|" + zeichend + ")";
				if (be % 1 == 0){
					nz = (int) be;
					zeichend = "" + nz + "";
					if (nz >= 0){
						zeichenz = " +" + nz + "";
					} else {
						zeichenz = " " + nz + "";
					}
				} else {
					zeichend = "" + be + "";
					if (be >= 0){
						zeichenz = " +" + be + "";
					} else {
						zeichenz = " " + be + "";
					}
				}
				ergebnis [zahl] = "Der fehlende Wert b in der Funktionsgleichung f(x)=" + zeichene + "x +b , welcher durch den Punkt " + funktione + " verläuft, beträgt:\nDie komplette Funktionsgleichung beträgt f(x)=" + zeichene + "x" + zeichenz + " (b = " + zeichend + ").";
				zahl = zahl + 1;
				funktione = "";
				zeichene = "";
				zeichenz = "";
				zeichend = "";
				nz = 0;
			}
			if (auswahl[n] == 11){
				System.out.print("b und P(x|y) gegeben -> m wird ausgerechnet\nb Funktion: ");
				be = Double.valueOf(in.nextLine());
				System.out.print("x Punkt: ");
				xe = Double.valueOf(in.nextLine());
				System.out.print("y Punkt: ");
				ye = Double.valueOf(in.nextLine());
				me = (ye - be) / xe;
				if (xe % 1 == 0){
					nz = (int) xe;
					zeichene = "" + nz + "";
				} else {
					zeichene = "" + xe + "";
				}
				if (ye % 1 == 0){
					nz = (int) ye;
					zeichenz = "" + nz + "";
				} else {
					zeichenz = "" + ye + "";
				}
				funktione = "P(" + zeichene + "|" + zeichenz + ")";
				if (be % 1 == 0){
					nz = (int) be;
					if (nz >= 0){
						zeichene = " +" + nz + "";
					} else {
						zeichene = " " + nz + "";
					}
				} else {
					if (be >= 0){
						zeichene = " +" + be + "";
					} else {
						zeichene = " " + be + "";
					}
				}
				if (me % 1 == 0){
					nz = (int) me;
					zeichenz = "" + nz + "";
				} else {
					zeichenz = "" + me + "";
				}
				ergebnis [zahl] = "Der fehlende Wert m in der Funktionsgleichung f(x)=mx" + zeichene + " , welcher durch den Punkt " + funktione + " verläuft, beträgt:\nDie komplette Funktionsgleichung beträgt f(x)=" + zeichenz + "x" + zeichene + " (m = " + zeichenz + ").";
				zahl = zahl + 1;
				zeichene = "";
				zeichenz = "";
				funktione = "";
			}
//Quadratische Funktion
			if (auswahl[n] == 12){
				while (ne != 1 && ne != 2){
					if (nz == 0){
						System.out.print("Scheitelpunkt in Allgemeinform umberechnen / Allgemeinform in Scheitelpunktform umberechnen\nIn welche Richtung soll die Funktion umberechnet werden:\nQuadratische Funktion:\n 1: Allgemeinform (y = ax^2+bx+c) -> Scheitelpunktform (y = a(x-xs)^2 + ys)\n 2: Scheitelpunktform (y = a(x-xs)^2 + ys) -> Allgemeinform (y = ax^2+bx+c)\nZahl: ");
					}
					if (nz == 1){
						System.out.print("Fehlerhafte Eingabe: Die eingegebene Zahl war weder 1 noch 2.\nBitte noch einmal versuchen: ");
					}
					ne = Integer.valueOf(in.nextLine());
					nz = 1;
				}
				nz = 0;
				if (ne == 1){
					System.out.print("Allgemeinform -> Scheitelpunktsform\na Funktion: ");
					ae = Double.valueOf(in.nextLine());
					System.out.print("b Funktion: ");
					be = Double.valueOf(in.nextLine());
					System.out.print("c Funktion: ");
					ce = Double.valueOf(in.nextLine());
					xe = b / (2 * a);
					ye = -a * (b / (2 * a)) * (b / (2 * a)) + c;
					if (ae == 0){
						zeichene = "";
						ganz = 1;
					} else {
						if (ae % 1 == 0){
							nz = (int) ae;
							zeichene = "" + nz + "";
						} else {
							zeichene = "" + ae + "";
						}
					}
					if (ganz == 1){
						ganz = 2;
						zeichenz = "";
					} else {
						if (xe == 0){
							zeichenz = "x^2";
						} else {
							if (xe % 1 == 0){
								nz = (int) xe;
								if (nz >= 0){
									zeichenz = " (x+" + nz + ")^2";
								} else {
									zeichenz = " (x" + nz + ")^2";
								}
							} else {
								if (xe >= 0){
									zeichenz = " (x+" + xe + ")^2";
								} else {
									zeichenz = " (x" + xe + ")^2";
								}
							}
						}
					}
					if (ye == 0){
						zeichend = "";
						if (ganz == 2){
							ganz = 3;
							funktione = " x-Achse";
						} else {
							ganz = 0;
						}
					} else {
						if (ye % 1 == 0){
							nz = (int) ye;
							if (nz >= 0 && ganz == 0){
								zeichend = " +" + nz + "";
							} else {
								ganz = 0;
								zeichend = " " + nz + "";
							}
						} else {
							if (ye >= 0 && ganz == 0){
								zeichend = " +" + ye + "";
							} else {
								ganz = 0;
								zeichend = " " + ye + "";
							}
						}
					}
					if (ganz != 3){
						funktione = "" + zeichene + "" + zeichenz + "" + zeichend + "";
					}
					ganz = 0;
					zeichene = "";
					zeichenz = "";
					zeichend = "";
					if (ae == 0){
						zeichene = "";
						ganz = 1;
					} else {
						if (ae % 1 == 0){
							nz = (int) ae;
							zeichene = "" + nz + "x^2";
						} else {
							zeichene = "" + ae + "x^2";
						}
					}
					
					if (be == 0){
						zeichenz = "";
						if (ganz == 1){
							ganz = 2;
						} else {
							ganz = 0;
						}
					} else {
						if (be % 1 == 0){
							nz = (int) be;
							if (nz >= 0 && ganz == 0){
								zeichenz = " +" + nz + "x";
							} else {
								ganz = 0;
								zeichenz = " " + nz + "x";
							}
						} else {
							if (be >= 0 && ganz == 0){
								zeichenz = " +" + be + "x";
							} else {
								ganz = 0;
								zeichenz = " " + be + "x";
							}
						}
					}
					if (ce == 0){
						zeichend = "";
						if (ganz == 2){
							ganz = 3;
							zeichend = " x-Achse";
						} else {
							ganz = 0;
						}
					} else {
						if (ce % 1 == 0){
							nz = (int) ce;
							if (nz >= 0 && ganz == 0){
								zeichend = " +" + nz + "";
							} else {
								ganz = 0;
								zeichend = " " + nz + "";
							}
						} else {
							if (ce >= 0 && ganz == 0){
								zeichend = " +" + ce + "";
							} else {
								ganz = 0;
								zeichend = " " + ce + "";
							}
						}
					}
					ergebnis [zahl] = "Umberechnung von der allgemeinen Formel f(x)=" + zeichene + "" + zeichenz + "" + zeichend + " in die Scheitelpunktsform:\nf(x)=" + funktione + "";
					zahl = zahl + 1;
					funktione = "";
					zeichene = "";
					zeichenz = "";
					zeichend = "";
				}
				if (ne == 2){
					System.out.print("Scheitelpunktsform -> Allgemeinform\na Funktion: ");
					ae = Double.valueOf(in.nextLine());
					System.out.print("xs Funktion: ");
					xe = Double.valueOf(in.nextLine());
					System.out.print("ys Funktion: ");
					ye = Double.valueOf(in.nextLine());
					be = -2 * a * xe;
					ce = xe * xe + ye;
					if (ae == 0){
						zeichene = "";
						ganz = 1;
					} else {
						if (ae % 1 == 0){
							nz = (int) ae;
							zeichene = "" + nz + "";
						} else {
							zeichene = "" + ae + "";
						}
					}
					if (ganz == 1){
						ganz = 2;
						zeichenz = "";
					} else {
						if (xe == 0){
							zeichenz = "x^2";
						} else {
							if (xe < 0){
								xe = xe * -1;
							}
							if (b/a >= 0){
								zeichend = "+";
							} else {
								zeichend = "-";
							}
							if (xe % 1 == 0){
								nz = (int) xe;
								zeichenz = "(x" + zeichend + "" + nz + ")^2";
							} else {
								zeichenz = "(x" + zeichend + "" + xe + ")^2";
							}
						}
					}
					zeichend = "";
					if (ye == 0){
						zeichend = "";
						if (ganz == 2){
							ganz = 3;
							funktione = " x-Achse";
						} else {
							ganz = 0;
						}
					} else {
						if (ye % 1 == 0){
							nz = (int) ye;
							if (nz >= 0 && ganz == 0){
								zeichend = " +" + nz + "";
							} else {
								ganz = 0;
								zeichend = " " + nz + "";
							}
						} else {
							if (ye >= 0 && ganz == 0){
								zeichend = " +" + ye + "";
							} else {
								ganz = 0;
								zeichend = " " + ye + "";
							}
						}
					}
					if (ganz != 3){
						funktione = "" + zeichene + "" + zeichenz + "" + zeichend + "";
					}
					ganz = 0;
					zeichene = "";
					zeichenz = "";
					zeichend = "";
					if (ae == 0){
						zeichene = "";
						ganz = 1;
					} else {
						if (ae % 1 == 0){
							nz = (int) ae;
							zeichene = "" + nz + "x^2";
						} else {
							zeichene = "" + ae + "x^2";
						}
					}
					
					if (be == 0){
						zeichenz = "";
						if (ganz == 1){
							ganz = 2;
						} else {
							ganz = 0;
						}
					} else {
						if (be % 1 == 0){
							nz = (int) be;
							if (nz >= 0 && ganz == 0){
								zeichenz = " +" + nz + "x";
							} else {
								ganz = 0;
								zeichenz = " " + nz + "x";
							}
						} else {
							if (be >= 0 && ganz == 0){
								zeichenz = " +" + be + "";
							} else {
								ganz = 0;
								zeichenz = " " + be + "";
							}
						}
					}
					if (ce == 0){
						zeichend = "";
						if (ganz == 2){
							ganz = 3;
							zeichend = " x-Achse";
						} else {
							ganz = 0;
						}
					} else {
						if (ce % 1 == 0){
							nz = (int) ce;
							if (nz >= 0 && ganz == 0){
								zeichend = " +" + nz + "";
							} else {
								ganz = 0;
								zeichend = " " + nz + "";
							}
						} else {
							if (ce >= 0 && ganz == 0){
								zeichend = " +" + ce + "";
							} else {
								ganz = 0;
								zeichend = " " + ce + "";
							}
						}
					}
					ergebnis [zahl] = "Umberechnung von der Scheitelpunktform f(x)=" + funktione + " zur Allgemeinform:\f(x)=" + zeichene + "" + zeichenz + "" + zeichend + "";
					zahl = zahl + 1;
				}
				funktione = "";
				zeichene = "";
				zeichenz = "";
				zeichend = "";
				ganz = 0;
				ne = 0;
			}
			if (auswahl[n] == 13){
				System.out.print("Durch 2 Nullstellen und einem Punkt die Steigung berechnen\nx 1. Nullstelle: ");
				xz = Double.valueOf(in.nextLine());
				System.out.print("x 2. Nullstelle: ");
				xd = Double.valueOf(in.nextLine());
				System.out.print("x Punkt: ");
				xe = Double.valueOf(in.nextLine());
				System.out.print("y Punkt: ");
				ye = Double.valueOf(in.nextLine());
				ae = ye / ((xe - xd) * (xe - xz));
				if (xe % 1 == 0){
					nz = (int) xe;
					zeichene = "" + nz + "";
				} else {
					zeichene = "" + xe + "";
				}
				if (ye % 1 == 0){
					nz = (int) ye;
					zeichenz = "" + nz + "";
				} else {
					zeichenz = "" + ye + "";
				}
				funktione = "P(" + zeichene + "|" + zeichenz + ")";
				zeichene = "";
				zeichenz = "";
				if (ae % 1 == 0){
					nz = (int) ae;
					zeichene = "" + nz + "";
				} else {
					zeichene = "" + ae + "";
				}
				if (xz % 1 == 0){
					nz = (int) xz;
					zeichenz = "" + nz + "";
				} else {
					zeichenz = "" + xz + "";
				}
				if (xd % 1 == 0){
					nz = (int) xd;
					zeichend = "" + nz + "";
				} else {
					zeichend = "" + xd + "";
				}
				
				ergebnis [zahl] = "Steigung mit den beiden Nullstellen N1(" +zeichenz + "|0) und N2(" + zeichend + "|0) und dem Punkt " + funktione + " berechnen:\na = " + zeichene + "";
				zahl = zahl + 1;
				funktione = "";
				zeichene = "";
				zeichenz = "";
				zeichend = "";
			}
//Rest
			if (auswahl[n] == 14){
				System.out.print("Abstand zwischen 2 Punkten berechnen\nx 1. Punkt: ");
				xe = Double.valueOf(in.nextLine());
				System.out.print("y 1. Punkt: ");
				ye = Double.valueOf(in.nextLine());
				System.out.print("x 2. Punkt: ");
				xz = Double.valueOf(in.nextLine());
				System.out.print("y 2. Punkt: ");
				yz = Double.valueOf(in.nextLine());
				nd = Math.sqrt((xz - xe) * (xz - xe) + (xz - xe) * (xz - xe));
				if (xe % 1 == 0){
					nz = (int) xe;
					zeichene = "" + nz + "";
				} else {
					zeichene = "" + xe + "";
				}
				if (ye % 1 == 0){
					nz = (int) ye;
					zeichenz = "" + nz + "";
				} else {
					zeichenz = "" + ye + "";
				}
				funktione = "P(" + zeichene + "|" + zeichenz + ")";
				if (xz % 1 == 0){
					nz = (int) xz;
					zeichene = "" + nz + "";
				} else {
					zeichene = "" + xz + "";
				}
				if (yz % 1 == 0){
					nz = (int) yz;
					zeichenz = "" + nz + "";
				} else {
					zeichenz = "" + yz + "";
				}
				funktionz = "Q(" + zeichene + "|" + zeichenz + ")";
				if (nd % 1 == 0){
					nz = (int) nd;
					zeichene = "" + nz + "";
				} else {
					zeichene = "" + nd + "";
				}
				ergebnis [zahl] = "Abstand zwischen den beiden Punkten " + funktione + " und " + funktionz + ":\ns = " + zeichene + "";
				zahl = zahl + 1;
				funktione = "";
				funktionz = "";
				zeichene = "";
				zeichenz = "";
			}
			if (auswahl[n] == 15){
				System.out.print("Mittelpunkt von 2 Punkten berechnen\nx 1. Punkt: ");
				xe = Double.valueOf(in.nextLine());
				System.out.print("y 1. Punkt: ");
				ye = Double.valueOf(in.nextLine());
				System.out.print("x 2. Punkt: ");
				xz = Double.valueOf(in.nextLine());
				System.out.print("y 2. Punkt: ");
				yz = Double.valueOf(in.nextLine());
				xd = (xe + xz) / 2;
				yd = (ye + yz) / 2;
				if (xe % 1 == 0){
					nz = (int) xe;
					zeichene = "" + nz + "";
				} else {
					zeichene = "" + xe + "";
				}
				if (ye % 1 == 0){
					nz = (int) ye;
					zeichenz = "" + nz + "";
				} else {
					zeichenz = "" + ye + "";
				}
				funktione = "P(" + zeichene + "|" + zeichenz + ")";
				if (xz % 1 == 0){
					nz = (int) xz;
					zeichene = "" + nz + "";
				} else {
					zeichene = "" + xz + "";
				}
				if (yz % 1 == 0){
					nz = (int) yz;
					zeichenz = "" + nz + "";
				} else {
					zeichenz = "" + yz + "";
				}
				funktionz = "Q(" + zeichene + "|" + zeichenz + ")";
				if (xd % 1 == 0){
					nz = (int) xd;
					zeichene = "" + nz + "";
				} else {
					zeichene = "" + xd + "";
				}
				if (yd % 1 == 0){
					nz = (int) yd;
					zeichenz = "" + nz + "";
				} else {
					zeichenz = "" + yd + "";
				}
				ergebnis [zahl] = "Mittelpunkt von den beiden Punkten " + funktione + " und " + funktionz + ":\nM (" + zeichene + "|" + zeichenz +")";
				zahl = zahl + 1;
				funktione = "";
				funktionz = "";
				zeichene = "";
				zeichenz = "";
			}
		}
		while (zahl != 0){
			zahl = zahl - 1;
			System.out.println(ergebnis [zahl]);
		}
		System.out.println("Ende");
	}
}