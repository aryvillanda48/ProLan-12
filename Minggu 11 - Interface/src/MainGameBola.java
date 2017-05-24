import java.util.Scanner;

public class MainGameBola {
 
    public static void main(String[] args) {
    GameBolaImpl bola = new GameBolaImpl();
    
    Scanner input = new Scanner(System.in);
    int n;
    
    do {
    System.out.println("Menu");
    System.out.println("1. PES 2016");
    System.out.println("2. PES 2017");
    System.out.println("3. FIFA 17");
    System.out.println("4. KELUAR");
    
    System.out.print("Masukan Pilihan Anda : ");
    n = input.nextInt();
    
    if(n == 1){
        bola.setNama("PES 2016");
        System.out.println("Nama           : "+bola.getNama());
        bola.setPengembang("KONAMI");
        System.out.println("Developer      : "+bola.getPengembang());
        bola.setPlatform("PC, PS4, PS3, Xbox One, dan Xbox 360");
        System.out.println("Platform       : "+bola.getPlatform());
        bola.setEngine("Fox Engine");
        System.out.println("Engine         : "+bola.getEngine());
        bola.setTahunrilis("22 September 2015");
        System.out.println("Tahun Rilis    : "+bola.getTahunrilis());
        System.out.println("Harga Sekarang : +-Rp."+bola.getHarga1());
    }
    if(n == 2){
        bola.setNama("PES 2017");
        System.out.println("Nama           : "+bola.getNama());
        bola.setPengembang("KONAMI");
        System.out.println("Developer      : "+bola.getPengembang());
        bola.setPlatform("PC, PS4, PS3, Xbox One, dan Xbox 360");
        System.out.println("Platform       : "+bola.getPlatform());
        bola.setEngine("Fox Engine");
        System.out.println("Engine         : "+bola.getEngine());
        bola.setTahunrilis("15 September 2016");
        System.out.println("Tahun Rilis    : "+bola.getTahunrilis());
        System.out.println("Harga Sekarang : +-Rp."+bola.getHarga2());
    }
    if(n == 3){
        bola.setNama("FIFA 17");
        System.out.println("Nama           : "+bola.getNama());
        bola.setPengembang("EA Sports");
        System.out.println("Developer      : "+bola.getPengembang());
        bola.setPlatform("PC, PS4, PS3, Xbox One, dan Xbox 360");
        System.out.println("Platform       : "+bola.getPlatform());
        bola.setEngine("Frostbite 3");
        System.out.println("Engine         : "+bola.getEngine());
        bola.setTahunrilis("29 September 2016");
        System.out.println("Tahun Rilis    : "+bola.getTahunrilis());
        System.out.println("Harga Sekarang : +-Rp."+bola.getHarga3());
    }
    }while(n!=4);
    }
}
