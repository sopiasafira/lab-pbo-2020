/**
 * Modul praktikum 5, Materi Keempat
 * Tentang Method toString()
 * @author (Sopia Safira)
 * @version (Gosong Telaga, 6 Desember 2020)
 */

public class Siswa4
{
    private int nrp; 
    private String nama;
    
    public Siswa4() //Method coustrustor lainnya (overloading)
    {
        this.nrp = 12345;
        this.nama = "nama default";
    } 
    
    public Siswa4(int nrp, String nama)
    {
        this.nrp = nrp; 
        this.nama = nama;
    } 
    
    public void setNrp(int nrp)
    {
        this.nrp = nrp;
    } 
     
    public int getNrp()
    { 
        return this.nrp;
    }
    
    public void setNama(String nama) 
    {
        this.nama = nama; 
    }
    
    public String getNama()
    {
        return this.nama; 
    }

    public String toString()
    { 
        return this.nrp + "  " + this.nama;
    } 
 
} 