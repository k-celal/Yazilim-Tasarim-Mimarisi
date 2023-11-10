public class Odeme extends KullaniciIslemleri{

    public Odeme(Kullanici _Kullanici) {
        super(_Kullanici);
    }
    public void OdemeYap(){
        System.out.println(this.kullanici.getIsim() + " Adli kullanici odeme yapti");
    }
}
