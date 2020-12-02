
/** 
 * Program berikut untuk mencoba statemen break
*/
public class CobaBreak
{
	public static void main(String arg[])
	{
		for (int i=0; i<10; i++)
		{
			for (int j=0; j<i+1; j++)
			{
				if(j==5)
					break; 
				System.out.print('*');
			}
			
			System.out.println();
		}
	}
}
/* 
code diatas digunakan untuk perulangan for dimulai dengan insiasi nilai i=0 lalu selanjutnya masuk ke looping j 
jika kondisinya masih memenuhi maka akan dicetak *, jika j = 5 program akan dihentikan dan dilanjutkan ke proses selanjutnya, namun jika kondisi sudah tidak memenuhi akan 
keluar menuju ke looping i, lalu jika masih memenuhi akan masuk ke looping j begitu seterusnya hingga looping di i tidak bisa lagi dan program selesai. 
nantinya akan dicetak bintang membentuk segitiga namun tidak sepernuhnya segitiga karena saat di looping j jika j= 5, tidak akan dicetak bintang tambahan. 
*/ 
