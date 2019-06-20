package com.training.other;

import java.util.Arrays;



/*
 * • O(log n) Ce sont des algorithmes tr`es rapides. Exemples typiques : recherche dichotomique,
	exponentiation rapide, etc.
• O(n) (on dit lin´eaire). Typiquement quand on parcourt un tableau ou une liste un
	nombre born´e de fois : recherche dans un tableau, minimum d’une liste, etc.
• O(n log n). Vous l’avez principalement vu pour les algorithmes efficaces de tri : tri
	rapide, tri fusion, tri par tas, etc. Cette complexit´e apparaˆıt r´eguli`erement lorsque l’on fait
	du “diviser pour r´egner”.
• O(n2) (on dit quadratique). Quand on manipule des tableaux `a deux dimensions, ou
qu’on effectue un assez grand nombre de calculs sur un tableau `a une dimension : somme de
deux matrices, transpos´ee d’une matrice, tri insertion, tri bulle, tri selection, etc.
 */


/*public static void main(String[] args) {
    int[] testArray = {3, 9, 50, 15, 99, 7, 98, 65};
    int result = distClosestNumbers(testArray);
    System.out.println(result); // Expected result is 1 (the 2 closest numbers are 98 and 99)
}*/
public class AlgoNumber {


public static int distClosestNumbers(int[] tab) {
		Arrays.sort(tab);
		int result = 0;
		int a = 0;
		int b = 0;
		
		for(int i=0 ;i < tab.length-2; i++) {
			a = tab[i+1] - tab[i];
			b = tab[i+2] - tab[i+1];
			if (a <=  b) result = a;
			else result = b;
		}
		return result;
	}

/*/
 * double MonteCarlo(int n) {
  int k=0;
  for (int i=0; i<n; ++i) {
    uint64_t x=rand(), y=rand();
    if (x*x + y*y <= RR) k++;
  }
  return 4.0*k/n;
}
 */

public static double calculPi(int nbreLanceTotal) {
	
	double x = 0.0;
	double y = 0.0;
	int nbreLanceReussi = 0;
	for(int i=0; i <= nbreLanceTotal; i++ ) {
		 x = Math.random();
		 y = Math.random();
		
		if((Math.pow(x, 2)+Math.pow(y, 2)) < 1) {
			nbreLanceReussi++;
		}
		
	}

	
	return 4 * nbreLanceReussi/Double.valueOf(nbreLanceTotal);	
}

// la Dichotomie

static float fonctionTest ( float y)
{
  return 6*y*y -7*y +1 ;
}

public static double dich(float inf, float sup, float precision) {
	float milieu;
	milieu = (inf+sup)/2;
	
	while(Math.abs(sup-inf)> precision) {
		if(AlgoNumber.fonctionTest(milieu) < 0) sup = milieu;
		else inf = milieu;
		milieu = (inf+sup)/2;
	}
	
	return sup;
}



public static void main(String[] args) {
	System.out.println(AlgoNumber.calculPi(10000));
	
}
	
}
