/**
	* Program berikut untuk menyalin array ke array lain
*/
public class CopyArray {
	public static void main(String args[]) { 
		int[] array1 = { 7, 4, 8, 1, 4, 1, 4 }; 
		int[] array2 = new int[3];

		System.arraycopy(array1,0,array2,0,3); 
		System.out.print("Array1 : ");
		for (int i=0; i<array1.length; i++) 		
			System.out.print(array1[i] + " ");
		System.out.println();

		System.out.print("Array2 : ");
		for (int i=0; i<array2.length; i++) 		
			System.out.print(array2[i] + " ");
	}
}

/* 
Code dari program diatas adalah program yang menyalin array, isi dari suatu array dapat di copy pada array yang lain 
dengan memanfaatkan method arraycopy() pada class system 
*/ 
