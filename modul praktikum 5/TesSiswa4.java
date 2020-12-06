/**
 * Modul praktikum 5, Materi Keempat
 * Tentang Method Method toString(), Compilasi dan jalankan class TesSiswa3 ini
 * @author (Sopia Safira)
 * @version (Gosong Telaga, 6 Desember 2020)
 */
public class TesSiswa4
{
    public static void main(String[] ar)
    { 
        Siswa4 s = new Siswa4();
        Siswa4 ss = new Siswa4(8030001, "Upin"); 
        
        //ini akan menimbulkan error
        //Siswa sss = new Siswa(8030002);  

        //System.out.println(s.getNrp() + "  " + s.getNama());  //sebenarnya kita bisa menggunakan ini tetapi panjang
        //System.out.println(ss.getNrp() + "  " + ss.getNama()); //dan terkesan berulang

        System.out.println(s);
        System.out.println(ss);

    } 
}

/*Method toString() merupakan method pada class Object yang merupakan induk dari semua class di Java.
Method toString() secara default-nya akan mengembalikan representasi objek dalam bentuk tipe data 
String. Method toString ini bisa ditimpa sehingga kita dapat membuat sendiri representasi objek sesuai
dengan yang kita inginkan. Method toString() ini adalah method yang dipanggil oleh statemen 
System.out.println.  
*/