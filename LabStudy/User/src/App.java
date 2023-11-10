public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Kullanici k1 = new Kullanici();
        k1.setIsim("celal");
        k1.setMail("celal@ktu.tr");
        Adres adres = new Adres();
        adres.setIl("Nigde");
        adres.setIlçe("Merkez");
        k1.setFaturaAdresi(adres);
        k1.setKargoAdresi(adres);
        Login login= new Login(k1);
        login.GirisYap();
        Odeme odeme = new Odeme(k1);
        odeme.OdemeYap();
    }
}

