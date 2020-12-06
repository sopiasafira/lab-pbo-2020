
/**
 * latihan 2 Praktikum 6
 * Materi Inheritance
 *
 * @author (Sopia Safira)
 * @version (Gosong Telaga, 06 Desember 2020)
 */
public class Pegawai 
{
    private String nama;
    private double gaji;
  
    public Pegawai(String nama, double gaji) //method constructor yang berisi parameter nama dan gaji
    {
        this.nama = nama;
        this.gaji = gaji; 
    }
 
    public void setNama(String nama) //memberi nilai pada nama pegawai
    {
        this.nama = nama; //pakai this biar jangan ambigu ya
    }
  
    public String getNama() //mengembalikan nama
    { 
        return this.nama;
    }
 
    public void setGaji(double gaji) //memberi nilai/set pada gaji pegawai
    {
        this.gaji = gaji; 
    }
  
    public double getGaji() //mengembalikan nilai gaji 
    { 
        return this.gaji;
    }
}