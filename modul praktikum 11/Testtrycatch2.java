public class Testtrycatch2{  
 	public static void main(String args[]){  
  		try{  
        		int data=10/0;  
     	} catch (ArithmeticException e){System.out.println(e);}  
   
  		System.out.println("rest of the code...");  
 	}  
}


/* Output dari program ini adalah

java.lang.ArithmeticException: / by zero
rest of the code...


program juga  sudah dihandle dengan menerapkan konsep exception handling jadi saat di run
eror udah dihandle . maka akan diprint erornya namun program tetap berhasil di run

*/
