/**
 * Program berikut untuk mencoba looping while
*/

public class CobaLoopingWhile
{
	public static void main(String arg[])
	{
		int i=0;

		while (i<10)
		{
			int j=0;
			while (j<i+1)
			{
				System.out.print('*');
				j++;
			}


			System.out.println();
			i++;
		}
	}
}
/*
code untuk menampilkan output bintang segitiga sama kaki
*/