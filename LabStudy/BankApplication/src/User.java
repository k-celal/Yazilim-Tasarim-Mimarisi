public abstract class User {

    private String name;
    private String identificationNumber;
    private double turkishLiraCurrency;

    public User(String name, String identificationNumber, double turkishLiraCurrency) {
        this.name = name;
        this.identificationNumber = identificationNumber;
        this.turkishLiraCurrency = turkishLiraCurrency;

    }

    public abstract void printTotalAccountBalance();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public double getTurkishLiraCurrency() {
        return turkishLiraCurrency;
    }

    public void setTurkishLiraCurrency(double turkishLiraCurrency) {
        this.turkishLiraCurrency = turkishLiraCurrency;
    }

}