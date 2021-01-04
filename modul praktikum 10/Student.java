class Student{
  int NIM;
  String name;
  static String college ="Unsyiah"; //collage = Unsyiah
  
  static void change(){
      college = "USK"; // pada static ini collage diganti = USK
  }
 
  Student(int r,String n){
      NIM = r;
      name = n;
  }

  void display (){
      System.out.println(NIM+" "+name+" "+college); //untuk menampilkan Nim, nama dan collage
    }

  public static void main(String args[]){
      Student s1 = new Student(111, "Karen");
      Student s2 = new Student(222, "Arya");
      s1.display(); //menampilkan objek s1
      s2.display(); ////menampilkan objek s2
    
      Student.change();
      s1.display(); //lalu ubah collage menjadi USK, karena pemanggilan change();
      s2.display();
  }
}  

/* pada class ini outpu yang dihasilkan adalah
111 Karen Unsyiah
222 Arya Unsyiah
111 Karen USK
222 Arya USK

*/