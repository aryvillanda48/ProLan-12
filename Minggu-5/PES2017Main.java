public class PES2017Main extends PES2016 {

	PES2017Main(String pengembang) {
		super(pengembang);
	}
	
    public void CornerKickStrategies() {
        System.out.println("Fitur Corner Kick Strategies : Di PES 2017 kamu bisa atur strategi set piece ketika bertahan ataupun menyerang.");
    }	
	
	public void GoalKeeperID() {
        System.out.println("Fitur Goal Keeper ID	: Kiper di PES 2017 udah dipoles sedemikian rupa, jadi kamu akan lebih susah untuk mencetak gol");
    }

    public void Super() {
        GoalKeeperID();
        super.GoalKeeperID();
        
    }

    public static void main(String[] args) {
        PES2017Main bola = new PES2017Main("Konami");
		System.out.println("PES2016 dan PES2017\n");
		bola.Platform();
		bola.Visual();
		bola.RealTouch();
		bola.CornerKickStrategies();
        bola.Super();
		bola.Developer();
    }
}