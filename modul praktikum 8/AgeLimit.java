import java.util.Scanner;

public class AgeLimit {
   public static void main(String args[]) { 
        int age=0; 
        Scanner sc = new Scanner(System.in); //scann setiap input user
        System.out.print("Enter age "); //memasukkan age
        age = sc.nextInt();
      	//age=Math.max(age,0);
     	age=Math.min(40, age); 
       System.out.print("Age is "+age); //untuk cetak outpu
    } 
}

/*program code ini menggunakan program class math yaitu Math.min(batasan/limit)
program ini hanya menerima age/umur hingga 40. jika kita input lebih dari itu
maka akan "age is 40" jika kita input dibawah 40 maka yang keluar akan sesuai
dengan yang kita input
*/