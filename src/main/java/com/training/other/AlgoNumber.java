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
		int inf =0;
		int sup = 0;
		
		for(int i=0 ;i < tab.length-2; i++) {
			inf = tab[i+1] - tab[i];
			
		}
		return 0;
	}
	
}
