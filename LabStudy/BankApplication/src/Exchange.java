public class Exchange {
    private static int exchangeRate;

    public static int getExchangeRate() {
        exchangeRate = 30;
        return exchangeRate;
    }
    public void DovizAl(SpecialUser specialUser, double miktar){
        if (specialUser.getTurkishLiraCurrency()>=miktar*exchangeRate) {
            double newTotalAccountBalance= specialUser.getTurkishLiraCurrency()- miktar*exchangeRate;
            specialUser.setForeignCurrencyAsset(miktar);
            specialUser.setTurkishLiraCurrency(newTotalAccountBalance);
            System.out.println("İslem Tamam");
        }
        else{
            System.out.println("Bakiye yetersiz");

        }
    }
    public void DovizSat(SpecialUser specialUser, double miktar) {
        if (specialUser.getTotalForeignCurrencyAsset() >= miktar) {
            double yeniDovizVarlik = specialUser.getForeignCurrencyAsset() - miktar;
            double yeniTurkLirasiVarlik = specialUser.getTurkishLiraCurrency() + (miktar * exchangeRate);
    
            specialUser.setForeignCurrencyAsset(yeniDovizVarlik);
            specialUser.setTurkishLiraCurrency(yeniTurkLirasiVarlik);
    
            System.out.println("İşlem Tamamlandı. Güncel Döviz Varlığı: " + specialUser.getForeignCurrencyAsset() + ", Güncel Türk Lirası Varlığı: " + specialUser.getTurkishLiraCurrency());
        } else {
            System.out.println("Bakiye yetersiz.");
        }
    }
    
}