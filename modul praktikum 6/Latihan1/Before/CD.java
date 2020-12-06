/**
 * Kelas CD mewakili objek CD. Informasi tentang
 * CD dapat diambil dan disimpan
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class CD
{
    private String judul;
    private String artis;
    private int numberOfTracks;
    private int playingTime;
    private boolean gotIt;
    private String comment;

    /**
     * Inisialisasi CD.
     * @param judul CD.
     * @param Artis dari CD.
     * @param Jumlah trek.
     * @param waktu pemutaran.
     */
    public CD(String theJudul, String theArtis, int tracks, int time)
    {
        judul = theJudul;
        artis = theArtis;
        numberOfTracks = tracks;
        playingTime = time;
        gotIt = false;
        comment = "<no comment>";
    }

    /**
     * Memasukkan komentar untuk CD.
     * @param comment, untuk komentar yang dimasukkan.
     */
    public void setComment(String comment)
    {
        this.comment = comment;
    }

    /**
     * @untuk mengembalikan komentar yang ada.
     */
    public String getComment()
    {
        return comment;
    }

    /**
     * Setel keadaan apakah kita memiliki CD ini.
     * @param "ownIt" true jika kita punya, false jika sebaliknya.
     */
    public void setOwn(boolean ownIt)
    {
        gotIt = ownIt;
    }

    /**
     * @return true jika kamu punya CD ini.
     */
    public boolean getOwn()
    {
        return gotIt;
    }

    /**
     * Print detail tentang CD ini.
     */
    public void print()
    {
        System.out.print("CD: " + judul + " (" + playingTime + " mins)");
        if(gotIt) {
            System.out.println("*");
        }
	else {
            System.out.println();
        }
        System.out.println("    " + artis);
        System.out.println("    tracks: " + numberOfTracks);
        System.out.println("    " + comment);
    }
}
