package Builder;

public class Sekil {

    private int kenarSayisi;
    private Konum baslangicKonum;
    private int kenarUzunluk;
    private int kenarKalinlik;
    private String kenarRenk;
    private String icRenk;

    public int getKenarSayisi() {
        return kenarSayisi;
    }

    public void setKenarSayisi(int kenarSayisi) {
        this.kenarSayisi = kenarSayisi;
    }

    public Konum getBaslangicKonum() {
        return baslangicKonum;
    }

    public void setBaslangicKonum(Konum baslangicKonum) {
        this.baslangicKonum = baslangicKonum;
    }

    public int getKenarUzunluk() {
        return kenarUzunluk;
    }

    public void setKenarUzunluk(int kenarUzunluk) {
        this.kenarUzunluk = kenarUzunluk;
    }

    public int getKenarKalinlik() {
        return kenarKalinlik;
    }

    public void setKenarKalinlik(int kenarKalinlik) {
        this.kenarKalinlik = kenarKalinlik;
    }

    public String getKenarRenk() {
        return kenarRenk;
    }

    public void setKenarRenk(String kenarRenk) {
        this.kenarRenk = kenarRenk;
    }

    public String getIcRenk() {
        return icRenk;
    }

    public void setIcRenk(String icRenk) {
        this.icRenk = icRenk;
    }

    @Override
    public String toString() {
        return "Sekil [kenarSayisi=" + kenarSayisi + ", baslangicKonum=" + baslangicKonum + ", kenarUzunluk="
                + kenarUzunluk + ", kenarKalinlik=" + kenarKalinlik + ", kenarRenk=" + kenarRenk + ", icRenk=" + icRenk
                + "]";
    }

}
