import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListContoh {
	public static void main(String[] args) {

        //Membuat object dari kelas Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("1608107010021", "Fulan 21", 2016); //obejek 1 yang dibuat dari class Mahasiswa
        Mahasiswa mhs2 = new Mahasiswa("1608107010002", "Fulan 2", 2016); //obejek 2 yang dibuat dari class Mahasiswa
        Mahasiswa mhs3 = new Mahasiswa("1608107010046", "Fulan 46", 2016); //obejek 3 yang dibuat dari class Mahasiswa

        //Membuat ArrayList
        List<Mahasiswa> mahasiswa = new ArrayList<>();
        mahasiswa.add(mhs1);
        mahasiswa.add(mhs2);
        mahasiswa.add(mhs3);

        //Perulangan menggunakan Interface Iterator yy
        Iterator itr = mahasiswa.iterator();

        while (itr.hasNext()){
            Mahasiswa m = (Mahasiswa) itr.next();
            System.out.println(m.npm + " " + m.nama + " " + m.angkatan); // cetak semua objek yang didahului dari npm, nama, angkatan
        }
    }
}

/* 
class ini menggunakan iterator, array List dan list pada java

Iterator adalah salah satu interface yang tersedia di dalam library Java, yang berlokasi di java.util package. 
Iterator digunakan untuk mengakses dan menampilkan nilai beserta tambahan method lain yang didefinisikan 
di dalam interface Iterator

*/