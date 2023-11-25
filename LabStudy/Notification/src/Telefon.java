public class Telefon implements INotification{
    @Override
    public void sendNotification(Kullanici kullanici, BildirimIcerik icerik) {
        System.out.println(kullanici.getTelefon()+"telefon numarali kullaniciya"+ icerik + "iceriği gönderildi");
    }
}
