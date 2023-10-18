public class App {
    public static void main(String[] args) {
        Isci isci = new Isci("Celal", 160); 
        Muhendis muhendis = new Muhendis("Hasan", 160); 
        MaasHesapla maasHesapla = new MaasHesapla();

        int isciMaas = maasHesapla.hesapla(isci);
        int muhendisMaas = maasHesapla.hesapla(muhendis);

        System.out.println("Iscinin adi: " + isci.getAd() +" Iscinin Maaşı: " + isciMaas);
        System.out.println("Muhendis adi: " + isci.getAd() + " Muhendis Maaşı: " + muhendisMaas);
    }
}
