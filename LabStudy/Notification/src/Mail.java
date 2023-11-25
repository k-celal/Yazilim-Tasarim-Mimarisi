public class Mail implements INotification{

    @Override
    public void sendNotification(Kullanici kullanici, BildirimIcerik icerik) {
        System.out.println(kullanici.getMail()+"mail adresli kullaniciya"+ icerik + "iceriği gönderildi");
    }
    
}
