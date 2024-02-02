import java.util.ArrayList;

public class MSSQL {
    private final ArrayList<User> userList;
    private int idCounter;
    public MSSQL(){
        idCounter=0;
        userList=new ArrayList<>();
    }
    public User USERSELECET(int id) {
        for(User user:userList){
            if (user.getId()==id) {
                System.out.println("MSSQL User found");
                return user;
            }
        }
        System.out.println("MSSQL User not found");
        return null;
    }
    public void userıntest(User user) {
        count();
        user.setId(idCounter);
        userList.add(user);
        System.out.println("MSSQL User inserted");
    }
    private void count(){
        idCounter=idCounter+1;
    }
    
}
