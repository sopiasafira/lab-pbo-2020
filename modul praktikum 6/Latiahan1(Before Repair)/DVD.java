/**
 * Kelas DVD mewakili objek DVD. 
 * Informasi tentang DVD disimpan dan dapat diambil kembali. 
 * Diasumsikan bahwa ini hanya berurusan dengan DVD film 
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class DVD 
{
    private String judul;
    private String direktur;
    private int playingTime; //playingTime dari fitur utama 
    private boolean gotIt;
    private String comment;

    
    public DVD(String theJudul, String theDirektur, int waktu)
    {
        judul = theJudul;
        direktur = theDirektur;
        playingTime = waktu;
        gotIt = false;
        comment = "<no comment>";
    }

    /**
     * Memasukkan komentar untuk DVD ini
     */
    public void setComment(String comment)
    {
        this.comment = comment;
    }

    /**
     * @Kembalikan isi komentar
     */
    public String getComment()
    {
        return comment;
    }

    /**
     * Setel tanda yang menunjukkan apakah punya DVD ini
     * @param "ownIt" jika kita benar punya, false jika sebaliknya
     */
    public void setOwn(boolean ownIt)
    {
        gotIt = ownIt;
    }

    /**
     * @mengembalikan nilai "true" jika kita punya DVD ini
     */
    public boolean getOwn()
    {
        return gotIt;
    }

    /**
     * Untuk cetak detail tentang DVD ini ke terminal teks
     */
    public void print()
    {
        System.out.print("DVD: " + judul + " (" + playingTime + " menit)");
        if(gotIt) {
            System.out.println("*");
        }
	else {
            System.out.println();
        }
        System.out.println("    " + direktur);
        System.out.println("    " + comment);
    }
}
