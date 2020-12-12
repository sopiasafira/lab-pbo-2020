
/**
 * class Manusia yg merupakan subkelas dari MakhlukHidup.
 * 
 * @author Viska
 * @version 23 des 2011
 */
public class Manusia extends MakhlukHidup
{
   
    /**
     * Constructor for objects of class Manusia
     */
    public Manusia()
    {
        
    }

    /**
     * Method berjalan yang dioverride oleh Manusia
     * 
     * 
     */
    public void berjalan()
    {
        System.out.println("Manusia berjalan dengan 2 kaki");
    }
}

/*
Pada saat kita membuat method berjalan pada class ini menjadi comment, maka keluar eror saat di compile.
ini disebabkan karena abstract class telah mengovveride method abstracnya
yaitu berjalan kepada sub-kelasnya dan jika tidak maka sub-kelas harus juga bertipe abstract.
makanya ketika error massage nya adalah "manusia bukan abstract class dan juga tidak override method abastrac"
*/