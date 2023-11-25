public class SendNotification {
    public void bildirimGonder(Kullanici kullanici, BildirimIcerik icerik){
        for(INotification bildirim:kullanici.geNotificationList()){
            bildirim.sendNotification(kullanici, icerik);
        }
    }
}
