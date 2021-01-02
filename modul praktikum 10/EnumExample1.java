class EnumExample1{
	public enum Season { WINTER, SPRING, SUMMER, FALL}
 	public static void main(String[] args) {
    	for (Season s : Season.values())
  			System.out.println(s);
  	}
 }

 /*
 Class ini menggunakan Enum, Enum ini adalah Enum merupakan tipe data yang mengandung
kumpulan konstan yang tetap. Enum juga dapat dianggap seperti class yang memiliki beberapa nilai
konstan yang tetap.

method public enum Season pada class ini yang berisi WINTER, SPRING, SUMMER, FALL
pada saat di print maka akan otomatis yang dicetak adalah isi dari Enum(karena value nya sudah ttp)
*/