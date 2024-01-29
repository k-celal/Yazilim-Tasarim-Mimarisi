public class App {
    public static void main(String[] args) throws Exception {
        KapakArayuz dergiKapakUret = new DergiKapakUret(new KirmiziKapakRengi(),new A4KapakBoyutu());
        dergiKapakUret.KapakUret();
        KapakArayuz kitapKapakUret = new KitapKapakUret(new MaviKapakRengi(),new A5KapakBoyutu());
        kitapKapakUret.KapakUret();
        KapakArayuz dergiKapakUret2 = new DergiKapakUret(new MaviKapakRengi(),new A4KapakBoyutu());
        dergiKapakUret2.KapakUret();
        KapakArayuz kitapKapakUret2 = new KitapKapakUret(new KirmiziKapakRengi(),new A5KapakBoyutu());
        kitapKapakUret2.KapakUret();

    }
}
