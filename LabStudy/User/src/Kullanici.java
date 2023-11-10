public class Kullanici {
    private String isim;
    private String mail;
    private Adres faturaAdresi;
    private Adres kargoAdresi;

    public Odeme odeme;
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Adres getFaturaAdresi() {
        return faturaAdresi;
    }

    public void setFaturaAdresi(Adres faturaAdresi) {
        this.faturaAdresi = faturaAdresi;
    }

    public Adres getKargoAdresi() {
        return kargoAdresi;
    }

    public void setKargoAdresi(Adres kargoAdresi) {
        this.kargoAdresi = kargoAdresi;
    }

}




