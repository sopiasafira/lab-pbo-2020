public class Array1{
    public static void main(String[] ar){
        //deklarasi dan inisialisasi array
        int[] bil_bulat = {3, 5, 7}; //variabel dari array int bilangan bulat
        String[] warna = {"merah", "hijau", "kuning"}; ////variabel dari array warna

        //menampilkan array
        for(int i=0;i<bil_bulat.length;i++){ //untuk i = 0, i lebih kecil dari panjang.bilanganbulat, i ++
            System.out.print(bil_bulat[i] +" "); //maka cetak angka 3,5,7
        }
      System.out.println();
  
      for(int i=0;i<warna.length;i++){ //untuk i = 0, i lebih kecil dari panjang.warna, i ++
            System.out.print(warna[i] +" "); //maka cetak merah, hijau, kuning
      }
      System.out.println();
  
      //deklarasi dan inisialisasi array 2D
      int arr[][]={{1,2,3},{3,4,5},{5,6,7}};
  
      //menampilkan array 2D 
      for(int i=0;i<3;i++){
          for(int j=0;j<3;j++){
              System.out.print(arr[i][j]+" ");
          }
        System.out.println();
      }
    }
} 

/*
Class ini menggunakan array
*/ 