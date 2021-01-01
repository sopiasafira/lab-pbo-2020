
/**
 * Modul praktikum 5, Materi Ketiga
 * Tentang Method Overloading, Compilasi dan jalankan class TesSiswa3 ini
 * @author (Sopia Safira)
 * @version (Gosong Telaga, 6 Desember 2020)
 */
public class TesSiswa3
{
    public static void main(String[] ar)
    { 
        Siswa3 s = new Siswa3();
        Siswa3 ss = new Siswa3(8030001, "Upin"); 
        
        //ini akan menimbulkan error
        //Siswa sss = new Siswa(8030002);  

        System.out.println(s.getNrp() + "  " + s.getNama()); 
        System.out.println(ss.getNrp() + "  " + ss.getNama());
    } 
}

/*objek s menggunakan method constructor tanpa parameter sedangkan objek ss menggunakan method.
constructor dengan dua parameter (int dan String).  Namun andaikan kita menambahkan kode 
Siswa sss = new Siswa(8030002); 
maka hal ini akan menimbulkan error sebab tidak ada padanan method constructor yang memiliki satu
parameter berupa int

Saat objek menggunakan method yang memiliki method
overloading, maka compiler akan mencari padanan yang paling sesuai dengan method overloading yang 
ada. Jika tidak ada padanan maka akan muncul error.  
*/