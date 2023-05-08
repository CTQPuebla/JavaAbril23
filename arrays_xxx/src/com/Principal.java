package com;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		// Arrays 1d
		// Son conjunto de datos del mismo tipo

		// Inicializa un array vacío
//		String[] array1 = new String[10];
//		
//		//Inicializa un array con valores
//		String[] array2 = {"fgv","sdvfv","sdfv","243t","fdgb","hbgf","563","dfgbfg"};
//		
//		System.out.println(array2[5]); //Lectura de un indice del array
//		
//		//Agregarle valor a un array
//		array1[0] = "dvs";
//		array1[1] = "123";
//		array1[2] = "/%&$";
//		array1[3] = "dvs";		
//		//System.out.println(array1[-5]);
//		
//		Scanner sc = new Scanner(System.in);
//		//Llenado dinámico
//		for (int i = 0; i < array1.length; i++) {
//			System.out.println("Ingresa un texto");			
//			array1[i] = sc.nextLine();			
//		}
//		
//		//Lectura dinámica
//		for (int i = 0; i < array1.length; i++) {
//			System.out.println("Valor: "+array1[i]);			
//					
//		}		
//		System.out.println(Arrays.toString(array1));
//		
//		System.out.println(array1[-5]);
//		
		/*
		 * Ingresar tu nombre Determinar en que posicion del abc se encuentra cada letra
		 * Imprimir resultados
		 * 
		 * Ejemplo
		 * 
		 * MARIO 13,1,19,9,16
		 * 
		 */

		// En base al anterior ejercicio, realizar los siguiente

		/*
		 * Se recibe por teclado cualquier texto de cualquier longitud, el cual puede
		 * incluir numeros
		 * 
		 * La salida del ejercicio debe ser el mismo texto pero cifrado
		 * 
		 * 
		 * Ejemplo puebla mexico 2023 rvfcmb ndyjdp 3134
		 */

		String cifrado = "";
		String texto = "";
		String[] abc = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };
		String numeros = "1234567890";
		String letra = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa el texto");
		texto = sc.nextLine().toLowerCase();
		// Iterar sobre el texto para obtener una letra a la vez
		for (int i = 0; i < texto.length(); i++) {
			letra = Character.toString(texto.charAt(i));
			// Iterar sobre el abc para encontrar la posicion de esa letra
			// Caso especial: z
			if (letra.equals("z")) { 
				cifrado = cifrado + "a";
			} else if (numeros.indexOf(letra) >= 0) { //Determino si son numeros
				cifrado = cifrado + (Integer.parseInt(letra) + 1);
			} else if (letra.equals(" ")) {//Determino si es un espacio en blanco
				cifrado = cifrado + "-";
			} else { //Si no, ahora tengo que determinar en que posicion del abc está esta letra
				for (int j = 0; j < abc.length; j++) {
					if (letra.equals(abc[j])) {
						cifrado = cifrado + abc[j + 1];
					}
				}
			}

		}
				
		System.out.println(cifrado);

	}

}
