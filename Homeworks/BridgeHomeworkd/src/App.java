public class App {
    public static void main(String[] args) throws Exception {
        DergiKapakUret dergiKapakUret = new DergiKapakUret(new KirmiziKapakRengi(),new A4KapakBoyutu());
        dergiKapakUret.KapakUret();
        KitapKapakUret kitapKapakUret = new KitapKapakUret(new MaviKapakRengi(),new A5KapakBoyutu());
        kitapKapakUret.KapakUret();
        DergiKapakUret dergiKapakUret2 = new DergiKapakUret(new MaviKapakRengi(),new A4KapakBoyutu());
        dergiKapakUret2.KapakUret();
        KitapKapakUret kitapKapakUret2 = new KitapKapakUret(new KirmiziKapakRengi(),new A5KapakBoyutu());
        kitapKapakUret2.KapakUret();

    }
}
