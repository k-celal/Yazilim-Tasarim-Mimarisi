public class EvFacade {
    private Klima klima;
    private Isik isik;
    private Kapi kapi;
    private Televizyon vizonTele;
    public EvFacade() {
        klima = new Klima();
        isik = new Isik();
        kapi = new Kapi();
        vizonTele = new Televizyon();
    }
    public void evdenDisariCik() {
        klima.kapat();
        isik.kapat(0);
        isik.kapat(1);
        isik.kapat(2);
        kapi.kilitle();
    }
    public void eveGir() {
        kapi.kilidiAc();
        isik.ac(0);
        isik.ac(1);
        isik.ac(2);
        klima.ac();
    }
    public void sicaklikGuncelle(int sicaklik) {
        klima.guncelle(sicaklik);
    }
    public void televizyonuAc() {
        vizonTele.ac();
    }
    public void televizyonuKapat() {
        vizonTele.kapat();
    }
    public void sesArtir() {
        vizonTele.sesArtir();
    }
    public void sesAzalt() {
        vizonTele.sesAzalt();
    }
    public void kanalDegistir(int kanal) {
        vizonTele.kanalDegistir(kanal);
    }
    public void kanalArtir() {
        vizonTele.kanalArtir();
    }
    public void kanalAzalt() {
        vizonTele.kanalAzalt();
    }
    public void klimalariKapat() {
        klima.kapat();
    }
    public void klimalariAc() {
        klima.ac();
    }
    public void isiklariKapat() {
        isik.kapat(0);
        isik.kapat(1);
        isik.kapat(2);
    }
    public void isiklariAc() {
        isik.ac(0);
        isik.ac(1);
        isik.ac(2);
    }
    public void kapilariKilitle() {
        kapi.kilitle();
    }
    public void kapilariAc() {
        kapi.kilidiAc();
    }

}
