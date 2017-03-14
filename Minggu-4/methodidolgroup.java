/*
  NIM  : 10115280
  Nama : Ary Villanda Dwitama
*/

public class methodidolgroup {
	public String nama;
	
	public methodidolgroup() {
		nama = "Keyakizaka46";
		
	}
	
	public static void main(String[] args) {
        //Pemanggilan method
        methodidolgroup group4846 = new methodidolgroup();
		
		System.out.println("Nama		: "+group4846.nama);
        group4846.asal("Asal		: Jepang");
		group4846.sister("Sister		: Nogizaka46");
		group4846.sister("Rival Sister	: AKB48", " SKE48, NMB48, HKT48, JKT48");
	    System.out.println("Member		: "+group4846.jumlahmember(22, 12)+" Member");	
    }
    
    //method tidak mengembalikan nilai dengan parameter
    private void asal(String nama) {
        this.nama=nama;
    }
    private void sister(String idol) {
        System.out.println(idol);
    }
	private void sister(String idol1, String idol2) {
        System.out.println(idol1+idol2);
    }
    //method mengembalikan nilai dengan parameter
	private int jumlahmember (int kanji, int hiragana) {
        return kanji + hiragana;
    }
}