package com;
//en caso de los objetos el resultado es null
//Arrays.toString()
import java.util.Scanner;

public class Principal {
	

	
	    public static void main(String[] args) {

	    	
	    	   Scanner sc = new Scanner(System.in);
	         
	           String[] alfabeto = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
	           System.out.print("Ingresa una palabra: ");
	           String palabra = sc.nextLine();
	           
	           for (int i = 0; i < palabra.length(); i++) {
	        	   
	        	  
		           
	        	  String letra = Character.toString(palabra.charAt(i));
	               String posicion = "";
	               for (int j = 0; j < alfabeto.length; j++) {
	                   if (letra.equals(alfabeto[j])) {
	                       posicion = posicion + (j + 1) + ",";
	                       break;
	                   }
	               }
	               System.out.print(""+posicion);
	           }
	    	    }
	    	}



