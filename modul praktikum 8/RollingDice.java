import java.util.Random;

public class RollingDice { 

    public static void main(String[] args) { 
        Random rand = new Random(); //untuk random
        int tries = 0; //variabel jumlah baris

        int sum = 0;
        while (sum != 7) { //keadaan dimana roll1 dan roll2 akan terus bekerja jika roll1+roll2 tidak sama dengan 7
            // roll the dice once
            int roll1 = rand.nextInt(6) + 1; //pada roll1 yang dirandom hanya sampai 6
            int roll2 = rand.nextInt(6) + 1; //pada roll2 yang dirandom juga sampai 6
            sum = roll1 + roll2; //menjumlahkan roll1 dan roll2
            System.out.println(roll1 + " + " + roll2 + " = " + sum); //untuk mencetak roll1 dan roll2 beserta jumlahnya
            tries++;
        } 

        System.out.println("You won after " + tries + " tries!");  //untuk mencetak berapa jumlah tries yang kita dapatkan dari random tersebut
    }
} 

/*Class ini menggunakan fungsi MathRandom, dimana program akan random angka yang ada pada 
roll1 dan roll2. Angka yang dirandom pada roll satu dan dua hanya sampai angka 6 saja. dan kemudian dijumlahkan. 
*/