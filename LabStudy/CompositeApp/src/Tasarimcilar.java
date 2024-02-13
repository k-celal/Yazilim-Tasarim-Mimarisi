public class Tasarimcilar extends Calisanlar {

    public Tasarimcilar(String ad, String pozisyon) {
        super(ad, pozisyon);
        //TODO Auto-generated constructor stub
    }
    @Override
    public void Goster() {
        System.out.println("Tasarimci Ad: " + getAd()+ " Pozisyon: " + getPozisyon());
    }

}
