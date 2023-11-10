public class Dikdortgen implements IAlan,ICevre {
    private double en;
    private double boy;

    public Dikdortgen(double en, double boy) {
        this.en = en;
        this.boy = boy;
    }
    @Override
    public double alanHesapla() {
        return en * boy;
    }
    @Override
    public double cevreHesapla() {
        return 2 * (en + boy);
    }
}
