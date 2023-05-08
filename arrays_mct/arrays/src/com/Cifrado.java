package com;

import java.util.Scanner;

public class Cifrado {
	public static void main(String[] args) {
		String cifrado = "";
		String letra = "";
		String numero = "1234567890";

		String textoCodificado = "";
		String[] alfabeto = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };

		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresa una palabra: ");
		String palabra = sc.nextLine().toLowerCase();

		for (int i = 0; i < palabra.length(); i++) {

			letra = Character.toString(palabra.charAt(i));

		
		if (letra.equals("z")) {
			cifrado = cifrado + "a";
		} else if (numero.indexOf(letra) >= 0) {
			cifrado = cifrado + (Integer.parseInt(letra) + 1);

		}else if (letra.equals(" ")) {
			
			cifrado = cifrado + ("-");

		}else {
			for (int j = 0; j < alfabeto.length; j++) {
				if (letra.equals(alfabeto[j])) {
					cifrado = cifrado + alfabeto[j + 1];
					break;
				}

			}
		}
		
		}

		System.out.println(cifrado);
	

//		 Scanner sn = new Scanner(System.in);
//	        sn.useDelimiter("\n");
//	         
//	        String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ1234567890";
//	 
//	        System.out.println("Dame una frase");
//	        String frase = sn.next();
//	         
//	        String texto = codificar(letras, frase);
//	        System.out.println("Texto codificado: " + texto);
//	         
////	        texto = descodificar(letras, texto);
//	        System.out.println("Texto descodificado: " + texto);
//	         
//	    }
//	 
//	    public static String codificar(String letras, String texto){
//	        String textoCodificado = "";
//	 
//	        texto = texto.toUpperCase();
//	 
//	        char caracter;
//	        for (int i = 0; i < texto.length(); i++) {
//	            caracter = texto.charAt(i);
//	 
//	            int pos = letras.indexOf(caracter);
//	 
//	            if(pos == -1){
//	                textoCodificado += caracter;
//	            }else{
//	                textoCodificado += letras.charAt( (pos + 1) % letras.length() );
//	            }
//	 
//	        }
//	 
//	        return textoCodificado;
	}

}
