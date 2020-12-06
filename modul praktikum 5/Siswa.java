/**
 * Modul praktikum 5, Materi Pertama
 * Tentang Enskapsulasi
 * @author (Sopia Safira)
 * @version (Gosong Telaga, 6 Desember 2020)
 */

public class Siswa { 
 	public int nrp; //atribut yang diubah menjadi public
  
 	public Siswa(int nrpx)
 	{ 
  		nrp = nrpx; 
  	}
  
 	public void setNrp(int nrpx)
 	{ 
 		nrp = nrpx;
 	}
 	
 	public int getNrp()
 	{ 
  	return nrp;
 	} 
} 

/*Enkapsulasi ini merupakan proses untuk menyembunyikan hal-hal yang harus
disembunyikan dan menampakkan hal-hal yang boleh ditampakkan. Hal-hal yang perlu disembunyikan 
adalah atribut/ instance variable dan implementasi yang ada dalam method.  Sedangkan yang boleh
ditampakkan adalah nama method. Pada kasus ini  atribut nrp jika saya ubah menjadi public maka nrp dengan
mudahnya diubah pada class Tes Siswa
*/