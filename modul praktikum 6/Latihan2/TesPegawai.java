
/**
 * Class yang berisi method main yang menggunakan
 * class Pegawai dan Manajer
 * @author (Sopia Safira)
 * @version (Gosong Telaga, 06 Desember 2020)
 */
public class TesPegawai
{
    public static void main(String[] ar)
    {
       Manajer m = new Manajer("Sofia", 20000000, "Keuangan"); //objek yang dibuat dari class Manajer yang sudah extends class Pegawai
       
       System.out.println("Nama Pegawai :" +m.getNama());  //cetak nama
       System.out.println("Banyak Gaji :" +m.getGaji()); //cetak banyak gaji
       System.out.println("Departemen :" +m.getDepartemen()); //cetak nama departemen
       
    }
}
