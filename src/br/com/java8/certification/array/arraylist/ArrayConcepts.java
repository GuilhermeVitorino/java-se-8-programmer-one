package br.com.java8.certification.array.arraylist;

public class ArrayConcepts {
	
	public static void main(String[] args) {
		
		// int[] values; //compilation error: array ever must be intialized with the new operator
		
		// int[] values = new int[]; //compilation error: in this case size must be initialized
		
		int[] values = new int[1]; //ok
		
		int[] values_2 = {1,2,3}; //ok. initialized with values
		
		int[] values_3 = new int[]{1,3,4,5}; //ok. initialized with values (other syntax)
			
		// int[] values_4 = new int[4]{1,3,4,5}; //compilation error. you can't initialize array passing size and values in the same time 
		
		
		
		
		int [][] twoD_array = new int [1][]; //ok
		
		// int [][] twoD_array = new int [][2]; //error. ever the first dimension must be specified before the others
		
		int [][] twoD_array2 = new int [1][1]; //ok
		
		int [] twoD_array3 [] = new int [1][1]; //ok

		int [] twoD_array4 [] = new int[][] {{1,2,3},{2,3,4},{3,4,5}};
		
		int [] twoD_array5 [] = new int[3][3];
		//twoD_array5 = {{1,2,3},{2,3,4},{3,4,5}} //syntax error. you can initialize on this way only in the same line that variable declaration

		int [][] twoD_array6 = {{1,2,3},{2,3,4},{3,4,5}};
		twoD_array5 = twoD_array6; //two array have same sizes in each dimension
		
		//int [] twoD_array5 [] = new int[3][3] {{1,2,3},{2,3,4},{3,4,5}}; //compilation error. you can't initialize array passing size and values in the same time
		
	}
	
}
