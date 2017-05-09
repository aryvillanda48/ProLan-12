public class Ary extends Mahasiswa {
    
 
     @Override
    public  String getNama() {
        return super.getNama();
    }

    @Override
    public void printNama() {
        System.out.println(getNama());
	}
    
     @Override
    public String getNim() {
        return super.getNim();
    }

    @Override
    public void printNim() {
        System.out.println(getNim());
        }
    
        
    @Override
    void kuliah() {
        System.out.println("Kuliah itu berat, banyak tugas !!! "); 
    }

    @Override
    void lulus() {
        System.out.println("Harus lulus tepat waktu!!"); 
    }

    @Override
    void tidaklulus() {
        System.out.println("Anda tidak lulus dan harus mengulang!!!"); 
    }
    
}
