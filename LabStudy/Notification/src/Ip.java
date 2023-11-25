public class Ip implements INotification{
    @Override
    public void sendNotification(Kullanici kullanici, BildirimIcerik icerik) {
        System.out.println(kullanici.getIp()+" ip adresli kullaniciya "+ icerik + " iceriği gönderildi");
    }
}
