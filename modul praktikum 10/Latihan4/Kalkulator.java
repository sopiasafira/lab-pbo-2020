import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) { //method main
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.perhitungan(); //memanggil method perhitungan
    }

    protected void perhitungan() {
        InputHelper input = new InputHelper(); //membuat objek input class MtahHelper

        String s1 = input.getInput("Masukkan angka: ");
        String s2 = input.getInput("Masukkan angka: ");
        String op = input.getInput("Pilih operasi (+ - * /):"); //memilih operasi
 
        double result = 0; 

        try {
            switch (op) {
                case "+": //jika memilih case peratama/+ maka kerjakan MathHelper.penambahan(s1, s2);
                    result = MathHelper.penambahan(s1, s2);
                    break;
                case "-": //jika memilih case peratama/- maka kerjakan MathHelper.pengurangan(s1, s2);
                    result = MathHelper.pengurangan(s1, s2);
                    break;
                case "*": //ika memilih case peratama/* maka kerjakan  MathHelper.perkalian(s1, s2);
                    result = MathHelper.perkalian(s1, s2);
                    break;
                case "/": //ika memilih case peratama/"/" maka kerjakan MathHelper.pembagian(s1, s2);
                    result = MathHelper.pembagian(s1, s2);
                    break;
                default:
                    System.out.println("Operasi tidak dikenal!"); //jika memilih selain tanda yang 4 maka akan tercetak seperti disamping
                    return;
            }

            System.out.println("Hasil: " + result);

        } catch (Exception e) {
            System.out.println("Number formatting exception " +e.getMessage());
        }
    }
    class InputHelper{
        
        public String getInput(String prompt) {
            System.out.print(prompt);
            Scanner sc = new Scanner(System.in);
            return sc.nextLine();
        }
   } 
}

/* Program ini adalah program kalkulator yang dapat melakukan operasi penambahan, pembagian, pengurangan, perkalian.
