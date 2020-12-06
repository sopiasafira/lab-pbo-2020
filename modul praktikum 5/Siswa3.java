/**
 * Modul praktikum 5, Materi Ketiga
 * Tentang Method Overloading
 * Contoh pada class Siswa3, kita ingin menambahkan satu method constructor lainnya seperti di bawah. 
 * @author (Sopia Safira)
 * @version (Gosong Telaga, 6 Desember 2020)
 */

public class Siswa3
{
    private int nrp; 
    private String nama;
    
    public Siswa3() //Method coustrustor lainnya (overloading)
    {
        this.nrp = 12345;
        this.nama = "nama default";
    } 
    
    public Siswa3(int nrp, String nama)
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
} 