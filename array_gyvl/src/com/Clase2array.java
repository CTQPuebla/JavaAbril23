package com;

public class Clase2array {
	public static void main(String[]args) {
	String[][]matrizA= {{"f","3","9"},
						{"z","5","2"},
						{"5","x","9"}};
	
	String[][]matrizB={{"6","f","2"},
			           {"3","8","k"},
			           {"5","1","9"}};
		
	String[][] matrizC = new String[matrizA.length][matrizA[0].length];
	  
	  String numeros="1234567890";
	  
	  int n1 = 0;
	  int n2 = 0 ;
	  for (int i = 0; i < matrizA.length; i++) { 
	   for (int j = 0; j < matrizA[i].length; j++) {   

	    try {
	          
	     n1 = Integer.parseInt(matrizA[i][j]);
	     n2 = Integer.parseInt(matrizB[i][j]);     
	     matrizC[i][j] = Integer.toString(n1+n2);
	     
	    }catch(Exception ex) {
	     ex.printStackTrace();
	     matrizC[i][j] = "0";
	     System.out.println("Este valor no se pudo convertir");     
	    }
	   
	   }
	   
	  }
	  //Imprimir la matrizC
	  System.out.println(Arrays.deepToString(matrizC));
	}
}
