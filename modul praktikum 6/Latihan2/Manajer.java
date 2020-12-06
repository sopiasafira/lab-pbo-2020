
/**
 * Latihan 2 modul praktikum 6
 * subclass dari Pegawai
 * @author (Sopia Safira)
 * @version (Gosong Telaga, 06 Desember 2020)
 */
public class Manajer extends Pegawai //extend kepegawai(subclass pegawai)
{
    private String departemen;
 
    public Manajer(String nama, double gaji, String departemen) 
    {
         super(nama, gaji);         //keyword super untuk mengambil atribut dari super class(Pegawai)
         this.departemen = departemen;
    } 
 
    public void setDepartemen(String departemen) //memberi string nilai pada departemen
    {
        this.departemen = departemen; 
    }
 
    public String getDepartemen() //untuk return departemen
    {
        return this.departemen;
    }
}