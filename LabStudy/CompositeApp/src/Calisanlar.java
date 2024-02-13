public abstract class Calisanlar {
    private String ad;
    private String pozisyon;
    public Calisanlar(String ad, String pozisyon) {
        this.ad = ad;
        this.pozisyon = pozisyon;
    }
    public String getAd() {
        return ad;
    }
    public String getPozisyon() {
        return pozisyon;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
    public void setPozisyon(String pozisyon) {
        this.pozisyon = pozisyon;
    }
    public void Goster() {}   
}
