/**
 * Program berikut untuk mencoba operator assignment
*/
public class prak2Lat2 {


	public static void main(String args[]) {
		int a = 10; 
		int b = 20; 
		int c = 0; 

		c = a + b;
		System.out.println("c = a + b = " + c );


		c += a ;
		System.out.println("c += a  = " + c );


		c -= a ;
		System.out.println("c -= a = " + c );


		c *= a ;
		System.out.println("c *= a = " + c );


		a = 10;
		c = 15;
		c /= a ;
		System.out.println("c /= a = " + c );


		a = 10;
		c = 15;
		c %= a ;
		System.out.println("c %= a  = " + c );


		c <<= 2 ;
		System.out.println("c <<= 2 = " + c );


		c >>= 2 ;
		System.out.println("c >>= 2 = " + c );


		c >>= 2 ;
		System.out.println("c >>= 2 = " + c );


		c &= a ;
		System.out.println("c &= a  = " + c );


		c ^= a ;
		System.out.println("c ^= a   = " + c );


		c |= a ;
		System.out.println("c |= a   = " + c );
	}
} 

/*
Penjelasan perbaris
1. a+b=c yaitu 10+20=30
2. c+a=c / 30+10=40
3. c-a=c / 40-10=30
4. cxa=c / 30x10=300
5. c=15, c/a = 15/10=1
6. c%a / 15%10=5
7. pergeseran nilai biner dari 5 kesamping kiri sebanyak 2 kali maka hasil yang ditampilkan adalah 20 .
8. pergeseran nilai biner dari 20 ke samping kanan sebanyak 2 kali maka hasil yang ditampilkan adalah 5 
9. pergeseran nilai biner dari 5 ke samping kanan sebanyak 2 kali maka hasil yang didapat 1.
10. penggunaan operator assignment & pada desimal 1 maka hasil adalah 0 
11. penggunaan operator assignment ^ pada desimal 0 maka hasil adalah 10 
12. penggunaan operator assignment | pada desimal 10 maka hasil adalah 10 
*/

