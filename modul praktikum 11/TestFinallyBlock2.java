public class TestFinallyBlock2{  
  public static void main(String args[]){  
    try{  
      int data=25/0;  
      System.out.println(data); //mencetak data, data adalah  
    }  
    catch(ArithmeticException e){
      System.out.println(e);
    }  
    finally{
      System.out.println("finally block is always executed");
    }  
    System.out.println("rest of the code...");  
  }  
}

/*

Output dari class ini adalah 

java.lang.ArithmeticException: / by zero
finally block is always executed
rest of the code...


Blok try akan berisi bagian yang akan menghasilkan exception.Blok catch akan menangkap exception lalu 
menanganinya.Blok finally merupakan blok yang akan selalu dilakukan, saat ada atau tiada exception. 
*/