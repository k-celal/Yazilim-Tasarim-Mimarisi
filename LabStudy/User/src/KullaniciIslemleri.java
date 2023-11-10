public abstract class KullaniciIslemleri {
    protected Kullanici kullanici;
    public KullaniciIslemleri(Kullanici _Kullanici){
        this.kullanici = _Kullanici;
    }
    public Kullanici getKullanici(){
        return kullanici;
    }
    public void setKullanici(Kullanici _Kullanici){
        this.kullanici = _Kullanici;
    }
}
