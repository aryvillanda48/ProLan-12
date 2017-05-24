public class GameBolaImpl implements GameBola {

    private String tahunrilis;
    private String pengembang;
    private String nama;
    private String platform;  
    private String engine; 

    @Override
    public double getHarga1() {
        return 300000;
        
    }

    @Override
    public double getHarga2() {
        return 475000;
        
    }

    @Override
    public double getHarga3() {
        return 500000;
        
    }
    
    public String getTahunrilis() {
        return tahunrilis;
    }

    public void setTahunrilis(String tahunrilis) {
        this.tahunrilis = tahunrilis;
    }

    public String getPengembang() {
        return pengembang;
    }

    public void setPengembang(String pengembang) {
        this.pengembang = pengembang;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    
}
