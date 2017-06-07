package tes;


public class Tes03 {
   private static <T> Object Tgame(T Type){
        return Type;
    }
    
    public static void main(String[] args) {
        Game qq = new Game();
        
        Tgame((qq).setGame("PES 2018"));
        System.out.println(Tgame((qq).getGame()));
    }
} 

