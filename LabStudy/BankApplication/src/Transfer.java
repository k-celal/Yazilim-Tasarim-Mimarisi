public class Transfer implements Transaction {
    @Override
    public void executeTransaction(User kullanici, double miktar) {
        double newTotalAccountBalance = kullanici.getTurkishLiraCurrency() - miktar;

        if (newTotalAccountBalance < 0) {
            System.out.println("Bakiye yetersiz");
            return;
        }

        kullanici.setTurkishLiraCurrency(newTotalAccountBalance);
    }

    public void havale(User kullanici, User hedefKullanici, double transferMiktari) {
            double newTotalAccountBalance = kullanici.getTurkishLiraCurrency() - transferMiktari;

            if (newTotalAccountBalance < 0) {
                System.out.println("Bakiye yetersiz");
                return;
            }
            kullanici.setTurkishLiraCurrency(newTotalAccountBalance);
            hedefKullanici.setTurkishLiraCurrency(hedefKullanici.getTurkishLiraCurrency() + transferMiktari);
            
    }

    public void swift(User kullanici, User hedefKullanici, double transferMiktari) {
        if (kullanici instanceof SpecialUser) {
            double newTotalAccountBalance = kullanici.getTurkishLiraCurrency() - transferMiktari - 500;

            if (newTotalAccountBalance < 0) {
                System.out.println("Bakiye yetersiz");
                return;
            }

            kullanici.setTurkishLiraCurrency(newTotalAccountBalance);
            hedefKullanici.setTurkishLiraCurrency(hedefKullanici.getTurkishLiraCurrency() + transferMiktari);
        } else {
            System.out.println("SWIFT işlemi yalnızca özel kullanıcılara izin verilir.");
        }
    }

    public void eft(User kullanici, User hedefKullanici, double transferMiktari) {
        if (kullanici instanceof NormalUser) {
            double transferUcreti = 20;

            if (transferMiktari >= 20) {
                transferUcreti = transferMiktari * 5 / 100;
            }

            double newTotalAccountBalance = kullanici.getTurkishLiraCurrency() - transferUcreti - transferMiktari;

            if (newTotalAccountBalance < 0) {
                System.out.println("Bakiye yetersiz");
                return;
            }

            kullanici.setTurkishLiraCurrency(newTotalAccountBalance);
            hedefKullanici.setTurkishLiraCurrency(hedefKullanici.getTurkishLiraCurrency() + transferMiktari);
        } else {
            System.out.println("EFT işlemi yalnızca normal kullanıcılara izin verilir.");
        }
    }
}
