public class App {
    public static void main(String[] args) throws Exception {
        ISekilOlusturucu kareOlusturucu = new KareOlusturucu();
        kareOlusturucu.KenarOlustur();
        kareOlusturucu.BaslangicKonumBelirle();
        kareOlusturucu.KenarUzunluklari();
        kareOlusturucu.KenarKalinliklari();
        kareOlusturucu.KenarRengi();
        kareOlusturucu.icRenk();

        Sekil kare = kareOlusturucu.getSekil();
        kare.SekliYazdir();
    }
}
