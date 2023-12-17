import java.util.Scanner;

class KareOlusturucu extends ISekilOlusturucu {
    public KareOlusturucu() {
        this.sekil = new Sekil("Kare"); // Sekil nesnesini başlat
    }
    @Override
    public void KenarOlustur() {
        sekil.set("Kenar sayisi", 4);
    }

    @Override
    public void BaslangicKonumBelirle() {
        sekil.set("Baslangic konumu", "0,0");
    }

    @Override
    public void KenarUzunluklari() {
        // Karede tüm kenarlar eşit uzunluktadır
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kenar uzunlugu: ");
        int kenarUzunlugu = scanner.nextInt();
        sekil.set("Kenar uzunlugu: ", kenarUzunlugu);
    }

    @Override
    public void KenarKalinliklari() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kenar kalinliği: ");
        int kenarKalinligi = scanner.nextInt();
        sekil.set("Kenar kalinliği: ", kenarKalinligi);
    }

    @Override
    public void KenarRengi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kenar rengi: ");
        String kenarRengi = scanner.next();
        sekil.set("Kenar rengi: ", kenarRengi);
    }

    @Override
    public void icRenk() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ic renk: ");
        String icRenk = scanner.next();
        sekil.set("Ic renk: ", icRenk);
    }
}
