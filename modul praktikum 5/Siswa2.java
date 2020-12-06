/**
 * Modul praktikum 5, Materi Kedua
 * Tentang Keyword This
 * Pada class Siswa ini, nama variabel dari parameter dibuat sama dengan nama atribut.  Hal ini tidak menimbulkan 
 * error karena memang Java compiler tahu maknanya (tapi bagi kita manusia itu ambigu). 
 * @author (Sopia Safira)
 * @version (Gosong Telaga, 6 Desember 2020)
 */
public class Siswa2 { 
 	private int nrp;
  
 	public Siswa(int nrp) 
 	{
 		 nrp = nrp; 
 	}
  
 	public void setNrp(int nrp)
 	{
  		this.nrp = nrp; //untuk menghilangkan ambigu kita memakai this
 	}
  
 	public int getNrp()
 	{ 
 		return nrp;
 	} 
} 

/*Dengan menambahkan this, maka manusia yang melihat bisa paham bahwa this.nrp itu merujuk kepada 
atribut nrp yang ada pada objek sekarang. Sedangkan nrp yang kedua merupakan nrp dari parameter
*/