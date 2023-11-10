public class Login extends KullaniciIslemleri {

    public Login(Kullanici _Kullanici) {
        super(_Kullanici);
    }
    public void GirisYap(){
        System.out.println(this.kullanici.getIsim() + " Adli kullanici giris yapti");
    }

}
