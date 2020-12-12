import java.util.Random;

public class RandomRange {

    public static void main(String[] args) {
 
        Random num = new Random(); 
        int randomnum = num.nextInt(10)+4; //logika untuk random
        System.out.println("Random Number: " + randomnum); //output dari angka yang di random
    }
} 

/*class ini menggunakan fungsi class random, dimana program akan mengacak angka dari 1-14 untuk
ditampilkan
*/