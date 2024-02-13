public class Gelistiriciler extends Calisanlar{

    public Gelistiriciler(String ad, String pozisyon) {
        super(ad, pozisyon);
        //TODO Auto-generated constructor stub
    }
    @Override
    public void Goster() {
        System.out.println("Gelistirici Ad: " + getAd()+ " Pozisyon: " + getPozisyon());
    }
}
