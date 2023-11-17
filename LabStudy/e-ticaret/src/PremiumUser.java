public class PremiumUser extends User{

    @Override
    public double indirimHesapla(double tutar) {
       return tutar - tutar*0.10;
    }
    
    
}
