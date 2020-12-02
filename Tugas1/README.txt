DESKRIPSI PROGRAM

1. Class Penumpang 
	Class ini berfungsi untuk mewakili identitas penumpang yang akan naik kedalam class Bus nantinya, setiap penumpang ada identitas nama (method getNama()
ada identitas umur (method getUmur()) dan identitas hamil (method getHamil()). Pada method getUmur() dan getHamil() nantinya akan diberikan syarat. 
Class Penumpang ini extends class Bus. Extends ini berfungsi untuk memanggil fungsi dari class lain, sehingga kita tidak perlu lagi membuat script yang sama 
pada class yang akan kita buat dengan class yang kita buat.  

2. class Bus 
	Class ini saya gunakan untuk menampung penumpang yang masuk. penumpang yang masuk tersebut ditampung pada objek penumpang yang telah kita buat
dan berbentuk array. Objek yang telah dibuat tadinya menjadi atribut pada class Bus ini (kursi untuk penumpang duduk). Kursi tempat duduk (array yang telah 
dibuat) terdiri dari 2 jenis kursi yaitu :
*untuk penumpangBiasa[4], artinya berjumlah 4 kursi
*untuk penumpangPrioritas[2,artinya berjumlah 2 kursi

*method getPenumpangBiasa() dan getPenumpangPrioritas()ini berfungsi untuk mengembalikan array yang telah dibuat.

*method getJumlahPenumpangBiasa() dan getJumlahPenumpangPrioritas()berfungsi untuk menegmbalikan jumlah penumpang yang diminta nantinya.
pada method ini saya berikan perulangan 
					
----untuk jumlah penumpang prioritas	for(int i = 0; i < arrayPenumpangPrioritas.length; i++) {		
           					 if (arrayPenumpangPrioritas[i] != null) {
                					jumlah++;
           						 }
       					}
        				return jumlah;
----untuk jumlah penumpang biasa 	  
					for(int i = 0; i < arrayPenumpangBiasa.length; i++) {
            					if (arrayPenumpangBiasa[i] != null) {
                					jumlah++;
           						 }
        				}
        				return jumlah;


untuk i sama dengan 0, i lebih kecil dari panjang array prioritas/biasa yang dibuat. jika array penumpang prioritas/biasa[i] tidak sama dengan null 
maka jumlahkan++ dan kembalikan nilai jumlahkan tersebut 

*method naikPenumpang()berfungsi untuk menaikkan penumpang
saya membuat syarat untuk penumpang yang naik menggunakan statement if else, jika penumpang yang naik berumur lebih dari 60 atau kurang dari 10 atau 
penumpang tersebut hamil maka untuk penumpang tersebut berada pada kursi prioritas. sebaliknya jika tidak memenuhi syarat pada if tersebut maka penumpang
berada pada kursi penumpang biasa.(untuk penulisan syarat ini bisa dilihat di class Bus pada method public boolean naikPenumpang(Penumpang penumpang)


*method turunkanPenumpang berfungsi untuk menurunkan penumpang yang ada pada array, baik penumpangBiasa maupun penumpangPrioritas
penulisan cara turunkannya dapat dilihat pada method public boolean turunkanPenumpang(String nama) pada class Bus. penumpang akan diturunkan berdasarkan
String nama yang telah di terima pada array setiap kursi berdasarkan method getNama. jika benar adanya dengan nama penumpang seperti yang diinput user
maka return true. jika tidak maka return false.

3. class Main
	Class ini berfungsi untuk mendeklarasi objek Bus dan objes Penumpang. Pada method main() ini anda akan mensimulasikan proses naik dan turunnya 
penumpang dari bus. pada class ini ada dua method
* public static void main(String[] args), method ini berisi semua implementasi atau tujuan code ini. yaitu untuk menampilkan menu, lalu memilih menu
menaikkan penumpang, menurunkan lalu melihat penumpang yang ada dan terakhir keluar dari alur code bus ini atau pilih (4).
*public static void lihatPenumpang(Bus bus1), method ini untuk penguraian atau logika dari penumpang yang kita lihat dan method ini nantinya akan 
dipanggil pada method main() dan diletakkan pada menu yang diperlukan. yaitu ketika selesai menambahkan penumpang, menurunkan, dan melihat.


CARA INSTALASI PROGRAM dan RUN

>>Clone repostory

https://github.com/sopiasafira/lab-pbo-2020

>>Compile program tersebut
cd ke directory file code tersebut dengan menggunkaan terminal/cmd dan run ;

javac Main.java

>>Run program tersebut
java Main
 
