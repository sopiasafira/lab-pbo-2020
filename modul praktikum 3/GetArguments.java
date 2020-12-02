/**
	* Program berikut untuk mendapatkan nilai argumen pada method main
*/
public class GetArguments {
	public static void main(String args[]) { 	
		System.out.println("Tanggal : " + args[0]); 
		System.out.println("Bulan : " + args[1]); 
		System.out.println("Tahun : " + args[2]);
	}
}
/* 
Code diatas adalah sebuah program method main yang memiliki parameter array bertipe String. 
argumen yang masuk saat dijalankan, akan disimpan dalam  array tersebut lalu diakses dengan menggunakan indeks. 
Jadi untuk menjalankannya dengan memasukkan tanggal, bulan dan tahun. 
*/  
