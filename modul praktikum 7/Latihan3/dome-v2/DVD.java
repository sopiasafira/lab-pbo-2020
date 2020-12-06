/**
 * Kelas DVD mewakili objek DVD. 
 * Informasi tentang DVD disimpan dan dapat diambil kembali. 
 * Asumsinya adalah berurusan dengan DVD film pada tahap ini.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class DVD extends Item 
{
    private String direktur;

    /**
     * Constructor untuk objek pada class DVD
     * @param theJudul adalah judul DVD ini.
     * @param theDirektur adalah direktur DVD ini.
     * @param time adalah waktu untuk DVD saat di play.
     */
    public DVD(String theJudul, String theDirektur, int time)
    {
        super(theJudul, time); //kata kunci super digunakan untuk memanggil method constructor dari super-kelas.
        direktur = theDirektur;
    }

    /**
     * @kembalikan direktur dari DVD ini
     */
    public String getDirektur()
    {
        return direktur;
    }
}
