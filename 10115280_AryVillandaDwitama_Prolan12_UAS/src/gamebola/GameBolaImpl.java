package gamebola;

public class GameBolaImpl<T> implements GameBola {

    private T tahunrilis;
    private T pengembang;
    private T nama;
    private T platform;  
    private T engine; 

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
    
    public T getTahunrilis() {
        return tahunrilis;
    }

    public void setTahunrilis(T tahunrilis) {
        this.tahunrilis = tahunrilis;
    }

    public T getPengembang() {
        return pengembang;
    }

    public void setPengembang(T pengembang) {
        this.pengembang = pengembang;
    }

    public T getNama() {
        return nama;
    }

    public void setNama(T nama) {
        this.nama = nama;
    }

    public T getPlatform() {
        return platform;
    }

    public void setPlatform(T platform) {
        this.platform = platform;
    }

    public T getEngine() {
        return engine;
    }

    public void setEngine(T engine) {
        this.engine = engine;
    }    
    
}