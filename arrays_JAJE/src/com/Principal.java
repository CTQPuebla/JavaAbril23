package com;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
	// Array 1d
		//son conjunto de datos del mismo tipo
		
		//inicializa un array vacio
		String[]array1 = new String[10];
		
		//inicializa un array vacio
			String[]array2 = {"gdfg","fdg","gb","dsfn","fhefhe","fhenue"};
			System.out.println(array2[5]);
			
			//Agregarle valor
			array1[0] = "qwe";
			array1[1] = "qwhe";
			array1[2] = "qwefv";
			array1[3] = "qwev";
			array1[4] = "qwefv";
			
			
			Scanner sc = new Scanner(System.in);
			//llenado dinamico
			
			for (int i = 0; i < array2.length; i++) {
				System.out.println("ingresa el texto");
				array1[i] = sc.nextLine();
			}
			
			//lectura dinamica
			
			for (int i = 0; i < array2.length; i++) {
				System.out.println("valor:" +array1[i]);
			}
			
			
			System.out.println(Arrays.toString(array1));
			
			
			//INGRESAR TU NOMBRE DETERMINAR EN QUE POSICION DE ABC SE EN CUENTRA CADA LETRA IMPRIMIR RESULTADOS
			//EJEMPLO 
			//MARIO 
			//13,1,19,9,16
			
	}
}
