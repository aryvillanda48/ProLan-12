/*
   NIM  : 10115280
   Nama : Ary Villanda Dwitama
*/

public class PES2017Main extends PES2016 {

    public PES2017Main(String nama){
		super(nama);
		System.out.println(nama);
	}
	
	@Override
	public void GoalKeeperID() {
		System.out.println("Fitur Goal Keeper ID	: Kiper di PES 2017 udah dipoles sedemikian rupa, jadi kamu akan lebih susah untuk mencetak gol");
		super.GoalKeeperID();
	}
	
	@Override
	public void TanggalRilis() {
		System.out.println("Tanggal Rilis PES 2017	: 15 September 2016");
		super.TanggalRilis();
	}

	public static void main(String[] args) {
	PES2017Main bola = new PES2017Main("Pro Evolution Soccer");
	System.out.println("PES2016 dan PES2017\n");
	bola.Platform();
	bola.Visual();
	bola.RealTouch();
	bola.GoalKeeperID();
	bola.TanggalRilis();
    }
}