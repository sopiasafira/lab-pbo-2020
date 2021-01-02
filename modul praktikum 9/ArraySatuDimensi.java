import java.util.Arrays;

public class ArraySatuDimensi {

    public static void main(String[] args) {

        System.out.println("Array of primitives"); 
        int[] ints = {9, 6, 3}; //variabel dari array ints yang isinya adalah 3
        Arrays.sort(ints);
        for (int i = 0; i < ints.length; i++) { //perulanagn untuk array ints
            System.out.println(ints[i]); //mencetak sebanayk mana isinya
        }

        System.out.println("Array of strings"); 
        String[] strings = {"Merah", "Hijau", "Biru"}; //variabel dari array string
        Arrays.sort(strings);
        for (String color : strings) {
            System.out.println(color); //mecetak warna-warna yang ada pada array
        }

        System.out.println("Setting an initial size"); //pengaturan dari inisialisasi ukuran
        int[] sized = new int[10]; //ukuran banyak array ada 10
        for (int i = 0; i < sized.length; i++) { //selagi syarat for ini masih terpenuhu
            sized[i] = i * 100; //kalikan i dengan 100 (i dimulai dari 0)
        }
        for (int value : sized) {
            System.out.println(value); //nilai yang di print sebanyak ukuran Array 
        }

        System.out.println("Copying an array");
        int[] copied = new int[5];
        System.arraycopy(sized, 5, copied, 0, 5);
        for (int value : copied) {
            System.out.println(value); //mencetak copied yang dimulai dari 5
        }
    }
} 

/*
Class ini menggunakan Array satu Dimensi
penjelasan ada pada tiap baris
*/