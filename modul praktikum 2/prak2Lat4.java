/**
 * Program berikut untuk mencoba operator bitwise
*/
public class prak2Lat4 {


	public static void main(String args[]) { 
		int a = 60;    /* 60 = 0011 1100 */ 
		int b = 13;    /* 13 = 0000 1101 */ 
		int c = 0; 

		c = a & b;        /* 12 = 0000 1100 */ 
		System.out.println("a & b = " + c );


		c = a | b;        /* 61 = 0011 1101 */ 
		System.out.println("a | b = " + c );


		c = a ^ b;        /* 49 = 0011 0001 */ 
		System.out.println("a ^ b = " + c );


		c = ~a;           /*-61 = 1100 0011 */ 
		ystem.out.println("~a = " + c );


		c = a << 2;       /* 240 = 1111 0000 */ 
		System.out.println("a << 2 = " + c );

		c = a >> 2;       /* 15 = 1111 */ 
		System.out.println("a >> 2  = " + c );


		c = a >>> 2;      /* 15 = 0000 1111 */ 
		System.out.println("a >>> 2 = " + c );
	}
}

/*
Penggunaan operator bitwise
1. & pada desimal 60 dengan 13 didapatkan hasil 12 
2. | pada sesimal 60 dengan 13 didapat hasil 61
3. ^ pada desimal 60 dengan 13 didapat hasil 49
4. ~ pada desimal 60 dengan 13 dapat hasil -61
5. << pada desima 60 dengan 13 ada pergeseran nilai binary kesamping kiri sebanyak 2 kali, maka hasil 240
6. >> pada desimal 60 dengan 13, penggeseran nilai binarynya ke samping kanan sebanyak 2 kali maka didapat hasil 15 
7. >>> pada desimal 60 dengan 13, penggeseran nilai binarynya ke samping kanan sebanyak 3 kali maka didapat hasil 15 
*/