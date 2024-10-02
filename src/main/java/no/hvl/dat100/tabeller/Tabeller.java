package no.hvl.dat100.tabeller;

import java.util.Arrays;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i<tabell.length; i++) {
			System.out.print(tabell[i]);
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {
		
		String a = Arrays.toString(tabell);
		 a = a.replace(" ", "");
		System.out.println(a);
	return(a);
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int i = 0; i<tabell.length; i++) {
			sum = sum + tabell[i];
		}
		System.out.print(sum);
	return(sum);
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		int i = 0;
		while (i<tabell.length) {
			if (tabell[i] == tall) {
				 return true;} 
			i++;}
		return false;
		}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int tal = 0;
		int i = 0;
		while (i<tabell.length) {
			if (tabell[i] == tall) {
				 tal = tall;
				 System.out.print("Tallet er " + tal + " og finnes i tabellen på plass " + i);
				 break;
				 
			} else {
				tal = -1;
				
			}
			i++;
		
			}
		if (tal == -1) {
			System.out.println("Tallet finnes ikke i tabellen");
		}
		return(tal);
	}

	// f)
	public static int[] reverser(int[] tabell) {
			int[] retur = new int[tabell.length];
			for (int i = 0; i<tabell.length; i++) {
				retur[i] = tabell[tabell.length -1 -i];
				}
			return retur;
			}
	// g)
	public static boolean erSortert(int[] tabell) {
		for (int i = 0; i<tabell.length; i++) {
			while (i<0) {
				if (tabell[i] < tabell [i-1]) {
					return false;}}}
	
	return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] tab3 = new int[tabell1.length + tabell2.length];
		for (int i = 0; i<tabell1.length; i++) {
			tab3[i] = tabell1[i]; }
		for (int i = 0; i<tabell2.length; i++) {
			tab3[i+ tabell1.length] = tabell2[i]; }
		return tab3;
		}
		
		

	}
