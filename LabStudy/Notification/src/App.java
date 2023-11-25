public class App {
    public static void main(String[] args) throws Exception {
        Kullanici kullanici1=new Kullanici();
        kullanici1.setIsim("Kullanici1");
        kullanici1.setMail("dasda@gmail.com");
        kullanici1.setIp("1.1.1.1");
        kullanici1.setTelefon("88888888");
        INotification mail = new Mail();
        INotification ip = new Ip();
        kullanici1.bildirimEkle(ip);
        kullanici1.bildirimEkle(mail);

        BildirimIcerik icerik = new BildirimIcerik();
        icerik.mesaj="Bu bir bildirimdir.";
        SendNotification sn = new SendNotification();
        sn.bildirimGonder(kullanici1, icerik);
    }
}
