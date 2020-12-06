import java.util.ArrayList;

/**
 * Kelas database menyediakan fasilitas untuk menyimpan objek CD dan video. 
 * Daftar semua CD dan video dapat dicetak ke terminal.
 * 
 * Versi ini tidak menyimpan data ke disk, dan tidak
 * menyediakan fungsi pencarian.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class Database
{
    private ArrayList<Item> items;

    /**
     * Construct kosong database.
     */
    public Database()
    {
        items = new ArrayList<Item>();
    }

    /**
     * Tambahkan item ke database
     * @param theItem adalah item yang akan ditambahakn
     */
    public void addItem(Item theItem)
    {
        items.add(theItem);
    }

    /**
     * Cetak daftar semua CD dan video yang saat ini disimpan ke
     * terminal teks.
     */
    public void list()
    {
        for(Item item : items)
        {
            item.print();
        }
    }
}
