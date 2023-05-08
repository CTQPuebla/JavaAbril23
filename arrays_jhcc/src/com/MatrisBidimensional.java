package com;

import java.util.Arrays;

public class MatrisBidimensional {

	
public static void main(String[] args) {
	//Inicializo 2 matrices String llenas
	  String[][] matrizA = {{"f","3","9"},
	                  {"z","5","2"},
	                  {"5","x","9"},
	                  {"5","x","9"}};
	  
	  String[][] matrizB = {{"6","f","2"},
	                           {"3","8","k"},
	                           {"5","1","9"}};
	  
	  //Como inicializo una matriz sin valores ?
	  String[][] matrizC = new String[matrizA.length][matrizA[0].length];
	  
	  String numeros="1234567890";
	  
	  int n1 = 0;
	  int n2 = 0 ;
	  //recorriendo la matriz
	  for (int i = 0; i < matrizA.length; i++) { //filas     
	   for (int j = 0; j < matrizA[i].length; j++) {   
	    //forma 1
//	    if(numeros.indexOf(matrizA[i][j])>=0 && numeros.indexOf(matrizB[i][j])>=0) {
//	     
//	    n1 = Integer.parseInt(matrizA[i][j]);
//	    n2 = Integer.parseInt(matrizB[i][j]);
	//    
//	    matrizC[i][j] = Integer.toString(n1+n2);
//	     
//	    }else {
//	     matrizC[i][j] = "0"; 
//	    }
	   //forma2 
	    try {//Intenta
	          
	     n1 = Integer.parseInt(matrizA[i][j]);
	     n2 = Integer.parseInt(matrizB[i][j]);     
	     matrizC[i][j] = Integer.toString(n1+n2);
	     
	    }catch(Exception ex) {
	     matrizC[i][j] = "0";
	    }
	   
	   }
	   
	  }
	  //Imprimir la matrizC
	  System.out.println(Arrays.deepToString(matrizC));
}
}
