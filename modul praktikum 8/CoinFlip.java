import java.util.Random; 

public class CoinFlip {
 
    public static void main(String[] args) {

        // 50% chance heads, 50% chance tails
        Random rand = new Random(); //untuk random
        double chance = rand.nextDouble();
        if (chance < 0.5) { //syarat
            System.out.println("heads!"); //jika lesematan lebih kecil dari 0.5 maka cetak heads!
        } else {
            System.out.println("tails!"); //lainnya maka cetak tails!
        }
    } 
}

/*code program ini menggunakan class random,  akan merandom output
"heads" dan "tails" pada kesempatan saat kita run program ini
*/