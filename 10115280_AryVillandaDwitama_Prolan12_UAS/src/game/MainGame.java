package game;

import GameFPS.GameFPS;
import java.util.Scanner;
import gamebola.GameBolaImpl;

public class MainGame {
 
    public static void main(String[] args) {
    Game game = new Game();    
    GameBolaImpl<String> bola = new GameBolaImpl<>();
    GameFPS fps = new GameFPS();
    
    System.out.println("Pengertian : ");
    System.out.println(game.game());
    System.out.println(game.genre());
    
    Scanner input = new Scanner(System.in);
    int n;
    
    do {
    System.out.println("Berikut genre-genre Game :");
    System.out.println("1. Sports");
    System.out.println("2. FPS");
    System.out.println("3. Adventure");
    System.out.println("4. RPG");
    System.out.println("5. Strategy");
    System.out.println("6. Simulation");
    System.out.println("7. Keluar");
   
    System.out.print("Masukan Pilihan Anda : ");
    n = input.nextInt();
    
    switch (n){
    case 1 : 
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
     break;
    
    case 2 :
        do {
        System.out.println("Menu");
        System.out.println("1. Counter-Strike : Global Offensive");
        System.out.println("2. Call of Duty : World at War");
        System.out.println("3. Battlefield 4");
        System.out.println("4. KELUAR");
    
        System.out.print("Masukan Pilihan Anda : ");
        n = input.nextInt();
    
            if(n == 1){
            fps.setNama("Counter-Strike : Global Offensive");
            System.out.println("Nama           : "+fps.getNama());
            fps.setPengembang("Valve Corporation");
            System.out.println("Developer      : "+fps.getPengembang());
            fps.setPlatform("PC, PS3, OS X, dan Xbox 360");
            System.out.println("Platform       : "+fps.getPlatform());
            fps.setEngine("Source");
            System.out.println("Engine         : "+fps.getEngine());
            fps.setTahunrilis("21 Agustus 2012");
            System.out.println("Tahun Rilis    : "+fps.getTahunrilis());
            System.out.println("Harga Sekarang : +-Rp."+fps.getHarga1());
            }
            if(n == 2){
            fps.setNama("Call of Duty : World at War");
            System.out.println("Nama           : "+fps.getNama());
            fps.setPengembang("Treyarch");
            System.out.println("Developer      : "+fps.getPengembang());
            fps.setPlatform("PC, PS3, Wii, dan Xbox 360");
            System.out.println("Platform       : "+fps.getPlatform());
            fps.setEngine("IW engine");
            System.out.println("Engine         : "+fps.getEngine());
            fps.setTahunrilis("11 November 2008");
            System.out.println("Tahun Rilis    : "+fps.getTahunrilis());
            System.out.println("Harga Sekarang : +-Rp."+fps.getHarga2());
            }
            if(n == 3){
            fps.setNama("Battlefield 4");
            System.out.println("Nama           : "+fps.getNama());
            fps.setPengembang("EA DICE");
            System.out.println("Developer      : "+fps.getPengembang());
            fps.setPlatform("PC, PS4, PS3, Xbox One, dan Xbox 360");
            System.out.println("Platform       : "+fps.getPlatform());
            fps.setEngine("Frostbite 3");
            System.out.println("Engine         : "+fps.getEngine());
            fps.setTahunrilis("29 Oktober 2013");
            System.out.println("Tahun Rilis    : "+fps.getTahunrilis());
            System.out.println("Harga Sekarang : +-Rp."+fps.getHarga3());
            }
     }while(n!=4);
         break;
    case 3 :
         System.out.println("Sementara belum tersedia");
         System.out.println();
         break;
     case 4 :
         System.out.println("Sementara belum tersedia");
         System.out.println();
         break;
     case 5 :
         System.out.println("Sementara belum tersedia");
         System.out.println();
         break;
     case 6 :
         System.out.println("Sementara belum tersedia");
         System.out.println();
         break;
     }
    }while(n!=7);
    }
}
