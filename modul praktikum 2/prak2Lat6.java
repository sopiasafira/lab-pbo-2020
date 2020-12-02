/**
 * Program berikut untuk mencoba operator conditional
*/
public class prak2Lat6 {


	public static void main(String args[]) {
		int a, b;
		a = 10;
		b = (a == 1) ? 20: 30;
		System.out.println( "Value of b is : " +  b );


		b = (a == 10) ? 20: 30;
		System.out.println( "Value of b is : " + b );
	}
}

/*
code pengujian ada baris pertama karena 10 tidak sama dengan 1 maka akan dicetak 30 
pada baris selanjutnya karena 10 sama dengan 10 maka akan dicetak 20 
*/