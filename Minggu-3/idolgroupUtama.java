/*
  NIM  : 10115280
  Nama : Ary Villanda Dwitama
*/

class idolgroupUtama {
	public static void main(String[] args) {
		idolgroup group4846 = new idolgroup();
		
		group4846.nama = "Keyakizaka46";
		group4846.asal = "Jepang";
		group4846.gender = 'P';
		System.out.println("Nama	: "+group4846.nama);
        System.out.println("Asal	: "+group4846.asal);
		System.out.println("Gender	: "+group4846.gender);
		group4846.menari();
		group4846.menyanyi();
		group4846.akting();
	}
}