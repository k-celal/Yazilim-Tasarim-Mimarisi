public class Ucgen implements IAlan,ICevre {
    private double taban;
    private double yukseklik;

    public Ucgen(double taban, double yukseklik) {
        this.taban = taban;
        this.yukseklik = yukseklik;
    }
    @Override
    public double alanHesapla() {
        return (taban * yukseklik) / 2;
    }
    @Override
    public double cevreHesapla() {
        return taban + (2 * Math.sqrt(Math.pow(yukseklik, 2) + Math.pow(taban / 2, 2)));
    }
}