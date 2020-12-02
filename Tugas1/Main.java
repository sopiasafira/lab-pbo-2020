import java.util.*;
/**
 * Class ini berfungsi untuk mendeklarasi objek Bus dan objes Penumpang. Pada method main() ini anda akan mensimulasikan proses 
 * naik dan turunnya penumpang dari bus. 
 *
 * @author (Sopia Safira)
 * (1908107010010)
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //untuk scan setiap nilai yang di input user
        Bus bus1 = new Bus(); //Objek yang dibuat dari class bus
        boolean mulai = true;
        String nama;
        int umur;
        
       
        
        while(mulai) {
            System.out.println("|==========================================|");
            System.out.println("|##SELAMAT DATANG DI BUS TRANS KOETARADJA##|");
            System.out.println("|==========================================|");
            System.out.println("MENU :");
            System.out.println("1. Naikkan Penumpang");
            System.out.println("2. Turunkan Penumpang");
            System.out.println("3. Lihat Penumpang");
            System.out.println("4. Berhenti");
            System.out.print("Masukkan Pilihan Anda : "); 
            String pilihan = input.next();
            System.out.println();

            if (pilihan.equals("1")) { //pilih 1 untuk menaikkan penumpang lalu input identitas penumpang
               System.out.println("IDENTITAS PENUMPANG");

               System.out.print("Nama : ");
               nama = input.next();
               System.out.print("Umur : ");
               umur = input.nextInt();
               System.out.print("Hamil(y/n) : ");
               String hamilKata = input.next();
               boolean hamil;
               if (hamilKata.equals("y")) {
                    hamil = true;
               } else {
                    hamil = false;
               }
                
               System.out.println();
               Penumpang penumpang = new Penumpang(nama, umur, hamil);
               boolean bisa = bus1.naikPenumpang(penumpang);
               
               
               if(bisa) {
                    System.out.println("Penumpang berhasil ditambahkan!");
                    lihatPenumpang(bus1);
                    System.out.println();
               } else {
                    System.out.println("Penumpang GAGAL ditambahkan!");
                    System.out.println("Tidak ada kursi yang kosong");
                    System.out.println();

               }
            } else if (pilihan.equals("2")) {
                System.out.print("Nama : ");
                nama = input.next();
                System.out.println();
                boolean bisa = bus1.turunkanPenumpang(nama);
                if (bisa) {
                    System.out.println("Penumpang Berhasil Turun");
                    System.out.println();
                    lihatPenumpang(bus1);
                    System.out.println();
                } else {
                    System.out.println("Penumpang tidak ditemukan!");
                    System.out.println("=====================================");
                    System.out.println();
                }
            } else if (pilihan.equals("3")) {
                System.out.println();
                lihatPenumpang(bus1);
                System.out.println();
            } else if (pilihan.equals("4")) {
                mulai = !mulai;
                break;
            }
        }
        
        input.close();
    }
    
    public static void lihatPenumpang(Bus bus1) {
        Penumpang[] biasa = bus1.getPenumpangBiasa();
        Penumpang[] prioritas = bus1.getPenumpangPrioritas();
        int jumlahBiasa = 0;
        int jumlahPrioritas = 0;
      
        System.out.print("Penumpang Biasa : ");
        for(int i = 0; i < biasa.length; i++) {
            if(biasa[i] != null) {
                System.out.print(biasa[i].getNama() + ", "); 
                System.out.println();
                jumlahBiasa++;   
            }
        }
        if (jumlahBiasa == 0) {
            System.out.print("<kosong>");
            System.out.println();
        }
        
        System.out.print("Penumpang Prioritas : ");
        
        for(int i = 0; i < prioritas.length; i++) {
            if(prioritas[i] != null) {
                System.out.print(prioritas[i].getNama() + ", ");
                jumlahPrioritas++;    
            }
        }
        if (jumlahPrioritas == 0) {
            System.out.print("<kosong>");
            System.out.println();
        }
        
        
        System.out.println();
        System.out.println("-------------------------------------------------------------");
    }
}
