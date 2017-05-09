public abstract class Mahasiswa {
  public String nama = "Ary Villanda Dwitama";
  public String nim = "10115280";
           
  public String getNama() {
        return nama;
    }

public abstract void printNama();

public String getNim() {
        return nim;
    }

public abstract void printNim();
  
  abstract void kuliah();
  abstract void lulus();
  abstract void tidaklulus();
}