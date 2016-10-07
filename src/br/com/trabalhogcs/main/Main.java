package br.com.trabalhogcs.main;

import br.com.trabalhogcs.util.Matematica;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Somando valores de uma coleção.");
		
		Matematica util = new Matematica();
		int[] arrValores = new int[5];
		arrValores[0] = 1;
		arrValores[1] = 2;
		arrValores[2] = 3;
		arrValores[3] = 4;
		arrValores[4] = 5;
		
		int result = util.somatorio(arrValores);
		int result2 = util.somatorio(-1,-2,-3,-4,-5);

		System.out.println("Resultado é: " + result);
		System.out.println("Resultado é: " + result2);
	}

}
