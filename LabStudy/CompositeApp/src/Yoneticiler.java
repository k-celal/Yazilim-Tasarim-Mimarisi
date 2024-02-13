public class Yoneticiler extends Calisanlar {

    public Yoneticiler(String ad, String pozisyon) {
        super(ad, pozisyon);
        //TODO Auto-generated constructor stub
    }
    @Override
    public void Goster() {
        System.out.println("Yonetici Ad: " + getAd()+ " Pozisyon: " + getPozisyon());
    }

}
