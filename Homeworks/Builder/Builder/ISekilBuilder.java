package Builder;

public interface ISekilBuilder {
    public ISekilBuilder setKenarSayi(int sayi);

    public ISekilBuilder setBaslangicKonum(Konum konum);

    public ISekilBuilder setKenarUzunluk(int uzunluk);

    public ISekilBuilder setKenarKalinlik(int kalinlik);

    public ISekilBuilder setKenarRengi(String renk);

    public ISekilBuilder setIcRenk(String renk);

    public Sekil Build();

}
