package com;

import java.util.Arrays;
import java.util.Scanner;

public class PrincipalArrays {
	
	public static void main(String[] args) {
		
		//Arrays 1d
		  //Son conjunto de datos del mismo tipo
		  
		
		  //Inicializa un array vacío
//		  String[] array1 = new String[10];
		
		
//		  
//		  //Inicializa un array con valores
//		  String[] array2 = {"fgv","sdvfv","sdfv","243t","fdgb","hbgf","563","dfgbfg"};
		
//		  
//		  System.out.println(array2[5]); //Lectura de un indice del array / visualizacion de un array
//		  
		
//		  //Agregarle valor a un array
		
//		  array1[0] = "dvs";
//		  array1[1] = "123";
//		  array1[2] = "/%&$";
//		  array1[3] = "dvs";  
		
		//En java no podemos pedir la lectura de un indice menor a 0
//		  //System.out.println(array1[-5]);
//		  
		
		
//		  Scanner sc = new Scanner(System.in);
//		  //Llenado dinámico
//		  for (int i = 0; i < array1.length; i++) {
//		   System.out.println("Ingresa un texto");   
		//
//		   array1[i] = sc.nextLine();   
//		  }
//		  
//		  //Lectura dinámica    aqui estamos a diciendo que i sea menor que la longitud del array
//		  for (int i = 0; i < array1.length; i++) {
//		   System.out.println("Valor: "+array1[i]);   
//		     
//		  }  
//		  System.out.println(Arrays.toString(array1));
		  
		  //LOS ARRAY INICIAN DESDE 0 Y SU ULTIMO VALOR ES N-1
		//  System.out.println(array1[-5]);		
		  
		  
		  
		  /*iNGRESA TU NOMBRE 
		   * DETERMINA EN QUE POSICION DE ABC SE ENCUENTRA CADA LETRA 
		   * IMPRIME EL RESULTADO
		   * 
		   * EJEMPLO
		   * 
		   * MARIO
		   * 13,1,19,9,16
		   */
		
//		Scanner x= new Scanner(System.in);
//		System.out.println("Ingresa tu nombre: ");
//		String nombre=x.nextLine();
//		String letra="";
//		String posiciones="";
//		
//		String [] array1= {"a","b","c","d","e","f","g","h","i",
//				"j","k","l","m","n","o","p", "q","r","s","t","u",
//				"v","w","x","y","z"};
//		
//		/*
//		 * cuando es nombre.length() lo que esta haciendo es que como es 
//  	   una cadena de caracteres pues se necesita guardar
//		 */
//		for(int i=0; i < nombre.length(); i++ ) {
//			
//			//para separar una cadena de caracteres String de letra por letra llamando
//			//a i que es donde se esta guardando y posteriormente estamos guardando dicha letra en la variable letra
//			letra = Character.toString(nombre.charAt(i));
//			
//			/*
//			 * aqui cuando es array1.length no le agregamos () porque ya tenemos datos designados en  nuestro array
//			 * 
//			 */
//			for(int j=0; j<array1.length; j++) {
//				
//				if(letra.equals(array1[j])) {
//					//System.out.println("coincidio "+j);
//					posiciones= posiciones+(j+1)+",";
//				}
//			}
//			
//		}
//		System.out.println(posiciones);
		
		Scanner x= new Scanner(System.in);
		System.out.println("Ingresa tu nombre: ");
		String cadena=x.nextLine();
		String letra= "";
		String casilla= "";
		
		String [] arrayLetras= {"a","b","c","d","e","f","g","h","i",
				"j","k","l","m","n","o","p", "q","r","s","t","u",
				"v","w","x","y","z","0","1","2","3","4","5","6","7","8","9"};
		for(int i=0; i < cadena.length(); i++ ) {
//			
			letra = Character.toString(cadena.charAt(i));
			
			for(int j=1; j<arrayLetras.length; j++) {
				
				if(letra.equals(arrayLetras[j])) 
				{
				casilla= casilla+arrayLetras[j+1];
				
				}else if (letra.equals(" ")) {
					
					casilla= casilla +"?" ;
				}else if
			}
			
		} System.out.println(letra);
		
	}

}
