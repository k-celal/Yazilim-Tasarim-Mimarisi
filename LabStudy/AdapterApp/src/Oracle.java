import java.util.ArrayList;

public class Oracle implements DB{
    private final ArrayList<User> userList;
    private int idCounter;
    public Oracle(){
        idCounter=0;
        userList=new ArrayList<>();
    }
    @Override
    public User selectUserById(int id) {
        for(User user:userList){
            if (user.getId()==id) {
                System.out.println("ORACLE User found");
                return user;
            }
        }
        System.out.println("ORACLE User not found");
        return null;
    }

    @Override
    public void insertUser(User user) {
        count();
        user.setId(idCounter);
        userList.add(user);
        System.out.println("ORACLE User inserted");
    }
    private void count(){
        idCounter=idCounter+1;
    }
}
