package br.com.devdojo;

public class foreach {
	public static void main(String[] args) {
		int[] numeros = new int[3];
		int[] numeros2 = {1,2,3,4,5};
		int[] numeros3 = new int[]{1,2,3,4,5};
		
		for(int i=0;i<numeros3.length;i++) {
			System.out.println(numeros3[i]);
		}
		
		System.out.println("-");
		
		for(int num:numeros3) {
			System.out.println(num);
		}
		
 	}
}
