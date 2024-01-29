package Builder;

public class SekilBuilder1 implements ISekilBuilder {
    private Sekil sekil;

    public SekilBuilder1() {
        this.sekil = new Sekil();
    }

    @Override
    public ISekilBuilder setKenarSayi(int sayi) {
        sekil.setKenarSayisi(sayi);
        return this;
    }

    @Override
    public ISekilBuilder setBaslangicKonum(Konum konum) {
        sekil.setBaslangicKonum(konum);
        return this;
    }

    @Override
    public ISekilBuilder setKenarUzunluk(int uzunluk) {
        sekil.setKenarUzunluk(uzunluk);
        return this;
    }

    @Override
    public ISekilBuilder setKenarKalinlik(int kalinlik) {
        sekil.setKenarKalinlik(kalinlik);
        return this;
    }

    @Override
    public ISekilBuilder setKenarRengi(String renk) {
        sekil.setKenarRenk(renk);
        return this;
    }

    @Override
    public ISekilBuilder setIcRenk(String renk) {
        sekil.setIcRenk(renk);
        return this;
    }

    @Override
    public Sekil Build() {
        return this.sekil;
    }

}
