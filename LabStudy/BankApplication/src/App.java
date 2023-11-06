import java.util.Scanner;

public class App {
    private static User[] kullanicilar = new User[100]; // Kullanıcıları saklamak için dizi
    private static int kullaniciSayisi = 0; // Kayıtlı kullanıcı sayısı
    private static User currentUser = null; // Giriş yapmış kullanıcıyı takip etmek için currentUser değişkeni

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (currentUser == null) {
                // Kullanıcı giriş yapmadıysa ilk menüyü göster
                System.out.println("Banka Uygulaması Menüsü:");
                System.out.println("1. Kayıt Ol");
                System.out.println("2. Giriş Yap");
                System.out.println("3. Çıkış");
            } else {
                // Kullanıcı giriş yaptıysa ana menüyü göster
                System.out.println("Ana Menü:");
                System.out.println("1. Para İşlemleri");
                System.out.println("2. Döviz İşlemleri");
                System.out.println("3. Ana Menüye Dön");
            }

            System.out.print("Seçenek girin: ");
            int secenek = scanner.nextInt();

            if (currentUser == null) {
                // Kullanıcı giriş yapmadıysa
                switch (secenek) {
                    case 1:
                        kayitOl();
                        break;
                    case 2:
                        System.out.print("Ismnizi giriniz: ");
                        String isim = scanner.next();
                        currentUser = girisYap(kullanicilar, isim);
                        break;
                    case 3:
                        System.out.println("Çıkış yapılıyor...");
                        System.exit(0);
                    default:
                        System.out.println("Geçersiz seçenek.");
                }
            } else {
                // Kullanıcı giriş yaptıysa
                switch (secenek) {
                    case 1:
                        paraIslemleri(currentUser);
                        break;
                    case 2:
                        if (currentUser instanceof SpecialUser) {
                            dovizIslemleri((SpecialUser) currentUser);
                        } else {
                            System.out.println("Özel kullanıcı olmalısınız.");
                        }
                        break;
                    case 3:
                        currentUser = null; // Kullanıcı ana menüye dön
                        break;
                    default:
                        System.out.println("Geçersiz seçenek.");
                }
            }
        }
    }

    public static User kayitOl() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanıcı Kaydı Oluşturun");
        System.out.print("İsim: ");
        String isim = scanner.nextLine();
        System.out.print("Kimlik Numarası: ");
        String kimlikNumarasi = scanner.nextLine();
        System.out.print("TL Varlık: ");
        double tlVarlik = scanner.nextDouble();

        System.out.println("Kullanıcı Türünü Seçin:");
        System.out.println("1. Normal Kullanıcı");
        System.out.println("2. Özel Kullanıcı");
        System.out.print("Seçenek girin: ");
        int kullaniciTurSecim = scanner.nextInt();

        if (kullaniciTurSecim == 1) {
            User normalKullanici = new NormalUser(isim, kimlikNumarasi, tlVarlik);
            kullanicilar[kullaniciSayisi] = normalKullanici;
            kullaniciSayisi++;
            return normalKullanici;
        } else if (kullaniciTurSecim == 2) {
            System.out.print("Döviz Varlık: ");
            double dovizVarlik = scanner.nextDouble();
            SpecialUser ozelKullanici = new SpecialUser(isim, kimlikNumarasi, tlVarlik, dovizVarlik);
            kullanicilar[kullaniciSayisi] = ozelKullanici;
            kullaniciSayisi++;
            return ozelKullanici;
        } else {
            System.out.println("Geçersiz kullanıcı türü.");
            return null;
        }
    }
    public static User girisYap(User[] kullanicilar, String girisIsim) {
        for (User kullanici : kullanicilar) {
            if (kullanici != null && kullanici.getName().equals(girisIsim)) {
                System.out.println("Giriş başarılı!");
                return kullanici;
            }
        }
    
        System.out.println("Kullanıcı bulunamadı. Lütfen tekrar deneyin.");
        return null;
    }
    
    public static User kullaniciSec() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Hedef Kullanıcı Seçin:");
        for (int i = 0; i < kullaniciSayisi; i++) {
            User kullanici = kullanicilar[i];
            System.out.println((i + 1) + ". " + kullanici.getName() + " - " + kullanici.getIdentificationNumber());
        }
    
        System.out.print("Kullanıcı seçin (1-" + kullaniciSayisi + "): ");
        int secenek = scanner.nextInt();
    
        if (secenek >= 1 && secenek <= kullaniciSayisi) {
            return kullanicilar[secenek - 1];
        } else {
            System.out.println("Geçersiz kullanıcı seçimi.");
            return null;
        }
    }
    
    public static void paraIslemleri(User kullanici) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Para İşlemleri Menüsü:");
        System.out.println("1. Havale");
        System.out.println("2. EFT");
        System.out.println("3. SWIFT");
        System.out.println("4. Ana Menüye Dön");
        Transfer transferServis = new Transfer();
        System.out.print("Seçenek girin: ");
        int secenek = scanner.nextInt();
        User hedefKullanici;
        double miktar;
        switch (secenek) {
            case 1:
                hedefKullanici = kullaniciSec(); // Hedef kullanıcıyı seçme işlemi
                System.out.print("Havale miktarı: ");
                miktar = scanner.nextDouble();
                transferServis.havale(kullanici, hedefKullanici, miktar);
                break;
            case 2:
                hedefKullanici = kullaniciSec(); // Hedef kullanıcıyı seçme işlemi
                System.out.print("EFT miktarı: ");
                miktar = scanner.nextDouble();
                transferServis.eft(kullanici, hedefKullanici, miktar);
                break;
            case 3:
                hedefKullanici = kullaniciSec(); // Hedef kullanıcıyı seçme işlemi
                System.out.print("SWIFT miktarı: ");
                miktar = scanner.nextDouble();
                transferServis.swift(kullanici, hedefKullanici, miktar);
                break;
            case 4:
                // Ana menüye dön
                break;
            default:
                System.out.println("Geçersiz seçenek.");
        }
    }
    

    public static void dovizIslemleri(SpecialUser ozelKullanici) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Döviz İşlemleri Menüsü:");
        System.out.println("1. Döviz Varlığını Görüntüle");
        System.out.println("2. Döviz Al");
        System.out.println("3. Döviz Sat");
        System.out.println("4. Ana Menüye Dön");
    
        System.out.print("Seçenek girin: ");
        int secenek = scanner.nextInt();
        Exchange exchange = new Exchange();
        switch (secenek) {
            case 1:
                System.out.println("Döviz Varlığı(TL cinsi): " + ozelKullanici.getTotalForeignCurrencyAsset());
                break;
            case 2:
                System.out.print("Döviz miktarı alınacak ");
                double miktar = scanner.nextDouble();
                exchange.DovizAl(ozelKullanici, miktar);
                break;
            case 3:
                System.out.print("Döviz miktarı satılacak ");
                miktar = scanner.nextDouble();
                exchange.DovizSat(ozelKullanici, miktar);
                break;
            case 4:
                // Ana menüye dön
                break;
            default:
                System.out.println("Geçersiz seçenek.");
        }
    }
    

}
