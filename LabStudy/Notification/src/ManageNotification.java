import java.util.ArrayList;

public class ManageNotification {
    ArrayList<INotification> bildirimlistesi;
    public ManageNotification(){
        bildirimlistesi=new ArrayList<>();
    }
    public void bildirimEkle(INotification bildirim){
        bildirimlistesi.add(bildirim);
    }
    public ArrayList<INotification> geNotificationList(){
        return bildirimlistesi;
    }
    
}
