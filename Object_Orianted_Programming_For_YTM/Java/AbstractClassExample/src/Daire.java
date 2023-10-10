public class Daire extends Sekil{
    double yariCap;
    
    public Daire(double yariCap) {
        this.yariCap = yariCap;
    }
    
    double alanHesapla() {
        return Math.PI * yariCap * yariCap;
    }
}
