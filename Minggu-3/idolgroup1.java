/*
  NIM  : 10115280
  Nama : Ary Villanda Dwitama
*/

class idolgroup1 {
	public String nama, asal, sister;
	public byte jumlahMember;
	public short tahunDebut;
	public int tanggalTerbentuk;
	public boolean negara;
	public char jenisKelamin;
	
	public void nama(){
		System.out.println("Keyakizaka46");
	}
	
	public void asal(){
		System.out.println("Jepang");	
	}
	
	public void negara(){
		boolean Jepang = true;
		System.out.println(Jepang);
	}
	
	public void sister(){
		System.out.println("Nogizaka46");
	}

	public void jumlahMember(){
		byte member = 34;
		System.out.println(member);		
	}
		
	public void tahunDebut(){
		short debut = 2015;
		System.out.println(debut);		
	}
		
	public void tanggalTerbentuk(){
		int terbentuk = 21082015;
		System.out.println(terbentuk);		
	}
	
	public void jenisKelamin(){
		char gender = 'P';
		System.out.println(gender);		
	}
	
}