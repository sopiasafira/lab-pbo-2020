import java.util.ArrayList;

/**
 *Kelas database menyediakan fasilitas untuk menyimpan objek item. 
 *Daftar semua item dapat dicetak ke terminal.
 * 
 * Versi ini tidak menyimpan data ke disk, dan tidak menyediakan fungsi pencarian apa pun.
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class Database
{
    private ArrayList<Item> items;

    /**
     * Construct database yang kosong.
     */
    public Database()
    {
        items = new ArrayList<Item>();
    }

    /**
     * Tambahkan item ke database.
     * @param theItem adalah item yang akan ditambahkan.
     */
    public void addItem(Item theItem)
    {
        items.add(theItem);
    }

    /**
     * Cetak daftar semua item yang saat ini disimpan ke
     * text terminal.
     */
    public void list()
    {
        for(Item item : items) {
            item.print();
            System.out.println();   //baris kosong antar item
        }
    }
}

/*Ini program code yang telah diperbaiki dari folder "before" yang commennya juga telah dibuat kedalam bahasa yang mudah dipahami
jadi untuk mengatasi masalah duplikasi kode ini maka kita dapat menggunakan konsep inheritance. Kita
kenalkan satu objek baru yang mengakomodir kesamaan antara objek CD dan DVD.