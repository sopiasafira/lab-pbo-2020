/**
 * Kelas Item mewakili item multi-media.
 * Informasi tentang item disimpan dan dapat diambil kembali.
 * Kelas ini berfungsi sebagai superclass untuk itms yang lebih spesifik.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class Item
{
    private String judul;
    private int playingTime;
    private boolean gotIt;
    private String comment;

    /**
     * Inisialisasi bidang item.
     * @param theJudul adalah judul item.
     * @param time adalah waktu item.
     */
    public Item(String theJudul, int time)
    {
        judul = theJudul;
        playingTime = time;
        gotIt = false;
        comment = "";
    }

    /**
     * Masukkan komentar untuk item .
     * @param comment adalah komentar yang akan dimasukkan.
     */
    public void setComment(String comment)
    {
        this.comment = comment;
    }

    /**
     * @mengembalikan komentar item.
     */
    public String getComment()
    {
        return comment;
    }

    /**
     *atur keadaan apakah memiliki item ini atau tidak.
     * @param "ownIt" akan true jika kita memiliki item tersebut.
     * false jika sebaliknya.
     */
    public void setOwn(boolean ownIt)
    {
        gotIt = ownIt;
    }

    /**
     * @kembalikan true jika punya.
     */
    public boolean getOwn()
    {
        return gotIt;
    }

    /**
     *cetak detail item ini ke program
     */
    public void print()
    {
        System.out.print("title: " + judul + " (" + playingTime + " mins)");
        if(gotIt) {
            System.out.println("*");
        } else {
            System.out.println();
        }
        System.out.println("    " + comment);
    }
}
