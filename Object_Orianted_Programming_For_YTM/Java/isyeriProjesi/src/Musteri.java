public class Musteri extends Kullanici{
    private String tc;

    public Musteri(String tc) {
        this.tc = tc;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public void urunGoruntule() {
        System.out.println("Ürünler görüntülendi.");
    }
}
