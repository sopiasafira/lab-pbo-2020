
/**
 * Write a description of class Penumpang here.
 *
 * @author (Sopia Safira)
 * @NIM (1908107010010)
 */
public class Penumpang extends Bus{
    private String nama;
    private int umur;
    private boolean hamil;

    public Penumpang(String nama, int umur, boolean hamil) {
        this.nama = nama;
        this.umur = umur;
        this.hamil = hamil;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public boolean getHamil() {
        return hamil;
    }
}
