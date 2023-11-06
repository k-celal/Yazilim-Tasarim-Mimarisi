public class NormalUser extends User {

    double totalAccountBalance;

    public double getTotalAccountBalance() {
        return totalAccountBalance;
    }

    public void setTotalAccountBalance(double totalAccountBalance) {
        this.totalAccountBalance = totalAccountBalance;
    }

    public NormalUser(String name, String identificationNumber, double turkishLiraCurrency) {
        super(name, identificationNumber, turkishLiraCurrency);
        totalAccountBalance = turkishLiraCurrency;
    }

    @Override
    public void printTotalAccountBalance() {
        System.out.println(getTurkishLiraCurrency());
    }

}

