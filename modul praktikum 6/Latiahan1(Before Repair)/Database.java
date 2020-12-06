import java.util.ArrayList;
/**
 * Kelas database menyediakan fasilitas untuk menyimpan objek CD dan video. 
 * Daftar semua CD dan video dapat dicetak ke terminal.
 * 
 * Versi ini tidak menyimpan data ke disk, 
 * dan tidak menyediakan fungsi pencarian apa pun.
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class Database
{
    private ArrayList<CD> cds;
    private ArrayList<DVD> dvds;

    /**
     * Construct an empty Database.
     */
    public Database()
    {
        cds = new ArrayList<CD>();
        dvds = new ArrayList<DVD>();
    }

    /**
     * Tambahkan CD ke database
     * @parameter theCD akan ditambahkan
     */
    public void tambahCD(CD theCD)
    {
        cds.add(theCD);
    }

    /**
     * Tambahkan DVD ke database
     * @parameter theDVD akan ditambahkan
     */
    public void tambahDVD(DVD theDVD)
    {
        dvds.add(theDVD);
    }

    /**
     * Cetak daftar semua CD dan DVD yang saat ini disimpan ke terminal teks.
     */
    public void daftar()
    {
        // Cetak daftar CD
        for(CD cd : cds) {
            cd.print();
            System.out.println();   // baris kosong antara item
        }

        // Cetak daftar DVD
        for(DVD dvd : dvds) {
            dvd.print();
            System.out.println();   // baris kosong antara item
        }
    }
}

/*Ketiga clas ini sudah saya unah coomentnya agar mudah dipahami
Setelah memahami kelas CD, DVD dan Database. Disini dapat dilihat kelas CD dan DVD
hampir sama. Pada kelas Database, juga banyak terdapat hal yang berulang seperti pada method print. 