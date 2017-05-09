public class MainMahasiswa {
	public static void main (String[] args) {
    Ary avd = new Ary();
       
    System.out.print("Nama Anda        :      "); avd.printNama();
    System.out.print("NIM Anda         :      "); avd.printNim();
    System.out.println("======================================================\n");

    avd.kuliah();
    avd.lulus();
    avd.tidaklulus();
	}
}
    
