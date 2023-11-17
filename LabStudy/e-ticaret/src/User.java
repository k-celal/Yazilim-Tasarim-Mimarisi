public abstract class User {
    private Sepet sepet;
    
    public User() {
        this.sepet=new Sepet();
    }

    public Sepet getSepet() {
        return sepet;
    }
    public abstract double indirimHesapla(double tutar);
}
