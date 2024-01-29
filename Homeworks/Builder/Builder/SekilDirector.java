package Builder;

public class SekilDirector {
    public SekilDirector(ISekilBuilder builder) {
        this.builder = builder;
    }

    ISekilBuilder builder;

    public Sekil olustur() {
        Sekil sekil = builder.setBaslangicKonum(new Konum(5, 3)).setIcRenk("kirmizi").setKenarRengi("Sari")
                .setKenarUzunluk(4)
                .setKenarKalinlik(7).Build();

        return sekil;
    }
}
