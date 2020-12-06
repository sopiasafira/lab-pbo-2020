/**
 *Kelas CD mewakili objek CD. 
 *Informasi tentang CD disimpan dan dapat diambil kembali.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class CD extends Item
{
    private String artis;
    private int nomorTrak;

    /**
    * Inisialisasi dari CD.
    * @param theJudul dari Judul CD.
    * @param theArtis adalah Artis yang ada pada CD.
    * Trek @param Jumlah trek pada CD.
    * @param time Waktu pemutaran CD.
    */
    public CD(String theJudul, String theArtis, int trak, int time)
    {
        super(theJudul, time); //kata kunci super digunakan untuk memanggil method constructor dari super-kelas.
        artis = theArtis;
        nomorTrak = trak;
    }
    
    
    /**
     * @mengembalikan nama artis pada CD
     */
    public String getArtis()
    {
        return artis;
    }


    /**
     * @mengembalikan jumlah trak CD ini
     */
    public int getNomorTrak()
    {
        return nomorTrak;
    }
}


