package com;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
//		//Arrays 1d
//		  //Son conjunto de datos del mismo tipo
//		  
//		  //Inicializa un array vacío
//		  String[] array1 = new String[10];
//		  
//		  //Inicializa un array con valores
//		  String[] array2 = {"fgv","sdvfv","sdfv","243t","fdgb","hbgf","563","dfgbfg"};
//		  
//		  System.out.println(array2[5]); //Lectura de un indice del array
//		  
//		  //Agregarle valor a un array
//		  array1[0] = "dvs";
//		  array1[1] = "123";
//		  array1[2] = "/%&$";
//		  array1[3] = "dvs";  
//		  //System.out.println(array1[-5]);
//		  
//		  Scanner sc = new Scanner(System.in);
//		  //Llenado dinámico
//		  for (int i = 0; i < array1.length; i++) {
//		   System.out.println("Ingresa un texto");   
//		   array1[i] = sc.nextLine();   
//		  }
//		  
//		  //Lectura dinámica
//		  for (int i = 0; i < array1.length; i++) {
//		   System.out.println("Valor: "+array1[i]);   
//		     
//		  }  
//		  System.out.println(Arrays.toString(array1));
//		  
//		  System.out.println(array1[-5]);
//
//
//		
		
		/*
		 * ingresa tu nombre
		 * determinar en que posicion del abc se encuentra cada letra
		 * Imprimir resultado
		 * 
		 * ejemplo
		 * 
		 * MARIO
		 * 13,1,19,9,16
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su nombre:");
		String nombre = sc.nextLine().toLowerCase();
		String letra = "";
		String[] array1 = { "a'", "b", "c", "e", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
				"r", "s", "t", "u", "v", "w", "x", "z" };
		String numeros = "1234567890";
		String textoCifrado = "";

		for (int i = 0; i < nombre.length(); i++) {
			letra = Character.toString(nombre.charAt(i)); // pasar la cadena a caracter

			// for (int j = 0; j < array2.length; j++) {

			// caso especial: z
			if (letra.equals("z")) {
				textoCifrado = textoCifrado + "a";
			} else if (numeros.indexOf(letra) >= 0) { // Determino si son numero
				textoCifrado = textoCifrado + (Integer.parseInt(letra) + 1);
			} else if (letra.equals(" ")) { // determina si es un espacio en blanco
				textoCifrado = textoCifrado + "-";
			} else {
				for (int j = 0; j < array1.length; j++) {
					if (letra.equals(array1[j])) {
						textoCifrado = textoCifrado + array1[j + 1];
					}
				}
			}

		}
		System.out.println(textoCifrado);
	}
}

