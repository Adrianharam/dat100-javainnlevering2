package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

    for (int[] tall: matrise) {
    	System.out.println(tall);
    }
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String a = "";
	
		for (int i = 0; i<matrise.length; i++) {
		for (int j = 0; j<matrise[i].length; j++) {
			a += matrise[i][j];
			
			if (j< matrise[i].length - 1) {
				a += " ";
			}}
	a += "\n";	
	}
	
	return(a);	
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] skala = new int[matrise.length][matrise[0].length];
		
		for (int i = 0; i<matrise.length; i++) {
			for (int j = 0; j<matrise[i].length; j++) {
				skala[i][j] = matrise[i][j]*tall;
			}
			
			
		}
	return skala;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		
		if(a.length != b.length) {
			return false;
		}

		for (int i = 0; i< a.length; i++) {
			if (a[i].length != b[i].length) {
				return false;
			}
			
			
			for (int j = 0; j<a[i].length; j++) {
				if (a[i][j]!=b[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
