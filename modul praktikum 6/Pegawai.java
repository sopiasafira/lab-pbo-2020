/**
 * Modul praktikum 6 Materi 4 (Method contructor pada subclass)
 * Tentang Inheritance, Compilasi dan jalankan class Manager
 * @author (Sopia Safira)
 * @version (Gosong Telaga, 6 Desember 2020)
 */
public class Pegawai {
 	private String nama;
 	private double gaji; 
 
 	public Pegawai(String nama, double gaji)
 	{
  		this.nama = nama; 
  		this.gaji = gaji;
 	}
  
 	public void setNama(String nama)
 	{
 		this.nama = nama; 
 	}
 
 	public String getNama()
 	{ 
  		return this.nama; 
 	}
  
 	public void setGaji(double gaji)
 	{
  	this.gaji = gaji;
	}
  
 	public double getGaji()
 	{ 
  		return this.gaji; 
 	} 

 	/*Method constructor tidak diturunkan ke sub class. Untuk membuktikan hal tersebut. Cobalah
 	*untuk kompilasi class Manager
 	*/