/**
 * Code ini adalah contoh kecil dari program data siswa
 *
 * @author (Sopia Safira)
 * @version (a version number or a date)
 */
public class Siswa {
    private int nrp;
    private String nama;
    
    public Siswa(int nrpx, String namax)
    {
        nrp = nrpx;
        nama = namax;
    }
    
    public void setNrp(int nrpx) //memberi nilai pada nrp
    {
        nrp = nrpx;
    }
    
    public int getNrp() //mengembalikan nilai nrp
    {
        return nrp;
    }
    
    public void setNama(String namax) //memberi nilai pada nama
    {
        nama = namax;
    }
    
    public String getNama() //mengembalikan nama
    {
        return nama;
    }
    
}