public class Odeme {
    public void odemeYap(User user){
        double toplam=0;
        for (Urun urun : user.getSepet().getUrunler()) {
            toplam+=urun.getAmount();
        }
        toplam=user.indirimHesapla(toplam);
        System.out.println("Ödenecek Tutar: "+toplam);
        System.out.println("Odeme yapildi");
    }    
}
