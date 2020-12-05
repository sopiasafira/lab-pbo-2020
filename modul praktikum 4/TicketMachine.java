/**
 * "TicketMachine" adalah code mesin tiket yang mengeluarkan tiket bertarif. 
 * Harga tiket ditentukan melalui method konstruktor. 
 * Instance akan memeriksa untuk memastikan bahwa pengguna/pembeli tiket memasukkan jumlah uang yang benar/sesuai/tidak negatif
 * dan mesin hanya akan mencetak tiket jika jumlah uang yang dimasukkan cukup
 * @author David J. Barnes and Michael Kolling
 * @version 2008.03.30
 */
public class TicketMachine
{
    // Harga tiket dari mesin ini
    private int harga;
    // jumlah uang yang dimasukkan pelanggan
    private int balance;
    // Jumlah total uang yang dikumpulkan oleh mesin
    private int total;

    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine(int ticketCost)
    {
        harga = 0;
        balance = 0;
        total = 0;
    }

    public TicketMachine()
    {
        harga = 1000;
        balance = 0;
        total = 0;
    }
    
    /*mengembalikan harga tiket 
    */
    public int getHarga()
    {
        return harga;
    }

    /*mengembalikan jumlah uang yang dimasukkan
    */
    public int getBalance()
    {
        return balance;
    }

    /**
     *Menerima unag yang masuk dari pelanggan.
     * Cek apakah uang yang dimasukkan benar/tidak minus.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0)
            balance = balance + amount;
       else
          System.out.println("Masukkan uang yang bernilai positif" +amount);
    }

    /**
     * Cetak tiket jika uang yang dumasukkan cukup, dan
     * kurangi saldo dengan harga tiket. Lalu cetak
     * "Pesan kesalahan" jika uang yang dimasukkan kurang.
     */
    public void cetakTicket()
    {
        if(balance >= harga){
            // Simulasi untuk percetakan tiket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + harga + " cents.");
            System.out.println("##################");
            System.out.println();

            // Perbarui total yang dikumpulkan dengan harga
            total = total + harga;
            // Kurangi saldo dengan harga
            balance = balance - harga;
            if(balance != 0)
                System.out.println("Uang kembaliannya adalah "+balance);
        } else
          System.out.println("Uangnya kurang, masukkan uang lagi dong");
    }
}


/* Code ini sudah saya edit variabel beserta method dan lain sebaginya kedalam bahasa yang mudah saya pahami( Sorry author David J. Barnes and Michael Kolling) 
simulasi pengejaan latihan ini sudah saya lampirkan disebuah file
*/ 