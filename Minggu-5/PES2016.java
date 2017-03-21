public class PES2016 {

    String nama;
	String rilis = "22 September 2015";
	
	PES2016(String nama) {
		this.nama = nama;
	}

	public void Developer() {
        System.out.println("Developer 		: "+nama);
    }    
	
	public void Platform() {
        System.out.println("Platform 		: PC, PS4, PS3, Xbox One, dan Xbox 360");
    }
	
	public void Visual() {
		System.out.println("Fitur Authentic Visuals : Pro Evolution Soccer (PES) menggunakan Fox Engine");
	}
	
	public void RealTouch() {
		System.out.println("Fitur Real Touch 	: Setiap pemain bola punya gaya masing-masing ketika mereka mengontrol bola.");
	}
	
	public void GoalKeeperID() {
		System.out.println("Penjaga gawang juga Mempunyai Kepribadian Sendiri");
	}
}