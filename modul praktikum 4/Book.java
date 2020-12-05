/**
 * code program ini menyimpan informasi tentang buku. 
 * code ini adalah contoh kecil dari program perpustakaan
 * @author (Sopia Safira.)
 * @version (Gosong Telaga, 5 Desember 2020)
 */
class Book
{
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    
    public Book(String bookAuthor, String bookTitle, int bookPages, String bookRefNumber)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }

    public String getAuthor() //method ini untuk mengembalikan nama author/penulis
    {
        return author;
    }
    
    public String title() //untuk mengembalikan judul buku
    {
        return title;
    }
    
    public void printAuthor() //Mencetak nama pengarang
    {
        System.out.println("Nama pengarang" +author);
    }
    
    public void printTitle() //mencetak judul buku
    {
        System.out.println("Judul buku" +title);
    }
    
    public int getPages() //mengembalikan jumlah atau banyak halaman pada buku
    {
        return pages;
    }
    
    public void printDetails() //method ini untuk mencetak detail pada buku
    {
        System.out.println("Nama pengarang " +author); //baris untuk mencetak nama pengarang
        System.out.println("Judul buku " +title); //baris ini untuk mencetak judul buku
        System.out.println("Jumlah halaman " +pages); //ini banyak halaman buku
        
        if (refNumber == "") { //sedangkan ini adalah syarat, jika nomor refrensi = ""
            System.out.println("zzz"); // maka akan dicetak zz
        } else
            System.out.println("Nomor refrensi " +refNumber); //else atau jika tidak maka akan dicetak sesuai yang di masukkan user pada method setRefNumber
    }
    
    public void setRefNumber(String ref) //untuk memberi nilai pada refrensi buku
    {
        this.refNumber = ref;
    }
    
}

