package com.stefanini.curso.javabasico.arraysgit;

public class ArraysMatrz {

	public static void main(String[] args) {
		
		int[][] mes= new int[8][31];
		
	
		mes[6][29]=31;
		
		for(int dia=1;dia<mes[6][29];dia++) {
			System.out.println(dia);
			
		}
		
	
}
	
}