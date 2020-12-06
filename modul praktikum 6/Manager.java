/**
 * Modul praktikum 6 Materi 4 Method constructor pada subclass
 * Tentang Inheritance, Compilasi dan jalankan class ini
 * @author (Sopia Safira)
 * @version (Gosong Telaga, 6 Desember 2020)
 */
public class Manajer extends Pegawai {
 	private String departemen; 
 
 	public Manajer(String nama, double gaji, String departemen)
 	{ 
  		Pegawai p = new Pegawai(nama, gaji);
  		this.departemen = departemen;
 	}
  
 	public void setDepartemen(String departemen)
 	{
  		this.departemen = departemen;
 	}
  
 	public String getDepartemen()
 	{ 
  		return this.departemen;
 	}
} 

//eror karena method constructor tidak diturunkan pada subclass