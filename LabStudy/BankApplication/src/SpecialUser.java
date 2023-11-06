public class SpecialUser extends User{
    
    private double foreignCurrencyAsset;

    private double totalAccountBalance;

    public SpecialUser(String name, String identificationNumber, double turkishLiraCurrency, double foreignCurrencyAsset) {
        super(name, identificationNumber, turkishLiraCurrency);
        this.foreignCurrencyAsset = foreignCurrencyAsset;

        totalAccountBalance = getForeignCurrencyAsset() * Exchange.getExchangeRate() + getTurkishLiraCurrency();

    }

    @Override
    public void printTotalAccountBalance() {
        System.out.println(getForeignCurrencyAsset() * Exchange.getExchangeRate() + getTurkishLiraCurrency());
    }

    public double getForeignCurrencyAsset() {
        return foreignCurrencyAsset;
    }
    public double getTotalForeignCurrencyAsset() {
        return foreignCurrencyAsset*Exchange.getExchangeRate();
    }

    public void setForeignCurrencyAsset(double foreignCurrencyAsset) {
        this.foreignCurrencyAsset = foreignCurrencyAsset;
    }

    public double getTotalAccountBalance() {
        return totalAccountBalance;
    }

    public void setTotalAccountBalance(double totalAccountBalance) {
        this.totalAccountBalance = totalAccountBalance;
    }
}
